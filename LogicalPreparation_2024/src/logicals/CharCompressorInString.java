package logicals;

public class CharCompressorInString {

	public static void main(String[] args) {
		
		String input = "aabbbccaaa";
		//String output = "a2b3c2a3"; IRIS Manager Round

		int count = 1;
		char ch = input.charAt(0);
		String str = "";
		for(int i = 1;i< input.length(); i++ ) {
			
			if(ch == input.charAt(i)) {
				
				++count;
				if(input.length()-1 == i) {
					str = str+ch+count;
					ch = input.charAt(i);
				}
				
			}else {
				str = str+ch+count;
				ch = input.charAt(i);
				count = 1;
			}
			
		}
		System.out.println(str);
		
	}

}
