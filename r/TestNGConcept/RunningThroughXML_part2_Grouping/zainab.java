package RunningThroughXML_part2_Grouping;




class result{
	static long count=0;
	
	public static long stringy(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i, j));
				count++;
			}
		}
		return count;
	}
}
public class zainab {
	public static void main(String args[])
			{	
		 result res=new result();
		 String s = new String("kincenvizh");
		 long b= res.stringy(s);
		 System.out.println(b);
		
		
			}
	
	

}
