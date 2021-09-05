package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class BaseMethods {
    

    @Step("Клик по элементу левой клавишей мыши")
    public void clickElement(SelenideElement element){
        element.click();

    }
    @Step("Клик по элементу правой клавишей мыши")
    public void rightClickToElement(SelenideElement element){
        element.contextClick();
    }
    @Step("Двойной клик по элементу левой клавишей мыши")
    public void doubleClickToElement(SelenideElement element){
        element.doubleClick();
    }
    @Step("Проверка элементов на видимость")
    public void checkElements(SelenideElement... elements){
        for (SelenideElement element: elements) {
            element.should(Condition.visible);
        }
    }
    @Step("Заполнение поля значением {text}")
    public void sendKeys(SelenideElement element, String text){
        element.setValue(text);
    }
}