#include <stdio.h>

int main() {

    int n, i, in=0, outI=0;
    scanf("%d", &n);
    int l[n];
    for(i=0;i<n;i++){
        scanf("%d", &l[i]);
        if(l[i]>=10 && l[i]<=20){
            in++;
        }else{
            outI++;
        }
    }
    printf("%d in\n%d out\n", in, outI);
    return 0;
}
