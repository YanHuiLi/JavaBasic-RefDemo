package com.archer.thisdemo;

/**
 * this关键字的使用
 * Created by Archer on 2016/3/25.
 */
public class ThisDemo01 {

    public static void main(String[] args) {

         People p=new People("张三",30);
        p.tell();
    }
}

class People{

    private  String name;
    private  int age;

    public People(String name,int age){
        //把构造器里的name赋值给people类中的name，完成映射关系
        //age同理，通过this来表示本类中的属性

        this();//必须放在首行，否则无法通过，通过this关键字调用构造方法
        this.name=name;
        this.age=age;

    }

    public People(){

        System.out.println("无参数的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    //使用this关键字，表示当前调用的类的方法
    public void tell(){
        System.out.println("姓名："+this.getName()+"年龄"+this.getAge());
    }
}
