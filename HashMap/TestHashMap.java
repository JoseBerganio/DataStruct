public class TestHashMap {

    public static void main(String[] args) {
        HashMap test = new HashMap(7);

        test.put("fname", "Anna");
        test.put("lname", "Rizal");
        test.put("age", "19");
        test.put("grades", "78");
        test.put("grades", "79");
        test.put("address", "Bacolod");
        test.printAll();

    }
}
