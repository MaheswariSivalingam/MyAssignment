package week3.day2;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String text="changeme";
		char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
				System.out.println(charArray[i]);
			}
		}
        
	}

}
