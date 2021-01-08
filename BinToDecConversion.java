import java.util.Arrays;
import java.util.Scanner;
public class BinToDecConversion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char p ='y';
        while(p=='y'){
        System.out.print("Enter the number of colums ");
        int x =sc.nextInt();
        int[] o = new int[x];
        int y [] = new int [x];
        for(int i=0;i<y.length;i++){
            System.out.print("Enter binary values " );
            y[i] = sc.nextInt();
            if(y[i] ==1 || y[i] ==0){
            o[i]= y[i] * (int) Math.pow(2, i);
            }
            else{
            System.out.println("Values are rejected");
            break;
            }
        }
        int w = Arrays.stream(o).sum();
        System.out.println("the sum Result is: " + w);
        System.out.print("please enter (y Key + Enter Key) if you want to enter an other value , or press (any key + Enter key) to finish ");
        p=sc.next().charAt(0);
    
    }
}
}
