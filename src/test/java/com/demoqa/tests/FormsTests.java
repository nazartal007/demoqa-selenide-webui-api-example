package com.demoqa.tests;

import com.demoqa.pages.FormsPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import static com.demoqa.helpers.Constants.*;

public class FormsTests extends TestBase{
    FormsPage formsPage = new FormsPage();

    @Test()
    @Description("Заполнение формы во кладке Practice Form")
    public void fillPracticeForm(){
        formsPage.goToPracticeForm();
        formsPage.fillUserData(FIRST_NAME,LAST_NAME,EMAIL);
        formsPage.chooseCustomerGender(GENDER_MALE);
        formsPage.fillUserMobilePhone(MOBILE_PHONE);
        formsPage.chooseBirthDay(DAY,MONTH,YEAR);
        formsPage.selectSubjectsEnglishAndComputerScience();
        formsPage.chooseHobbies(HOBBY_MUSIC,HOBBY_READING,HOBBY_SPORTS);
        formsPage.uploadPhoto();
        formsPage.fillFullAddress();
        formsPage.submitStudentForm();
        formsPage.checkSuccessModalWindow();
    }
}
