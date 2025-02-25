import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MVideo {
    @Test
    void startPage(){
        open("https://www.mvideo.ru/");
    }
    @Test
    void searchTest(){
        open("https://www.mvideo.ru/");
        $("[id='1']").setValue("iphone 15").pressEnter();
        $("[class='ng-star-inserted']").shouldHave(text("Iphone 15"));
    }
    @Test
    void addMarket(){
        open("https://www.mvideo.ru/");
        $("[id='1']").setValue("apple watch 10").pressEnter();
        $("[class='product-cards-row ng-star-inserted']").shouldHave(text("apple watch s10"));
        $("[title='Добавить в корзину']").click();
        sleep(3000);
        $("[type='wishlist']").click();
        sleep(3000);
        $("[type='comparison']").click();
        sleep(3000);
    }
}
