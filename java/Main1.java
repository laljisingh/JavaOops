public class Main1{
    public static void Modify(Student s2){
        s2.marks=1560;
    }
    public static void swap2(Student x, Student y) {
        Student z = new Student();
        z.marks = x.marks;
        z.gender = x.gender;

        x = y;
        y = z;
    }

    public static void swapFinal(Student x, Student y){
        Student z=new Student();
        z.marks=x.marks;
        x.marks = y.marks;
        y.marks = z.marks; 


    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.marks=100;
        
        Student s2=new Student();
        s2.marks=160;

        System.out.print(s2.marks+" ,"+s1.marks+" ");

        // Modify(s2);
        // swap2(s1,s2);
        swapFinal(s1, s2);

        System.out.print(s2.marks+" ,"+s1.marks);

    }
}                                  