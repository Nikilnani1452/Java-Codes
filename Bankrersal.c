#include<stdio.h>
int main()
{
	int all[20][20],max[20][20],need[20][20],avail[20][20],i,j,p,r,x,k,l,flag[p];
	printf("ENTER THE NO.OF PROCESSES YOU NEED :");
	scanf("%d",&p);
	printf("ENTER THE NO.OF RESOURCES YOU NEED :");
	scanf("%d",&r);
	printf("ENTER THE ALLOCATED RESOURCES :");
	for(i=0;i<p;i++)
	{
	    for(j=0;j<r;j++)
	    {
		scanf("%d",&all[i][j]);
	    }
	}
	printf(" ALLOCATED RESOURCES ARE :");
	for(i=0;i<p;i++)
	{
	    for(j=0;j<r;j++)
	    {
		printf("%d\t",all[i][j]);
	    }
		printf("\n");
	}
	printf("ENTER THE MAXIMUM RESOURCES :");
	for(i=0;i<p;i++)
	{
	    for(j=0;j<r;j++)
	    {
		scanf("%d",&max[i][j]);
	    }
	}
	printf("MAXIMUM RESOURCES ARE  :");
	for(i=0;i<p;i++)
	{
	    for(j=0;j<r;j++)
	    {
		printf("%d\t",max[i][j]);
	    }
		printf("\n");
	}
	printf("ENTER AVAILABLE RESOURCES :");
	for(i=0;i<p;i++)
	{
	    for(j=0;j<r;j++)
	    {
		scanf("%d",&max[i][j]);
	    }
	    for(i=0;i<p;i++)
	    {
	        for(j=0;j<r;j++)
	        {
		    need[i][j]=max[i][j]-all[i][j];
		  }
	    }
	 printf("NEED RESOURCES ARE :");
	for(i=0;i<p;i++)
	{
	    for(j=0;j<r;j++)
	    {
		printf("%d\t",need[i][j]);
	    }
		printf("\n");
	}
	for(x=0;x<p;x++)
	{
	   while(flag[x]!=1)
		{
			for(i=0;i<p;i++)
			{
				if(flag[i]!=1)
				{
					j=0,k=1,l=2;
					if(need[i][j]=avail[j] && need[i][k]<=avail[k] && need[i][l]<=avail[l])
					{
						avail[i] = avail[j]+all[i][j];
						avail[k] = avail[k]+all[i][k];
						avail[l] = avail[l]+all[i][l];
						flag[i]=1;
						printf("P[i]d",i);
					}
				}
			}
		}
	}
	printf("AVAILABLE IS ");
	for(i=0;i<r;i++)
	{
		printf("%d",avail[i]);
	}
	return 0;
}

















	

	
	












	