package th.ac.su.vote;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import th.ac.su.vote.MainActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

import static com.muddzdev.styleabletoastlibrary.StyleableToast.*;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button checkButton = findViewById(R.id.button_check);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNumber = findViewById(R.id.editTextNumber);
                String AS1 = "1111111111111";
                String AS2 = "2222222222222";
                if (editTextNumber.getText().toString().length() < 13) {

                    makeText(getApplicationContext(),"กรุณากรอกเลขบัตรประชาชน 13 หลัก",R.style.exampleToast).show();

                } else if (editTextNumber.getText().toString().equals(AS1) || editTextNumber.getText().toString().equals(AS2)){

                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity2.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง");
                    dialog.setNegativeButton("OK", null);
                    dialog.show();

                } else {

                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity2.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage("คุณไม่มีสิทธิ์เลือกตั้ง");
                    dialog.setNegativeButton("OK", null);
                    dialog.show();

                }
            }
        });

    }
}