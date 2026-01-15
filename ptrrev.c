// reverse of an array using dynamic array locating
/* #include <stdio.h>
#include<stdlib.h>
int main()
{
	int n,i,temp;
	
	// int arr1[]; this cannot be initilaised  error because it can be initilaised with the values only:
	scanf("%d", &n);
	
	// By creating dynamic array:
	// By using malloc and creating dynamic memory:
	int *arr1=(int*)malloc(n * sizeof(int));
	
	//to check memory allocation is sucessfull or not.
	if(arr1 == NULL)
	{
		printf("Failed \n");
	}
	
	// calculation
	for(i=0;i<n;i++)
	{
		scanf("%d", &arr1[i]);
	}
	
	for(i=0;i<arr1[n];i++)
	{
		for(int j=n-1;j>0;j--)
		{
		temp=arr1[i];
		arr1[i]=arr1[j];
		arr1[j]=temp;
		}
	}
	for (i = 0; i < n; i++) 
	{
        printf("%d ", arr1[i]);
    }
	
	return 0;
	}*/
	#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, i, temp;

    // Step 1: Read the size of the array
    scanf("%d", &n);

    // Step 2: Allocate dynamic memory
    int *arr1 = (int *)malloc(n * sizeof(int));

    // Step 3: Check for memory allocation failure
    if (arr1 == NULL)
    {
        printf("Memory allocation failed\n");
        return 1;
    }

    // Step 4: Input the array elements
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr1[i]);
    }

    // Step 5: Reverse the array using two-pointer technique
    for (i = 0; i < n / 2; i++)
    {
        temp = arr1[i];
        arr1[i] = arr1[n - 1 - i];
        arr1[n - 1 - i] = temp;
    }

    // Step 6: Print the reversed array
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr1[i]);
    }
    printf("\n");

    // Free the memory
    free(arr1);
    return 0;
}

		
		
		
	
	