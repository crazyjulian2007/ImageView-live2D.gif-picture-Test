package com.example.user.imageviewtest;
import com.bumptech.glide.Glide;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = findViewById(R.id.txtView);
        ImageView imgView = findViewById(R.id.imgView);

        Glide.with(this).load(R.drawable.charlotte01).into(imgView);

        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (count){
                    case 0:
                        count++;
                        txtView.setText("");
                        txtView.setText("How are you?");
                        break;
                    case 1:
                        count++;
                        txtView.setText("");
                        txtView.setText("I'm hungry...");
                        break;
                    case 2:
                        count++;
                        txtView.setText("");
                        txtView.setText("Am I cute?");
                        break;
                    case 3:
                        count++;
                        txtView.setText("");
                        txtView.setText("What can I do for you?");
                        break;
                    case 4:
                        count = 0;
                        txtView.setText("");
                        txtView.setText("Mio Mio~~");
                        break;
                }
            }
        });
    }
    boolean isTrue;
//    @Override
//    public void onClick(View view) {
//        int ID = view.getId();
//
//        switch (ID){
//            case R.id.imgView:
//                switch (count){
//                    case 0:
//                        count++;
//                        txtView.setText("");
//                        txtView.setText("How are you?");
//                        break;
//                    case 1:
//                        count++;
//                        txtView.setText("");
//                        txtView.setText("I'm hungry...");
//                        break;
//                    case 2:
//                        count++;
//                        txtView.setText("");
//                        txtView.setText("Am I cute?");
//                        break;
//                    case 3:
//                        count++;
//                        txtView.setText("");
//                        txtView.setText("What can I do for you?");
//                        break;
//                    case 4:
//                        count = 0;
//                        txtView.setText("");
//                        txtView.setText("Mio Mio~~");
//                        break;
//                }
//                break;
//        }


//    }
}
