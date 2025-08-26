public class Stack {
    private int maxCapacity;
    private char[] container;
    private int top;

    public Stack() {
        this.top = 0;
        this.container = new char[10];
        this.maxCapacity = 10;
    }

    public Stack(int size) {
        this.top = 0;
        this.container = new char[size];
        this.maxCapacity = size;
    }

    public void push(char itemToPush) {
        if (this.top < 0) {
            this.top = 0;
        }
        if (this.top < this.maxCapacity) {
            System.out.println(itemToPush + " => was pushed to stack");
            this.container[this.top] = itemToPush;
            this.top++;
        } else {
            System.out.println("The stack is full");
        }
    }

    public char pop() {
        if (this.top < 0) {
            System.out.println("No more items");
            return '_';
        }
        char topItem = this.peek();
        System.out.println(topItem + " => was popped from stack");
        this.top--;
        return topItem;
    }

    /*
     * public void multiplePush(char item1, char item2){
     * this.push(item1);
     * this.push(item2);
     * }
     */

    public char peek() {
        if (this.top == 0) {
            System.out.println("No more item to Peek");
            return '_';
        }
        return this.container[this.top - 1];
    }
}
