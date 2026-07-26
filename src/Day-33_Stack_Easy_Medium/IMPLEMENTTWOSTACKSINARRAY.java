public class IMPLEMENTTWOSTACKSINARRAY {

    private int[] arr;
    private int top1;
    private int top2;
    private int size;


    public IMPLEMENTTWOSTACKSINARRAY(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }


    public void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }


    public void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }


    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }


    public int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }


    public static void main(String[] args) {

        IMPLEMENTTWOSTACKSINARRAY ts = new IMPLEMENTTWOSTACKSINARRAY(5);
        
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        
        System.out.println("Popped from stack1: " + ts.pop1()); // 11
        ts.push2(40); // Stack Overflow
        System.out.println("Popped from stack2: " + ts.pop2()); // 7
    }
}
