package com.anncode.micalculadora.presenter;

/**
 * Created by anahisalgado on 24/05/17.
 */

public interface MainActivtyPresenter {

    void sumar(String number1, String number2); //interactor
    void showError(String error); //View
    void showResult(String resultado); //View
}
