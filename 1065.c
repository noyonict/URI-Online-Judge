#include<stdio.h>

int main(){
    int a[5];
    int c = 0;
    int i;
    for(i=0;i<5;i=i+1){
        scanf("%d", &a[i]);
        if(a[i]%2==0){
            c++;
        }
    }
    printf("%d valores pares\n", c);

    return 0;
}
