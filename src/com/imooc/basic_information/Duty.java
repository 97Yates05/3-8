package com.imooc.basic_information;

/**
 * 职务类
 * 职务分为职员、助理、经理
 * 编号为01、02、03
 */
public class Duty {
    private int postion_number;
    private String postion_name;

    public int getPostion_number() {
        return postion_number;
    }

    public void etPostion_number(int postion_number) {
        this.postion_number = postion_number;
    }

    public String getPostion_name() {
        return postion_name;
    }

    public void setPostion_name(String postion_name) {
        this.postion_name = postion_name;
    }

    public Duty() {
    }

    public Duty(int postion_number, String postion_name) {
        this.postion_number = postion_number;
        this.postion_name = postion_name;
    }
}
