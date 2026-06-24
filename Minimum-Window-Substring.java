1class Solution {
2    public String minWindow(String s, String t) {
3
4        HashMap<Character, Integer> map = new HashMap<>();
5
6        for(char c : t.toCharArray()){
7            map.put(c, map.getOrDefault(c, 0) + 1);
8        }
9
10        int left = 0;
11        int count = t.length();
12
13        int minLen = Integer.MAX_VALUE;
14        int start = 0;
15
16        for(int right = 0; right < s.length(); right++){
17
18            char ch = s.charAt(right);
19
20            if(map.containsKey(ch)){
21                if(map.get(ch) > 0)
22                    count--;
23
24                map.put(ch, map.get(ch) - 1);
25            }
26
27            while(count == 0){
28
29                if(right - left + 1 < minLen){
30                    minLen = right - left + 1;
31                    start = left;
32                }
33
34                char leftChar = s.charAt(left);
35
36                if(map.containsKey(leftChar)){
37                    map.put(leftChar, map.get(leftChar) + 1);
38
39                    if(map.get(leftChar) > 0)
40                        count++;
41                }
42
43                left++;
44            }
45        }
46
47        return minLen == Integer.MAX_VALUE
48                ? ""
49                : s.substring(start, start + minLen);
50    }
51}