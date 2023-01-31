package ca.qc.colval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Numero1Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero1);
        showMessage("Je suis la méthode onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage("Je suis la méthode onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("Je suis la méthode onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage("L'activité est terminée");
    }

    private void showMessage(String message){
        Toast toast;
        toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setText(message);
        toast.show();
    }
}