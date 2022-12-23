package assign4;

class Ineuron{
	
	 boolean uniqueChar(String str)
	{
		for (int i = 0; i < str.length(); i++)
           for (int j = i + 1; j < str.length(); j++)
               if (str.charAt(i) == str.charAt(j))
                   return false;
                  //if no duplicate char
       return true;
	        	
	}
	
public class UniqueChar {

	public static void main(String[] args) {
		
		 Ineuron i=new Ineuron();
		 String s="Ineuron";
		 
		  if (i.uniqueChar(s))
	            System.out.println("The String " + i + " has all unique characters");
	        else
	            System.out.println("The String " + i + " has duplicate characters");
		 
		
	           
	    }
	}

}

