class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //approach using array failed at 47 testcase
        int size = temperatures.length;
        // int l = 0;
        // int r = 1;
        int[] arr = new int[size];

        // while (l < size && r < size) {
        //     if (temperatures[l] < temperatures[r]) {
        //         arr[l] = r - l;
        //         l++;
        //         r = l + 1;
        //     } else {
        //         r++;
        //         if (r == size) {
        //             l++;
        //             r = l + 1;
        //         }
        //     }
        // }
        // return arr;

        Stack<int[]> stack = new Stack<>();
        for(int i =0;i<size;i++){
            int temp = temperatures[i];
            while(!stack.isEmpty()&&temp>stack.peek()[0]){
                int[] pair = stack.pop();
                arr[pair[1]]=i-pair[1];

            }
            stack.push(new int[]{temp, i});
        }
        return arr ;


    }
}