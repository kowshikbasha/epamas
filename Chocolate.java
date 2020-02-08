package epam.task2;

/**
 * Hello world!
 *
 */
public class Chocolate implements Gift
{
	
    public int weight(int a[],int weight)
    {
    	int sum=0;
    	int c=0;
    	for(int i=0;i<a.length;i++)
    	{
    		sum=sum+a[i];
    		if(sum<=weight)
    			c++;
    			
    	}
    	return c;
    }
   public void sortindex(int a[],int m,int n)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]>=m && a[i]<=n)
    		{
    			System.out.print(a[i]+" ");
    		}
    	}
    	System.out.println();
    }
}
