package a_Foundations;
import java.util.Scanner;

public class Patterns{

    public static void p01(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    public static void p02(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    public static void p03(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p04(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void p05(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    public static void p06(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p07(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void p08(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("X");
            }
            // for(int j=1;j<=n-i;j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
    public static void p09(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*n-2*i+1;k++){
                System.out.print("X");
            }
            System.out.println();
        }
    }
    public static void p10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=n-stars;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=stars;k++){
                System.out.print("X");
            }

            System.out.println();
        }
    }
    public static void p11(int n){
        int start=0;
        for(int i=1;i<=n;i++){
            if(i%2==0) start=0;
            else start=1;
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void p12(int n){
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=0;j<=2*(n-i)-1;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void p13(int n){
        char a=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((a++)+" ");
            }
            System.out.println();
        }
    }
    public static void p14(int n){
        for(int i=1;i<=n;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p15(int n){
        for(int i=1;i<=n;i++){
            for(char j='A';j<='A'+(n-i);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p16(int n){

        for(int i=1;i<=n;i++){
            char a=(char)('A'+ i-1);
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    public static void p17(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            for(char j=(char)('A'+i-2);j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void p18(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==n || j==1 || i==j ||j==(n-i+1)){
                    System.out.print("* ");
                }       else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void p19(int n){
        for(int i=0;i<n;i++){
            for(char j=(char)('E'-i);j<='E';j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void p20(int n){

        for(int i=n;i>=1;i--){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=0;j<=2*(n-i)-1;j++){
                System.out.print("  ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=0;j<=2*(n-i)-1;j++){
                System.out.print("  ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void p21(int n){
        int s=2*n-2;
        for(int i=1;i<=(2*n-1);i++){
            int a=i;
            //star
            if(i>n) a=(2*n)-i;
            for(int j=1;j<=a;j++){
                System.out.print("* ");
            }
            //space
            for(int j=1;j<=s;j++){
                System.out.print("  ");


            }
            //star
            for(int j=1;j<=a;j++){
                System.out.print("* ");
            }
            if(i<n ) s-=2;
            else s+=2;
            System.out.println();
        }
    }
    public static void p22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int down= (2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,down), Math.min(left,right))+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        p22(n);
        sc.close();
    }
}
