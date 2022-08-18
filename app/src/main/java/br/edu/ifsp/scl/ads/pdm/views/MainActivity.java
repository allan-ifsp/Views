package br.edu.ifsp.scl.ads.pdm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifsp.scl.ads.pdm.views.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;
    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(amb.getRoot());

        amb.limparBt.setOnClickListener( (View view) -> {
            amb.nomeEt.setText("");
            amb.sobrenomeEt.setText("");
            amb.emailEt.setText("");
            amb.estadoCivilSp.setSelection(0);
            amb.femininoRb.setChecked(true);
        });

        amb.salvarBt.setOnClickListener( view-> {
            pessoa = new Pessoa(
                    amb.nomeEt.getText().toString(),
                    amb.sobrenomeEt.getText().toString(),
                    amb.emailEt.getText().toString(),
                    ((TextView) amb.estadoCivilSp.getSelectedView()).getText(),
            );
        });

    }

    public void onClickSBotao(View botao){
        if (botao.getId() == R.id.salvarBt){
            Toast.makeText(this, "clicou no slavar", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "clicou no limpar", Toast.LENGTH_SHORT).show();
        }
    }
}