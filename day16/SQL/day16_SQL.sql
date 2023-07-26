-- where 절은 join 뒤에 작성.

-- cartisian product : 조건 없는 join의 결과
select * from department, job;
-- cross 조인 : 여러 테이블을 조인할 때 조건없이 모든 경우의 수를 마늘어내느 쿼리
select emp_id, emp_name, dept_code from employee, department;

select emp_id, emp_name, dept_code from employee join department on DEPT_CODE = DEPT_ID;
select emp_id, emp_name, department.DEPT_TITLE from employee join department on employee.DEPT_CODE = department.DEPT_ID;
select emp_id, emp_name, department.DEPT_TITLE from employee inner join department on employee.DEPT_CODE = department.DEPT_ID;
-- inner를 생략해도 기본적으로 inner로 동작함.

-- outer joun 방향성을 가짐, left outer는 왼쪽 테이블 기준으로 안보이는 데이터를
select emp_id, emp_name, department.DEPT_TITLE from employee left outer join department on employee.DEPT_CODE = department.DEPT_ID;
select emp_id, emp_name, department.DEPT_TITLE from employee right outer join department on employee.DEPT_CODE = department.DEPT_ID;

-- full outer join mysql에선 지원 안함;;

select emp_id, emp_name, job_code from employee;
select * from job;

select emp_id, emp_name, job.job_code, job_name from employee join job on employee.job_code = job.job_code;

-- self join - join에 참여할 필요가 있는 테이블이 자기 자신일때 사용되는 쿼리
select e1.emp_name, e1.MANAGER_ID, e2.EMP_NAME, e1.SALARY, e2.SALARY from employee e1 join employee e2 on e1.MANAGER_ID = e2.EMP_ID;

-- 다중 join  : 3개 이상의 테이블을 조인할 때 사용하는 쿼리 문법, join on을 계속해서 붙혀서 사용할 수 있음.
select e.EMP_ID, e.emp_name, j.JOB_NAME, ifnull(d.DEPT_TITLE,'미배정')
from employee e
left join department d on e.DEPT_CODE = d.DEPT_ID
join job j on e.JOB_CODE = j.JOB_CODE;

set sql_mode = 'only_full_group_by';

-- quiz
select emp_name, dept_title, dept_code from employee e join department d on e.DEPT_CODE=d.DEPT_ID and d.DEPT_TITLE IN ('총무부','회계관리부');
select emp_name, dept_title, dept_code from employee e join department d on e.DEPT_CODE=d.DEPT_ID where d.DEPT_TITLE IN ('총무부','회계관리부');  -- 위의 코드와 동일한 결과

select emp_id, emp_name, dept_title, dept_code, floor(salary*12) from employee e join department d on e.DEPT_CODE = d.DEPT_ID where d.DEPT_TITLE LIKE '%해외영업%' order by DEPT_TITLE, emp_id asc;

select j.JOB_NAME, floor(avg(salary)) from employee e join job j on e.JOB_CODE = j.JOB_CODE group by j.JOB_NAME;

select emp_id, emp_name, ifnull(dept_title,'미배정'), floor(salary*12)
from employee e left outer join department d on e.DEPT_CODE = d.DEPT_ID
where ifnull(d.DEPT_TITLE,'미배정') not like '기술지원%' order by DEPT_TITLE, EMP_ID, 4 asc;
-- null != '문자열' 의 결과는 null이 나옴. (select는 for문과 같은 기능, where은 if와 같은 기능)

select * from department;
select * from location;
select e.emp_id, e.emp_name, e.dept_code, d.dept_title, l.NATIONAL_CODE from employee e
left join department d on e.DEPT_CODE = d.DEPT_ID
left join location l on d.LOCATION_ID = l.LOCAL_CODE;

select * from department;
select * from location;
select e.emp_id, e.emp_name, e.dept_code, d.dept_title, n.national_name from employee e
left join department d on e.DEPT_CODE = d.DEPT_ID
left join location l on d.LOCATION_ID = l.LOCAL_CODE
left join national n on l.NATIONAL_CODE = n.NATIONAL_CODE;

-- 서브쿼리 보충