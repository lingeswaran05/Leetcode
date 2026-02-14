1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5
6    public boolean isIsomorphic(String s, String t) {
7
8        if (s.length() != t.length()) return false;
9
10        Map<Character, Character> mapST = new HashMap<>();
11        Map<Character, Character> mapTS = new HashMap<>();
12
13        for (int i = 0; i < s.length(); i++) {
14
15            char chS = s.charAt(i);
16            char chT = t.charAt(i);
17
18            if (mapST.containsKey(chS)) {
19                if (mapST.get(chS) != chT)
20                    return false;
21            } else {
22                mapST.put(chS, chT);
23            }
24
25            if (mapTS.containsKey(chT)) {
26                if (mapTS.get(chT) != chS)
27                    return false;
28            } else {
29                mapTS.put(chT, chS);
30            }
31        }
32
33        return true;
34    }
35}
36