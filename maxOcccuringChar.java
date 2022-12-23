package assign4;

class MaxmimumOccuring {

	public static void main(String[] args) {
		 String s = "ineuron";  
	        int[] freq = new int[s.length()];  
	        char  maxChar = s.charAt(0);  
	        int   max;              
	        //Converts given string into character array  
	        char str[] = s.toCharArray();  
	        for(int i = 0; i < str.length; i++) {  
	            freq[i] = 1;  
	            for(int j = i+1; j < str.length; j++) {  
	                if(str[i] == str[j] && str[i] != ' ' && str[i] != '0') {  
	                    freq[i]++;     
	                    //Set string[j] to 0 to avoid printing visited character  
	                    str[j] = '0';  
	                }  
	            }  
	        }  
	           
	       max = freq[0];  
	        for(int i = 0; i <freq.length; i++) {  
	            if(max < freq[i]) {  
	                max = freq[i];  
	                maxChar = str[i];  
	            } 
	          
	        }   
	       
            	
	        System.out.println("Maximum occurring character: " + maxChar);
	     
	        
	    }  

}
