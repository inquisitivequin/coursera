public class test {

	public static int cup() {
		int srchInd = 0;
		int count = 0;
		String b = "test";
		while(!(b.indexOf("t", srchInd) == -1)) {
			System.out.println(count);
			count++;
			srchInd++;
		}
		return count;
	}

	// public static void spoon() {
	// 	String b = "test";
	// 	System.out.println(b.indexOf("t",4));
	// }

    public static void main(String[] args) {
      cup();
    // spoon();
    }
}