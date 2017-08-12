#include<stdio.h>
#include<math.h>


int main(){

int i,num,count=0;

printf("Enter The number :  ");
scanf("%d",&num);

if(num > 1){
for(i=2;i<=sqrt(num);i++){

    if((num % i) ==0){
        count=1;

        break;
    }

}

if(count==0)
    printf("\n%d is Prime no",num);
else
   printf("\n%d  is  Not Prime no",num);

}
else

 printf("\nCannot Find");








return 0;
}
