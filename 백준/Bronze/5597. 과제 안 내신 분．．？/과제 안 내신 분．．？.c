#include <stdio.h>

int main() {
    int std[31] = {0}; // 인덱스를 1부터 30까지 사용하기 위해 크기를 31로 설정
    int a;

    for (int i = 0; i < 28; i++) {
        scanf("%d", &a);
        std[a] = 1; // 출석번호에 해당하는 인덱스를 1로 설정
    }

    for (int i = 1; i <= 30; i++) { // 인덱스 1부터 30까지 검사
        if (std[i] != 1) {
            printf("%d\n", i);
        }
    }

    return 0;
}