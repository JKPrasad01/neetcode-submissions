class Solution {
     public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> m=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer>  q=new PriorityQueue<>((a,b)->m.get(a)-m.get(b));
        
        for (int n: m.keySet()){
            q.add(n);
            
            if(q.size()>k){
                q.poll();
            }
        }

        int[] res=new int[k];
            for (int i=0;i<k;i++){
                res[i]=q.poll();
            }
            
        return res;
    
    }
}
