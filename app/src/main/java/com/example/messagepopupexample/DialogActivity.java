package com.example.messagepopupexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.messagepopupexample.databinding.ActivityDialogBinding;

public class DialogActivity extends Activity {

    ActivityDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dialog);
    }
}
