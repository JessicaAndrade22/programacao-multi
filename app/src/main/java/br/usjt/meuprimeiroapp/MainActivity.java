package br.usjt.meuprimeiroapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

/**
 * nome: Jessica de Andrade Oliveira
 * RA: 201515225
 */

public class MainActivity extends Activity  {

    private EditText editText;

    //constante static para identificar a mensagem
    public final static String MENSAGEM =
            "br.usjt.meuprimeiroapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(MENSAGEM, message);
        startActivity(intent);
    }
}
