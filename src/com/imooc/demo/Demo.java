package com.imooc.demo;

import com.imooc.basic_information.*;

public class Demo {
    public static void main(String[] args) {
        Department department1 = new Department(01, "人事部");
        Department department2 = new Department(02, "财务部");
        Department department3 = new Department(03, "市场部");
        Department department4 = new Department(04, "行政部");
        Duty duty1 = new Duty(01, "职员");
        Duty duty2 = new Duty(02, "助理");
        Duty duty3 = new Duty(03, "经理");
        Employee employee1 = new Employee("张铭", "S001", 29, "男");
        Employee employee2 = new Employee("李艾爱", "S002", 21, "女");
        Employee employee3 = new Employee("孙超", "S004", 29, "男");
        Employee employee4 = new Employee("孙美美", "S005", 26, "女");
        Employee employee5 = new Employee("蓝迪", "S006", 37, "男");
        Employee employee6 = new Employee("米莉", "S007", 24, "女");
        department1.add_employee(employee1);
        department1.add_employee(employee2);
        department1.add_employee(employee3);
        department3.add_employee(employee4);
        department3.add_employee(employee5);
        department3.add_employee(employee6);
        System.out.println(employee1.employeeInfo(department1, duty3));
        System.out.println(employee2.employeeInfo(department1, duty2));
        System.out.println(employee3.employeeInfo(department1, duty1));
        System.out.println(employee4.employeeInfo(department3, duty1));
        System.out.println(employee5.employeeInfo(department3, duty3));
        System.out.println(employee6.employeeInfo(department3, duty1));
        System.out.println(department1.getDepartment() + "共有" + department1.getDepartment_numbers() + "名员工");
        System.out.println(department3.getDepartment() + "共有" + department3.getDepartment_numbers() + "名员工");

    }
}
