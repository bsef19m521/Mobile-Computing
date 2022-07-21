package com.example.gridandcardviewlayoutapplication;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView txtInfo = (TextView)findViewById(R.id.txtInfo);
        if(getIntent() != null)
        {
            String info = getIntent().getStringExtra("info");
            txtInfo.setText(info);
        }
    }
}

