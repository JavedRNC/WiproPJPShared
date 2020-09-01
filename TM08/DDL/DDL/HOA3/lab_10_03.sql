create table emp(ID NUMBER(7) constraint id_num_pk primary key,LAST_NAME varchar2(25) not null,FIRST_NAME
varchar2(25), DEPT_ID NUMBER(7) constraint id_foreign_key references DEPT(Dept_ID));