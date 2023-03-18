package ru.lis154;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int sred = start + (end - start) / 2;
            if (isBadVersion(sred) && !isBadVersion(sred-1)) {
                return sred;
            }
            if (!isBadVersion(sred)) {
                start = sred + 1;
            } else {
                end = sred;
            }
        }
        return -1;
    }

    static boolean isBadVersion(int v){
        return true;
    }
}
