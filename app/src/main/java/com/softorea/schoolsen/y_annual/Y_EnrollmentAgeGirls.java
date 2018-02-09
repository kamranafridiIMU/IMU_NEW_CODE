package com.softorea.schoolsen.y_annual;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.softorea.schoolsen.R;
import com.softorea.schoolsen.databasehelper.DatabaseHandler;
import com.softorea.schoolsen.lists.Roster_List;

/**
 * Created by Softorea on 10/2/2017.
 */

public class Y_EnrollmentAgeGirls extends Activity {
    Button back, next;
    TextView tundamit, tkachi, tpaki, ttwo, tthree, tfour, tfive, tsix, tseven, teight, tnine, tten, televen, ttwleve;
    String schoolareaStr,constructionStr,buildindconditionStr,itlabStr,
            commodititesStr,ptcStr,infrastructureStr,guideStr,cleanlinessStr,stipendStr,SanctionedStr,indicatorStr,
            enrollmentageStr,enrollmentgrpStr,disabledStr,securityStr,ftbStr,furnitureStr;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.y_enrollment_byage_girlsmainclass);
        tundamit = (TextView) findViewById(R.id.unadmitted);
        tkachi = (TextView) findViewById(R.id.kachi);
        tpaki = (TextView) findViewById(R.id.pakki);
        ttwo = (TextView) findViewById(R.id.classtwo);
        tthree = (TextView) findViewById(R.id.classthree);
        tfour = (TextView) findViewById(R.id.classfour);
        tfive = (TextView) findViewById(R.id.classfive);
        tsix = (TextView) findViewById(R.id.classsix);
        tseven = (TextView) findViewById(R.id.classseven);
        teight = (TextView) findViewById(R.id.classeight);
        tnine = (TextView) findViewById(R.id.classnine);
        tten = (TextView) findViewById(R.id.classten);
        televen = (TextView) findViewById(R.id.classeelven);
        ttwleve = (TextView) findViewById(R.id.classtwelve);
        back = (Button) findViewById(R.id.ebtn_left);
        next = (Button) findViewById(R.id.ebtn_right);

        SharedPreferences preferences1 = PreferenceManager.getDefaultSharedPreferences(this);
        String primary1 = preferences1.getString("primary", "");
        String middle = preferences1.getString("middle", "");
        String high = preferences1.getString("high", "");
        String highsec = preferences1.getString("highsecondary", "");
        if (primary1.equals("PrimarySelected")) {
            tsix.setVisibility(View.GONE);
            tseven.setVisibility(View.GONE);
            teight.setVisibility(View.GONE);
            tnine.setVisibility(View.GONE);
            tten.setVisibility(View.GONE);
            televen.setVisibility(View.GONE);
            ttwleve.setVisibility(View.GONE);
        }
        if (middle.equals("MiddleSelected")) {
            tnine.setVisibility(View.GONE);
            tten.setVisibility(View.GONE);
            televen.setVisibility(View.GONE);
            ttwleve.setVisibility(View.GONE);
        }
        if (high.equals("HighSelected")) {
            televen.setVisibility(View.GONE);
            ttwleve.setVisibility(View.GONE);
        }

        tundamit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class Unadmitted");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        tkachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class Kachi");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        tpaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class Pakki");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        ttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 2");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        tthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 3");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        tfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 4");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        tfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 5");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        tsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 6");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        tseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 7");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        teight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 8");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        tnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 9");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        tten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 10");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        televen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 11");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        ttwleve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeGirlsMain.class);
                intent.putExtra("className", "Class 12");
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });

        back = (Button) findViewById(R.id.ebtn_left);
        next = (Button) findViewById(R.id.ebtn_right);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(Y_EnrollmentAgeGirls.this);
        final String primary = preferences.getString("primary", "");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(Y_EnrollmentAgeGirls.this);
                final String middle = preferences.getString("middle", "");
                final String high = preferences.getString("high", "");
                final String hsec = preferences.getString("highsecondary", "");

                final String boys = preferences.getString("boys", "");
                final String girls = preferences.getString("girls", "");
                SQLiteOpenHelper database = new DatabaseHandler(Y_EnrollmentAgeGirls.this);
                SQLiteDatabase dbd = database.getReadableDatabase();
                Cursor cursorform = dbd.rawQuery("SELECT * FROM t_screenconfig", null);
                if (cursorform.moveToFirst()) {
                    do {
                        schoolareaStr = cursorform.getString(cursorform.getColumnIndex("Bi_SchoolArea"));
                        constructionStr = cursorform.getString(cursorform.getColumnIndex("Bi_NatureOfConstruction"));
                        buildindconditionStr = cursorform.getString(cursorform.getColumnIndex("Bi_BuildingCondition"));
                        itlabStr = cursorform.getString(cursorform.getColumnIndex("Bi_ITLab"));
                        commodititesStr = cursorform.getString(cursorform.getColumnIndex("Bi_Commodities"));
                        ptcStr = cursorform.getString(cursorform.getColumnIndex("Bi_PTC"));
                        infrastructureStr = cursorform.getString(cursorform.getColumnIndex("Bi_Infrastructure"));
                        guideStr = cursorform.getString(cursorform.getColumnIndex("Bi_Guides"));
                        cleanlinessStr = cursorform.getString(cursorform.getColumnIndex("Bi_Cleanliness"));
                        stipendStr = cursorform.getString(cursorform.getColumnIndex("Bi_Stipend"));
                        disabledStr = cursorform.getString(cursorform.getColumnIndex("An_DisabledStudent"));
                        enrollmentageStr = cursorform.getString(cursorform.getColumnIndex("An_EnrollmentByAge"));
                        enrollmentgrpStr = cursorform.getString(cursorform.getColumnIndex("An_EnrollmentByGroup"));
                        ftbStr = cursorform.getString(cursorform.getColumnIndex("An_FTB"));
                        furnitureStr = cursorform.getString(cursorform.getColumnIndex("An_Furniture"));
                        indicatorStr = cursorform.getString(cursorform.getColumnIndex("An_Indicator"));
                        SanctionedStr = cursorform.getString(cursorform.getColumnIndex("An_SantionedPosts"));
                        securityStr = cursorform.getString(cursorform.getColumnIndex("An_SecurityMeasures"));
                    } while (cursorform.moveToNext());
                }
                cursorform.close();
                dbd.close();

               if (enrollmentgrpStr.equals("True") && (middle.equals("MiddleSelected") || high.equals("HighSelected")
                        || hsec.equals("HighSecondarySelected")))
                {
                    startActivity(new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentByGroupSectionMain.class));
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    finish();
                }
                else if (disabledStr.equals("True"))
                {
                    startActivity(new Intent(Y_EnrollmentAgeGirls.this, Y_SpecialBoysMain.class));
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    finish();
                }
                else if (securityStr.equals("True"))
                {
                    startActivity(new Intent(Y_EnrollmentAgeGirls.this, Y_SecurityMeasures.class));
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    finish();
                }
                else if (ftbStr.equals("True"))
                {
                    startActivity(new Intent(Y_EnrollmentAgeGirls.this, Y_ProvisionFreeBooksMain.class));
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    finish();
                }
                else if (furnitureStr.equals("True"))
                {
                    startActivity(new Intent(Y_EnrollmentAgeGirls.this, Y_Furniture.class));
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    finish();
                }
                else
                {
                    startActivity(new Intent(Y_EnrollmentAgeGirls.this, CompleteForm.class));
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                    finish();
                }

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Y_EnrollmentAgeGirls.this, Y_EnrollmentAgeBoys.class));
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(Y_EnrollmentAgeGirls.this);
        builder1.setMessage("Are you sure to go to roster screen?");
        builder1.setCancelable(false);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(getApplicationContext(), Roster_List.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("EXIT", true);
                        startActivity(intent);
                    }
                });

        builder1.setNegativeButton(
                "Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}
