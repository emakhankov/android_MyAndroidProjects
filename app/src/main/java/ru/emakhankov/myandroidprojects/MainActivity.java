package ru.emakhankov.myandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycle_view_projects);
        Project[] projects = {
               new Project("Getting Started App", "Our very first project, the defsult 'Hello World' app!", R.drawable.getting_started),
                new Project("Vin Quote", "Making a simple change to the layout, with me own personal motivation", R.drawable.quote),
                new Project("BMI Calculator", "A real life working BIM calculator teaching me Variables", R.drawable.calculator),
                new Project("Inches Converter", "A basic converter to convert inches to meters", R.drawable.calculator ),
                new Project("The Hungry Developer", "A menu app for a fictional restaurant", R.drawable.hungry_developer),
        };

    ProjectsAdapter adapter = new ProjectsAdapter(projects);
    list.setAdapter(adapter);

    }
}