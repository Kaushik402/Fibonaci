//0,1,1,2,3,5,8
//it programe run time some error fount how to solve it


class Fibonaci
{public static void main(String a[])
	{
		int b=10;
		int i,f[]=new int [50];

		for(i=0;i<=b;i++) 
		{
			if(i==1)
			{
				f[i]=1;
			}
		
			if(i==0)
			{
				f[i]=0;
			}			

			else
			{
				f[i]=(f[i-2])+(f[i-1]);
			}
				System.out.println("Fibonaci:="+f[i]);
		}
	}
}
