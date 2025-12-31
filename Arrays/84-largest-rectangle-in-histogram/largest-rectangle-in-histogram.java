class Solution {
    public int largestRectangleArea(int[] heights) {
        //  Stack <Integer> stack = new Stack<>();
        // int min_element=heights[heights.length-1];
        // int max_area=heights[heights.length-1];
        // int width=1;
        // stack.push(min_element);


        // for(int  i=heights.length-1 ;i>=0;i--){
        //     min_element= Math.min(min_element,heights[i]);
        //     if(min_element!=stack.peek()){
        //         stack.pop();
        //         stack.push(min_element);
        //     } 
        //     System.out.println("the width is"+" "+width);
        //     int current_area=stack.peek()*(width);
        //     if(max_area<=current_area && current_area<=heights[i]){
        //             width=1;
        //             stack.pop();
        //             stack.push(heights[i]);
        //             min_element=heights[i];
        //             max_area=heights[i];
                
        //     }else if(max_area<=current_area) {
        //         max_area=current_area;
        //     }else{
        //        if(max_area<heights[i]){
        //             width=1;
        //             stack.pop();
        //             stack.push(heights[i]);
        //             min_element=heights[i];
        //             max_area=heights[i];
                
        //         }else if (current_area<heights[i]){
        //             width=1;
        //             stack.pop();
        //             stack.push(heights[i]);
        //             min_element=heights[i];

        //         }
                
                
        //     }
           
        //     width++;
        //     System.out.println("the ca is"+" "+current_area);
            

        //     System.out.println("the elemnt is"+" "+heights[i]);
        //     System.out.println("the min element is"+" "+min_element);
        //     System.out.println(max_area);
            
        // }
        // return max_area;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int currHeight = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {

                int height = heights[stack.pop()];
                int width = stack.isEmpty()
                        ? i
                        : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}