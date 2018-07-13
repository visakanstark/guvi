#include <stdio.h>
int main()
{
    int number;

    printf("yo an integer: ");
    scanf("%d", &number);

 
    if(number % 2 == 0)
        printf("%d is yo even.", number);
    else
        printf("%d is yo odd.", number);

    return 0;
}
