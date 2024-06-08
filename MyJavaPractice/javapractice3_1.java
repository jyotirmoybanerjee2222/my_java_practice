package MyJavaPractice;

public class javapractice3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //problem!
		String Name = "Jack Parker";
		Name = Name.toLowerCase();
		System.out.println(Name);
		//problem2
		String text = "To Lower Case";
		text = text.replace(" ","_");
		System.out.println(text);
		//problem 3
		String letter = "Dear <|name|>,Thanks a lot";
		letter = letter.replace("<|name|>", "Harry");
		System.out.println(letter);
		// problem 4
		String mystring = "This string  double and    triple space";
		System.out.println(mystring.indexOf("  "));
		System.out.println(mystring.indexOf("   "));
		//problem 5
		String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThANKS!";
		System.out.println(myLetter);
	}

}
