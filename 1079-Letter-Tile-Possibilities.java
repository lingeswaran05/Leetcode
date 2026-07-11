class Solution {
    void backtrack(String tiles, boolean[] used,StringBuilder sb, Set<String> set) {
        if(sb.length() > 0) set.add(sb.toString());

        for(int i=0;i<tiles.length();i++){
            if(used[i]) continue;
            used[i]=true;
            sb.append(tiles.charAt(i));
            backtrack(tiles,used,sb,set);
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    }
    public int numTilePossibilities(String tiles) {
        
        Set<String> set = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];

        backtrack(tiles, used, new StringBuilder(), set);

        return set.size();
    }
}