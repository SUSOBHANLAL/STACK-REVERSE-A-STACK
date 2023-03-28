package reverseAstacka;
import java.util.*;
public class susobhan {
	Stack <Character> st = new Stack<Character>();
	
	void remove() {
		if(st.size()>0) {
			char  x = st.peek();
			st.pop();
			// asahi sob ko remove korn hai
			remove();
			// after removing all call a fun inset_botton
			// kuki sob remove hona bad far stack main vorna hota hai
			insert_button(x) ;
			
		}
	}
	
	void insert_button(char x) {
		if(st.isEmpty()) {
			st.push(x);
			
		}else {
			char n = st.peek();
			st.pop();
			//function call unless it empty it will pop
			insert_button(x);
			// fair o bala x inser hona ka bad jo jo chiz stack main tha oo fair far dana hai
			st.push(n);
			
		}
	}
	
	
	
	  public static void main(String[] args)
	    {
		  
		  susobhan s = new susobhan();
	 
	        // push elements into
	        // the stack
	        s.st.push('1');
	        s.st.push('2');
	        s.st.push('3');
	        s.st.push('4');
	        
	        System.out.println("Original Stack");
	        
	        System.out.println(s.st);
	        
	        s.remove();
	        System.out.println("Reversed Stack");
	        
	        System.out.println(s.st);
	    }

}
