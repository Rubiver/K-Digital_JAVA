select * from location;
select * from national;
select * from sal_grade;
select  * from employee;
-- DML - Select : 테이블 내부의 내용을 조회하는 명령.
select EMP_ID as "사원 번호",EMP_NAME as "사원 이름", PHONE as "전화번호" from employee;

-- 글자는 작은 따옴표로 묶기.
select EMP_ID as "사원 번호",EMP_NAME as "사원 이름", PHONE as "전화번호" from employee where EMP_NAME = '유재식';
select EMP_ID as "사원 번호",EMP_NAME as "사원 이름", PHONE as "전화번호" from employee where EMP_NAME LIKE '유%';

select * from employee where SALARY >= 4000000;
-- 숫자형을 문자열로 만들어 쿼리를 날려도 DBMS가 자동 형변환하여 쿼리를 수행하려고함.

-- D5 부서에서 급여가 300만원 이하인 직원의 이름 및 직급코드 출력 , or로도 출력
select DEPT_CODE,EMP_NAME, JOB_CODE, SALARY from employee where DEPT_CODE = 'D5' or SALARY <= 3000000 ;

-- 급여가 200만원에서 300만원 사이인 직원의 이름과 급여를 출력.
select EMP_NAME, SALARY from employee where SALARY >= 2000000 and SALARY <= 3000000;

-- between and
select EMP_NAME, SALARY from employee where SALARY between 2000000 and 3000000;

-- employee 테이블의 부서코드만 나열 (distinct)
select distinct DEPT_CODE from employee;

-- 부서코드가 D8이거나 D6인 직원들의 부서코드, 이름, 연락처 출력.
select DEPT_CODE, EMP_NAME, PHONE from employee where DEPT_CODE = 'D6' or DEPT_CODE = 'D8';
select DEPT_CODE, EMP_NAME, PHONE from employee where DEPT_CODE in('D6','D8','D1') order by DEPT_CODE asc;

-- 컬럼명으로만 출력 가능한 것은 아님. 집계함수, 연산, 상수 출력이 가능.
select EMP_NAME as '사원명', SALARY*12, '원' from employee;
select EMP_NAME 사원명, SALARY*12, '원' from employee;

-- concat 하나의 컬럼에서 두개의 값을 연결
select EMP_NAME, concat(SALARY*12, ' 원') 연봉 from employee;

-- 현재 시간을 타임 스팸프로 출력
select now();

-- 테이블 구조를 확인
desc employee;

-- datediff 날짜 두개의 차이를 반환 (반환 값은 차이가 나는 일 수)
select EMP_NAME, datediff(now(),HIRE_DATE) 근속일 from employee;

-- 근속년수가 20년 이상인 직원의 이름 및 직급코드를 출력
select EMP_NAME, JOB_CODE from employee where datediff(now(),HIRE_DATE)/365 >= 20;

-- employee 테이블에서 이름, 연봉, 총수령액(보너스 포함)을 출력
select  EMP_NAME, SALARY*12, SALARY+(SALARY*BONUS) from employee;