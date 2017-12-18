package com.anncode.micalculadora.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.anncode.micalculadora.R;
import com.anncode.micalculadora.presenter.MainActivityPresenterImpl;
import com.anncode.micalculadora.presenter.MainActivtyPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private EditText edtNumber1;
    private EditText edtNumber2;
    private TextView tvResult;

    private MainActivtyPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber1 = (EditText) findViewById(R.id.edtNumber1);
        edtNumber2 = (EditText) findViewById(R.id.edtNumber2);
        tvResult   = (TextView) findViewById(R.id.tvResult);


        presenter = new MainActivityPresenterImpl(this);

    }

    public void suma(View view){
        String number1 = edtNumber1.getText().toString();
        String number2 = edtNumber2.getText().toString();
        presenter.sumar(number1, number2);
    }

    @Override
    public void showResult(String result) {
        tvResult.setText(result);
    }

    @Override
    public void showError(String error) {
        tvResult.setText(error);
    }
}
