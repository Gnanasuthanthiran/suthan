#include<stdio.h>

int main(){
int i,num,sum=0;

printf("Enter the number  :  ");
scanf("%d",&num);

if(num > 0){
for(i=1;i<=num;i++){

sum=sum+i;

}

printf("sum = %d ",sum);
}
else{
printf("please Enter Natural no");
}



return 0;
}
