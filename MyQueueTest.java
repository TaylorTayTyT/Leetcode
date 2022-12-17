public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue a = new MyQueue(); 
        a.push(0);
        a.push(1);
        a.push(2);
        a.push(3);
        System.out.println("Peeking: " + a.peek());
    }
}
