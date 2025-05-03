class StringLengthWithOutUsingLengthMethod {
	public static void main(String[] fargs){
		String s = "Vamshi the Dog";
		int count = 0;
		char[] c = s.toCharArray();
		
		for(int i = 0; i<c.length; i++){
			count++;
		}
		
//		for(char c : s.toCharArray()){
//			count++;
//		}

		System.out.println("Total Length Of Given String '"+s+"' is: "+count);
	}
}