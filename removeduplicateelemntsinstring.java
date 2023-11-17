public class removeduplicateelementsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char b[]=a.toCharArray();
		String z="";
		for(int i=1;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					b[i]='0';
				
				}
			}
		} 
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!='0')
			{
				System.out.print(b[i]);
			}
		}
	} 
	
/*INPUT:
 WHITDEVILHIT
 
 OUTPUT:
 WHITEDEVIL   */
 */

}