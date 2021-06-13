package rg.simplilearn.assignments;

public class AnotherClass {

	public static void main(String[] args) {
		AccessSpecifiers b = new AccessSpecifiers();
		//float avgScore = b.getAvgScorePrivate(290);
		//System.out.println("Average Score is : " + avgScore + "%");
		float avgScoreDefault = b.getAvgScoreDefault(290);
		float avgScoreProtected = b.getAvgScoreProtected(290);
	}
	
	
}
