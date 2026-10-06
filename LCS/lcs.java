public class LCS {
    public static void findLCS(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        // Step 1: Create a 2D DP matrix initialized with zeros
        int[][] dp = new int[m + 1][n + 1];

        // Step 2: Fill the DP matrix bottom-up
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The length of the longest common subsequence
        int lcsLength = dp[m][n];

        // Step 3: Backtrack to reconstruct the LCS string
        StringBuilder lcsSequence = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcsSequence.append(X.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Reverse the string because backtracking gives us characters in reverse order
        lcsSequence.reverse();

        // Output results
        System.out.println("String 1: " + X);
        System.out.println("String 2: " + Y);
        System.out.println("Length of LCS: " + lcsLength);
        System.out.println("LCS Sequence : " + lcsSequence.toString());
    }

    // --- Driver Code to Test the Solution ---
    public static void main(String[] args) {
        String stringA = "ABCBDAB";
        String stringB = "BDCABA";

        findLCS(stringA, stringB);
    }
}