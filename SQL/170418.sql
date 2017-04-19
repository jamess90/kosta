use hr;

create table MY_BOOK(
	id int,
    name varchar(50),
    price int,
    isbn_no varchar(100) not null,
    primary key(id, name) 		# 두 개 이상의 컬럼에 primary key를 설정할 수 있다.
);

desc MY_BOOK;

create table MY_EMP
as 
	select *
	from employees;
    
    
select *
from MY_EMP;

desc my_emp;


# reg_date
alter table my_book		# 테이블이 있는데 컬럼을 추가하고 싶을 때 사용
add (reg_date timestamp);

desc my_book;

alter table my_book	
add primary key(id);

drop table my_book;
drop table my_emp;

desc my_emp;

alter table my_emp
	add foreign key(job_id) 
    references jobs(job_id);

select * from job_history;

create table job_history(
	employee_id int(11) unsigned,
	start_date Date,
    end_date Date,
    job_id varchar(10) ,
    department_id int(11) unsigned,
    primary key(employee_id, start_date),
    foreign key(job_id) references jobs(job_id),
    foreign key(employee_id) references employees(employee_id),
    foreign key(department_id) references departments(department_id)
);

drop table job_history;

desc employees;
desc jobs;
desc departments;

select @@innodb_buffer_pool_size/1024/1024;

# 부서명도 함께 출력하시오
select 	e.last_name			as 성, 
		e.first_name		as 이름, 
		e.department_id		as 직무번호,
        d.department_name	as 직무이름
from employees e left outer join departments d using(department_id);







###################################################################3
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema myhr
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema myhr
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hr` DEFAULT CHARACTER SET utf8 ;
USE `myhr` ;

-- -----------------------------------------------------
-- Table `myhr`.`regions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `myhr`.`regions` (
  `region_id` INT(11) UNSIGNED NOT NULL,
  `region_name` VARCHAR(25) NULL DEFAULT NULL,
  PRIMARY KEY (`region_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `myhr`.`countries`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `myhr`.`countries` (
  `country_id` CHAR(2) NOT NULL,
  `country_name` VARCHAR(40) NULL DEFAULT NULL,
  `region_id` INT(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`country_id`),
  INDEX `countries_regions_region_id` (`region_id` ASC),
  CONSTRAINT `countries_regions_region_id`
    FOREIGN KEY (`region_id`)
    REFERENCES `myhr`.`regions` (`region_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `myhr`.`departments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `myhr`.`departments` (
  `department_id` INT(11) UNSIGNED NOT NULL,
  `department_name` VARCHAR(30) NOT NULL,
  `manager_id` INT(11) UNSIGNED NULL DEFAULT NULL,
  `location_id` INT(11) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`department_id`),
  INDEX `departments_locations_location_id` (`location_id` ASC),
  CONSTRAINT `departments_locations_location_id`
    FOREIGN KEY (`location_id`)
    REFERENCES `myhr`.`locations` (`location_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hr`.`jobs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `myhr`.`jobs` (
  `job_id` VARCHAR(10) NOT NULL,
  `job_title` VARCHAR(35) NOT NULL,
  `min_salary` DECIMAL(8,0) UNSIGNED NULL DEFAULT NULL,
  `max_salary` DECIMAL(8,0) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`job_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hr`.`job_history`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `myhr`.`job_history` (
  `employee_id` INT(11) UNSIGNED NULL DEFAULT NULL,
  `start_date` DATE NOT NULL,
  `end_date` DATE NOT NULL,
  `job_id` VARCHAR(10) NULL DEFAULT NULL,
  `department_id` INT(11) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`start_date`, `end_date`),
  INDEX `job_id` (`job_id` ASC),
  INDEX `department_id` (`department_id` ASC),
  CONSTRAINT `job_history_ibfk_2`
    FOREIGN KEY (`job_id`)
    REFERENCES `myhr`.`jobs` (`job_id`),
  CONSTRAINT `job_history_ibfk_3`
    FOREIGN KEY (`department_id`)
    REFERENCES `myhr`.`departments` (`department_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hr`.`my_book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `myhr`.`my_book` (
  `id` INT(11) NOT NULL,
  `name` VARCHAR(50) NOT NULL,
  `price` INT(11) NULL DEFAULT NULL,
  `isbn_no` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`, `name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hr`.`my_emp`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `myhr`.`my_emp` (
  `employee_id` INT(11) UNSIGNED NOT NULL,
  `first_name` VARCHAR(20) NULL DEFAULT NULL,
  `last_name` VARCHAR(25) NOT NULL,
  `email` VARCHAR(25) NOT NULL,
  `phone_number` VARCHAR(20) NULL DEFAULT NULL,
  `hire_date` DATE NOT NULL,
  `job_id` VARCHAR(10) NOT NULL,
  `salary` DECIMAL(8,2) NOT NULL,
  `commission_pct` DECIMAL(2,2) NULL DEFAULT NULL,
  `manager_id` INT(11) UNSIGNED NULL DEFAULT NULL,
  `department_id` INT(11) UNSIGNED NULL DEFAULT NULL,
  INDEX `job_id` (`job_id` ASC),
  CONSTRAINT `my_emp_ibfk_1`
    FOREIGN KEY (`job_id`)
    REFERENCES `myhr`.`jobs` (`job_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

USE `myhr` ;

-- -----------------------------------------------------
-- Placeholder table for view `hr`.`emp_details_view`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `myhr`.`emp_details_view` (`employee_id` INT, `job_id` INT, `manager_id` INT, `department_id` INT, `location_id` INT, `country_id` INT, `first_name` INT, `last_name` INT, `salary` INT, `commission_pct` INT, `department_name` INT, `job_title` INT, `city` INT, `state_province` INT, `country_name` INT, `region_name` INT);

-- -----------------------------------------------------
-- View `hr`.`emp_details_view`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `myhr`.`emp_details_view`;
USE `myhr`;
CREATE  OR REPLACE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `myhr`.`emp_details_view` AS select `e`.`employee_id` AS `employee_id`,`e`.`job_id` AS `job_id`,`e`.`manager_id` AS `manager_id`,`e`.`department_id` AS `department_id`,`d`.`location_id` AS `location_id`,`l`.`country_id` AS `country_id`,`e`.`first_name` AS `first_name`,`e`.`last_name` AS `last_name`,`e`.`salary` AS `salary`,`e`.`commission_pct` AS `commission_pct`,`d`.`department_name` AS `department_name`,`j`.`job_title` AS `job_title`,`l`.`city` AS `city`,`l`.`state_province` AS `state_province`,`c`.`country_name` AS `country_name`,`r`.`region_name` AS `region_name` from (((((`myhr`.`employees` `e` join `myhr`.`departments` `d`) join `myhr`.`jobs` `j`) join `myhr`.`locations` `l`) join `myhr`.`countries` `c`) join `myhr`.`regions` `r`) where ((`e`.`department_id` = `d`.`department_id`) and (`d`.`location_id` = `l`.`location_id`) and (`l`.`country_id` = `c`.`country_id`) and (`c`.`region_id` = `r`.`region_id`) and (`j`.`job_id` = `e`.`job_id`));

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

