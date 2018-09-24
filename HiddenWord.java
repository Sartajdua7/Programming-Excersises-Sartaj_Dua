package homework;

public class HiddenWord {
	private String hiddenWord;
	public HiddenWord(String x) {
		hiddenWord = x;
	}
	public String getHint(String wrd) {
		String hint = "";
		boolean test = true;
		char[] guess = wrd.toCharArray();
		char[] hidden = hiddenWord.toCharArray();
		for(int i = 0; i < guess.length; i++) {
			test = true;
			if(guess[i] == hidden[i]) 
				hint += guess[i];
			else {
				for(int r = 0; r < guess.length; r++) {
					if(guess[i] == hidden[r]) {
						hint += "+";
						test = false;
						break;
					}
				}
				if(test) 
				hint += "*";
			}
		}
		return hint;
	}
}
