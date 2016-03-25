package com.archer.ref;

/**
 * Created by Archer on 2016/3/25.
 */

/**
 * 申明的对象存在栈内存之中 ，赋值的变量在堆内存中。
 *
 *
 */

class Ref1{

    int temp=10;


}
public class RefDemo01 {

    public static void main(String[] args) {

        Ref1 r1=new Ref1();
        r1.temp=20;
        System.out.println(r1.temp);
        tell(r1);
        System.out.println(r1.temp);
    }

    public static void tell(Ref1 r2){
        r2.temp=30;
    }

}


