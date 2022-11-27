package com.example.a2440032801_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class SecondActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerView);
        ListData[] listData = new ListData[]{
                new ListData("Jeremy Michael", R.drawable.ic_baseline_person_24),
                new ListData("Andi", R.drawable.ic_baseline_person_24),
                new ListData("Budi", R.drawable.ic_baseline_person_24),
                new ListData("Joko", R.drawable.ic_baseline_person_24),
                new ListData("Bambang", R.drawable.ic_baseline_person_24),
                new ListData("Anton", R.drawable.ic_baseline_person_24),
                new ListData("Doni", R.drawable.ic_baseline_person_24),
                new ListData("Tono", R.drawable.ic_baseline_person_24),
                new ListData("Toni", R.drawable.ic_baseline_person_24),
                new ListData("Dono", R.drawable.ic_baseline_person_24),
                new ListData("Roni", R.drawable.ic_baseline_person_24),
                new ListData("Dino", R.drawable.ic_baseline_person_24),
                new ListData("Tina", R.drawable.ic_baseline_person_24)
        };
        //Adapter
        ListAdapter adapter = new ListAdapter(listData);
        recyclerView.setHasFixedSize(true);

        //Layout Manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }
}

