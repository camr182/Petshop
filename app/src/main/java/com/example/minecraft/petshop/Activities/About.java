package com.example.minecraft.petshop.Activities;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.minecraft.petshop.Mail.Mail;
import com.example.minecraft.petshop.R;
import com.example.minecraft.petshop.Mail.SendEmailAsyncTask;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setFormularioContacto();

       // ActionBar actionBar = getActionBar();
//Escondiendo la Action Bar
        //actionBar.hide();

//Mostrando de nuevo la Action Bar
        //actionBar.show();


    }


    public void setFormularioContacto() {
        Button EnviarComentario = (Button) findViewById(R.id.btnEnviarCorreo);
        EnviarComentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });
    }

    public void displayMessage(String message) {
        Snackbar.make(findViewById(R.id.activity_contacto), message, Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }

    //ENVIAR CORREO
    private void sendMessage() {
        String[] recipients = {"larileando@gmail.com"};//para
        SendEmailAsyncTask email = new SendEmailAsyncTask();
        email.activity = this;
        email.m = new Mail("camr182@gmail.com","2008026337");//cuenta y contraseña que manda correo
        email.m.set_from("camr182@gmail.com");
        email.m.setBody(((EditText) findViewById(R.id.inMensaje)).getText().toString());
        email.m.set_to(recipients);
        email.m.set_subject(((EditText) findViewById(R.id.inAsunto)).getText().toString());
        email.execute();
    }

}
