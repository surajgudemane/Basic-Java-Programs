class ReverseStringWithoutInbuiltFunction {
	public static void main(String[] args){
		String s = "Void Main";
		String str = "";
		for(int i=s.length()-1; i>=0; i--){
			str = str+s.charAt(i);
		}
		System.out.println("After reverse: "+str);
	}
}