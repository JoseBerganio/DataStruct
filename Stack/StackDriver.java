public class StackDriver {
    public static void main(String[] args) {
        Stack basket = new Stack();
        Stack cabinet = new Stack(20);

        basket.push('e');
        basket.push('s');
        basket.push('o');
        basket.push('j');
        System.out.println("--------------------");
        basket.pop();
        basket.pop();
        basket.pop();
        // basket.multiplePush('a', 'b');

        System.out.println(basket.peek() + " is the current index");
    }
}
