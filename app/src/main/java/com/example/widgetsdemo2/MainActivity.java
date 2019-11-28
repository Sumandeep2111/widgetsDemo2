package com.example.widgetsdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar seekBar = findViewById(R.id.seekbar);
        final TextView textView = findViewById(R.id.seekbar_txt);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
       final EditText et = findViewById(R.id.number);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seekBar.setProgress(Integer.valueOf(et.getText().toString()));
            }
        });

        Switch agree = findViewById(R.id.agree);
        agree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                    Toast.makeText(MainActivity.this,"Agree",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Not agree",Toast.LENGTH_SHORT).show();
            }
        });

        ToggleButton toggleButton = findViewById(R.id.toggle);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    if (b)
                        Toast.makeText(MainActivity.this,"agree",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this,"Not agree",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
