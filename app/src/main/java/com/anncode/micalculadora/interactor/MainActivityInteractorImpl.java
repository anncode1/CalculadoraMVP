package com.anncode.micalculadora.interactor;

import android.util.Log;

import com.anncode.micalculadora.presenter.MainActivtyPresenter;

/**
 * Created by anahisalgado on 24/05/17.
 */

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivtyPresenter presenter;

    public MainActivityInteractorImpl(MainActivtyPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String number1, String number2) {
        Double resultado = Double.valueOf(number1) + Double.valueOf(number2);
        presenter.showResult(String.valueOf(resultado));
        //presenter.showError(e);
    }
}
