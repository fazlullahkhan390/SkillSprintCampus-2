package com.example.ecotrack;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        int[] ids = {R.id.speakBtn, R.id.codeBtn, R.id.brainBtn, R.id.missionBtn};
        String[] tips = {
            "Practice a 60-second self-introduction 🎤",
            "Solve one tiny coding challenge 💻",
            "Recall 5 things you learned today 🧠",
            "Complete 3 skill missions this week 🏆"
        };

        for (int i = 0; i < ids.length; i++) {
            final int index = i;
            findViewById(ids[i]).setOnClickListener(v -> new AlertDialog.Builder(this)
                .setTitle("Skill Practice")
                .setMessage(tips[index])
                .setPositiveButton("Done", (dialog, which) -> Base.toast(this, "Nice work!"))
                .setNegativeButton("Later", null)
                .show());
        }

        findViewById(R.id.profileBtn).setOnClickListener(v -> Base.go(this, ProfileActivity.class));
    }
}
