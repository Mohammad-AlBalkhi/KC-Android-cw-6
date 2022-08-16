package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  int currentstudent = 0 ;
    ArrayList <Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText studentName = findViewById(R.id.SName);
        ImageView studentImg = findViewById(R.id.SImg);
        EditText studentAge = findViewById(R.id.SAge);
        EditText studentGrade = findViewById(R.id.SGrade);
        Button b = findViewById(R.id.Next);


      Student student1 = new Student("Hamad", 17,12, R.drawable.boy1);
      Student student2 = new Student("Salman", 14,9, R.drawable.boy2);
      Student student3 = new Student("Mohammad", 16,11, R.drawable.boy3);

     students.add(student1);
     students.add(student2);
     students.add(student3);


     studentImg.setImageResource(students.get(currentstudent).getStudentImg());
     studentName.setText(students.get(currentstudent).getStudentName());
     studentAge.setText(String.valueOf(students.get(currentstudent).getStudentAge()));
     studentGrade.setText(String.valueOf(students.get(currentstudent).getStudentGrade()));

     b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

         currentstudent++;
         if (currentstudent == students.size() ) {
             currentstudent = 0;
         }

             studentImg.setImageResource(students.get(currentstudent).getStudentImg());
             studentName.setText(students.get(currentstudent).getStudentName());
             studentAge.setText(String.valueOf(students.get(currentstudent).getStudentAge()));
             studentGrade.setText(String.valueOf(students.get(currentstudent).getStudentGrade()));



         }
     });

    }
}