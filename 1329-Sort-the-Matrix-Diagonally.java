class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length,n=mat[0].length;

        for(int c=n-1;c>=0;c--){
            List<Integer> a=new ArrayList<>();
            int i=0,j=c;
            while(i<m && j<n){
                a.add(mat[i][j]);
                i++;j++;
            }
            Collections.sort(a);
            int r=0,s=c,l=0;
            while(r<m && s<n){
                mat[r][s]=a.get(l++);
                r++;s++;
            }
        }
        for(int row=1;row<m;row++){
            List<Integer> a=new ArrayList<>();
            int i=row,j=0;
            while(i<m && j<n){
                a.add(mat[i][j]);
                i++;j++;
            }
            Collections.sort(a);
            int r=row,s=0,l=0;
            while(r<m && s<n){
                mat[r][s]=a.get(l++);
                r++;s++;
            }
        }
        return mat;
    }
}