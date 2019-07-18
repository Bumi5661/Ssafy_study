import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class move {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        System.setIn(new FileInputStream("src\\com\\ssafy\\java\\robot.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int tc = 0; tc < T; tc++)    {
        int n=sc.nextInt();
        char map[][]=new char[n][n];
        int cnt=0;
        
        for(int i=0;i<n;i++) {// map 입력받기
            for(int j=0;j<n;j++) {
                map[i][j]=sc.next().charAt(0);
                }}

        
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                
                switch(map[i][j]) {
                case 'A':
                    for(int k=j+1;k<n;k++) {
                    if (map[i][k]=='S')
                        cnt++;
                    else break;
                    //else if(map[i][k]=="B"||map[i][k]=="C")break;
                    }

                    break;
                    
                case 'B':
                    for(int k=j+1;k<n;k++) {
                        if (map[i][k]=='S')
                            cnt++;
                        else break;
                        }for(int k=j-1;k>=0;k--) {
                            if(map[i][k]=='S')
                                cnt++;
                            else break;}

                    break;
                    
                case 'C':
                    for(int k=j+1;k<n;k++) {//오른쪽
                        if (map[i][k]=='S')
                            cnt++;
                        else break;
                        }for(int k=j-1;k>=0;k--) {//왼쪽
                            if(map[i][k]=='S')
                                cnt++;
                            else break;}
                        for(int k=i+1;k<n;k++) {//위
                            if (map[k][j]=='S')
                                cnt++;
                            else break;
                            }for(int k=i-1;k>=0;k--) {//위
                                if(map[k][j]=='S')
                                    cnt++;
                                else break;}

                    break;
                    
                default:
                    break;
                }    
            }
        }
        System.out.println("#"+(tc+1)+" "+cnt);    }
    }
}