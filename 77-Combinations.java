class Solution {
    public static void backtrack(int n,int k,List<List<Integer>> res,List<Integer> temp,int ind){
        if(temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<=n;i++){
            temp.add(i);
            backtrack(n,k,res,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(n,k,res,new ArrayList<>(),1);
        return res;
    }
}