package LinkedList;
public class PrintingSinglyLinkedList {
    
    private listNode head;
    
    private static class listNode {
        private int data;
        private listNode next;
        
        public listNode(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public void display(){
        listNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        PrintingSinglyLinkedList sil = new PrintingSinglyLinkedList();
        sil.head = new listNode(10);
        listNode second = new listNode(1);
        listNode third = new listNode(8);
        listNode forth = new listNode(11);


        sil.head.next = second;
        second.next = third;
        third.next = forth;

        sil.display();

    }
}
