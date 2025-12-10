class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> closetoopen =new  HashMap<Character,Character>() ;

        closetoopen.put(')','(');
        closetoopen.put('}','{');
        closetoopen.put(']','[');
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(closetoopen.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==closetoopen.get(c)){
                    stack.pop();
                }
                else{
                    return false ;
                }
            }
            else{
                stack.push(c);

            }
           
        }
        return stack.isEmpty();
        
    }
}