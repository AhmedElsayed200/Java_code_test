package org.example;

public class WaterTrap {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1;
        int ml = h[0], mr = h[r];
        int ans = 0;

        while (l <= r) {
            if (h[l] <= h[r]) {
                int trap = Math.min(ml, mr) - h[l];
                if (trap > 0) ans += trap;
                l++;
                if (l < h.length) ml = Math.max(ml, h[l]);
            } else {
                int trap = Math.min(ml, mr) - h[r];
                if (trap > 0) ans += trap;
                r--;
                if (r >= 0) mr = Math.max(mr, h[r]);
            }
        }

        return ans;
    }
}
