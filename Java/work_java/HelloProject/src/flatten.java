

import java.util.Arrays;
import java.util.Scanner;

public class flatten {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);

        for(int tc=0;tc<10;tc++) {
            
            int block[]=new int[100];
            int max=0,min = 0,dump=0;
            
            dump=sc.nextInt();
        
            for(int i=0;i<100;i++) {
                block[i]=sc.nextInt();
                }
        
            for(int j=0;j<dump;j++) {
                Arrays.sort(block);
                
                if(block[dump-1]==block[0])break;
                
                block[dump-1]--;	//이거 아니고 마지막꺼에서 하나 빼야지 	//dump는 돌리는 횟수잖아
                block[0]++;
                
                max=block[dump-1];
                min=block[0];
            }System.out.println("#"+(tc+1)+" "+(max-min));
    }

}}