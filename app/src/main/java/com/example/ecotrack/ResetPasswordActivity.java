package com.example.ecotrack;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        findViewById(R.id.primaryBtn).setOnClickListener(v -> {
            String pass = ((EditText) findViewById(R.id.field0)).getText().toString();
            String confirm = ((EditText) findViewById(R.id.field1)).getText().toString();

            if (pass.length() < 6 || !pass.equals(confirm)) {
                Base.toast(this, "Passwords must match and contain 6+ characters");
                return;
            }

            Base.password = pass;
            Base.toast(this, "Password updated locally");
            Base.go(this, LoginActivity.class);
            finish();
        });
    }
}
