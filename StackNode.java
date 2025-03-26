class StackNode {
    int data;
    StackNode next;
    
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private StackNode top;
    
    public Stack() {
        this.top = null;
    }
    
    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        
        StackNode current = top;
        System.out.println("Stack elements:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    // Peek method to return top element
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return top.data;
    }
    
    // Pop method to remove and return top element
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }
}

public class StackTest {  class StackNode {
    int data;
    StackNode next;
    
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private StackNode top;
    
    public Stack() {
        this.top = null;
    }
    
    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        
        StackNode current = top;
        System.out.println("Stack elements:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1; 
        return top.data;
    }
    
   
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }
}

public class StackTest {  
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        stack.display();
        
        System.out.println("Top element is " + stack.peek());
        
        System.out.println(stack.pop() + " popped from Stack");
        
        stack.display();
    }
}

    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        stack.display();
        
        System.out.println("Top element is " + stack.peek());
        
        System.out.println(stack.pop() + " popped from Stack");
        
        stack.display();
    }
}
