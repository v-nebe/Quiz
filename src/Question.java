public class Question {
    private String text;
    private String[] options;
    private int correctAnswers;
    public Question(String text, String[] options, int correctAnswers){
        this.text = text;
        this.options =options;
        this.correctAnswers = correctAnswers;
    }

    public String getText(){
        return text;
    }

    public String[] getOPtions() {
        return options;
    }

    public boolean isCorrect(int answer){
        return answer == correctAnswers;
    }
}
