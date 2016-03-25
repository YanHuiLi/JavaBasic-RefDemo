package com.archer.thisdemo;

/**
 * this关键字得到同一个对象
 * Created by Archer on 2016/3/25.
 */
public class ThisDemo02 {
    public static void main(String[] args) {

         People1 p=new People1();
        System.out.println(p);
       p.tell();

    }
}


class People1{
    public void tell(){

        System.out.println(this);

    }

}