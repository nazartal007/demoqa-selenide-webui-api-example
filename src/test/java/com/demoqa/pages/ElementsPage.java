package com.demoqa.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.demoqa.helpers.Constants.*;

public class ElementsPage {


    //  Селекторы подразделов
    private SelenideElement
            textBox = $x("//*[@class = 'text'  and text( )='Text Box']/.."),
            checkBox = $x("//*[@class = 'text'  and text( )='Check Box']/.."),
            radioButton = $x("//*[@class = 'text'  and text( )='Radio Button']/.."),
            buttons = $x("//*[@class = 'text'  and text( )='Buttons']/.."),
            dynamicProperties = $x("//*[@class = 'text'  and text( )='Dynamic Properties']/.."),

    //  Селекторы подраздела Text Box
            headerTextBox = $x("//div[@class = 'main-header'  and text( ) = 'Text Box']"),
            userName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submitButton = $("#submit"),
            submittingName = $x("//*[@id = 'email'  and text( ) = '" + EMAIL + "']"),
            submittingEmail = $x("//*[@id = 'name'  and text( ) = '" + FULL_NAME + "']"),
            submittingCurrentAddress = $x("//*[@id = 'currentAddress'  and text( ) = '" + CURRENT_ADDRESS + "']"),
            submittingPermanentAddress = $x("//*[@id = 'permanentAddress'  and text( ) = '" + PERMANENT_ADDRESS + "']"),

    //  Селекторы подраздела Check Box
            headerCheckBox = $x("//div[@class = 'main-header'  and text( ) = 'Check Box']"),
            expandAllButton = $(".rct-option-expand-all"),
            collapseAllButton = $(".rct-option-collapse-all"),
            homeCheckBox = $x("//*[@id = 'tree-node-home']/.."),
    //  Ниже раздел Check Box сообщения об удачном выборе нужных папок.
            homeSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'home']"),
            desktopSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'desktop']"),
            notesSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'notes']"),
            commandsSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'commands']"),
            documentsSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'documents']"),
            workspaceSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'workspace']"),
            reactSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'react']"),
            angularSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'angular']"),
            veuSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'veu']"),
            officeSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'office']"),
            publicSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'public']"),
            privateSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'private']"),
            classifiedSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'classified']"),
            generalSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'general']"),
            downloadsSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'downloads']"),
            wordFileSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'wordFile']"),
            excelFileSelectedMessage = $x("//*[@class = 'text-success'  and text( )= 'excelFile']");

    private ElementsCollection
            listUncheckedBoxes = $$(".rct-icon-uncheck"),
            listCheckedBoxes = $$(".rct-icon-check");

    //  Селекторы подраздела Radio Button
    private SelenideElement
            headerRadioButton = $x("//div[@class = 'main-header' and text( ) = 'Radio Button']"),
            yesRadio = $x("//*[@class = 'custom-control-label' and @for = 'yesRadio']"),
            impressiveRadio = $x("//*[@class = 'custom-control-label' and @for = 'impressiveRadio']"),
            noRadioDisabled = $x("//*[@id = 'noRadio' and @disabled]"),
            textSuccessYes = $x("//*[@class = 'text-success'  and text( ) = 'Yes']"),
            textSuccessImpressive = $x("//*[@class = 'text-success'  and text( ) = 'Impressive']"),

    //  Селекторы подраздела Buttons
            headerButtons = $x("//div[@class = 'main-header'  and text( ) = 'Buttons']"),
            doubleClickButton = $("#doubleClickBtn"),
            rightClickButton = $("#rightClickBtn"),
            leftClickButton = $x("//*[@type ='button'  and text( ) = 'Click Me']"),
            doubleClickMessage = $x("//*[@id = 'doubleClickMessage'  and text( ) = 'You have done a double click']"),
            rightClickMessage = $x("//*[@id = 'rightClickMessage'  and text( ) = 'You have done a right click']"),
            leftClickMessage = $x("//*[@id = 'dynamicClickMessage'  and text( ) = 'You have done a dynamic click']"),

    //  Селекторы подраздела Dynamic Properties
            headerDynamicProperties = $x("//div[@class = 'main-header'  and text( ) = 'Dynamic Properties']"),
            willEnable5Seconds = $("#enableAfter"),
            colorChange = $("#colorChange"),
            visibleAfter5Seconds = $("#visibleAfter");


    //  Методы для раздела Text Box
    @Step("Переходим в раздел Text Box")
    public ElementsPage goToTextBox() {
        open("https://demoqa.com/text-box");
        return this;
    }

    @Step("Заполняем поле full name значением {fullName}")
    public ElementsPage fillFullName(String fullName) {
        userName.setValue(fullName);
        return this;
    }

    @Step("Заполняем поле Email значением {email}")
    public ElementsPage fillEmail(String email) {
        userEmail.setValue(email);
        return this;
    }

    @Step("Вводим текущий адрес пользователя: {address}")
    public ElementsPage fillCurrentAddress(String address) {
        currentAddress.setValue(address);
        return this;
    }

    @Step("Вводим постоянный адрес пользователя: {address}")
    public ElementsPage fillPermanentAddress(String address) {
        permanentAddress.setValue(address);
        return this;
    }

    @Step("Подтверждаем все введённые данные")
    public ElementsPage submitForm() {
        submitButton.click();
        return this;
    }

    @Step("Проверяем что принятые данные совпадают с введёнными")
    public void checkCorrectDataSubmitting() {
        submittingName.should(visible);
        submittingEmail.should(visible);
        submittingCurrentAddress.should(visible);
        submittingPermanentAddress.should(visible);
    }

    //  Методы для раздела Check Box
    @Step("Переходим в раздел Check Box")
    public void goToCheckBox() {
        open("https://demoqa.com/checkbox");
    }

    @Step("Открываем все подпапки нажатием кнопки +")
    public void expandAllFolders() {
        expandAllButton.click();
    }

    @Step("Проверка, что все чек-боксы отключены")
    public void allCheckBoxDisabled() {
        listUncheckedBoxes.should(CollectionCondition.size(COUNT_CHECK_BOXES));
    }

    @Step("Проверка, что все чек-боксы включены и появилось сообщение с назаванием всех выбранных папок и файлов")
    public void allCheckBoxEnabled() {
        listCheckedBoxes.should(CollectionCondition.size(COUNT_CHECK_BOXES));

        // todo - надо как-то адекватно это сделать
        homeSelectedMessage.should(visible);
        desktopSelectedMessage.should(visible);
        notesSelectedMessage.should(visible);
        commandsSelectedMessage.should(visible);
        documentsSelectedMessage.should(visible);
        workspaceSelectedMessage.should(visible);
        reactSelectedMessage.should(visible);
        angularSelectedMessage.should(visible);
        veuSelectedMessage.should(visible);
        officeSelectedMessage.should(visible);
        publicSelectedMessage.should(visible);
        privateSelectedMessage.should(visible);
        classifiedSelectedMessage.should(visible);
        generalSelectedMessage.should(visible);
        documentsSelectedMessage.should(visible);
        downloadsSelectedMessage.should(visible);
        wordFileSelectedMessage.should(visible);
        excelFileSelectedMessage.should(visible);
    }

    @Step("Включаем все чек-боксы нажатием чек-бокса Home")
    public void activateAllCheckboxes() {
        homeCheckBox.click();
    }

    @Step("сворачиваем все папки нажатием - и проверяем что видимым остался только один чекбокс")
    public void collapseAllFolders() {
        collapseAllButton.click();
        listCheckedBoxes.should(CollectionCondition.size(1));
    }

    //  Методы для раздела Radio Button
    @Step("Переходим в раздел Radio Button")
    public void goToRadioButtons() {
        open("https://demoqa.com/radio-button");
    }

    @Step("Активируем радиокнопку Yes")
    public void enableYes() {
        yesRadio.click();
    }

    @Step("Проверяем, наличие сообщения о том что выбрано Yes")
    public void checkYesSuccessMessage() {
        textSuccessYes.click();
    }

    @Step("Активируем радиокнопку impressive")
    public void enableImpressive() {
        impressiveRadio.click();
    }

    @Step("Проверяем, наличие сообщения о том что выбрано impressive")
    public void checkImpressiveSuccessMessage() {
        textSuccessImpressive.click();
    }

    @Step("Проверяем, что вариант no нелья выбрать")
    public void noIsNotClickable() {
        noRadioDisabled.should(disabled);
    }

    //  Методы для раздела Buttons
    @Step("Переходим в раздел Buttons")
    public void goToButtons() {
        open("https://demoqa.com/buttons");
    }

    @Step("Двойной клик по кнопке Double Click Me")
    public void activateDoubleClickButton() {
        doubleClickButton.doubleClick();
    }

    @Step("Проверяем сообщение об успешном нажатии кнопки Double Click Me")
    public void checkDoubleClickSuccessMessage() {
        doubleClickMessage.should(visible);
    }

    @Step("Клик правой кнопкой мыши по кнопке Right Click Me")
    public void activateRightClickButton() {
        rightClickButton.contextClick();
    }

    @Step("Проверяем сообщение об успешном нажатии кнопки Right Click Me")
    public void checkRightClickSuccessMessage() {
        rightClickMessage.should(visible);
    }

    @Step("Клик левой кнопкой мыши по кнопке Click Me")
    public void activateLeftClickButton() {
        leftClickButton.click();
    }

    @Step("Проверяем сообщение об успешном нажатии кнопки Right Click Me")
    public void checkLeftClickSuccessMessage() {
        leftClickMessage.should(visible);
    }

    //  Методы для раздела Dynamic Properties
    @Step("Переходим в раздел Buttons")
    public void goToDynamicProperties() {
        open("https://demoqa.com/dynamic-properties");
    }

    @Step("Кликаем по кнопке которая будет активна только через 5 секунд")
    public void clickWillEnable5SecondsButton() {
        willEnable5Seconds.click();
    }

    @Step("Кликаем по кнопке которая меняет цвет")
    public void clickColorChangeButton() {
        colorChange.click();
    }

    @Step("Кликаем по кнопке которая становится видимой через 5 секунд")
    public void clickVisibleAfter5SecondsButton() {
        visibleAfter5Seconds
                .should(visible, Duration.ofSeconds(6000))
                .click();
    }
}
