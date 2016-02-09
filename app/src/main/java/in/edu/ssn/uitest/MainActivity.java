package in.edu.ssn.uitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText username, password;
    RelativeLayout canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button)findViewById(R.id.submit);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        canvas = (RelativeLayout)findViewById(R.id.canvas);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String un = null, pwd = null;
                un = username.getText().toString();
                pwd = password.getText().toString();
                if (un.equals("test")&&pwd.equals("test123")) {
                    Toast.makeText(getApplicationContext(),"aunthenticated user",Toast.LENGTH_LONG).show();
                    canvas.setBackgroundResource(R.color.cac);
                }else {
                    Toast.makeText(getApplicationContext(),"invalid user",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
