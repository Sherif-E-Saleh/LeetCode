package Problems;

public class WordsReversal {

	public static String reverseWords (String s){
		if (s.isEmpty())
			return "";
		else if (s.length() == 1){
			if (s.equals(" "))
				return "";
			else 
				return s;
			
		}
		else {
			s = s.trim();
			String [] temp = s.split(" ");
			String swap = "";
			String output = "";
			int i = 0;
			int j = temp.length-1;
			
			while (i<=j){
				if (!temp[i].equals(" ") && !temp[i].equals("") && !temp[j].equals(" ") && !temp[j].equals("")){
					swap = temp[i];
					temp[i] = temp[j];
					temp[j] = swap;
					i++;
					j--;
				}
				else if(!temp[i].equals(" ") && !temp[i].equals("") && temp[j].equals("") || temp[j].equals(" ")){
					j--;
				}
				else if(temp[i].equals(" ") && temp[i].equals("") && !temp[j].equals("") || !temp[j].equals(" ")){
					i++;
				}
				else {
					i++;
					j--;
				}
				
			}
			
			for (int r = 0; r < temp.length; r++) {
				if(!temp[r].equals("")&&!temp.equals(" "))
					output+=temp[r]+" ";
			}
	
			return output.trim();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseWords("K  R        o        iS    J                   "));
	
	}

}
