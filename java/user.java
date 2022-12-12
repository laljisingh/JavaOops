class user{
    private String name;
    private char gender;
    private String dateOfBirth;

    public void setName(String name) {
        this.name =name;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void showList(){
        System.out.println("Only view List");
    }
}