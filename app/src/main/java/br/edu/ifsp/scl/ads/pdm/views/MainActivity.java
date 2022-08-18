package br.edu.ifsp.scl.ads.pdm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.edu.ifsp.scl.ads.pdm.views.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(amb.getRoot());
    }

    public void onClickSalvar(View botao){
        Toast.makeText(this, "clicou no slavar", Toast.LENGTH_LONG).show();
    }
}