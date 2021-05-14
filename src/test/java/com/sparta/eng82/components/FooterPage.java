package com.sparta.eng82.components;

import com.sparta.eng82.components.pages.*;
import com.sparta.eng82.interfaces.Page;

public enum FooterPage {

    WOMEN("Women", WomenPageImpl.class),
    SPECIALS("Specials", SpecialsPageImpl.class),
    NEW_PRODUCTS("New products", NewProductsPageImpl.class),
    BEST_SELLERS("Best sellers", BestSellersPageImpl.class),
    OUR_STORES("Our stores", OurStoresPageImpl.class),
    CONTACT_US("Contact us", ContactUsPageImpl.class),
    TOS("Terms and conditions of use", TosPageImpl.class),
    ABOUT_US("About us", AboutUsPageImpl.class),
    SITEMAP("Sitemap", SitemapPageImpl.class);


    private String linkText;
    private final Class<? extends Page> pageClass;


    FooterPage(String linkText, Class<? extends Page> pageClass) {
        this.linkText = linkText;
        this.pageClass = pageClass;
    }

    public String getLinkText() {
        return linkText;
    }

    public Class<? extends Page> getPageClass(){return pageClass;}
}
