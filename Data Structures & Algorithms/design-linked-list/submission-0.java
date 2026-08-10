class MyLinkedList {
    private Node head;

    public MyLinkedList() {}

    public int get(int index) {
        if(head == null){
            return -1;
        }

        Node curr = head;
        int i = 0;
        while(curr != null &&  i != index){
            curr = curr.next;
            i++;
        }

        if(curr == null){
            return -1;
        }

        return curr.val;

    }

    public void addAtHead(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        if(head == null){
            head = new Node(val);
            return;
        }
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(val);
    }

    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }

        Node prev = head;
        int i = 0;
        while(prev != null && i < index - 1){
            prev = prev.next;
            i++;
        }

        if (prev == null) return;
        
        Node newNode = new Node(val);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if(head == null) return;
        if(index == 0){
            head = head.next;
            return;
        }

        Node prev = head;
        int i = 0;
        while(prev.next != null && i < index - 1){
            prev = prev.next;
            i++;
        }

        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */