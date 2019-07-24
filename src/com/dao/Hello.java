package com.dao;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;

/**
 * @author dong
 * @date 2019/7/19 - 11:19
 */
public class Hello {//模板一：psvm
    public static void main(String[] args) {



        //模板二:sout
        //变形:soutp/soutm/soutv/xxx.sout
        System.out.println("hello!");
        System.out.println("args = [" + args + "]");

        System.out.println("Hello.main");

        int num1=10;
        System.out.println("num1 = " + num1);
        int num2=20;
        System.out.println("num2 = " + num2);

        System.out.println(num1);



        //模板三：
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);
        if (list == null) {

            }

        }


    public void method(){

        System.out.println("Hello.method");


    }
}
