public class Potato {

	public static String findSimpGene(String dna,
																		String startCod,
																		String stopCod) {

		String result = "";

		Integer start = dna.indexOf(startCod);
		if(start == -1) {
			return "a";
		};

		Integer end = dna.indexOf(stopCod, start+3);
		if(end == -1) {
			return "eat";
		};

		if((start - end) % 3 == 0) {
			String dnaSubstring = dna.substring(start, end+3);
					if(Character.isLowerCase(dnaSubstring.charAt(0))) {
						result = dnaSubstring.toLowerCase();
					} else {
						result = dnaSubstring.toUpperCase();
					}
			 } else {
				result = "potato";
		}

		return result;	
	}

	public static void testSimpGene() {
		String sc = "ATG";
		String stc = "TAA";
		String dna1 = "atgtaa";
		System.out.println(findSimpGene(dna1, sc, stc));

		String dna2 = "ATGGTACCCTTTGATTAG";
		System.out.println(findSimpGene(dna2, sc, stc));

		String dna3 = "GTACCCTTTGATTAGTAA";
		System.out.println(findSimpGene(dna3, sc, stc));

		String dna4 = "ATGGTACCCTTTTAATAG";
		System.out.println(findSimpGene(dna4, sc, stc));		

		String dna5 = "ATGGTACCCTTTGATAATAG";
		System.out.println(findSimpGene(dna5, sc, stc));
	}

	public static boolean twoOccs(String stOne,String stTwo) {
		if(stTwo.contains(stOne)) {
			return true;
		} else {
			return false;
		}
	}

	public static String last(String stOne, String stTwo) {
		if(stTwo.contains(stOne)) {
			return stTwo.substring(stTwo.indexOf(stOne), stTwo.length()+stOne.length());
		} else {
			return stTwo;
		}
	}

	public static void testTwoOcs() {
		System.out.println(twoOccs("atg", "ctgtatta"));
		System.out.println(last("an", "banana"));
	}

    public static void main(String[] args) {

    		testSimpGene();
    		testTwoOcs();
    }
}