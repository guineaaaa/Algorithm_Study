#include <stdio.h>

int main(void){
    int n;
    
    scanf("%d", &n);
    
    if((n%2024!=0)||(n> 100000 )){
        printf("No");
    }else{
        printf("Yes");
    }
    return 0;
}