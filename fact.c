#include<stdio.h>



int main(){

int i,f,sum=1;
printf("Enter the number  : " );
scanf("%d",&f);

for(i=f;i>0;--i){

    sum=sum*i;

}

printf("\n%d Factorial is : %d ",f,sum);




}
