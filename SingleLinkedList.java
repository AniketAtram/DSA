package DSA;

public class SingleLinkedList {
    private Node head = null;

    // TODO : Add a node at front of linked list
    // The complexity of adding a node at the front has a time complexity of O(1)
    // since adding a node at front is done or performed in constant time
    public void addFront(int data){
        // Allocate a new node
        Node new_node = new Node(data);
        // Make new node as head
        new_node.next = head;
        // move the head to new node
        head = new_node;

    }

    // TODO: Add a node after a given element
    public void addAfter(){

    }

    // TODO: Add a node at the end of linked list
    public void addEnd(){

    }

    // TODO: Print the linked list
    public void print(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
            if (temp!=null){
                System.out.print(" -> ");
            }

        }
    }
}