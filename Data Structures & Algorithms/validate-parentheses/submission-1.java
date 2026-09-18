class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Set<Character> opening = Set.of(
            '(','{','['
        );

        for(char c: s.toCharArray()){
            if(opening.contains(c)){
                stack.push(c);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }

            char popped = stack.pop();

            if((c == ')' && popped != '(') ||
               (c == '}' && popped != '{') ||
               (c == ']' && popped != '[')){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
