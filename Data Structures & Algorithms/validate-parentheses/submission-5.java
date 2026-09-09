class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(mapping.containsKey(current)) {
                if(stack.isEmpty() || stack.pop() != mapping.get(current)) return false;
            } else {
                stack.push(current);
            }
        }
        return stack.isEmpty();
    }
}
