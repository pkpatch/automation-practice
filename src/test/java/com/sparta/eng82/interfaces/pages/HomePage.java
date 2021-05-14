package com.sparta.eng82.interfaces.pages;

public interface HomePage {

    HomePage addItemToCart();

    SummaryPage goToCheckout();

    void typeInSearchBar(String searchTerm);

}