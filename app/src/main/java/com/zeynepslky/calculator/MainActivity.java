package com.zeynepslky.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button sil,ac,kapa,fullsil,nokta,hesapla;
    Button toplama,cikarma,carpma,bolme;
    Button sifir,bir,iki,uc,dort,bes;
    Button alti,yedi,sekiz,dokuz;
    TextView girdi,sonuc;

    boolean arti,eksi,carpi,bolu;
    float deger1,deger2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sil = (Button) findViewById(R.id.sil);
        ac = (Button) findViewById(R.id.ac);
        kapa = (Button) findViewById(R.id.kapa);
        fullsil = (Button) findViewById(R.id.fullsil);
        nokta = (Button) findViewById(R.id.nokta);
        toplama = (Button) findViewById(R.id.toplama);
        cikarma = (Button) findViewById(R.id.cikarma);
        carpma = (Button) findViewById(R.id.carpma);
        bolme = (Button) findViewById(R.id.bolme);
        hesapla = (Button) findViewById(R.id.hesapla);
        sifir = (Button) findViewById(R.id.sifir);
        bir = (Button) findViewById(R.id.bir);
        iki = (Button) findViewById(R.id.iki);
        uc = (Button) findViewById(R.id.uc);
        dort = (Button) findViewById(R.id.dort);
        bes = (Button) findViewById(R.id.bes);
        alti = (Button) findViewById(R.id.alti);
        yedi = (Button) findViewById(R.id.yedi);
        sekiz = (Button) findViewById(R.id.sekiz);
        dokuz = (Button) findViewById(R.id.dokuz);
        girdi = (TextView) findViewById(R.id.girdi);
        sonuc = (TextView) findViewById(R.id.sonuc);

        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"1");
                girdi.setText(sonuc.getText());
            }
        });

        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"2");
                girdi.setText(sonuc.getText());
            }
        });

        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"3");
                girdi.setText(sonuc.getText());
            }
        });

        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"4");
                girdi.setText(sonuc.getText());
            }
        });

        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"5");
                girdi.setText(sonuc.getText());
            }
        });

        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"6");
                girdi.setText(sonuc.getText());
            }
        });

        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"7");
                girdi.setText(sonuc.getText());
            }
        });

        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"8");
                girdi.setText(sonuc.getText());
            }
        });

        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"9");
                girdi.setText(sonuc.getText());
            }
        });

        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"0");
                girdi.setText(sonuc.getText());
            }
        });

        nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+".");
                girdi.setText(sonuc.getText());
            }
        });

        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonuc.getText().toString().length() > 1)
                {
                    sonuc.setText(sonuc.getText().toString().substring(0,sonuc.getText().toString().length()-1));
                    girdi.setText(sonuc.getText());
                }
                else
                {
                    sonuc.setText("0");
                    girdi.setText(sonuc.getText());
                }

            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"(");
                girdi.setText(sonuc.getText());
            }
        });

        kapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+")");
                girdi.setText(sonuc.getText());
            }
        });

        fullsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonuc.setText("");

            }
        });

        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc == null)
                    sonuc.setText("");
                else {
                    deger1 = Float.parseFloat(sonuc.getText()+"");
                    arti = true;
                    sonuc.setText(null);
                }
            }
        });

        cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc == null)
                    sonuc.setText("");
                else {
                    deger1 = Float.parseFloat(sonuc.getText()+"");
                    eksi = true;
                    sonuc.setText(null);
                }
            }
        });

        carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc == null)
                    sonuc.setText("");
                else {
                    deger1 = Float.parseFloat(sonuc.getText()+"");
                    carpi = true;
                    sonuc.setText(null);
                }
            }
        });

        bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc == null)
                    sonuc.setText("");
                else {
                    deger1 = Float.parseFloat(sonuc.getText()+"");
                    bolu = true;
                    sonuc.setText(null);
                }
            }
        });

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger2 = Float.parseFloat(sonuc.getText()+"");
                if (arti == true)
                {
                    sonuc.setText(deger1+deger2+"");
                    girdi.setText(deger1+"+"+deger2);
                    arti = false;
                }
                if (eksi == true)
                {
                    sonuc.setText(deger1-deger2+"");
                    girdi.setText(deger1+"-"+deger2);
                    eksi = false;
                }
                if (carpi == true)
                {
                    sonuc.setText(deger1*deger2+"");
                    girdi.setText(deger1+"x"+deger2);
                    carpi = false;
                }
                if (bolu == true)
                {
                    sonuc.setText(deger1/deger2+"");
                    girdi.setText(deger1+"/"+deger2);
                    bolu = false;
                }
            }
        });

    }
}