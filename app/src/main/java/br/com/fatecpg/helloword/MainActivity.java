package br.com.fatecpg.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void somar(View view){
        EditText e1 = (EditText)findViewById(R.id.editText1);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        double n1 = Double.parseDouble(e1.getText().toString());
        double n2 = Double.parseDouble(e2.getText().toString());
        double soma = n1 + n2;
        TextView t = (TextView) findViewById(R.id.textViewSoma);
        t.setText(""+soma);
    }
}
