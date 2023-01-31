package ca.qc.colval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Numero2Activity extends AppCompatActivity {

    EditText txt_email, txt_password;
    Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero2);
        //init
        txt_email = findViewById(R.id.numero2_txt_email);
        txt_password = findViewById(R.id.numero2_txt_password);
        btn_send = findViewById(R.id.numero2_btn_send);
        //click send button
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txt_email.getText().toString();
                String password = txt_password.getText().toString();
                if(checkAuthentification(email, password))
                    showMessage("Success authentification");
                else
                    showMessage("Error authentification");
            }
        });
    }

    private boolean checkAuthentification(String email, String password) {
        if(email.equals("admin@colval.qc.ca")  && password.equals("admin2023")) {
            return true;
        }
        return false;
    }

    private void showMessage(String message){
        Toast toast;
        toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setText(message);
        toast.show();
    }
}