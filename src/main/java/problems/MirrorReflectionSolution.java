package problems;

public class MirrorReflectionSolution {
    public int mirrorReflection(int p, int q) {
        int g = gcd(p, q);
        p /= g;
        p %= 2;
        q /= g;
        q %= 2;

        if(p == 1 && q == 1) return 1;
        return p == 1 ? 0 : 2;
    }

    public int gcd(int p, int q) {
        if(p == 0) return q;
        return gcd(q % p, p);
    }
}
