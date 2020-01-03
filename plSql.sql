set serveroutput on

DECLARE 
a NUMBER :=4;
BEGIN
    a := a+1;
    if mod(a,2)=0 then
  dbms_output.put_line(a);
  else
  dbms_output.put_line(a+10);
  end if;
END;

/

DECLARE
 i NUMBER:=1;
 BEGIN
 LOOP 
    INSERT INTO T1 VALUES(i,i+1);
    i:=i+1;
    EXIT WHEN i>100;
 END LOOP;
END;
/

DECLARE
 i NUMBER;
 BEGIN
 
 FOR i in 101..200 LOOP
 INSERT INTO T1 VALUES(i,i);
 END LOOP;
END;
/

DECLARE
i NUMBER:=201;
BEGIN

WHILE i<=300 LOOP
INSERT INTO T1 VALUES(i,i);
i:=i+1;
END LOOP;
END;
/

DECLARE 
n_pct employees.commission_pct%TYPE;
v_eval varchar2(10);
n_emp_id employees.employee_id%TYPE := 145;

BEGIN

SELECT commission_pct
INTO n_pct
FROM employees
WHERE employee_id = n_emp_id;

CASE n_pct
    WHEN 0 THEN
    v_eval:='N/A';
    WHEN 0.1 THEN
    v_eval:='Low';
    WHEN 0.4 THEN
    v_eval:='High';
    ELSE
    v_eval:='Fair';
    END CASE;
    
    DBMS_OUTPUT.PUT_LINE('EMPLOYEE '||n_emp_id||' commission is '|| TO_CHAR(n_pct)||' which is '||v_eval);
    
    END;
    /
    
DECLARE
givenName users.name%TYPE:=&name;

BEGIN
dbms_output.put_line('The role of ' || givenName ||' is ' || getRole(givenName));
END;
/

CREATE OR REPLACE FUNCTION getRole(givenName in users.name%TYPE)
RETURN roles.role_name%TYPE IS
roleName roles.role_name%TYPE;
BEGIN
select role_name into roleName from users join roles using (role_id) where users.name=givenName;

RETURN roleName;
END;
/

select * from t1;

INSERT INTO employee_salary values(2,'Hari',15000,4000,1000,5000,15000,20000);
INSERT INTO employee_salary values(1,'Vikram',31000,8000,1000,5000,35000,40000);
INSERT INTO employee_salary values(3,'Vishal',14000,4000,1000,5000,15000,19000);
INSERT INTO employee_salary values(4,'Pawan',14000,4000,1000,5000,15000,19000);
INSERT INTO employee_salary values(5,'Kalyan',13000,4000,1000,5000,15000,18000);

declare
begin
INSERT INTO employee_salary values(6,'Sri',53000,4000,1000,5000,15000,58000);
declare 
ename employee_salary.emp_name%TYPE:='&name';
tax_percent NUMBER:=0;
tax NUMBER:=0;
grossSal employee_salary.gross_salary%TYPE:=0;
BEGIN
select gross_salary into grossSal from employee_salary where emp_name=ename;

case 
when (grossSal>=15000 and grossSal<25000) then
tax_percent:=5;
when (grossSal>=25000 and grossSal<50000) then
tax_percent:=10;
when grossSal>=50000 then
tax_percent:=20;
end case;
tax:=tax_percent*grossSal/100;
dbms_output.put_line('Tax for '|| ename || ' is '||tax);
END;
end;
/


DECLARE
  -- declare a cursor
  CURSOR cur_chief IS
      SELECT u.name,
             r.role_name
      FROM users u
      INNER JOIN roles r ON u.role_id = r.role_id;
 
  r_chief cur_chief%ROWTYPE;
BEGIN
  OPEN cur_chief;
  LOOP
    -- fetch information from cursor into record
    FETCH cur_chief INTO r_chief;
 
    EXIT WHEN cur_chief%NOTFOUND;
 
    -- print department - chief
    DBMS_OUTPUT.PUT_LINE(r_chief.name|| ' - ' ||
                         r_chief.role_name);
  END LOOP;
  -- close cursor cur_chief
  CLOSE cur_chief;
END;
/
delete from t1;


declare 
cursor cur_chief is select a,b from t1 where a<b for update;
r_chief cur_chief%ROWTYPE;
temp t1.a%type;
begin
open cur_chief;
loop
fetch cur_chief into r_chief;
exit when cur_chief%NOTFOUND;
temp:=r_chief.a;
update t1 set a=r_chief.b where b=r_chief.b;
update t1 set b=temp where b=r_chief.b;

end loop;
end;
/
select * from employee_salary;
select * from t1;

declare
cursor cur_chief is select employee_id,first_name,salary,hire_date from employees where hire_date>TO_DATE('31-Dec-2004');
r_chief cur_chief%ROWTYPE;
begin
OPEN cur_chief;
loop
fetch cur_chief into r_chief;
exit when cur_chief%NOTFOUND;
dbms_output.put_line(r_chief.first_name||q'['s]'||' updated salary is '||(r_chief.salary*0.1+r_chief.salary));

end loop;
end;
/

declare
cursor cur_chief is select last_name,first_name,hire_date from employees;
r_chief cur_chief%ROWTYPE;
oldDate employees.hire_date%TYPE:=sysdate;
first_name employees.first_name%TYPE;
last_name employees.last_name%TYPE;
begin
open cur_chief;
loop
fetch cur_chief into r_chief;
exit when cur_chief%NOTFOUND;
if r_chief.hire_date<oldDate 
then
oldDate:=r_chief.hire_date;
first_name:=r_chief.first_name;
last_name:=r_chief.last_name;
end if;
end loop;
dbms_output.put_line(first_name||' '||last_name||' is the oldest employee hired on '||oldDate);
end; 
/

select * from employees;