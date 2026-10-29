package com.example.ecotrack;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView userInfo = findViewById(R.id.userInfo);
        userInfo.setText("Name: " + Base.name + "\nEmail: " + (Base.email.isEmpty() ? "Demo user" : Base.email) + "\n\nMember • SkillSprint");

        findViewById(R.id.logoutBtn).setOnClickListener(v -> {
            Base.go(this, LoginActivity.class);
            finish();
        });
    }
}
