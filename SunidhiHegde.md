Knapsack program in c++ just for memory purpose.
#include <stdio.h>
#include <stdlib.h>

#include <stdio.h>
#include <stdlib.h>
int weight[25],value[25],V[25][25];
int max(int a,int b)
{
if(a>b)
return a;
else
return b;
}
int MFK(int i,int j)
{
if(i>=0 && j>=0)
{
int val;
if(V[i][j]<0)
{
if(j<weight[i]) //If current item doesn't fit in current capacity of knapsack
val=MFK(i-1,j);
else
val=max(MFK(i-1,j),value[i]+MFK(i-1,j-weight[i]));
V[i][j]=val;
}
}
return V[i][j];
}
int main()
{
int n,w,i,j,x,y,soln;
printf("Enter the number of items : ");
scanf("%d",&n);
printf("Enter the threshold weight of knapsack : ");
scanf("%d",&w);
for(i=0; i<=n; i++)
for(j=0; j<=w; j++)
if(i==0 || j==0)

V[i][j]=0; //Wight is zero or item is not selected
else
V[i][j]=-1;
printf("Enter weight and value of %d items:\n",n);
printf("Format: WEIGHT <space> VALUE\n");
for(i=1; i<=n; i++)
{
printf("Item-%d : ",i);
scanf("%d%d",&x,&y);
weight[i]=x;
value[i]=y;
}
soln=MFK(n,w);
printf("The optimal solution is %d.",soln);
return 0;
}
