// package JAVAOOPS;
public class Main{
    
    public static void main(String[] args){
        Student st=new Student();
       
       //set the data
        st.name="lalji";
        st.roll=1526;
        st.gender = 'M';
        st.marks = 152;

//get the data
        System.out.println(st.name);
        System.out.println(st.roll);
        System.out.println(st.gender);
        System.out.println(st.marks);

        Student st1=new Student();
       
       //set the data
        st1.name="lalji";
        st1.roll=1526;
        st1.gender = 'M';
        st1.marks = 152;

        // Student[] arr = new Student[3];

        // arr[0] = st;
        // arr[1] = st1;

        // arr[2] = new Student();
        // arr[2].name = "Chetan";
        // arr[2].roll = 3;
        // arr[2].gender = 'M';
        // arr[2].marks = 95;

        // System.out.println(arr[2].name);
        // System.out.println(arr[2].roll);
        // System.out.println(arr[2].gender);
        // System.out.println(arr[2].marks);

        // System.out.println("///////////");
        // System.out.println(arr[0].name);
        // System.out.println(arr[0].roll);
        // System.out.println(arr[0].gender);
        // System.out.println(arr[0].marks);
        
    }
}