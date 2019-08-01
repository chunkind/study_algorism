package sw.day04.sw5215;

import java.util.Scanner;

public class 햄버거_다이어트2 {
	
}
/**
#include <stdio.h>
 
int main(void) {
    int t;
    setbuf(stdout, NULL);
    scanf("%d", &t);
    for (int z = 1; z <= t; z++) {
        int n, k;
        scanf("%d%d", &n, &k);
        int v[21] = { 0, };
        int c[21] = { 0, };
        for (int i = 1; i <= n; i++) {
            scanf("%d%d",  &c[i], &v[i]);
        }
        int opt[21][10002] = { { 0, }, };
        for (int i = 0; i <= k; i++)
            opt[0][i] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (v[i] > j) {
                    opt[i][j] = opt[i - 1][j];
                }
                else {
                    opt[i][j] = ((opt[i - 1][j] >= (opt[i - 1][j - v[i]] + c[i])) ? opt[i - 1][j] : ((opt[i - 1][j - v[i]]) + c[i]));
                }
            }
        }
        printf("#%d %d\n", z, opt[n][k]);
    }
    return 0;
}
*/