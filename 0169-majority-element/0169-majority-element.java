class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=mp.getOrDefault(nums[i],0);
            mp.put(nums[i],value+1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue()>(nums.length/2)){
                return entry.getKey();
            }

        }
        return -1;
    }
    }
