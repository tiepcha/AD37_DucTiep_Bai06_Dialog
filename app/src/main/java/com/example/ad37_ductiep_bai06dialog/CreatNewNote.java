package com.example.ad37_ductiep_bai06dialog;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static android.app.TimePickerDialog.*;

public class CreatNewNote extends AppCompatActivity {

    Spinner spntype;
    ArrayList<String> type;
    TextView tvtimepicker, tvdatepicker;
    TextView tvtune , tvsave;
    ImageView img3dots;

    TextView tvtags , tvtag,tvweek , tvweeks;

    int year, month, day, monthOfYear, dayOfMonth, hour, minute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_new_note);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        tvtags = findViewById(R.id.tvtags);
        tvdatepicker = findViewById(R.id.tvdatepicker);
        tvtimepicker = findViewById(R.id.tvtimepicker);
        tvtune = findViewById(R.id.tvtune);
        spntype = findViewById(R.id.spntype);
        tvtag = findViewById(R.id.tvtag);
        tvsave = findViewById(R.id.tvsave);
        tvweek = findViewById(R.id.tvweek);
        tvweeks = findViewById(R.id.tvweeks);
        img3dots = findViewById(R.id.img3dots);


        type = new ArrayList<>();
        type.add("Word");
        type.add("Games");
        type.add("3");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.spinner_item, type);
        spntype.setAdapter(arrayAdapter);

        tvdatepicker.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                datepicker();
            }
        });

        tvtimepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timepicker();
            }
        });

        tvtags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] listtags = {"Family", "Game", "Android", "VTC", "Friend"};
                final boolean[] b = {true, false, true, false, true};

                AlertDialog alertDialog = new Builder(CreatNewNote.this)
                        .setTitle("Choose tags:")
                        .setMultiChoiceItems(listtags, b, new OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                            }
                        })
                        .setPositiveButton("OK", new OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                List<String> tags = new ArrayList<>();
                                for (int x =0 ; x <=4 ; x++){
                                    if (b[x]==true){
                                        tags.add(listtags[x]);
                                    }
                                }

                                tvtags.setText(tags.toString().substring(1,tags.toString().length()-1));
                            }
                        })
                        .setNegativeButton("Cancel", new OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .create();
                alertDialog.show();
            }
        });

        tvtag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] listtags = {"Family", "Game", "Android", "VTC", "Friend"};
                final boolean[] b = {true, false, true, false, true};

                AlertDialog alertDialog = new Builder(CreatNewNote.this)
                        .setTitle("Choose tags:")
                        .setMultiChoiceItems(listtags, b, new OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                            }
                        })
                        .setPositiveButton("OK", new OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                List<String> tags = new ArrayList<>();
                                for (int x =0 ; x <=4 ; x++){
                                    if (b[x]==true){
                                        tags.add(listtags[x]);
                                    }
                                }

                                tvtags.setText(tags.toString().substring(1,tags.toString().length()-1));
                            }
                        })
                        .setNegativeButton("Cancel", new OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .create();
                alertDialog.show();
            }
        });
        tvweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] listtags = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday","Sunday"};
                final boolean[] b = {true, true, false,false,false, true,false};

                AlertDialog alertDialog = new Builder(CreatNewNote.this)
                        .setTitle("Choose tags:")
                        .setMultiChoiceItems(listtags, b, new OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                            }
                        })
                        .setPositiveButton("OK", new OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                List<String> tags = new ArrayList<>();
                                for (int x =0 ; x <=6 ; x++){
                                    if (b[x]==true){
                                        tags.add(listtags[x]);
                                    }
                                }

                                tvweeks.setText(tags.toString().substring(1,tags.toString().length()-1));
                            }
                        })
                        .setNegativeButton("Cancel", new OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .create();
                alertDialog.show();
            }
        });
        tvweeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] listtags = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday","Sunday"};
                final boolean[] b = {true, true, false,false,false, true,false};

                AlertDialog alertDialog = new Builder(CreatNewNote.this)
                        .setTitle("Choose tags:")
                        .setMultiChoiceItems(listtags, b, new OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                            }
                        })
                        .setPositiveButton("OK", new OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                List<String> tags = new ArrayList<>();
                                for (int x =0 ; x <=6 ; x++){
                                    if (b[x]==true){
                                        tags.add(listtags[x]);
                                    }
                                }

                                tvweeks.setText(tags.toString().substring(1,tags.toString().length()-1));
                            }
                        })
                        .setNegativeButton("Cancel", new OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .create();
                alertDialog.show();
            }
        });


        tvtune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(getBaseContext(),view);

                popupMenu.getMenuInflater().inflate(R.menu.tune_menu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()){

                            case R.id.fromdefault:
                                String[] list = {"Nexus tune", "WinPhone tune","Peep tune","Nokia tune","Etc"};
                                AlertDialog alertDialog = new AlertDialog.Builder(CreatNewNote.this)
                                        .setTitle("")
                                        .setSingleChoiceItems(list,1, new OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .setPositiveButton("Ok", new OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })

                                        .setNegativeButton("Cancel", new OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {

                                            }
                                        })
                                        .create();
                                alertDialog.show();
                                break;


                            case R.id.fromfile :
                                Toast.makeText(getBaseContext(),"From File",Toast.LENGTH_SHORT).show();
                                break;


                        }

                        return false;
                    }
                });

                popupMenu.show();
            }
        });


        img3dots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(getBaseContext(),view);
                popupMenu.getMenuInflater().inflate(R.menu.action_menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(getBaseContext(),"Cancel",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                popupMenu.show();
            }
        });


        tvsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Save",Toast.LENGTH_SHORT).show();
            }
        });

    }


    @RequiresApi(api = Build.VERSION_CODES.N)


    void datepicker() {

        final Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                i1 += 1;
                tvdatepicker.setText(i2 + "/" + i1 + "/" + i);

            }
        }, year, month, day);
        datePickerDialog.show();

    }


    void timepicker() {

        final Calendar calendar = Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR);
        minute = calendar.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                tvtimepicker.setText(i+":"+i1);
            }
        },hour,minute,true);
        timePickerDialog.show();

    }
}