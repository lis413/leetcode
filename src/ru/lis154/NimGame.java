package ru.lis154;

public class NimGame {
    public boolean canWinNim(int n) {
        if (n <= 3) return true;
        if (n < 5) return false;
        return false;
    }
}
