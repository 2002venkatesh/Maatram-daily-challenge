#include <stdio.h>

int main()
{
    int n,p;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
        for(int i=0;i<n;i++){
            if(a[i]!=(a[i+1]-1) && a[i+1]>0){
                p=a[i]+1;
                break;
            }
        }
        printf("%d",p);
    

    return 0;
}
