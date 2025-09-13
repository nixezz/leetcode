package problems;

public class FindMostFrequentVowelAndConsonantSolution {
    public int maxFreqSum(String s) {
        int[] frequencies = new int[26];
        int maxVowel = 0, maxConsonant = 0;
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            frequencies[i]++;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                maxVowel = Math.max(maxVowel, frequencies[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, frequencies[i]);
            }
        }
        return maxVowel + maxConsonant;
    }
}
