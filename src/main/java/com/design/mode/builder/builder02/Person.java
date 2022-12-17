package com.design.mode.builder.builder02;

/**
 * @Author: Xibiao Cao
 * @Date: 2022/12/12 21:58
 * @Description:
 */
public class Person {

    private int id;
    private String name;
    private int age;
    private String sex;
    private String phone;
    private String address;
    private String desc;

    /**
     * 构造函数私有化
     */
    private Person(){}

    private Person(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.phone = builder.phone;
        this.address = builder.address;
        this.desc = builder.desc;
    }

    /**
     * 通过内部类Builder构造外部类对象
     */
    public static class Builder{
        private int id;
        private String name;
        private int age;
        private String sex;
        private String phone;
        private String address;
        private String desc;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

}
