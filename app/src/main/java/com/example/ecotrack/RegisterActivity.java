package com.example.ecotrack;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findViewById(R.id.primaryBtn).setOnClickListener(v -> {
            EditText nameInput = findViewById(R.id.field0);
            EditText emailInput = findViewById(R.id.field1);
            EditText passInput = findViewById(R.id.field2);
            EditText confirmInput = findViewById(R.id.field3);

            String name = nameInput.getText().toString().trim();
            String mail = emailInput.getText().toString().trim();
            String pw = passInput.getText().toString();
            String confirmPw = confirmInput.getText().toString();

            if (name.isEmpty() || !Base.validEmail(mail) || pw.length() < 6 || !pw.equals(confirmPw)) {
                Base.toast(this, "Check name, email, password (6+), and confirmation");
                return;
            }

            Base.name = name;
            Base.email = mail;
            Base.password = pw;
            Base.toast(this, "Account created locally");
            Base.go(this, DashboardActivity.class);
            finish();
        });
    }
}
