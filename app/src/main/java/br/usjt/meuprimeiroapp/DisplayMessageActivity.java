package br.usjt.meuprimeiroapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * nome: Jessica de Andrade Oliveira
 * RA: 201515225
 */

public class DisplayMessageActivity extends Activity  {

    @Override
    //metodo para dar display da mensagem
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message =
                intent.getStringExtra(MainActivity.MENSAGEM);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        ViewGroup layout = (ViewGroup)
                findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
