create user 'pair' identified by 'pair';
create database dev;
create database support;

show databases;

grant all privileges on pair.* to 'pair';

create table dev.emp_for_dev like java.emp_for_dev;

grant select on java.emp_for_dev to dev;
grant select on java.emp_view to dev;



revoke select on java.emp_view from dev;
revoke select on java.emp_for_dev from dev;
create user 'support' identified by 'sup';
grant all privileges on support to 'support';
-- revoke all privileges on java.emp_dept_view from 'support';