package ca.qc.colval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Numero4Activity extends AppCompatActivity {

    EditText txt_amount, txt_tip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero4);
        setTitle("Tip Calculator");

        //init
        txt_amount = findViewById(R.id.numero4_txt_amount);
        txt_tip = findViewById(R.id.numero4_txt_tip);
    }

    private void showMessage(String message) {
        Toast toast;
        toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setText(message);
        toast.show();
    }

    public void clickCalculate(View view) {
        float amount = Float.parseFloat(txt_amount.getText().toString());
        float tipPercent = Float.parseFloat(txt_tip.getText().toString());

        float result = amount * tipPercent / 100;
        showMessage("Your tip is " + result + " $");
    }
}













