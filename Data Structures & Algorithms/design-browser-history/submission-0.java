class BrowserHistory {

    Node current;


    public BrowserHistory(String homepage) {
        this.current = new Node(homepage,null,null);
    }

    public void visit(String url) {
        current.next = new Node(url,null,current);
        current = current.next;
    }

    public String back(int steps) {
        int x = 0;
        while(current.prev != null && x < steps){
            current = current.prev;
            x++;
        }
        return current.url;
    }

    public String forward(int steps) {
        int x = 0;
        while(current.next != null && x < steps){
            current = current.next;
            x++;
        }
        return current.url;
    }

    class Node {
        String url;
        Node next;
        Node prev;

        public Node(String url, Node next, Node prev) {
            this.url = url;
            this.next = next;
            this.prev = prev;
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */