package com.anncode.micalculadora.presenter;

import android.util.Log;

import com.anncode.micalculadora.interactor.MainActivityInteractor;
import com.anncode.micalculadora.interactor.MainActivityInteractorImpl;
import com.anncode.micalculadora.view.MainActivityView;

/**
 * Created by anahisalgado on 24/05/17.
 */

public class MainActivityPresenterImpl implements MainActivtyPresenter {

    private MainActivityView activityView;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(MainActivityView activityView) {
        this.activityView = activityView;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void sumar(String number1, String number2) {
        interactor.sumar(number1, number2);
    }

    @Override
    public void showError(String error) {
        activityView.showError(error);
    }

    @Override
    public void showResult(String resultado) {
        activityView.showResult(resultado);
    }
}
