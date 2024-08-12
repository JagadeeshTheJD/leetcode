class Solution {
    public int getsqsum(int n){
        int currsum=0;
        while(n!=0){
            int remainder=n%10;
            currsum+=remainder*remainder;
            n/=10;
        }
        return currsum;
    }
    public boolean isHappy(int n) {
        int slow= getsqsum(n);
        int fast=getsqsum(getsqsum(n));

        while((slow!= fast) && (fast!=1)){
            slow=getsqsum(slow);
            fast=getsqsum(getsqsum(fast));
        }
        return fast==1;
    }
}