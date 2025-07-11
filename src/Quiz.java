import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz(){
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public  void shuffleQuestions(){
        Collections.shuffle(questions);
    }

    public void start(){
        for(int i = 0; i< questions.size(); i++){
            Question question = questions.get(i);
            System.out.print("\nВопрос " + (i+1)+": ");
            System.out.println(question.getText());

            String[] options = question.getOPtions();
            for(int j = 0 ; j < options.length; j++)
            {
                System.out.println((j+1) + ". " + options[j]);
            }

            System.out.print("Введите ваш ответ (выберите число): ");
            int answer = Main.scanner.nextInt() - 1;

            if(question.isCorrect(answer)){
                System.out.println("Правильно !");
                score++;
            }else{
                System.out.println("Неправильно!");
            }
        }
        System.out.println("\nКвиз завершен! Ваш результат: " + score +"/" + questions.size());
    }
}
