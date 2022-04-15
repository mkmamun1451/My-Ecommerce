package com.example.myecommerce;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView signup2;
    private Button signup;
    private Class<HomeActivity2> targetActivityClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        signup = findViewById(R.id.signup);
        signup2 = findViewById(R.id.signup2);


        signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                builder.setTitle("Signing Up");
                builder.setMessage("Are you sure you want to Sign up for This Application?");
                builder.setCancelable(false);
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(MainActivity2.this,SignActivity.class);
                        intent.putExtra("placeId",1);
                        startActivity(intent);

                    }
                })
                        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });






        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        Intent intent = new Intent(MainActivity2.this,HomeActivity.class);
                        startActivity(intent);
            }
        });
    }
}