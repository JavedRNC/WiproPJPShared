/* Data populated by Departments_table */

insert into DEPT(DEPT_ID,DEPT_NAME)
select department_id,department_name from departments
commit;

/* Insertion not possible since primary key */
/* insert into Dept values(10,'Accounts');*/

/*NULL not possible since of primary key constraint*/
/* insert into DEPT values(NULL,'TT'); */

/*PRIMARY KEY CANNOT BE DUPLICATED*/
/* insert into DEPT values(20,'TT'); */


/*Insertion not possible since of invalid format*/
/*insert into DEPT values('A1','Accounts');*/


/*PRIMARY KEY CANNOT BE DUPLICATED*/
/*insert into DEPT values(30,'Accounts')*/
