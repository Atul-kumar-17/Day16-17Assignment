import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of words ");
        int n = sc.nextInt();
        String[] str = new String[n];
        int start = 0;
        int end = str.length - 1;
        int mid = (start + end) / 2;
        System.out.println("Enter the words");
        for (int i = 0; i < str.length; i++) {
            System.out.println("Word " + (i + 1) + " : ");
            str[i] = sc.next();
        }
        for(int j=0;j<str.length;j++){
            System.out.println(str[j]);
        }
        System.out.println("Enter the String you want to search :");
        String str1 = sc.next();
        while (start <= end) {
            if (str[mid].equals(str1)) {
                System.out.println("Element is at " + mid + " position");
                break;
            } else if (str[mid].compareTo(str1) < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println(str1 + " is word no.= " +(mid+1));
    }
}


