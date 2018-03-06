package com.example.toshimishra.photolearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class ParticipantSession extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participant_session);
        EditText text = (EditText)findViewById(R.id.editText);
        text.setText(FirebaseAuth.getInstance().getCurrentUser().getDisplayName(), TextView.BufferType.NORMAL);

    }
}
