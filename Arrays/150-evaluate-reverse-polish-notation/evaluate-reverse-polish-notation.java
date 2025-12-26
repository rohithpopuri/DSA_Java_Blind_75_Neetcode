class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        Set<String> set = Set.of("+", "-", "/", "*");

        for(String s : tokens){
            if (set.contains(s)){
                int element_2 = stack.pop();
                int element_1 = stack.pop();
                if (s.equals("+")) {
                    stack.push(element_1 + element_2);
                } else if (s.equals("-")) {
                    stack.push(element_1 - element_2);
                } else if (s.equals("*")) {
                    stack.push(element_1 * element_2);
                } else if (s.equals("/")) {
                    stack.push(element_1 / element_2);
                }
            }else{
                int element = Integer.parseInt(s);
                stack.push(element);
            }
        }
        return stack.peek();
        
    }
}