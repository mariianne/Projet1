package com.example.mybts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class page_4 extends AppCompatActivity implements View.OnClickListener {


    //déclaration des buttons
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btP,btM,btF,btD,btE,btV, btAC, btPo, btPM;
    TextView txtMontant;
    private double chiffre1;
    private boolean clicOperateur = false;
    private boolean update = false;
    //private String operateur = "";
    private double chiffre2;
    private String operation;
    private double result;
    private String answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_4);


        bt0 = (Button) findViewById(R.id.id0);
        bt1 = (Button) findViewById(R.id.idUn);
        bt2 = (Button) findViewById(R.id.idDeux);
        bt3 = (Button) findViewById(R.id.idTrois);
        bt4 = (Button) findViewById(R.id.idQuatre);
        bt5 = (Button) findViewById(R.id.idCinq);

        bt6 = (Button) findViewById(R.id.idSix);
        bt7 = (Button) findViewById(R.id.idSept);
        bt8 = (Button) findViewById(R.id.idHuit);
        bt9 = (Button) findViewById(R.id.idNeuf);
        btP = (Button) findViewById(R.id.idP);
        btM = (Button) findViewById(R.id.idM);
        btF = (Button) findViewById(R.id.idF);
        btD = (Button) findViewById(R.id.idD);
        btE = (Button) findViewById(R.id.idE);
        btV = (Button) findViewById(R.id.idV);
        btPo = (Button) findViewById(R.id.idPo);
        btAC = (Button) findViewById(R.id.idAC);
        btPM = (Button) findViewById(R.id.idPM);

        txtMontant = (TextView) findViewById(R.id.idTxtMontant);


        //rendre les boutons clicables
        this.bt1.setOnClickListener(this);
        this.bt2.setOnClickListener(this);
        this.bt3.setOnClickListener(this);
        this.bt4.setOnClickListener(this);
        this.bt5.setOnClickListener(this);
        this.bt6.setOnClickListener(this);
        this.bt7.setOnClickListener(this);
        this.bt8.setOnClickListener(this);
        this.bt9.setOnClickListener(this);
        this.bt0.setOnClickListener(this);
        this.btV.setOnClickListener(this);

        this.btE.setOnClickListener(this);
        this.btP.setOnClickListener(this);
        this.btM.setOnClickListener(this);
        this.btF.setOnClickListener(this);
        this.btD.setOnClickListener(this);

        this.btPM.setOnClickListener(this);

        this.btAC.setOnClickListener(this);
        this.btPo.setOnClickListener(this);


    }

    public void chiffreClick(String str) {
        if(update){
            update = false;
        }else{
            if(!txtMontant.getText().equals("0"))
                str = txtMontant.getText() + str;
        }
        txtMontant.setText(str);



    }





    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.idAC:
                this.txtMontant.setText("");
                break;

            case R.id.idPo:
                float mt = 0;

                try {
                    mt = Float.parseFloat(this.txtMontant.getText().toString());
                    mt = (float) (mt / 100);
                    this.txtMontant.setText(mt + "");
                } catch (NumberFormatException exp) {
                    Toast.makeText(this, "Erreur de saisie", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.idUn:
                String mtt1;
                mtt1 = this.txtMontant.getText().toString()+this.bt1.getText();
                this.txtMontant.setText(mtt1);
                break;

            case R.id.idDeux:
                String mtt2;
                mtt2 = this.txtMontant.getText().toString()+this.bt2.getText();
                this.txtMontant.setText(mtt2);
                break;

            case R.id.idTrois:
                String mtt3;
                mtt3 = this.txtMontant.getText().toString()+this.bt3.getText();
                this.txtMontant.setText(mtt3);
                break;

            case R.id.idQuatre:
                String mtt4;
                mtt4 = this.txtMontant.getText().toString()+this.bt4.getText();
                this.txtMontant.setText(mtt4);
                break;

            case R.id.idCinq:
                String mtt5;
                mtt5 = this.txtMontant.getText().toString()+this.bt5.getText();
                this.txtMontant.setText(mtt5);
                break;
            case R.id.idSix:
                String mtt6;
                mtt6 = this.txtMontant.getText().toString()+this.bt6.getText();
                this.txtMontant.setText(mtt6);
                break;
            case R.id.idSept:
                String mtt7;
                mtt7 = this.txtMontant.getText().toString()+this.bt7.getText();
                this.txtMontant.setText(mtt7);
                break;
            case R.id.idHuit:
                String mtt8;
                mtt8 = this.txtMontant.getText().toString()+this.bt8.getText();
                this.txtMontant.setText(mtt8);
                break;
            case R.id.idNeuf:
                String mtt9;
                mtt9 = this.txtMontant.getText().toString()+this.bt9.getText();
                this.txtMontant.setText(mtt9);
                break;
            case R.id.id0:
                String mtt0;
                mtt0 = this.txtMontant.getText().toString()+this.bt0.getText();
                this.txtMontant.setText(mtt0);
                break;

            case R.id.idV:
                String mttP = ".";
                try {
                    if (!this.txtMontant.getText().toString().contains(mttP) ){
                        mttP = this.txtMontant.getText().toString()+this.btV.getText();
                        this.txtMontant.setText(mttP);
                    }
                }catch(NumberFormatException exp){
                    Toast.makeText(this, "Veuillez saisir un chiffre !", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.idE:
                try{
                    String answer;
                    chiffre2 = Double.parseDouble(this.txtMontant.getText().toString());
                    if (operation == "+")
                    {
                        result = chiffre1 + chiffre2;
                        answer = String.format("%.2f", result);
                        this.txtMontant.setText(answer);
                    }else if (operation == "-")
                    {
                        result = chiffre1 - chiffre2;
                        answer = String.format("%.2f", result);
                        this.txtMontant.setText(answer);
                    }else if (operation == "*")
                    {
                        result = chiffre1 * chiffre2;
                        answer = String.format("%.2f", result);
                        this.txtMontant.setText(answer);
                    }else if (operation == "/") {
                        result = chiffre1 / chiffre2;
                        answer = String.format("%.2f", result);
                        this.txtMontant.setText(answer);
                    }

                }catch(NumberFormatException exp){
                    Toast.makeText(this, "Veuillez saisir un chiffre !", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.idP:
                try{
                    chiffre1 = Double.parseDouble(this.txtMontant.getText().toString());
                    this.txtMontant.setText("");
                    operation = "+";
                }catch (NumberFormatException exp){
                    Toast.makeText(this, "Veuillez saisir un chiffre !", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.idM:
                try{
                    chiffre1 = Double.parseDouble(this.txtMontant.getText().toString());
                    this.txtMontant.setText("");
                    operation = "-";
                }catch (NumberFormatException exp){
                    Toast.makeText(this, "Veuillez saisir un chiffre !", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.idD:
                try{
                    chiffre1 = Double.parseDouble(this.txtMontant.getText().toString());
                    this.txtMontant.setText("");
                    operation = "/";
                }catch (NumberFormatException exp){
                    Toast.makeText(this, "Veuillez saisir un chiffre !", Toast.LENGTH_LONG).show();
                }
                break;


            case R.id.idF:
                try{
                    chiffre1 = Double.parseDouble(this.txtMontant.getText().toString());
                    this.txtMontant.setText("");
                    operation = "*";
                }catch (NumberFormatException exp){
                    Toast.makeText(this, "Veuillez saisir un chiffre !", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.idPM:
                try{
                    Double pm;

                        chiffre1 = Double.parseDouble(this.txtMontant.getText().toString());
                        pm  = - chiffre1;
                        this.txtMontant.setText(String.valueOf(pm));
                    

                }catch(NumberFormatException exp){
                    Toast.makeText(this, "Veuillez saisir un chiffre !", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
