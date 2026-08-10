class LinkedList {

    Node head;

    public LinkedList() {
    }

    public int get(int index) {
        if(head == null){
            return -1;
        }

        Node cur = head;
        int i = 0;
        while(cur != null){
            if(i == index){
                return cur.val;
            }
            cur = cur.next;
            i++;
        }
        return - 1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertTail(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new Node(val);
    }

    public boolean remove(int index) {
        if(head == null){
            return false;
        }
        if(index == 0){
            head = head.next;
            return true;
        }

        int i = 0;
        Node cur = head;
        while(cur != null && i < index - 1){
            cur = cur.next;
            i++;
        }
        
        if (cur == null || cur.next == null) {
            return false;
        }

        cur.next = cur.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        Node cur = head;
        while(cur != null){
            values.add(cur.val);
            cur = cur.next;
        }
        return values;
    }


    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

    }
}
