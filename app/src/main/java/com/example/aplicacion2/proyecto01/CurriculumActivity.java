package com.example.aplicacion2.proyecto01;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class CurriculumActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculum);

        final TextView DateNac = (TextView)findViewById(R.id.InputFechaNac);

        DateNac.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int Dia = c.get(Calendar.DAY_OF_MONTH);
                int Mes = c.get(Calendar.MONTH);
                int Ano = c.get(Calendar.YEAR);

                DatePickerDialog dpt = new DatePickerDialog(CurriculumActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        String tDay = String.format("%0" + 2 + "d", day);
                        String tMes = String.format("%0" + 2 + "d", month);

                        DateNac.setText(tDay + "/" + tMes + "/" + year);
                    }
                }, Ano, Mes, Dia);
                dpt.show();
            }
        });

    }


}
