#include <stdio.h>
int main()
{
    int a,b=0,N;
    scanf ("%d", &N);
    for(a=2;a<=N;a=a+2)
    {
        b=a*a;
        printf("%d^2 = %d\n",a,b);
        b=0;
    }
    return 0;
}
