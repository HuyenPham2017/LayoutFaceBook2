package huyen.com.layoutfacebook2;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtSignupforfb = (TextView) findViewById(R.id.txtSignupForFb);
        //String textContent = txtSignupforfb.getText().toString();

        txtSignupforfb.setPaintFlags(txtSignupforfb.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}
