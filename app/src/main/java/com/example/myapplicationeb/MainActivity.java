package com.example.myapplicationeb;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // הגדרת המשתנים של תיבות הטקסט, התוצאה והכפתור
    EditText num1, num2;
    TextView result;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // חיבור קובץ העיצוב לקוד
        setContentView(R.layout.activity_main);

        // קישור המשתנים לרכיבים שבמסך
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        calculateButton = findViewById(R.id.calculateButton);

        // הגדרת פעולה שתתבצע בלחיצה על הכפתור
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // קבלת המספר הראשון והשני מהמשתמש
                String first = num1.getText().toString();
                String second = num2.getText().toString();

                // בדיקה אם אחת מתיבות הטקסט ריקה
                if (first.isEmpty() || second.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "יש להכניס שני מספרים",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                // המרת הטקסט למספרים
                double n1 = Double.parseDouble(first);
                double n2 = Double.parseDouble(second);

                // חיבור שני המספרים
                double sum = n1 + n2;

                // הצגת התוצאה על המסך
                result.setText(String.valueOf(sum));
            }
        });
    }
}
