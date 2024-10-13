drop table if exists member;
drop table if exists employee;
create table employee(
                         emp_no varchar(10) primary key,
                         emp_password varchar(255) not null,
                         emp_email varchar(50) unique not null,
                         emp_name varchar(10) not null,
                         emp_phone varchar(15),
                         emp_hiredate date not null, -- 입사일
                         department enum('영업팀', '인사팀', '마케팅팀') not null, -- 부서
                         emp_grade enum('사원', '팀장', '이사', '대표이사') not null, -- 직급
                         role enum('USER', 'ADMIN')
);
