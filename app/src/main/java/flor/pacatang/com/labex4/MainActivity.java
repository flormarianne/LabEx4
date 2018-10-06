package flor.pacatang.com.labex4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toast = (Button) findViewById(R.id.toast);
        Button snackbarbtn = (Button) findViewById(R.id.snackbarbtn);
        Button snackbaractbtn = (Button) findViewById(R.id.snackbaractbtn);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "TOAST!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });
        snackbarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "SNACKBAR!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });

        snackbaractbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Snackbar message with action";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbarAct(view, message, duration);
            }
        });
    }

    public void showSnackbar(View view, String message, int duration) {
        Snackbar.make(view, message, duration).show();
    }

    public void showSnackbarAct(View view, String message, int duration) {
        final Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("DISMISS", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });

        snackbar.show();
    }


    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("LAB4" ,"onResume() has executed" );
    }
}