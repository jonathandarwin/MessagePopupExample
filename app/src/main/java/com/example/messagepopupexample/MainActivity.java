package com.example.messagepopupexample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.messagepopupexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setListener();
    }

    @Override
    public void onClick(View v) {
        if(v.equals(binding.btnTextMessage)){
            // TEXT MESSAGE
            binding.txtMessage.setText("This is text message.");
        }
        else if (v.equals(binding.btnToastMessage)){
            // TOAST MESSAGE
            Toast.makeText(this, "This is toast message", Toast.LENGTH_SHORT).show();
        }
        else if (v.equals(binding.btnDialogMessage)){
            // DIALOG MESSAGE
            AlertDialog dialog = new AlertDialog.Builder(this).create();
            dialog.setTitle("Title");
            dialog.setMessage("This is simple dialog");
            dialog.show();
        }
        else if (v.equals(binding.btnActivityDialogMessage)){
            // ACTIVITY DIALOG MESSAGE
            Intent intent = new Intent(this, DialogActivity.class);
            startActivity(intent);
        }
        else if (v.equals(binding.btnSnackbarMessage)){
            // SNACKBAR MESSAGE
            Snackbar snackbar = Snackbar.make(binding.llContainer, "This is snackbar message", Snackbar.LENGTH_SHORT);
            snackbar.show();
        }
        else if (v.equals(binding.btnActionSnackbarMessage)){
            // ACTION SNACKBAR MESSAGE
            Snackbar snackbar = Snackbar.make(binding.llContainer, "Action snackbar", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Ok", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Snackbar snackbar = Snackbar.make(binding.llContainer, "Okay!", Snackbar.LENGTH_SHORT);
                            snackbar.show();
                        }
                    });
            snackbar.show();
        }
    }

    private void setListener(){
        binding.btnTextMessage.setOnClickListener(this);
        binding.btnToastMessage.setOnClickListener(this);
        binding.btnDialogMessage.setOnClickListener(this);
        binding.btnActivityDialogMessage.setOnClickListener(this);
        binding.btnSnackbarMessage.setOnClickListener(this);
        binding.btnActionSnackbarMessage.setOnClickListener(this);
    }
}
