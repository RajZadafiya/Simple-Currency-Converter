package com.example.a1912_6073_raj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.a1912_6073_raj.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Raj Currency Converter INR,$,€.");

        binding.convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (binding.inr.isChecked()){
                    if (binding.toinr.isChecked()){
                        binding.result.setText(binding.amount.getText().toString()+" INR.");
                    }

                    if (binding.todollar.isChecked()){

                        Float amount = Float.valueOf(binding.amount.getText().toString());
                        result = amount*0.013;
                        Toast.makeText(MainActivity.this, "Converted Amount : "+result, Toast.LENGTH_SHORT).show();
                        binding.result.setText(result+" $.");
                    }

                    if (binding.toeuro.isChecked()){

                        String amount = binding.amount.getText().toString();
                        result = Float.valueOf(amount)*0.012;
                        Toast.makeText(MainActivity.this, "Converted Amount : "+result, Toast.LENGTH_SHORT).show();
                        binding.result.setText(result+" €.");
                    }
                }

                if (binding.dollar.isChecked()){
                    if (binding.toinr.isChecked()){

                        String amount = binding.amount.getText().toString();
                        result = Float.valueOf(amount)*75.8053;
                        Toast.makeText(MainActivity.this, "Converted Amount : "+result, Toast.LENGTH_SHORT).show();
                        binding.result.setText(result+" INR.");

                    }

                    if (binding.todollar.isChecked()){

                        binding.result.setText(binding.amount.getText().toString() + " $.");
                    }

                    if (binding.toeuro.isChecked()){

                        String amount = binding.amount.getText().toString();
                        result = Float.valueOf(amount)*0.92;
                        Toast.makeText(MainActivity.this, "Converted Amount : "+result, Toast.LENGTH_SHORT).show();
                        binding.result.setText(result+" €.");
                    }
                }

                if (binding.euro.isChecked()){
                    if (binding.toinr.isChecked()){

                        String amount = binding.amount.getText().toString();
                        result = Float.valueOf(amount)*82.68;
                        Toast.makeText(MainActivity.this, "Converted Amount : "+result, Toast.LENGTH_SHORT).show();
                        binding.result.setText(result+" INR.");
                    }

                    if (binding.todollar.isChecked()){

                        String amount = binding.amount.getText().toString();
                        result = Float.valueOf(amount)*1.09;

                        binding.result.setText(result+" $.");
                    }

                    if (binding.toeuro.isChecked()){

                        binding.result.setText(binding.amount.getText().toString() + " €.");

                    }
                }

                Toast.makeText(MainActivity.this, "Converted Amount : "+result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}