package com.example.ecotrack;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        findViewById(R.id.primaryBtn).setOnClickListener(v -> {
            String mail = ((EditText) findViewById(R.id.field0)).getText().toString().trim();
            if (!Base.validEmail(mail)) {
                Base.toast(this, "Enter a valid email");
                return;
            }
            Base.email = mail;
            Base.toast(this, "Demo recovery started. Continue to reset.");
            Base.go(this, ResetPasswordActivity.class);
            finish();
        });
    }
}
