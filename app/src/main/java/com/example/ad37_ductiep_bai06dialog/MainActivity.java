package com.example.ad37_ductiep_bai06dialog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtpass;
    Button btnsignin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Login Activity");

        edtpass = findViewById(R.id.edtpass);
        btnsignin = findViewById(R.id.btnsignin);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = String.valueOf(edtpass.getText());
                String[] Hoa = { "Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};
                String[] thuong = { "q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
                String[] so = {"0","1","2","3","4","5","6","7","8","9"};
                String all = "qưertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0987654321";

                Boolean check1 = false;
                for ( String i : Hoa){
                   if (pass.contains(i)){check1 = true;
                   }}

                Boolean check2 = false;
                for ( String i : thuong){
                    if (pass.contains(i)){check2 = true;
                    }}
                Boolean check3 = false;
                for ( String i : so){
                    if (pass.contains(i)){check3 = true;
                    }}
                Boolean check4 = false;

                char[] c = pass.toCharArray();
                for ( char i : c){
                    if ( !all.contains(Character.toString(i))){
                        check4 = true;
                    }

                }


                if (pass.length()<6 || pass.contains("\n") || check1 == false || check2 == false || check3 == false || check4 == false || pass.isEmpty()){
                    Toast.makeText(getBaseContext(),"lỗi",Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(getBaseContext(),CreatNewNote.class));
                }

            }
        });

    }
}
