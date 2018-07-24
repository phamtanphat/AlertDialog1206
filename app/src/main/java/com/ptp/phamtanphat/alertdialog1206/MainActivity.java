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
                alertDialog.setMessage("Hay xac nhan ben duoi");
                alertDialog.setCancelable(false);
                alertDialog.setIcon(R.mipmap.ic_launcher);
                alertDialog.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Ket thuc ung dung
                        finishAffinity();
                    }
                });
                alertDialog.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Ban da chon Khong", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNeutralButton("Huy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

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
