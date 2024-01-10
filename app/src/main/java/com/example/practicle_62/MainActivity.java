package com.example.practicle_62;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout f1=findViewById(R.id.f1);
        TextView t1=findViewById(R.id.t1);

        displaydt(t1);
    }

    private void displaydt(TextView t1)
    {
        int intval=10;
        float floatval=50.25f;
        String Stringval="Rakesh Bandi";
        boolean boolval=true;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Integer: ").append(intval).append("\n");
        stringBuilder.append("Float: ").append(floatval).append("\n");
        stringBuilder.append("String: ").append(Stringval).append("\n");
        stringBuilder.append("Boolean: ").append(boolval);

        t1.setText(stringBuilder.toString());


    }
}