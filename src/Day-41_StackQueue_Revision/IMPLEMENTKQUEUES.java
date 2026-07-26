class KQueues {
    int[] arr;
    int[] front;
    int[] rear;
    int[] next;
    
    int freeSpot;
    
    KQueues(int k, int n) {
        arr = new int[n];
        next = new int[n];
        front = new int[k];
        rear = new int[k];
        
        for (int i = 0; i < k; i++) {
            front[i] = -1;
            rear[i] = -1;
        }
        
        for (int i = 0; i < n - 1; i++) {
            next[i] = i + 1;
        }
        next[n - 1] = -1;
        
        freeSpot = 0;
    }
    
    boolean enqueue(int data, int qNum) {
        
        if (freeSpot == -1) {
            System.out.println("Queue Overflow");
            return false;
        }
        
        int index = freeSpot;
        
        freeSpot = next[index];
        
        if (front[qNum] == -1) {
            front[qNum] = index;
        } else {
            next[rear[qNum]] = index;
        }
        
        next[index] = -1;
        
        rear[qNum] = index;
        
        arr[index] = data;
        
        return true;
    }
    
    int dequeue(int qNum) {
        
        if (front[qNum] == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        
        int index = front[qNum];
        
        front[qNum] = next[index];
        
        next[index] = freeSpot;
        freeSpot = index;
        
        return arr[index];
    }
    
    boolean isEmpty(int qNum) {
        return front[qNum] == -1;
    }
}

public class IMPLEMENTKQUEUES {

    public static void main(String[] args) {
        
        KQueues ks = new KQueues(3, 10);
        
        ks.enqueue(10, 0);
        ks.enqueue(20, 0);
        ks.enqueue(30, 1);
        
        System.out.println("Dequeued from q0: " + ks.dequeue(0));
        System.out.println("Dequeued from q1: " + ks.dequeue(1));
        System.out.println("Dequeued from q0: " + ks.dequeue(0));
        System.out.println("Is q0 empty? " + ks.isEmpty(0));
    }
}
