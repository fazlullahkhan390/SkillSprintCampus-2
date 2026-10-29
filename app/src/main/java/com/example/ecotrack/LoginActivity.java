package com.example.ecotrack;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.field0);
        passwordEditText = findViewById(R.id.field1);

        findViewById(R.id.primaryBtn).setOnClickListener(v -> {
            String mail = emailEditText.getText().toString().trim();
            String pass = passwordEditText.getText().toString();

            if (!Base.validEmail(mail)) {
                Base.toast(this, "Enter a valid email");
                return;
            }
            if (pass.isEmpty()) {
                Base.toast(this, "Enter password");
                return;
            }
            if ((Base.email.isEmpty() && pass.equals(Base.password)) ||
                (mail.equals(Base.email) && pass.equals(Base.password))) {
                Base.email = mail;
                Base.go(this, DashboardActivity.class);
            } else {
                Base.toast(this, "Demo login: register first, or use password Green123");
            }
        });

        findViewById(R.id.registerBtn).setOnClickListener(v -> Base.go(this, RegisterActivity.class));
        findViewById(R.id.forgotBtn).setOnClickListener(v -> Base.go(this, ForgotPasswordActivity.class));
    }
}
