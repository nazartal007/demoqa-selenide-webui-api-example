package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    BaseMethods baseMethods = new BaseMethods();

    //  селекторы главной страницы
    SelenideElement
            elements = $x("//*[h5= 'Elements']/.."),
            forms = $x("//*[h5= 'Forms']/.."),
            alertsFrameWindows = $x("//*[h5= 'Alerts, Frame & Windows']/.."),
            widgets = $x("//*[h5= 'Widgets']/.."),
            interactions = $x("//*[h5= 'Interactions']/.."),
            bookStoreApplication = $x("//*[h5= 'Book Store Application']/.."),
            joinNow = $(".banner-image"),

    //  селекторы заголовков других страниц для проверки
            headerElements = $x("//div[@class = 'main-header' and text() = 'Elements']"),
            headerForms = $x("//div[@class = 'main-header' and text() = 'Forms']"),
            headerAlertsFrameWindows = $x("//div[@class = 'main-header' and text() = 'Alerts, Frame & Windows']"),
            headerBookStoreApplication = $x("//div[@class = 'main-header' and text() = 'Book Store']"),
            headerInteractions = $x("//div[@class = 'main-header' and text() = 'Interactions']"),
            headerWidgets = $x("//div[@class = 'main-header' and text() = 'Widgets']");

    @Step("Открываем домашнюю страницу")
    public void openHomePage() {
        open("https://demoqa.com/");
    }

    @Step("Проверяем наличие всех элементов на странице")
    public void checkAllPartitionsArePresent() {
        baseMethods.checkElements(elements, forms, alertsFrameWindows, widgets, interactions, bookStoreApplication, joinNow);
    }

    @Step("Кликаем на elements")
    public void clickToElements() {
        elements.click();
    }

    @Step("Кликаем на forms")
    public void clickToForms() {
        forms.click();
    }

    @Step("Кликаем на alertsFrameWindows")
    public void clickToAlertsFrameWindows() {
        alertsFrameWindows.click();
    }

    @Step("Кликаем на widgets")
    public void clickToWidgets() {
        widgets.click();
    }

    @Step("Кликаем на interactions")
    public void clickToInteractions() {
        interactions.click();
    }

    @Step("Кликаем на bookStoreApplication")
    public void clickToBookStoreApplication() {
        bookStoreApplication.click();
    }

    @Step("Кликаем на joinNow")
    public void clickToJoinNow() {
        joinNow.click();
    }

    @Step("Проверяем открытие раздела elements")
    public void checkElementsPageIsOpen() {
        headerElements.should(Condition.visible);
    }

    @Step("Проверяем открытие раздела elements forms")
    public void checkFormsPageIsOpen() {
        headerForms.should(Condition.visible);
    }

    @Step("Проверяем открытие раздела alertsFrameWindows")
    public void checkAlertsFrameWindowsPageIsOpen() {
        headerAlertsFrameWindows.should(Condition.visible);
    }

    @Step("Проверяем открытие раздела widgets")
    public void checkWidgetsPageIsOpen() {
        headerWidgets.should(Condition.visible);
    }

    @Step("Проверяем открытие раздела interactions")
    public void checkInteractionsPageIsOpen() {
        headerInteractions.should(Condition.visible);
    }

    @Step("Проверяем открытие раздела bookStoreApplication")
    public void checkBookStoreApplicationPageIsOpen() {
        headerBookStoreApplication.should(Condition.visible);
    }

    @Step("Проверяем открытие раздела joinNow")
    public void checkJoinNowPageIsOpen() {

    }

/*
    @FindBy(xpath = "//*[h5= 'Elements']/..")
    public static WebElement elements;
    @FindBy(xpath = "//*[h5= 'Forms']/..")
    public static WebElement forms;
    @FindBy(xpath = "//*[h5= 'Alerts, Frame & Windows']/..")
    public static WebElement alertsFrameWindows;
    @FindBy(xpath = "//*[h5= 'Widgets']/..")
    public static WebElement widgets;
    @FindBy(xpath = "//*[h5= 'Interactions']/..")
    public static WebElement interactions;
    @FindBy(xpath = "//*[h5= 'Book Store Application']/..")
    public static WebElement bookStoreApplication;
    @FindBy(className = "banner-image")
    public static WebElement joinNow;
    //  селекторы заголовков других страниц для проверки
    @FindBy(xpath = "//div[@class = 'main-header' and text() = 'Alerts, Frame & Windows']")
    public static WebElement headerAlertsFrameWindows;
    @FindBy(xpath = "//div[@class = 'main-header' and text() = 'Book Store']")
    public static WebElement headerBookStoreApplication;
    @FindBy(xpath = "//div[@class = 'main-header' and text() = 'Elements']")
    public static WebElement headerElements;
    @FindBy(xpath = "//div[@class = 'main-header' and text() = 'Forms']")
    public static WebElement headerForms;
    @FindBy(xpath = "//div[@class = 'main-header' and text() = 'Interactions']")
    public static WebElement headerInteractions;
    @FindBy(xpath = "//div[@class = 'main-header' and text() = 'Widgets']")
    public static WebElement headerWidgets;*/
}
