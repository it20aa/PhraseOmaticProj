
public class PhraseOmatic {

public static void main (String [] args) {

	// String arrays, populated with my words
	String [] wordListOne = {"24.7", "ice cream", "Apple Pie" ,"Tangie things", "Bean Pie", "Tacos Beef", "Chili", "Taco Salad"};

	String [] wordListTwo = {"fine", "delish", "Most outrageous", "colorful", "tangie", "palet pleasing", "wonderous"};

	String [] wordListThree = {"pink", "blue", "aqua", "orange", "black", "purple", "red", "brown", "yellow", "green"};
	
	// Find out how many words in the list
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	 
	//Generate 3 random numbers
	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);
	
	//build a phrase
	String phrase = wordListThree[rand3] + " " + 
	wordListTwo[rand2] + " " + wordListOne[rand1];
	
	// print a phrase
	System.out.println("What we need is a " + phrase);
	
}

}
