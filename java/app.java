class app{

    public static void main(String[] args) {
        
        user u1=new user();
        u1.setName("Lalji");
        u1.setGender('M');

        System.out.println(u1.getName());
        u1.showList();
        regdUser r=new regdUser();
        r.setEmail("lalji7411@gmail.vom");
        r.setMob(872555);
        r.showRegd();
        System.out.println(r.getEmail());
    }
}