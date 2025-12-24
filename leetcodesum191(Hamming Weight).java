Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.



class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            int a=n%2;
            n=n/2;
            if(a==1){
                count++;
            }
        }
        return count; 
    }
}

