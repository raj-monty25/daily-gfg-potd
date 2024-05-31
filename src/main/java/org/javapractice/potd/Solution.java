package org.javapractice.potd;

/**
 * Given three numbers n, x, and y, Geek and his friend are playing a coin game. In the beginning,
 * there are n coins. In each move, a player can pick x, y, or 1 coin. Geek always starts the game. The player
 * who picks the last coin wins the game. The task is to determine whether Geek will win the game or
 * not if both players play optimally.
 *
 * Input:
 * n = 5
 * x = 3
 * y = 4
 * Output:
 * 1
 * Explanation:
 * There are 5 coins, every player can pick 1 or 3 or 4 coins on his/her turn. Geek can win by picking
 * 3 coins in first chance. Now 2 coins will be left so his friend will pick
 * one coin and now Geek can win by picking the last coin.
 */
public class Solution {
        public static int findWinner(int n, int x, int y) {
            // code here
            boolean[] dp = new boolean[n + 1];

            // Base case: If there are 0 coins, the player to move loses
            dp[0] = false;

            // Fill the dp table
            for (int i = 1; i <= n; i++) {
                if (i >= 1 && !dp[i - 1]) {
                    dp[i] = true;
                } else if (i >= x && !dp[i - x]) {
                    dp[i] = true;
                } else if (i >= y && !dp[i - y]) {
                    dp[i] = true;
                } else {
                    dp[i] = false;
                }
            }

            if (dp[n]) {
                return 1;
            } else {
                return 0;
            }
        }
}
