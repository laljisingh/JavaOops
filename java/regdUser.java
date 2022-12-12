class regdUser extends user{
    private long mob;
    private String email;

    public void setMob(long mob){
        this.mob = mob;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }
    public static void showRegd() {
        System.out.println("You are regd User" +"Email");
    }
}