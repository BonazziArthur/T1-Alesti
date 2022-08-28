public class alg_5 {
    public static int f5(int n) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n / 2; i <= n + 1; i += 2)
            for (j = i; j <= n * i; j += i / 2 + 1)
                for (k = i + 1; k <= n * j; k += 1) {
                    res = res + k * j;
                    cont_op++;
                }
        return cont_op;
    }
}
