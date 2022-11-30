import java.io.*;
import java.util.*;
class hello{
    public static void main(String[] args){
        System.out.println("Enter Your Name :-");
        Scanner scn=new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("Your Name is -----> "+name);
        scn.close();
    }
}