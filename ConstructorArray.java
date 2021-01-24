class ConstrictorArray
{
	int [][]a={{10,13,14},{14,14,63}};//instance variables

ConstrictorArray ()//constructor
{
int i;
for (i=0;i<=1 ; i++)
 {
for (int j=0;j<=2 ;j++ )
 {

if (a[i][j]%2==1) 
{
System.out.println(a[i][j]);

		}		
	}	
}
}
/*public void display ()
{
	System.out.println();	
}*/
public static void main(String[] args) 
{
ConstrictorArray array =new ConstrictorArray();
}
}