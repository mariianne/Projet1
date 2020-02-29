package com.example.mybts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page_2 extends AppCompatActivity implements View.OnClickListener
{


    private Button btTaux, btAC, btEuros, btDevise;
    private EditText txtMontant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);

        //correspondance entre les objets graphiques et objets de programmation

        this.btAC=(Button)findViewById(R.id.idAC);
        this.btDevise=(Button) findViewById(R.id.idDevise);
        this.btTaux=(Button) findViewById(R.id.idTaux);
        this.btEuros=(Button) findViewById(R.id.idEuros);
        this.txtMontant=(EditText) findViewById(R.id.idTxtMontant);


        //rendre les boutons clicables
        this.btEuros.setOnClickListener(this);
        this.btDevise.setOnClickListener(this);
        this.btTaux.setOnClickListener(this);
        this.btAC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.idAC :
                this.txtMontant.setText("");
                break;
            case R.id.idEuros :
            {
                float mt =0;
                try {
                    mt = Float.parseFloat(this.txtMontant.getText().toString());
                    mt = mt/(float)6.56;
                    this.txtMontant.setText(mt + "");
                }catch (NumberFormatException exp)
                {
                    Toast.makeText(this, "Erreur de saisie", Toast.LENGTH_LONG).show();
                }
            }
            break;
            case R.id.idDevise :
            {
                float mt =0;
                try {
                    mt = Float.parseFloat(this.txtMontant.getText().toString());
                    mt = mt*(float)6.56;
                    this.txtMontant.setText(mt + "");
                }catch (NumberFormatException exp)
                {
                    Toast.makeText(this, "Erreur de saisie", Toast.LENGTH_LONG).show();
                }
            }
            break;
            case R.id.idTaux :
                Toast.makeText(this, "Le taux de change est de 6.56", Toast.LENGTH_LONG).show();

                break;
        }
    }
}