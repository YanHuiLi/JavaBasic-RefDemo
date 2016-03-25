package com.archer.staticDemo;

/**
 * Created by Archer on 2016/3/25.
 */
public class StaticDemo01 {
    public static void main(String[] args) {
        //申明成static的变量是实例化之前就已经被调用了
        Person.setCountry("云南");
        Person p=new Person("张三");
        p.tell();
        Person p1=new Person("张四");
        //通过类名调用比较合适，说明了staic是共享一块数据块
//        Person.setCountry("云南");
        p1.tell();
        Person p2=new Person("张五");
//        p2.country="昆明";
        p2.tell();
        Person p3=new Person("张六");
//        p3.country="红河";
        p3.tell();
    }
}

class Person{
     String name;

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Person.country = country;
    }

    private static   String country="北京";
    public Person(String name){
        this.name=name;

    }

    public void tell(){
        System.out.println("姓名是:"+name+"国家是："+country);
    }

}
