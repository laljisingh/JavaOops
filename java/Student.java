public class Student{
    private String name;
    private int roll;
    private char gender;
    private double marks;

    public void setName(String names){
        name = names;
    }
    public void setMarks(double mark){
        marks = mark;
    }
    public void setRoll(int r){
        roll = r;
    }
    public void setGender(char g , String pass){
        if(pass.equals("1234"))
            gender = g;
    }

    ///getter 
    public void getName(){
        System.out.println(name);
    }
    public void getRoll(){
        System.out.println(roll);
    }
    public void getGender(){
        System.out.println(gender);
    }
    public void getMarks(){
        System.out.println(marks);
    }
    
    
}
