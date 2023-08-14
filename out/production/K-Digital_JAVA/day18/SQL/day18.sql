select *
from employee;

-- foreign key 조건 (board 테이블, writer(AI), title, contents 전부 varchar ), (member 테이블, id, name, age)

create table board(
                      seq int not null auto_increment,
                      writer varchar(20),
                      title varchar(300) not null,
                      contents varchar(3000) not null,
                      primary key (seq),
                      foreign key (writer) references member(id) on delete set null -- cascade : 지우는 대상과 관련된 모든 데이터를 삭제, set null : 연관된 데이터에 null값을 대입,
);

create table member(
                       id varchar(20) primary key ,
                       name varchar(20) not null,
                       age int check(age >= 19) not null
);
insert into member value('test', 'kwon', 15);

select * from member;
insert into board value (null,'test','title','contents');
insert into board value (null,'test','title2','contents');
insert into board value (null,'test','title3','contents');
delete from member where id='test';

select * from board;


drop table board;
drop table member;
desc board;
desc member;

-- alter table board drop constraint board_ibfk_1;
-- 기존에 존재한 테이블을 이용하여(데이터와 구조) 새로운 테이블을 만들 수 있음. where절에 false를 주게 된다면 테이블의 구조만 가져옴.
create table emp_part as select emp_id,EMP_NAME,PHONE from employee;
select * from emp_part;

create table cafe_menu(
                          mid int not null auto_increment primary key ,
                          mname varchar(50) not null UNIQUE ,
                          mprice int not null check ( mprice >= 1000 ),
                          isIce char(1) not null check ( isIce in ('Y','N'))
);
desc cafe_menu;
drop table  cafe_menu;
show create table cafe_menu;
-- alter : 기존 테이블의 구조를 수정

alter table cafe_menu change mid id int ; -- mid to id (modify : 이름과 타입, extra)
alter table cafe_menu modify id int auto_increment; -- (change : 이름은 그대로, 타입과 extra를 변경)
alter table cafe_menu add primary key (id);
alter table cafe_menu add UNIQUE index name(name); -- add unique index uniquekey별명(컬럼명)
alter table cafe_menu modify mname varchar(100) not null; -- null값 허용 여부도 초기값으로 바뀌기 때문에 허용하고 싶지 않다면 not null 적어줘야 함.
alter table cafe_menu change mname name varchar(100) not null ; -- mid to id (modify : 이름과 타입, extra)

-- 테이블 컬럼 제약조건 추가 및 삭제
alter table cafe_menu drop primary key; -- auto increment는 테이블에 하나만 존재하고 key 값에서 사용가능.
-- alter table cafe_menu drop index mname;   -- drop index : unique 키를 지울때 사용. (처음 정의한 컬럼명으로 제거할 수 있음.)

-- alter table cafe_menu drop constraint cafe_menu_chk_1; -- check 옵션 지우기 (조건에 붙은 별명으로 지움)
alter table cafe_menu add constraint  cafe_menu_price_chk check ( mprice >= 2000 ); -- check 옵션 추가

show create table board;
-- 외래키 및 index 제거
-- CONSTRAINT `board_ibfk_1` FOREIGN KEY (`writer`) REFERENCES `member` (`id`) ON DELETE SET NULL
-- alter table board drop foreign key board_ibfk_1; -- board 테이블의 외래키를 지움.
-- alter table board drop index writer;
alter table board add foreign key (writer) references  member(id);

-- 테이블 명 변경
alter table cafe_menu rename to cafe;
desc cafe;

-- view : 특정 테이블의 결과를 가상테이블로 만드는 것. (연산의 반복을 최소화)
create view emp_view as select emp_id, emp_name, PHONE, EMAIL from employee;
select * from emp_view;
drop view emp_view;

create table emp_for_dev
as
select emp_id, emp_name, PHONE, EMAIL from employee;
select * from emp_for_dev;
grant select on java.emp_for_dev to dev;

update employee set EMP_NAME = '선동이' where emp_id = 200;
commit;
show create view emp_view;


/*
root에서 실행해야함.

create database dev;
create user 'dev' identified by 'dev';
grant all privileges on dev.* to dev;

create table dev.emp_for_dev like java.emp_for_dev;

grant select on java.emp_for_dev to dev; 테이블에 대한 권한

grant select on java.emp_view to dev; 뷰에 대한 권한

select  * from java.emp_view; -> 실시간으로 변경되는 것을 확인할 수 있음.

revoke select on java.emp_view from dev;
revoke select on java.emp_for_dev from dev;
*/

-- commit and rollback

-- quiz
create view emp_dept_view
as
select emp_id, EMP_NAME, DEPT_TITLE
from employee e join department d on e.DEPT_CODE = d.DEPT_ID; -- java에서
create user 'support' identified by 'sup'; -- root 에서
grant all privileges on support.* to support; -- root
grant select on java.emp_for_dev to 'support'; -- root
select * from java.emp_dept_view; -- support에서
revoke all privileges on java.emp_dept_view from support; -- root


grant select on java.emp_for_dev to dev;
grant select on java.emp_view to dev;



revoke select on java.emp_view from dev;
revoke select on java.emp_for_dev from dev;
create user 'support' identified by 'sup';
grant all privileges on support.* to support;
grant select on java.emp_for_dev to 'support';
-- revoke all privileges on java.emp_dept_view from 'support';


---quiz
delete from

    select * from tb_student;
select * from tb_professor;
select * from tb_grade;
select * from tb_department;
select * from tb_class;
select * from tb_class_professor;

select TERM_NO, POINT from tb_grade where STUDENT_NO = 'A112113'; --  답안과 다름 질문
select DEPARTMENT_NO, count(*) from tb_student where ABSENCE_YN = 'Y' group by DEPARTMENT_NO;

-- 15번 점수 이후 평균 어캐함?
select substring(TERM_NO,1,4) as 년도, right(TERM_NO, 2) as 학기, point from tb_grade where STUDENT_NO = 'A112113';
select * from tb_grade where STUDENT_NO = 'A112113';

-- 13번
select CLASS_NAME, DEPARTMENT_NAME from tb_class tc
                                            join tb_department td on tc.DEPARTMENT_NO = td.DEPARTMENT_NO and td.CATEGORY = '예체능';


-- 18번
select STUDENT_NO, STUDENT_NAME
from tb_student ts
         join tb_department td on ts.DEPARTMENT_NO = td.DEPARTMENT_NO and td.DEPARTMENT_NAME like '국어국문학과';
