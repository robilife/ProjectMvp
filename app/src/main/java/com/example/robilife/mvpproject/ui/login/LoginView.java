package com.example.robilife.mvpproject.ui.login;

import com.example.robilife.mvpproject.data.api.model.QuoteOfTheDayResponse;
import com.example.robilife.mvpproject.ui.base.BaseView;

/**
 * Created by khalifa on 1/16/18.
 */

public interface LoginView extends BaseView {

    void openMainActivity();

    void setQuote(QuoteOfTheDayResponse quoteOfTheDayResponse);
}
