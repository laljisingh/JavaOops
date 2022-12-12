public class Encapsulation{
    private String name;
    private double roll;
    private String subject;

    Encapsulation(String n, double r, String s ){
        name = n;
        roll = r;
        subject =s;
    }
    Encapsulation(){
        name = "abcd";
        roll = 100;
        subject ="Math";
    }

   public String getName(){
        return name;
    }
    public double getRoll(){
        return roll;
    }
    public String getSubject(){
        return subject;
    }
}