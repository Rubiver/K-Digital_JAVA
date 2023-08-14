-- 단일행 단일열 서브쿼리 : 서브쿼리의 반환값이 단일 값인 경우

-- 다중행 단일열 서브쿼리 : 섭쿼리의 변환값이 여러행으로 구성되어있는 경우

-- 단일행 다중열 서브쿼리 : 서브쿼리의 반환값이 여러 열로 구성되어 있는 경우 ( = 또는 in으로 비교가능 )

-- 다중행 다중열 서브쿼리 : 서브쿼리의 반환값이 여러 행, 여러 열로 구성되어 있는 경우. ( in으로만 비교 가능 )


select * from employee;
select DEPT_CODE, JOB_CODE from employee where EMP_NAME='이태림';

-- 서브쿼리의 반환 값이 여러 열인 경우 조건을 여러개로 할 수 있음.
select EMP_NAME, DEPT_CODE, JOB_CODE
from employee
where (DEPT_CODE, JOB_CODE) = (select DEPT_CODE, JOB_CODE from employee where EMP_NAME='이태림');


-- inline view
select * from (select * from employee) emp;
select * from (select EMP_NAME, EMP_NO from employee) emp;

-- select 안에 select(서브쿼리), 보통 상관쿼리(메인쿼리의 컬럼이 서브쿼리에 영향을 줌) 형태로 많이 사용됨.
select EMP_NAME, (select DEPT_TITLE from department d where e.DEPT_CODE = d.DEPT_ID) from employee e;

-- ranking 적용 (rank(), dense_rank(), row_number()
select EMP_NAME, SALARY, rank() over(order by SALARY desc) '급여순위' from employee;
select EMP_NAME, SALARY, dense_rank() over(order by SALARY desc) '급여순위' from employee;
select EMP_NAME, SALARY, row_number() over (order by SALARY desc) '급여순위' from employee;


-- quiz
select e.EMP_NAME, substring(EMP_NO,3,4), DEPT_CODE, d.dept_title from employee e
                                                                           join department d on e.DEPT_CODE = d.DEPT_ID
where (e.DEPT_CODE,e.JOB_CODE) in (select distinct DEPT_CODE, job_code from employee where substring(EMP_NO,3,4) like '%0808%');

set sql_mode = '';


select EMP_NAME, e.JOB_CODE, j.JOB_NAME, SALARY from employee e
                                                         join job j on e.JOB_CODE = j.JOB_CODE
where (SALARY,e.JOB_CODE) in (select max(SALARY), JOB_CODE from employee group by JOB_CODE)
   or (SALARY,e.JOB_CODE) in (select min(SALARY), JOB_CODE from employee group by JOB_CODE)
order by e.JOB_CODE;

-- 게시판별 페이지마다 글목록 보여줄때 사용됨.
select *
from (select EMP_NAME, SALARY, row_number() over (order by SALARY desc) as '급여순위'
      from employee) emp2
where 급여순위 >= 5 and 급여순위 <= 10;
/*
select *
from (select EMP_NAME, row_number() over (order by SALARY desc) as as1
      from employee) e1
join employee e2 on e1.EMP_NAME = e2.EMP_NAME
where as1 >= 5 and as1 <= 10;
 */
select date_format('98/04/13','%W');

select EMP_NAME, EMP_NO, d.DEPT_TITLE, j.JOB_NAME from employee e
                                                           join department d on e.DEPT_CODE = d.DEPT_ID
                                                           join job j on e.JOB_CODE = j.JOB_CODE
where EMP_NAME LIKE '전%' and substring(EMP_NO,1,2) >= 70 and substring(EMP_NO,1,2) <= 79;

select EMP_NAME, DEPT_TITLE, LOCAL_NAME from employee e
                                                 join department d on e.DEPT_CODE = d.DEPT_ID
                                                 join location l on d.LOCATION_ID = l.LOCAL_CODE
where BONUS is null;

select EMP_NAME, DEPT_TITLE, l.NATIONAL_CODE from employee e
                                                      join department d on e.DEPT_CODE = d.DEPT_ID
                                                      join location l on d.LOCATION_ID = l.LOCAL_CODE
where l.NATIONAL_CODE in ('KO', 'JP');

select
    case
        when ENT_YN = 'Y' then '퇴사'
        when ENT_YN = 'N' then '재직중'
        end 재직여부,
    count(*) 인원수
from employee
group by case
             when ENT_YN = 'Y' then '퇴사'
             when ENT_YN = 'N' then '재직중'
             end;

select EMP_NAME, SALARY, DEPT_TITLE, floor((select avg(SALARY) from employee e2 where e.DEPT_CODE = e2.DEPT_CODE)) as 평균 from employee e
                                                                                                                                  join department d on d.DEPT_ID = e.DEPT_CODE
where SALARY > (select avg(SALARY) from employee e3 where e.DEPT_CODE = e3.DEPT_CODE);

select DEPT_CODE, EMP_NAME, SALARY, DEPT_TITLE from employee e
                                                        join department d on e.DEPT_CODE = d.DEPT_ID
where (SALARY,DEPT_TITLE) in (select max(SALARY), DEPT_TITLE from employee join department on employee.DEPT_CODE = department.DEPT_ID group by DEPT_code)
group by DEPT_CODE, DEPT_TITLE
order by DEPT_CODE;

select
    case
        when l.NATIONAL_CODE = 'KO' then '한국'
        when l.NATIONAL_CODE = 'JP' then '일본'
        when l.NATIONAL_CODE = 'RU' then '러시아'
        when l.NATIONAL_CODE = 'CH' then '중국'
        end as '국가명'
    , EMP_NAME, SALARY from employee e
                                            join department d on e.DEPT_CODE = d.DEPT_ID
                                            join location l on d.LOCATION_ID = l.LOCAL_CODE
where (SALARY, LOCATION_ID)
          in (select min(SALARY), l2.LOCAL_CODE from employee e2
                                                         join department d2 on e2.DEPT_CODE = d2.DEPT_ID
                                                         join location l2 on d2.LOCATION_ID = l2.LOCAL_CODE
              group by l2.LOCAL_CODE)
group by l.NATIONAL_CODE
order by l.NATIONAL_CODE desc;

select *
from (select DEPT_CODE, dept_title,(max(SALARY)-min(SALARY)) as '차액' from employee e
                                                                              join department d on e.DEPT_CODE = d.DEPT_ID
      group by DEPT_CODE, dept_title) temp
group by dept_code ,DEPT_TITLE
order by 3 desc;


-- DDL, DCL 한거 보충