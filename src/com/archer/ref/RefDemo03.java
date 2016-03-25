package com.archer.ref;

import java.sql.Ref;

/**
 * Created by Archer on 2016/3/25.
 */
public class RefDemo03 {


    public static void main(String[] args) {
Ref2 r1=new Ref2();
        r1.temp="geek";
        System.out.println(r1.temp);

        tell(r1);
        System.out.println(r1.temp);
        /**
         * 因为新创建了ref2的类，新开辟了堆内存，所以string的引用就改变了。
         * 在上一个例子中，并没有心开辟内存，所以string的引用不可改变。
         */

    }

    public static void tell(Ref2 r2){

        r2.temp="Archer";

    }

}


class Ref2{

    String temp="hello";

}
