package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class MangerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangerWebApplication.class, args);
        int num=1;

        for(int i=0;i<100;i++){
            num++;
        }
        int a1=add(1,2);
        System.out.println(a1);
        int a2=add(2,3);
        System.out.println(a1+a2);
        int result=a1+a2;
        System.out.println(result);

        System.out.println("num"+num);
        num++;
        System.out.println("num"+num);
     operatorList();
    }
    public static int add(int a,int b){
        int result=a+b;
        return result;
    }
    public static void operatorList(){
        ArrayList<String> list=new ArrayList<>();

    }

}
