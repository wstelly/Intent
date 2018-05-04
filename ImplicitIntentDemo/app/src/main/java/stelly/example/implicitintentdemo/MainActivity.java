package stelly.example.implicitintentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private EditText editText;

    private String website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.open_web_site_tv);
        editText=(EditText)findViewById(R.id.activity_main_website_et);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.stelly");
                intent.addCategory("com.stelly");
                if (editText.getText().toString().isEmpty()){
                    website ="http://www.baidu.com";
                }else {
                    website=editText.getText().toString().trim();
                }
                intent.putExtra("website",website);
                startActivity(intent);
            }
        });

    }
}
