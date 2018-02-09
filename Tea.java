import edu.duke.*;

public class Tea {



public static Integer findStopCodon(String dna, 
																		Integer startInd, 
																		String stopC) {
	if(startInd == -1) {
		startInd = 0;
	} else {
		startInd = startInd;
	}
	Integer currInd = dna.indexOf(stopC, startInd + 3);
	while(currInd != -1) {
		if((currInd - startInd) % 3 == 0) {
			return currInd;
		} else {
			currInd = dna.indexOf(stopC, currInd + 1);
		}
	}
	return dna.length();
}

	public static void testDna() {
		//
		System.out.println(findStopCodon("asdasdatgasdasdasdasdtaa", 0,"taa"));
		System.out.println(findStopCodon("atgasdasdasdasdtag", 0,"tag"));
		System.out.println(findStopCodon("asdasatgasdasdtga", 0,"tga"));
	}

//---------------------------------------------------------------------------->


public static String findGene(String dna, int start) {
		dna = dna.toLowerCase();
		int startInd = dna.indexOf("atg", start);;
		if(startInd == -1) {
			return "";
		};
		int taaInd = findStopCodon(dna, startInd, "taa");
		int tagInd = findStopCodon(dna, startInd, "tag");
		int tgaInd = findStopCodon(dna, startInd, "tga");
		int minInd = 0;
		if (taaInd == -1 ||
					(tgaInd != -1 && tgaInd < taaInd)) {
			minInd = tgaInd;
		} else {
			minInd = taaInd;
		}
		return dna.substring(startInd, minInd + 3);
};

public static void testFindGene() {
	String dna1 = "ATGGTATAGAGTATAA";
	//System.out.println(findGene(dna1));
}

public static void printAllGenes(String dna) {
	dna = dna.toLowerCase();
	int start = 0;
	while(true) {
		String curGene = findGene(dna, start);

		if(curGene.isEmpty()) {
			break;
		}
		System.out.println(curGene);

		start = dna.indexOf(curGene, start) + curGene.length();
	}

}

public static Integer howMany(String strngA, String strngB) {
	strngA.toLowerCase();
	strngB.toLowerCase();
	int count = 0;
	int curInd = 0;

	if(strngA.length() == 0 || strngB.length() == 0) {
		return 0;
	} else {
		while(!(strngB.indexOf(strngA, curInd) == -1)) {
			count++;
			curInd = strngB.indexOf(strngA, curInd) + strngA.length();
		}
	}
	return count;
}



	public static void main (String[] args) {
			// testDna();
			//testFindGene();
			//printAllGenes("asdasdatgasdasdasdasdtaaatgaggaggtagatatatgaggaggtga");
			System.out.println(howMany("gaa","atgaacgaattgaatc"));
	}
}