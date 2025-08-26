public class DriverQueue {
    public static void main(String[] args) {
        Queue stiCashier = new Queue(20);

        stiCashier.enqueue('A');
        stiCashier.enqueue('B');
        stiCashier.enqueue('C');
        stiCashier.enqueue('D');
        stiCashier.enqueue('E');
        stiCashier.dequeue();
        stiCashier.dequeue();
        stiCashier.dequeue();
        stiCashier.dequeue();
        stiCashier.dequeue();
        

    }
}
