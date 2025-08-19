public class FamilyMemberList {
    public static void main(String[] args){

        FamilyMember mem1 = new FamilyMember("Novelita", 56);
        FamilyMember mem2 = new FamilyMember("Jose III", 54);
        FamilyMember mem3 = new FamilyMember("Lester", 24);
        FamilyMember mem4 = new FamilyMember("Jose", 20);
        FamilyMember mem5 = new FamilyMember("Carlo", 18);

        mem1.next = mem2;
        mem2.next = mem3;
        mem3.next = mem4;
        mem4.next = mem5;

        System.out.println("---------------------");
        FamilyMember current = mem1;
        while(current != null){
            System.out.println("Current Member: "+ current.getFamilyName() + " | Current Age: "+ current.getFamilyAge());
            current = current.next;
        }
        
    }
}
