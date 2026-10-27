class Solution {
    public String[] createGrid(int m, int n) {
        String[]  gd = new String[m];
        gd[0] = ".".repeat(n);
        String r = "#".repeat(n-1) +".";
        for(int i = 1; i< m ; i++){
            gd[i] = r;
        }
        return gd;
        
    }
}