package com.example.c4q.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cheat extends QuizActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = (Button) findViewById(R.id.cheat_bttn);
        button.setVisibility(View.GONE);
        TextView questionTV = (TextView) findViewById(R.id.question_text_view);
        Intent intent = getIntent();

        String myQuestion = intent.getExtras().getString("CURRENT QUESTION");
        String myAnswer = intent.getExtras().getString("CURRENT ANSWER");
        int myIndex = intent.getExtras().getInt("CURRENT INDEX");
//        questionTV.setText(myQuestion + ": " + myAnswer);
        Question currentQuestionCheat = questionBank[myIndex];
        questionTV.setText(getResources().getString(currentQuestionCheat.getTextResId()) + ": " + Boolean.toString(currentQuestionCheat.isAnswerTrue()));
    }
}
