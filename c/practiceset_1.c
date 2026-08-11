#include <stdio.h>
int main(){
    int r,h;
    printf("enter the the radius of cylinder");
    scanf("%d",&r);
    printf("enter the height of cylinder ");
    scanf("%d",&h);
    printf("the area of cylinder is %f",2*3.14*r*h+2*3.14*r*r);
    return 0;
}