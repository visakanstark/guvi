#include <stdio.h>
int main()
{
    int number;

    printf( "pls  a number: ");
    scanf("%lf", &number);

    if (number <= 0)
    {
        if (number == 0)
            printf("kinda enter no.");
        else
            printf("Yo a negative number.");
    }
    else
        printf("You a positive number.");
    return 0;
}
