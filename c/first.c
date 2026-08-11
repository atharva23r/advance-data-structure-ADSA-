#include<stdio.h>

int main(){
    int a,b,c;
    a=97;
    printf("the value of a is %d\n",a);
    printf("enter the number to check it is devisible by 97 or not ");
    scanf("%d",&b);
    c=a%b;
    printf("the value of c is %d\n",c);
    printf("if the value of c is zero then the number is devisible by 97 otherwise not\n");
    return 0;
}