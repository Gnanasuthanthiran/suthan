#include<stdio.h>
#include<math.h>


int main(){

int i,j,start,end,count;

printf("Enter Starting point :  ");
scanf("%d",&start);
printf("\nEnter Ending point :  ");
scanf("%d",&end);


printf("\n%d to %d Prime number(s) Are :    ",start,end);

for(j=start;j<=end;j++){
        count=0;

    if(j > 1){
        for(i=2;i<=sqrt(j);i++){

            if((j%i)== 0){
                count=1;
                break;
            }




        }

        if(count==0)
            printf(" %d ,",j);

    }



}







return 0;
}
