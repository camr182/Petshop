package com.example.minecraft.petshop.Activities;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import com.example.minecraft.petshop.Mail.Mail;
import com.example.minecraft.petshop.Mail.SendEmailAsyncTask;
import com.example.minecraft.petshop.R;

public class Contacto extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        setFormularioContacto();

    }

    public void setFormularioContacto() {

        Button EnviarComentario = (Button) findViewById(R.id.btnEnviarCorreo);
        EnviarComentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextInputEditText mensaje = (TextInputEditText) findViewById(R.id.inMensaje);
                TextInputEditText asunto = (TextInputEditText) findViewById(R.id.inAsunto);
                TextInputEditText correo = (TextInputEditText) findViewById(R.id.inCorreo);
                TextInputLayout tilCorreo = (TextInputLayout) findViewById(R.id.tilCorreo);
                TextInputLayout tilAsunto = (TextInputLayout) findViewById(R.id.tilAsunto);
                TextInputLayout tilMensaje = (TextInputLayout) findViewById(R.id.tilMensaje);

                String mailError = null;
                if (TextUtils.isEmpty(correo.getText())) {
                    mailError = getString(R.string.mensaje_error_correo);
                }
                toggleTextInputLayoutError(tilCorreo, mailError);

                String asuntoError = null;
                if (TextUtils.isEmpty(asunto.getText())) {
                    asuntoError = getString(R.string.mensaje_error_asunto);
                }
                toggleTextInputLayoutError(tilAsunto, asuntoError);

                String mensajeError = null;
                if (TextUtils.isEmpty(asunto.getText())) {
                    mensajeError = getString(R.string.mensaje_error_mensaje);
                }
                toggleTextInputLayoutError(tilMensaje, mensajeError);

                correo.clearFocus();


                //clearFocus();

                sendMessage();
            }
        });
    }



    public void displayMessage(String message) {
        Snackbar.make(findViewById(R.id.activity_contacto), message, Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }


    //ENVIAR CORREO
    private void sendMessage() {
        TextInputEditText mensaje = (TextInputEditText) findViewById(R.id.inMensaje);
        TextInputEditText asunto = (TextInputEditText) findViewById(R.id.inAsunto);

        String[] recipients = {"larileando@gmail.com"};//para
        SendEmailAsyncTask email = new SendEmailAsyncTask();
        email.activity = this;
        email.m = new Mail("camr182@gmail.com","2008026337");//cuenta y contraseña que manda correo
        email.m.set_from("adminastrador@gmail.com");
        email.m.setBody((mensaje).getText().toString());
        email.m.set_to(recipients);
        email.m.set_subject((asunto).getText().toString());
        email.execute();
    }


    private static void toggleTextInputLayoutError(TextInputLayout textInputLayout,
                                                   String msg) {
        textInputLayout.setError(msg);
        if (msg == null) {
            textInputLayout.setErrorEnabled(false);
        } else {
            textInputLayout.setErrorEnabled(true);
        }
    }
}
