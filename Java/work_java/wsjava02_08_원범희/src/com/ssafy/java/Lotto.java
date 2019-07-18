package com.ssafy.java;

import java.util.Random;

public class Lotto {

    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        Random r=new Random();
        int lotto[]=new int [45];
        
        for(int i=0;i<6;i++) 
        {
            int t=r.nextInt(45)+1;
            if(lotto[t]!=1)
                lotto[t]++;
            else 
            {
            	i--;
            	continue;
            }
        }
        
        for(int i=0;i<45;i++) 
        {
            if(lotto[i]==1)
                System.out.println(i);
        }
    }

}