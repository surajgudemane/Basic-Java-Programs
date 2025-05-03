class StringPalindromeOrNot{
	public static void main(String[] args){
		String str = "Rotator";
		String s = str.toLowerCase();
		String rev = "";
		for(int i = s.length()-1; i >= 0; i--){
			rev += s.charAt(i);
		}
		if(s.equals(rev)){
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}
	}
}