package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTests {
    HomePage homePage = new HomePage();

    @Test()
    @DisplayName("Проверка, что все элементы для перехода на другие страницы присутвуют")
    public void checkAllElement() {
        homePage.openHomePage();
        homePage.checkAllPartitionsArePresent();
    }

    @Test()
    @DisplayName("Проверка, что кликнув по elements можно пройти в соответвующий раздел.")
    public void goToElements() {
        homePage.openHomePage();
        homePage.clickToElements();
        homePage.checkElementsPageIsOpen();
    }

    @Test()
    @DisplayName("Проверка, что кликнув по forms можно пройти в соответвующий раздел.")
    public void goToForms() {
        homePage.openHomePage();
        homePage.clickToForms();
        homePage.checkFormsPageIsOpen();
    }

    @Test()
    @DisplayName("Проверка, что кликнув по Alerts, Frame & Windows можно пройти в соответвующий раздел.")
    public void goToAlertsFrameWindows() {
        homePage.openHomePage();
        homePage.clickToAlertsFrameWindows();
        homePage.checkAlertsFrameWindowsPageIsOpen();
    }

    @Test()
    @DisplayName("Проверка, что кликнув по Widgets можно пройти в соответвующий раздел.")
    public void goToWidgets() {
        homePage.openHomePage();
        homePage.clickToWidgets();
        homePage.checkWidgetsPageIsOpen();
    }

    @Test()
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка, что кликнув по Interactions можно пройти в соответвующий раздел.")
    public void goToInteractions() {
        homePage.openHomePage();
        homePage.clickToInteractions();
        homePage.checkInteractionsPageIsOpen();
    }

    @Test()
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка, что кликнув по Book Store Application можно пройти в соответвующий раздел.")
    public void goToBookStoreApplication() {
        homePage.openHomePage();
        homePage.clickToBookStoreApplication();
        homePage.checkBookStoreApplicationPageIsOpen();
    }

}