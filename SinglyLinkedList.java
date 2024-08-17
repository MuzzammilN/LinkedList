package LinkedList;
public class SinglyLinkedList {
    
    private listNode head;
    
    private static class listNode {
        private int data;
        private listNode next;
        
        public listNode(int data){
            this.data = data;
            this.next = null;
        }
        
    }


    public static void main(String[] args) {
        SinglyLinkedList sil = new SinglyLinkedList();
        sil.head = new listNode(10);
        listNode second = new listNode(1);
        listNode third = new listNode(8);
        listNode forth = new listNode(11);


        sil.head.next = second;
        second.next = third;
        third.next = forth;

    }
}
