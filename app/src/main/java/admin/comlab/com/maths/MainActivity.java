package admin.comlab.com.maths;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5;
    TextView answer;
    EditText number;
    Integer factorial = 1, i, t1 = 1, t2 = 2, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        answer = findViewById(R.id.ans);
        number = findViewById(R.id.num);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer i, t1 = 1, t2 = 2, next;
                Double factorial = Double.valueOf(1);
                String num = number.getText().toString();
                Double n = Double.parseDouble(num);
                if (n <= 0) {
                    Toast.makeText(getApplicationContext(), "Please Enter positive number", Toast.LENGTH_SHORT).show();
                } else {
                    for (i = 1; i <= n; i++) {
                        factorial = factorial * i;
                    }
                    String finalanswer = Double.toString(factorial);
                    answer.setText("Factorial is" + finalanswer);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer factorial = 1, i, t1 = 1, t2 = 2, next;
                String num = number.getText().toString();
                Integer n = Integer.parseInt(num);
                StringBuilder stringBuilder = new StringBuilder();
                if (n == 1 & n == 0) {
                    answer.setText("Enter valid number");
                } else {
                    for (i = 1; i <= n; i++) {
                        stringBuilder.append(t1 + ",");
                        next = t1 + t2;
                        t1 = t2;
                        t2 = next;


                    }
                    answer.setText(stringBuilder.toString());
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int reversed = 0;
                String num = number.getText().toString();
                Integer n = Integer.parseInt(num);
                while (n != 0) {
                    int digit = n % 10;
                    reversed = reversed * 10 + digit;
                    n /= 10;
                }
                answer.setText("Reversed Number is-" + reversed);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = 0;
                String num = number.getText().toString();
                Integer n = Integer.parseInt(num);
                while (n != 0) {
                    int digit = n % 10;
                    sum = sum + digit;
                    n /= 10;
                }
                answer.setText("Sum of difgits of Number is-" + sum);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String num = number.getText().toString();
                                      Integer n = Integer.parseInt(num);
                                      int c = 0, a, temp;
                                      temp = n;
                                      while (n > 0) {
                                          a = n % 10;
                                          n = n / 10;
                                          c = c + (a * a * a);
                                      }
                                      if (temp == c) {
                                          answer.setText(num.toString() + " is a Armstrong Number");
                                      } else {
                                          answer.setText(num + " is not an Armstrong Number");
                                      }
                                  }
                              }
        );
    }
}
