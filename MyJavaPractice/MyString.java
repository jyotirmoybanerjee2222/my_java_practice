package MyJavaPractice;

public class MyString {
	public static void main(String[] args)
	{
		String name = "harryrry";
		String n = new String("  Harry  ");
		System.out.println(name);
		int value = n.length(); 
		System.out.println(value);
		String lstring = name.toLowerCase();
		System.out.println(lstring);
		String Ustring = name.toUpperCase();
		System.out.println(Ustring);
		String nontrimString = n.trim();
		System.out.println(nontrimString);
		System.out.println(name.substring(3));//ry
		System.out.println(name.substring(1,3));//end is excluded
	    System.out.println(name.replace('r','p'));
	    System.out.println(name.replace("rry","ier"));	    
	    System.out.println(name.startsWith("Har"));	    
	    System.out.println(name.endsWith("Har"));
	   
	    System.out.println(name.charAt(0));
	    System.out.println(name.indexOf("har"));
	    System.out.println(name.indexOf("rry",4));
	    System.out.println(name.lastIndexOf("rry",4));
	    System.out.println(name.lastIndexOf("rry"));
	    System.out.println(name.equals("Harry"));
	    System.out.println(name.equalsIgnoreCase("Harry"));
	}

}
