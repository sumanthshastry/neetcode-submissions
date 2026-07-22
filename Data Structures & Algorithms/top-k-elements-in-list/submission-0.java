class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if (nums.length == 0 || k == 0) {
            return new int [0];
        }

        final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Arrays.stream(nums).forEach(i -> {
            map.merge(i, 1, (oldValue, newValue) -> ++oldValue);
        });

        System.out.println(map.size());

        LinkedHashMap<Integer, Integer> sortedMap = map.entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMap);
        Iterator<Integer> it = sortedMap.keySet().iterator();
        int [] result = new int [k];
        for(int i=0; i<k; i++) {
            result[i] = it.next();
        }

        return result;
    }
}
