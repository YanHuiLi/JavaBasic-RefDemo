package com.archer.ref;

/**
 * Created by Archer on 2016/3/25.
 */
public class RefDemo02 {

    public static void main(String[] args) {
        String str1="Hello";
        System.out.println(str1);

        //数值并没有被改变，String不可变
        tell(str1);
        System.out.println(str1);
    }

    //创建一个方法
    public static void tell(String str2){

        str2="Geek";

    }

}
