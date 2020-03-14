class Stack{
    static final int MAX=1000;
    int top,x;
    int a[]=new int[MAX];
    
    boolean isEmpty(){
        return (top<0);
    }
    
    Stack(){
        top=-1;
    }
    
    void push(int x){
        if(top>=MAX-1){
            System.out.println("Stack Over flow");
            
        }
        else{
            a[++top]=x;
            System.out.println("Pushed: "+x);
        }
    }
    
    void pop(){
        if(top<0){
            System.out.println("Stack Underflow");
        }
        else{
            x=a[top--];
            System.out.println("Popped: "+x);
        }
    }
}

public class Main{
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();
        
    }
}
