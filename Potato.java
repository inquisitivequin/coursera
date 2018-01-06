public class Potato {

	public static String findSimpGene(String dna) {

		String result = "";

		Integer start = dna.indexOf("ATG");
		if(start == -1) {
			return "";
		};

		Integer end = dna.indexOf("TAA", start+3);
		if(end == -1) {
			return "";
		};

		if((start - end) % 3 == 0) {
			result = dna.substring(start, end+3);
		} else {
			result = "potato";
		}

		return result;	
	}

	public static void testSimpGene() {
		String dna1 = "ATGTAA";
		System.out.println(findSimpGene(dna1));

		String dna2 = "ATGGTACCCTTTGATTAG";
		System.out.println(findSimpGene(dna2));

		String dna3 = "GTACCCTTTGATTAGTAA";
		System.out.println(findSimpGene(dna3));

		String dna4 = "ATGGTACCCTTTGATTAG";
		System.out.println(findSimpGene(dna4));		

		String dna5 = "ATGGTACCCTTTGATTAG";
		System.out.println(findSimpGene(dna5));
	}

    public static void main(String[] args) {


    }
}