// Java program using String Methods.
class StringMethods
{
	public static void main(String[] args)
	{
		String a = "ADARSH";
		String b = "Krishna";
		String c = " ";
		String d = "   Papa   ";
		System.out.println(a.toLowerCase());
	    System.out.println(b.toUpperCase());
	    System.out.println(c.isEmpty());
	    System.out.println(d.trim());
	    System.out.println(a.concat(b));
	    System.out.println(a.length());
	    System.out.println(a.equals(b));
	    System.out.println(b.charAt(2));
	    System.out.println(a.indexOf('H'));
        System.out.println(a.replace('A','a'));

    }
} 