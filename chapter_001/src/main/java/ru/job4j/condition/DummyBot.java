package ru.job4j.condition;
import java.util.Scanner;
/**
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        } 
        return rsl;
     }
     
     public static void main(String[] args) {
        DummyBot bot = new DummyBot();
        Scanner in = new Scanner(System.in);
        System.out.println("Ввидите вопрос");
        System.out.println(bot.answer(in.nextLine()));
     }
}



