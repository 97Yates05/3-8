package com.imooc.basic_information;

/**
 * 部门类
 * 共分为四个部门：人事部、财务部、市场部、行政部
 * 部门编号依次为 01、02、03、04
 */
public class Department {
    private int department_number;
    private String department;
    private Employee[] employees;
    private int department_numbers;

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 设定每个部门最多十位员工
     *
     * @return 返回保存员工的数组
     */
    public Employee[] getEmployee() {
        if (this.employees == null) {
            this.employees = new Employee[10];
        }
        return employees;
    }


    public void setEmployee(Employee[] employees) {

        this.employees = employees;
    }
    public int getDepartment_numbers() {
        return department_numbers;
    }

    public void setDepartment_numbers(int department_numbers) {
        this.department_numbers = department_numbers;
    }

    public Department() {
    }

    /**
     * 多参构造方法（部门编号、部门名称）
     * @param department_number
     * @param department
     */
    public Department(int department_number, String department) {
        this.setDepartment(department);
        this.setDepartment_number(department_number);
    }

    /**
     * 添加所属部门员工到该部门数组employees中
     * 得到该部员工人数储存在departmen_numbers中
     * @param employee
     */
    public void add_employee(Employee employee) {
        for (int i=0; i<this.getEmployee().length;i++) {
            if (this.getEmployee()[i] == null) {
                this.getEmployee()[i] = employee;
                department_numbers++;
                return;

            }
        }

    }

    /**
     * 得到某一个部门所有员工的信息
     * @return返回一个含有该部门员工信息的字符串
     */
    public String info() {
        String str = this.getDepartment()+"编号为"+this.getDepartment_number()+"\t" + "员工信息如下:"+'\n';
        for(int i=0;i<this.getDepartment_numbers();i++){
            str = str+"姓名:" + this.getEmployee()[i].getName()+'\n'+"工号:"
                    + this.getEmployee()[i].getJob_number()+'\n'+"性别:"
                    +this.getEmployee()[i].getSex()+'\n'+"年龄:"+this.getEmployee()[i].getAge()+'\n';
        }
        str+="= = = = = = = = = = = = = = = = = = = = = = = = = = ";
        return str;


    }


}
