package OOPS;

public class CricketScorer {
	//Instance	Variables	- constitute	the	state	of	an	object
	private int score;
	
	//Behavior	- all	the	methods	that	are	part	of	the	class
	//An	object	of	this	type	has	behavior	based	on	the	
	//methods	four,	six	and	getScore
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int run) {
		score= score +run;
	}
	
	public void four() {
		score = score+4;
	}
	
	public void six() {
		score = score+6;
	}

	public static void main(String[] args) {
		
		CricketScorer cs=new CricketScorer();
		cs.setScore(22);
		cs.four();
		cs.six();
		cs.setScore(18);
		cs.four();
		cs.six();
		cs.setScore(30);
		cs.four();
		cs.six();
		cs.setScore(100);
		cs.four();
		cs.six();
		cs.four();
		cs.six();
		System.out.println("Runs scored in this Match : "+ cs.getScore());
	}

}
