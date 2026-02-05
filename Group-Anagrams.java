1
2class Solution {
3    public List<List<String>> groupAnagrams(String[] strs) {
4        Map<String, List<String>> map = new HashMap<>();
5
6        for (String str : strs) {
7            char[] charArray = str.toCharArray();
8            Arrays.sort(charArray);
9            String key = new String(charArray);
10
11            map.putIfAbsent(key, new ArrayList<>());
12            map.get(key).add(str);
13        }
14
15        return new ArrayList<>(map.values());
16    }
17}