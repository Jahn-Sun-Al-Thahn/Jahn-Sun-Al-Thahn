public class Essay extends GradedActivity{
	private int Grammar;
	private int Spelling;
	private int CorrectLength;
	private int Content;
	Essay(){}
	
	Essay(int Gram, int Spell, int CorLen, int Cont){
		Grammar = Gram; 
		Spelling = Spell;
		CorrectLength = CorLen;
		Content = Cont;
	}
	
	public void setGrammar(int gram) {
		Grammar = gram;
	}
	
	public void setSpelling(int spell) {
		Spelling = spell;
	}
	
	public void setCorrLength(int correct) {
		CorrectLength = correct;
	}
	
	public void setContent(int con) {
		Content = con;
	}
	
	public double getEssayGrade() {
		double grade;
		grade = (Grammar + Spelling + Content + CorrectLength);
		super.setScore(grade);
		return grade;
	}
	
}