package ca.qc.colval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Numero3Activity extends AppCompatActivity {

    EditText txt_message;
    Button btn_reverse;
    TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero3);
        //init
        txt_message = findViewById(R.id.numero3_txt_message);
        btn_reverse = findViewById(R.id.numero3_btn_reverse);
        tv_result = findViewById(R.id.numero3_tv_result);

        btn_reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message  = txt_message.getText().toString();
                StringBuilder result = new StringBuilder(message);
                result = result.reverse();
                tv_result.setText(result);
            }
        });
    }
}