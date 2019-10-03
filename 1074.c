#include <stdio.h>

int main() {

    int n, i;
    scanf("%d", &n);
    int l[n];
    for(i=0;i<n;i++){
        scanf("%d", &l[i]);
        if(l[i]!=0){
            if(l[i]%2==0){
                if(l[i]>0){
                    printf("EVEN POSITIVE\n");
                }else{
                    printf("EVEN NEGATIVE\n");
                }
            }else{
                if(l[i]>0){
                    printf("ODD POSITIVE\n");
                }else{
                    printf("ODD NEGATIVE\n");
                }
            }
        }else{
            printf("NULL\n");
        }
    }
    return 0;
}
