package com.applook.pilot;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Random;

public class Call extends AppCompatActivity {

    private TextView Question, number;
    private Button option1btn, option2btn, option3btn, option4btn;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int currentScore = 0, questionAttempted = 1, currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        Question = findViewById(R.id.Question);
        number = findViewById(R.id.number);
        option1btn = findViewById(R.id.option1);
        option2btn = findViewById(R.id.option2);
        option3btn = findViewById(R.id.option3);
        option4btn = findViewById(R.id.option4);
        quizModalArrayList = new ArrayList<>();
        random = new Random();
        getQuizQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size());
        setDataToViews(currentPos);
        option1btn.setOnClickListener(v -> {
            if (quizModalArrayList.get(currentPos).getAnswer().trim().equalsIgnoreCase(option1btn.getText().toString().trim())) {


                currentScore++;
            }
            questionAttempted++;
            currentPos = random.nextInt(quizModalArrayList.size());
            setDataToViews(currentPos);
        });
        option2btn.setOnClickListener(v -> {
            if (quizModalArrayList.get(currentPos).getAnswer().trim().equalsIgnoreCase(option2btn.getText().toString().trim())) {


                currentScore++;
            }
            questionAttempted++;
            currentPos = random.nextInt(quizModalArrayList.size());
            setDataToViews(currentPos);
        });
        option3btn.setOnClickListener(v -> {
            if (quizModalArrayList.get(currentPos).getAnswer().trim().equalsIgnoreCase(option3btn.getText().toString().trim())) {


                currentScore++;
            }
            questionAttempted++;
            currentPos = random.nextInt(quizModalArrayList.size());
            setDataToViews(currentPos);
        });
        option4btn.setOnClickListener(v -> {
            if (quizModalArrayList.get(currentPos).getAnswer().trim().equalsIgnoreCase(option4btn.getText().toString().trim())) {


                currentScore++;
            }
            questionAttempted++;
            currentPos = random.nextInt(quizModalArrayList.size());
            setDataToViews(currentPos);
        });
    }

    private void setDataToViews(int currentPos) {
        number.setText("Question Attempted : " + questionAttempted + "/10");
        Question.setText(quizModalArrayList.get(currentPos).getQuestion());
        option1btn.setText(quizModalArrayList.get(currentPos).getOption1());
        option2btn.setText(quizModalArrayList.get(currentPos).getOption2());
        option3btn.setText(quizModalArrayList.get(currentPos).getOption3());
        option4btn.setText(quizModalArrayList.get(currentPos).getOption4());
    }

    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList) {

        quizModalArrayList.add(new QuizModal("What this app developed`s name ?", "Father", "Ilia", "Max", "Seva"));
        quizModalArrayList.add(new QuizModal("Why i so clevar ?", "gkgkkg", "lfeb", "dgerg", "geg"));
        quizModalArrayList.add(new QuizModal("Who want hang out ?", "ppppd", "tttt", "jjj", "ooo"));
        quizModalArrayList.add(new QuizModal("Who want look out ?", "gdeg", "pppppppppp", "mmm", "lll"));

    }
}