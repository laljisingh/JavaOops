public class Student{
    String name;
    int roll;
    char gender;
    double marks;

    public void study(){
        System.out.println("Stydy");
    }
    public void play(String str){
        System.out.println("play  " + str);
    }
    
    public boolean getResult(){
        if(marks >=33)
            return true;
        return false;
    }
    public void setRoll(int rollNumber){
        roll = rollNumber;
    }
}
