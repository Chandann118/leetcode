class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        ArrayList<int []> l1 = new ArrayList<>();
          ArrayList<int[]> l2 = new ArrayList<>();
         
          int n = img1.length;
          for(int i = 0 ; i < n ; i++){
            for( int  j = 0 ; j < n; j++){
                if(img1[i][j] ==1){
                    l1.add(new int[]{i , j});
                }
                if(img2[i][j] == 1){
                    l2.add(new int[]{i , j});
                }
            }
          }

          HashMap<String , Integer > map = new HashMap<>();

          int ans= 0 ; 
          for( int i = 0 ; i < l1.size(); i++){
            for( int j = 0 ; j< l2.size(); j ++){
                 int p1[]= l1.get(i);
                 int p2[]= l2.get(j);

                 int dr = p2[0] - p1[0];
                 int dc = p2[1] -p1[1];

                 String key = dr+","+ dc;

                 map.put(key , map.getOrDefault( key , 0) + 1);
                 ans=Math.max(ans , map.get(key)); 
            }
          }
        return ans;
    }
}