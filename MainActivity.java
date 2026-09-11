package com.code.edit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Switch highQualitySwitch;
    private Switch effectsSwitch;
    private Switch developerSwitch;
    private Button applyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        highQualitySwitch = findViewById(R.id.highQualitySwitch);
        effectsSwitch = findViewById(R.id.effectsSwitch);
        developerSwitch = findViewById(R.id.developerSwitch);
        applyButton = findViewById(R.id.applyButton);

        applyButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Toast.makeText(
                        MainActivity.this,
                        "Settings applied",
                        Toast.LENGTH_SHORT
					).show();
				}
			});
    }
}

