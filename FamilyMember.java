public class FamilyMember {
    private String name;
    private int age;
    public FamilyMember next;

    //constructor
    public FamilyMember(){
        this.name = "";
        this.age = 0;
        this.next = null;
    }
    public FamilyMember(String name, int age){
        this.name = name;
        this.age = age;
        this.next = null;
    }

    public FamilyMember(String name, int age, FamilyMember next){
        this.name = name;
        this.age = age;
        this.next = next;

    }


    public String getFamilyName(){
        //formatting
        return name;
    }

    public int getFamilyAge(){
        //formatting
        return age;
    }

}
