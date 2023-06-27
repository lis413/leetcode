package ru.lis154;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0;
        int n = height.length;
        int j=n-1;
        int ans = Integer.MIN_VALUE;
        while(i<=j)
        {
            int area = (j-i)*Math.min(height[i] , height[j]);
            ans = Math.max(area , ans);

            if(height[i] < height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return ans;
    }
}
