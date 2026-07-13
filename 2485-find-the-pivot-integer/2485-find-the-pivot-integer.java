class Solution {
    public int pivotInteger(int n) {
        int total= (n*(n+1))/2;
        for(int x=0;x<=n;x++){
            int left = (x*(x+1))/2;
            int right = total - (x*(x-1))/2;
            if(right==left){
                return x;
            }
        }return -1;
       
    }
}