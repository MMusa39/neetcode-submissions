class Solution {
    public boolean isValid(String s) {
        // Create a mapping between the associated symbols.
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');
        
        /*
         * We will traverse s, and at each character, if it is an opening symbol
         * (so not a key in mapping), we will simply push the symbol onto the stack.
         * If, however, the symbol is a closing symbol, then the corresponding open
         * symbol should be on top of the stack.
         */
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
