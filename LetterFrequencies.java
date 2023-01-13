/*
 * Activity 2.4.4
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";
		


		System.out.println("The following shows the letter frequencies for the phrase");

    /* your code here */
		//for loop that happens 26 times
		for (int i = 0; i <26; i++){
			String let = letters.substring(i,i+1);
			int count = 0;
			for(int j = 0; j < phrase.length(); j++){
			
				String phr = phrase.substring(j, j+1);

			if(let.equals(phr))
			count++;
				
			}
		
			System.out.println(let + " appears " + count + " times.");
		}
		
		

	}
}
