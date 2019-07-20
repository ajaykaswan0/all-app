package com.shashi.whatsapplogin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.hbb20.CountryCodePicker;

import java.util.concurrent.TimeUnit;

public class Login extends AppCompatActivity {
    Button send;
    CountryCodePicker ccp;
    FirebaseAuth firebaseAuth;
     EditText ed1;
    EditText codeText;
    String verification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        send=findViewById(R.id.sendButton);
        codeText =findViewById(R.id.codeText);
        ed1=findViewById(R.id.phoneText);
        firebaseAuth=FirebaseAuth.getInstance();

        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(ed1);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=ed1.getText().toString().trim();
                if(s.isEmpty() || s.length()<10){
                    ed1.setError("valid number is required");
                    ed1.requestFocus();
                    return;
                }

                final  String a = ccp.getFullNumberWithPlus();
                phoneauth(a);



            }
        });

    }
    public void phoneauth(String a){
        PhoneAuthProvider.getInstance().verifyPhoneNumber(a,60, TimeUnit.SECONDS, TaskExecutors.MAIN_THREAD,mcallback);
    };


    private PhoneAuthProvider.OnVerificationStateChangedCallbacks
            mcallback=new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        @Override
        public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            verification=s;
        }
        @Override
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {

            String code=phoneAuthCredential.getSmsCode();
            if(code!=null){
                codeText.setText(code);
                verifycode(code);
            }

        }

        @Override
        public void onVerificationFailed(FirebaseException e) {
            Toast.makeText(Login.this,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    };

     private  void  verifycode(String code){

       PhoneAuthCredential phoneAuthCredential=PhoneAuthProvider.getCredential(verification,code);
     }

    private  void signinwithcrendential(PhoneAuthCredential credential) {
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Login.this, "Sucessfull", Toast.LENGTH_LONG).show();
                            Intent i=new Intent(Login.this,Mainpage.class);
                            startActivity(i);
                        } else {
                            Toast.makeText(Login.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }
}
