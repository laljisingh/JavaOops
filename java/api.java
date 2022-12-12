public class api{
    public static void main(String[] args){
        Encapsulation e1 = new Encapsulation("Lalji singh" ,150152026 , "Math");

        Encapsulation e2 = new Encapsulation();

        System.out.println(e2.getName());
        System.out.println(e2.getRoll());
        System.out.println(e2.getSubject());

        System.out.println(e1.getName());
        System.out.println(e1.getRoll());
        System.out.println(e1.getSubject());

    }

}