class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "+":
                    int top = stack.pop();
                    int newTop = top + stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}