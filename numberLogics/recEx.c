#include <stdio.h>

int cnt = 0;

// Function prototype declaration
int recursive_sum_of_digits(int n);

int my_function(int n, int sm) {
    int i, tmp_sm;
    for (i = 1; i <= n; i++) {
        tmp_sm = recursive_sum_of_digits(i);
        if (tmp_sm == sm)
            cnt++;
    }
    return cnt;
}

int recursive_sum_of_digits(int n) {
    if (n == 0)
        return 0;
    return n % 10 + recursive_sum_of_digits(n / 10);
}

int main() {
    int n = 20, sum = 3;
    int ans = my_function(n, sum);
    printf("%d", ans);
    return 0;
}
