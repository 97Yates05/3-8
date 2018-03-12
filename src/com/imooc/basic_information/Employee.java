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
     */
    public Employee(String name, String job_number, int age, String sex) {
        this.setName(name);
        this.setJob_number(job_number);
        this.setAge(age);
        this.setSex(sex);
    }

    /**
     * 员工信息
     * 包括员工姓名、工号、性别、年龄、职务
     * @param department
     * @param duty
     * @return
     */
    public String employeeInfo(Department department,Duty duty) {
        String str = "姓名:" + this.getName() + '\n' + "工号:" + this.getJob_number()
                + '\n' + "性别:" + this.getSex() +'\n'+ "年龄:" + this.getAge()+'\n'
                +"职务:"+department.getDepartment()+duty.getPostion_name()+'\n'
                +"= = = = = = = = = = = = = = = = = = = = = = = = = = ";
        return str;
    }
}
