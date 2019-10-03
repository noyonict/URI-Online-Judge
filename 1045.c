#include<stdio.h>

int main(){
    double a, b, c;
    scanf("%lf %lf %lf", &a, &b, &c);
    if(a>b && a>c){
        a = a;
    }
    else if(b>a && b>c){
        double d = a;
        a = b;
        b = d;
    }else{
        double d = a;
        a = c;
        c = d;
    }
    if(a>=(b+c)){
        printf("NAO FORMA TRIANGULO\n");
    }
    else if((a*a)>((b*b)+(c*c))){
        printf("TRIANGULO OBTUSANGULO\n");
    }
    if((a*a)==((b*b)+(c*c))){
        printf("TRIANGULO RETANGULO\n");
    }

    if((a*a)<((b*b)+(c*c))){
        printf("TRIANGULO ACUTANGULO\n");
    }
    if(a==b && b==c && c==a){
        printf("TRIANGULO EQUILATERO\n");
    }
    if((a==b && a!=c) || (a==c && a!=b) || (b==c && c!=a)){
        printf("TRIANGULO ISOSCELES\n");
    }
    return 0;
}
