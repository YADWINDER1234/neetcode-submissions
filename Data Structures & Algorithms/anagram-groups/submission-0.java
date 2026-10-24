class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();

        for(int i =0;i<strs.length;i++){
            String word = strs[i];
        char[]ch = word.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);
        List<String>group=map.getOrDefault(key,new ArrayList<>());
        group.add(word);
        map.put(key,group);

        
        
        }
        return new ArrayList<>(map.values());
    }
}
