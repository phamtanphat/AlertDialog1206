package com.ptp.phamtanphat.alertdialog1206;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.buttonAlertDialog);
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Ban co muon tat hop thoai khong?");

                alertDialog.setCancelable(false);
                alertDialog.setIcon(R.mipmap.ic_launcher);

                final String[] mangten = {"Meo","Cho","Heo","Ga"};
                boolean[] checked = {true,false,false,false};
                alertDialog.setMultiChoiceItems(mangten, checked, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        Toast.makeText(MainActivity.this, mangten[i], Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.show();
            }
        });
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}
