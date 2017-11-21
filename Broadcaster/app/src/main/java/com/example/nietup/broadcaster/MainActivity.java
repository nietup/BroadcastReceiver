package com.example.nietup.broadcaster;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMessage = (EditText) findViewById(R.id.am_et_message);
    }

    /**
     * Broadcasts notification message so that receiver app can create notification out of it.
     */
    public void broadcast(View v) {
        String msg = etMessage.getText().toString();

        Intent intent = new Intent();
        intent.setAction("com.example.nietup.broadcaster.VERY_IMPORTANT_MESSAGE");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        sendBroadcast(intent);

        Toast.makeText(this, "Message broadcasted", Toast.LENGTH_SHORT).show();
    }
}
