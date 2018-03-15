package com.imooc.basic_information;

/**
 * 员工类
 *
 */
public class Employee {
    private String name;
    private String job_number;
    private int age;
    private String sex;
    private Duty duty;
    private Department department;

    public Duty getDuty() {
        return duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_number() {
        return job_number;
    }

    public void setJob_number(String job_number) {
        this.job_number = job_number;
    }

    public int getAge() {
        return age;
    }

    /**
     * 限定年龄只能是18--65
     * @param age
     */
    public void setAge(int age) {
        if (age < 18 || age > 65)
            this.age = 18;
        else
            this.age = age;
    }

    public String getSex() {
        return sex;
    }

    /**
     * 限定性别只能是“男”或“女”
     * @param sex
     */
    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女"))
            this.sex = sex;
        else
            this.sex = "男";
    }

    public Employee() {
    }

    /**
     * 实现多参赋值的构造方法
     *
     * @param name
     * @param job_number
     * @param age
     * @param sex
     * @param department
     * @param duty
     */
    public Employee(String name, String job_number, int age, String sex, Department department, Duty duty) {
        this.setName(name);
        this.setJob_number(job_number);
        this.setAge(age);
        this.setSex(sex);
        this.setDepartment(department);
        this.setDuty(duty);
    }

    /**
     * 员工信息
     * 包括员工姓名、工号、性别、年龄、职务
     * @return
     */
    public String employeeInfo() {
        String str = "姓名:" + this.getName() + '\n' + "工号:" + this.getJob_number()
                + '\n' + "性别:" + this.getSex() +'\n'+ "年龄:" + this.getAge()+'\n'
                + "职务:" + this.getDepartment().getDepartment() + this.getDuty().getPostion_name() + '\n'
                +"= = = = = = = = = = = = = = = = = = = = = = = = = = ";
        return str;
    }
}
