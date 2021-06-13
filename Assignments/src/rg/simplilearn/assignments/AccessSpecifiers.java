package rg.simplilearn.assignments;

public class AccessSpecifiers {

	public static void main(String[] args) {

		AccessSpecifiers a = new AccessSpecifiers();
		float avgScore = a.getAvgScore(250);
		System.out.println("Average Score is : " + avgScore + "%");
		float avgScorePrivate = a.getAvgScorePrivate(250);
		System.out.println("Average Score is : " + avgScorePrivate + "%");
		float avgScoreDefault = a.getAvgScoreDefault(250);
		System.out.println("Average Score is : " + avgScoreDefault + "%");
	}
	
	public float getAvgScore(int score) {
		float avgScore = score * 100 / 500; 
		return (avgScore);
	}
	
	private float getAvgScorePrivate(int score) {
		float avgScore = score * 100 / 500; 
		return (avgScore);
	}

	protected float getAvgScoreProtected(int score) {
		float avgScore = score * 100 / 500; 
		return (avgScore);
	}
	
	float getAvgScoreDefault(int score) {
		float avgScore = score * 100 / 500; 
		return (avgScore);
	}
}
