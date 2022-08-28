public class alg_2 {
    //algoritmo 2
    public static int f2(int n) {
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n; i <= n + 1; i += 2)
            for (j = n + 1; j <= n * n; j += 2)
                for (k = i + 1; k <= 2 * n; k += 2) {
                    res = res + n * k;
                    cont_op++;
                }
        return cont_op;
    }
}
