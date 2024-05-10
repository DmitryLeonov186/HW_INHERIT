package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {
    @Test
    public void SimpleTaskMatchesTest() {
        SimpleTask task = new SimpleTask(1, "Начать работу");
        boolean expected = true;
        boolean actual = task.matches("Начать");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SimpleTaskNotMatchesTest() {
        SimpleTask task = new SimpleTask(1, "Начать работу");
        boolean expected = false;
        boolean actual = task.matches("Сделать");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingMatchesTest() {
        Meeting task = new Meeting(3, "Поддержка продукта", "Плюс Ультра", "Первое мая, восемнадцать часов");
        boolean expected = true;
        boolean actual = task.matches("Плюс Ультра");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingMatchesTest2() {
        Meeting task = new Meeting(3, "Поддержка продукта", "Плюс Ультра", "Первое мая, восемнадцать часов");
        boolean expected = true;
        boolean actual = task.matches("Поддержка продукта");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MeetingNotMatchesTest() {
        Meeting task = new Meeting(3, "Поддержка продукта", "Плюс Ультра", "Первое мая, восемнадцать часов");
        boolean expected = false;
        boolean actual = task.matches("Встреча");

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void EpicMatchesTest() {

        Epic task = new Epic(12, new String[]{"Роспуск на доски", "Обработка на станке", "Распил"});
        boolean expected = true;
        boolean actual = task.matches("Распил");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void EpicNoMatchesTest() {

        Epic task = new Epic(12, new String[]{"Роспуск на доски", "Обработка на станке", "Распил"});
        boolean expected = false;
        boolean actual = task.matches("Строгание");

        Assertions.assertEquals(expected, actual);

    }

}