1class Solution {
2    public String processStr(String s) {
3        StringBuilder sb=new StringBuilder();
4        for(char c:s.toCharArray()){
5            if(c >= 'a' && c <= 'z'){
6                sb.append(c);
7            }
8            else if(c == '*' && sb.length() > 0){
9                sb.deleteCharAt(sb.length()-1);
10            }
11            else if(c == '#'){
12                sb.append(sb);
13            }
14            else if(c == '%'){
15                sb=sb.reverse();
16            }
17        }
18        return sb.toString();
19    }
20}