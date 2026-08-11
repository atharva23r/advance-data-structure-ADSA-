#include<stdio.h>

int main(){
    int sub_1,sub_2,sub_3,a,b,c,d;
    printf("enter the first subject marks:");
    scanf("%d",&sub_1);
    printf("enter the second subject marks:");
    scanf("%d",&sub_2);
    printf("enter the third subject marks:");
    scanf("%d",&sub_3);
    a=sub_1+sub_2+sub_3;
    c=a*40/100;
    if(sub_1>=sub_1*33/100 && sub_2>=sub_2*33/100 && sub_3>=sub_3*33/100){
        if(a>=c){
            printf("the student is pass\n");
        }
        else{
            printf("the student is fail\n");
        }
    }
    return 0;
}