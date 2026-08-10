class DynamicArray {

    private int[] storage;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.storage = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return storage[i];
    }

    public void set(int i, int n) {
        storage[i] = n;
    }

    public void pushback(int n) {
        if(storage.length == size){
            resize();
        }
        size++;
        storage[size - 1] = n;
    }

    public int popback() {
        int popped = storage[size - 1];
        size--;
        return popped;
    }

    private void resize() {
        capacity *= 2;
        storage = Arrays.copyOf(storage,capacity); 
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
