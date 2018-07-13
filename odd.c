#include <stdio.h>
int main()
{
    int number;

    printf("yo an integer: ");
    scanf("%d", &number);

       if(number % 2 == 0)
        printf("%d yo  even.", number);
    else
        printf("%d yo  odd.", number);

    return 0;
}
