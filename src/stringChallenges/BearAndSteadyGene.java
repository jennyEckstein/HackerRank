package stringChallenges;

public class BearAndSteadyGene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "GAAATAAA";
		BearAndSteadyGene bearAndSteadyGene = new BearAndSteadyGene();
		System.out.println(bearAndSteadyGene.fixGene(string.toLowerCase()));
	
	}
	
	public int fixGene(String str){
		int totalRequiredOccurences = str.length() / 4;
		
		final String A = "a";
		final String C = "c";
		final String T = "t";
		final String G = "g";
		
		int a = 0;
		int c = 0;
		int t = 0;
		int g = 0;
		
		boolean a_over = false;
		boolean c_over = false;
		boolean t_over = false;
		boolean g_over = false;
		
		for (int i = 0; i < str.length(); i++){
			String letter = str.substring(i, i+1);
			System.out.println(letter);
			switch (letter){
				case A:
					a++;
				break;	
				
				case C:
					c++;
				break;
				
				case T:
					t++;
				break;
				
				case G:
					g++;
				break;
			}
		}
		
		System.out.println(a + " | " + c + " | " + t + " | " + g);
		System.out.println(totalRequiredOccurences);
		
		if (a > totalRequiredOccurences){a_over = true;}
		if (c > totalRequiredOccurences){c_over = true;}
		if (t > totalRequiredOccurences){t_over = true;}
		if (g > totalRequiredOccurences){g_over = true;}
		
		
		
		int replace = 0;
		if((a - totalRequiredOccurences) > 0){replace += a - totalRequiredOccurences;}
		if((c - totalRequiredOccurences) > 0){replace += c - totalRequiredOccurences;}
		if((t - totalRequiredOccurences) > 0){replace += t - totalRequiredOccurences;}
		if((g - totalRequiredOccurences) > 0){replace += g - totalRequiredOccurences;}
		
		int smallestSub = str.length();
		
		for(int j = 0; j < str.length() - replace; j++){
			if(str.substring(j, j+1).equals(A) && a_over){
				int count = 0;
				for(int k = j; k < str.length(); k++){
					if(str.substring(arg0))
				}
			}
			if(str.substring(j, j+1).equals(C) && c_over){
							
						}
			if(str.substring(j, j+1).equals(T) && t_over){
				
			}
			if(str.substring(j, j+1).equals(G) && g_over){
				
			}
		}
		
		return replace;
	}

}
