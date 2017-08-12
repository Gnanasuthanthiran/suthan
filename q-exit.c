#include<stdio.h>



int main(){
char ch;
int i_ch;


printf("Enter Char  'q' or 'Q' to exit :\n");

do{
    scanf("%c",&ch);

}
while((ch!='q') && (ch !='Q'));


printf("\n\nExit........\n\n");


return 0;
}
