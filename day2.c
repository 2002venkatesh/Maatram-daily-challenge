#include <stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    int a[n],b[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++){
        b[i]=1;        
        for(int j=0;j<n;j++){
            if(i!=j){
                b[i]=b[i]*a[j];
            }
        }
    }
    for(int i=0;i<n;i++){
        printf("%d ",b[i]);
    }
    
}



