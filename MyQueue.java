import java.util.Stack;
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int turn;
    public MyQueue() {
        this.stack1 = new Stack<>(); 
        this.stack2 = new Stack<>(); 
        this.turn = 1; 
    }

    private void flip(int x) {
        if(this.turn == -1) {
            this.stack1.push(x); 
            System.out.println("Transferring to stack1");
            while(!this.stack2.empty()) {
                int temp = this.stack2.pop(); 
                System.out.println(temp);
                this.stack1.push(temp);
            }
        }
        else if(this.turn == 1) {
            this.stack2.push(x); 
            System.out.println("Transferring to stack2");
            while(!this.stack1.empty()) {
                int temp = this.stack1.pop(); 
                this.stack2.push(temp);
            }
        }
    }

    public void push(int x) {
        System.out.println("Pushing: " + x);
        if(this.stack1.empty()) {
            stack1.push(x);
            return; 
        }
        flip(x);
        this.turn *= -1; 
    }
    
    public int pop() {
        if(this.turn == 1) {
            return stack1.pop(); 
        }
        else {
            return stack2.pop(); 
        }
    }
    
    public int peek() {
        if(this.turn == 1) {
            return stack1.peek(); 
        }
        else {
            return stack2.peek(); 
        }
    }
    
    public boolean empty() {
        return stack1.empty() || stack2.empty(); 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
