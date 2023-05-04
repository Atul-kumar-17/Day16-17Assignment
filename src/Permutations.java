import java.util.Scanner;

public class Permutations {
    private static String swap(String s, int i, int j){
        char temp;
        char ch[]=s.toCharArray();
        temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    private static void permutation(String s ,int i,int j){
        if(i==j){
            System.out.println(s);
        }else{
            for(int k=i;k<=j;k++){
                s=swap(s,i,k);
                permutation(s,i+1,j);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        int length=s.length();
        permutation(s,0,length-1);

    }
}
