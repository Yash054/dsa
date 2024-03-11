class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int ele: nums1)
        {
            mp.put(ele, mp.getOrDefault(ele,0)+1);// important note
        }
        List<Integer> li = new ArrayList<>();
        for(int ele: nums2)
        {
            if (mp.containsKey(ele)) {
                li.add(ele);
                mp.remove(ele);
            }
        }
        
        int[] result = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            result[i] = li.get(i);
        }
        return result;
}}