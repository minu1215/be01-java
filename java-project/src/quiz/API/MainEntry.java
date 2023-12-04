package quiz.API;

public class MainEntry {
	public static void main(String[] args) {
		String str = "abcDEFGHeijwEIMPYmnqr";
		String str2 = "";
		char ch;
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				str2 += (char)(ch + 'A' - 'a');
			}
			else
				str2 += (char)(ch - 'A' + 'a');		
		}
		System.out.println(str2);
	}
}
