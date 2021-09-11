package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;
import static com.demoqa.helpers.Constants.*;

public class FormsPage {
    //  Селекторы заполняемых полей.
    SelenideElement
            bannerForms = $x("//div[@class = 'main-header' and text() = 'Forms']"),
            practiceForm = $x("//*[@class = 'text' and text()='Practice Form']/.."),
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            userMobileNumber = $("#userNumber"),
            subjectsContainer = $("#subjectsInput"),
            currentAddress = $("#currentAddress"),
            chooseFile = $("#uploadPicture"),
    //  Селекторы выбора из вариантов и клики.
    sexMale = $x("//*[@class = 'custom-control-input' and @value = '" + GENDER_MALE + "']/.."), //todo сделать стринг формат
            sexFemale = $x("//*[@class = 'custom-control-input' and @value = '" + GENDER_FEMALE + "']/.."), //todo сделать стринг формат
            sexOther = $x("//*[@class = 'custom-control-input' and @value = '" + GENDER_OTHER + "']/.."), //todo сделать стринг формат
            hobbiesSports = $x("//*[@for = 'hobbies-checkbox-1']"),
            hobbiesReadings = $x("//*[@for = 'hobbies-checkbox-2']"),
            hobbiesMusic = $x("//*[@for = 'hobbies-checkbox-3']"),
            english = $("#react-select-2-option-0"),
            computerScience = $("#react-select-2-option-2"),
            openStateMenu = $("#state .css-tlfecz-indicatorContainer"),
            nCR = $("#react-select-3-option-0"),
            openCityMenu = $("#city .css-tlfecz-indicatorContainer"),
            delhi = $("#react-select-4-option-0"),
            submitButton = $("#submit"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            chooseMonth = $(".react-datepicker__month-select"),
            chooseYear = $(".react-datepicker__year-select"),
            chooseDay = $x("//*[contains(@aria-label , '" + MONTH + " " + DAY + "st, " + YEAR + "')]"), //todo сделать стринг формат
            modalContent = $(".modal-content");

    @Step("Переход к тренировочной форме для заполнения")
    public void goToPracticeForm() {
        open(HOME_URL + "/automation-practice-form");
    }

    @Step("Вводим данные клиента: имя({first}), фамилию({last})  и почту({email})")
    public void fillUserData(String first, String last, String email) {
        firstName.setValue(first);
        lastName.setValue(last);
        userEmail.setValue(email);
    }

    @Step("Выбираем пол клиента: {gender}")
    public void chooseCustomerGender(String gender) {
        switch (gender) {
            case GENDER_MALE:
                sexMale.click();
                break;
            case GENDER_FEMALE:
                sexFemale.click();
                break;
            case GENDER_OTHER:
                sexOther.click();
                break;
        }
    }

    @Step("Заполняем поле ввода номера телефона значением : {phone}")
    public void fillUserMobilePhone(String phone) {
        userMobileNumber.setValue(phone);
    }

    @Step("Выбор даты дня рождения соответвующей {day} {month} {year}")
    public void chooseBirthDay(String day, String month, String year) {
        dateOfBirthInput.setValue(day);
        new Select(chooseMonth).selectByVisibleText(month);
        new Select(chooseYear).selectByVisibleText(year);
        chooseDay.click();
    }

    @Step("Выбираем предметы Английский и Информатика в списке предметов")
    public void selectSubjectsEnglishAndComputerScience() {
        subjectsContainer.setValue(SUBJECT_TEXT);
        english.click();
        subjectsContainer.setValue(SUBJECT_TEXT);
        computerScience.click();
    }

    @Step("Выбираем хобби: {hobbies}")
    public void chooseHobbies(String... hobbies) {
        for (String hobby : hobbies) {
            if (hobby.equals("Sports")) {
                hobbiesSports.click();
            }
            if (hobby.equals("Music")) {
                hobbiesMusic.click();
            }
            if (hobby.equals("Reading")) {
                hobbiesReadings.click();
            }
        }
    }

    @Step("Загружаем фото клиента")
    public void uploadPhoto() {
        chooseFile.setValue(JPG_FILE);
    }

    @Step("Заполняем текущий адрес с выбором штата и города")
    public void fillFullAddress() {
        currentAddress.setValue(CURRENT_ADDRESS);
        openStateMenu.scrollTo().click();
        nCR.click();
        openCityMenu.click();
        delhi.click();
    }

    @Step("Отправляем студенческую форму регистрации")
    public void submitStudentForm() {
        submitButton.click();
    }

    @Step("Проверяем что появилось модальное окно с данными зарегистрированного студента")
    public void checkSuccessModalWindow() {
        modalContent.click();
    }
}
