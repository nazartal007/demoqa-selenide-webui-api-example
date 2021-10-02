package com.demoqa.uiTests;

import com.demoqa.pages.ElementsPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import static com.demoqa.helpers.Constants.*;

public class ElementsTests extends TestBase {
    ElementsPage elementsPage = new ElementsPage();

    @Test()
    @Description("Заполнение раздела Text Box")
    public void textBoxFill() {
        elementsPage.goToTextBox();
        elementsPage.fillFullName(FULL_NAME);
        elementsPage.fillEmail(EMAIL);
        elementsPage.fillCurrentAddress(CURRENT_ADDRESS);
        elementsPage.fillPermanentAddress(PERMANENT_ADDRESS);
        elementsPage.submitForm();
        elementsPage.checkCorrectDataSubmitting();
    }

    @Test()
    @Description("Работа с чек-боксами в разделе Check Box")
    public void activateCheckBoxes() {
        elementsPage.goToCheckBox();
        elementsPage.expandAllFolders();
        elementsPage.allCheckBoxDisabled();
        elementsPage.activateAllCheckboxes();
        elementsPage.allCheckBoxEnabled();
        elementsPage.collapseAllFolders();
    }

    @Test()
    @Description("Работа с чек-боксами в разделе Radio Button")
    public void radioButtons() {
        elementsPage.goToRadioButtons();
        elementsPage.enableYes();
        elementsPage.checkYesSuccessMessage();
        elementsPage.enableImpressive();
        elementsPage.checkImpressiveSuccessMessage();
        elementsPage.noIsNotClickable();
    }

    @Test()
    @Description("Работа с кнопками в разделе Buttons")
    public void clickToButtons() {
        elementsPage.goToButtons();
        elementsPage.activateDoubleClickButton();
        elementsPage.checkDoubleClickSuccessMessage();
        elementsPage.activateRightClickButton();
        elementsPage.checkRightClickSuccessMessage();
        elementsPage.activateLeftClickButton();
        elementsPage.checkLeftClickSuccessMessage();
    }


    @Test()
    @Description("Работа с кнопками из раздела Dynamic Properties")
    public void dynamicProperties() {
        elementsPage.goToDynamicProperties();
        elementsPage.clickWillEnable5SecondsButton();
        elementsPage.clickColorChangeButton();
        elementsPage.clickVisibleAfter5SecondsButton();

    }
}