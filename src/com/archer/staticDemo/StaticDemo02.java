package com.archer.staticDemo;

/**
 * 静态方法不能调用非static的方法和属性
 * Created by Archer on 2016/3/25.
 */
public class StaticDemo02 {
    private  static int i=10;
    public static void main(String[] args) {
        tell();
        System.out.println(i);
    }

    //
    public  static void tell(){

    }
}
