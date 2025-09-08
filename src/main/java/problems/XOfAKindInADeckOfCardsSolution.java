package problems;

import java.util.HashMap;

public class XOfAKindInADeckOfCardsSolution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] temp = new int[deck.length+1];
        for(int x : deck){
            temp[x]++;
        }
        int gcd = -1;
        for(int x : temp){
            if(x > 0){
                if(gcd == -1){
                    gcd = x;
                } else {
                    gcd = GCD(gcd, x);
                }
            }
        }
        return gcd > 1;
    }

    public static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
}
