package com.java.first;

import java.util.Scanner;

public class CheckPoint {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int h=0,w=0;
        int ow;
        h=sc.nextInt();
        w=sc.nextInt();
        ow=w+100-h;
       
        System.out.println("비만수치는 "+ow+"입니다.");
        
        if(ow>0) {
            System.out.println("당신은 비만이군요");
        }
    }

}