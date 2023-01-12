package com.example.tema1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  onClickBtn (View view)
    {
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        EditText edtTextBox = findViewById(R.id.editName);
        EditText edtTextBox1= findViewById(R.id.editName2);
        EditText edtTextBox3 = findViewById(R.id.editEmail);
        textView.setText(edtTextBox.getText().toString());
        textView2.setText(edtTextBox1.getText().toString());
        textView3.setText(edtTextBox3.getText().toString());

    }
}