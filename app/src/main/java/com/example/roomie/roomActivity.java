package com.example.roomie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.parse.ParseUser;
import com.parse.LogInCallback;
import com.parse.ParseException;


public class roomActivity extends AppCompatActivity {

    public static final String TAG = "RoomActivity";
    private EditText tvRoomJoin;
    private Button btnJoinRoom;
    private Button btnCreateRoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        tvRoomJoin = findViewById(R.id.tvRoomJoin);
        btnJoinRoom = findViewById(R.id.btnJoinRoom);
        btnCreateRoom = findViewById(R.id.btnCreateRoom);

        btnJoinRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick join room button");
                String roomCode = tvRoomJoin.getText().toString();
                ParseUser user = ParseUser.getCurrentUser();
                joinRoom(roomCode,user);
            }
        });
    }

    private void joinRoom(String roomCode, ParseUser user){

    }
}