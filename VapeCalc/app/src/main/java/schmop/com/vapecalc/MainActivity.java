package schmop.com.vapecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init textbox voltH
        EditText VoltageEditText= (EditText) findviewbyId(r.id.voltB);
        VoltageEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean handled = false;
                if (i== EditorInfo.IME_ACTION_NEXT) {
                    //capture input to string mvoltage, send to toast
                    String mvoltage = textView.getText().toString();
                    Toast.makeText(MainActivity.this, "Voltage applied is: "
                            + inputText, Toast.LENGTH_SHORT).show();

                }
                return handled;
            }
        });

        EditText ResEditText= (EditText) findviewbyId(r.id.impB);
        ResEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean handled = false;
                if (i== EditorInfo.IME_ACTION_NEXT) {
                    //capture input to string mres, send to toast
                    String mres = textView.getText().toString();
                    Toast.makeText(MainActivity.this, "Coil Impotence is: "
                            + inputText, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
