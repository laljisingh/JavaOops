import java.util.*;

public class OneDArray{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size=scn.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter Element of Array");
        for(int i=0 ; i<size ; i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Elements of Array");
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}