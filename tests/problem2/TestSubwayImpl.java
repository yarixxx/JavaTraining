package problem2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import problems2.Subway;
import problems2.SubwayImpl;

public class TestSubwayImpl {

    Subway subway;
    List<String> lineOne;
    List<String> path;

    String[] LINE_ONE = { "Девяткино", "Гражданский проспект", "Академическая",
            "Политехническая", "Площадь Мужества", "Лесная", "Выборгская",
            "Площадь Ленина", "Чернышевская", "Площадь Восстания",
            "Владимирская", "Пушкинская", "Технологический институт",
            "Балтийская", "Нарвская", "Кировский завод", "Автово",
            "Ленинский проспект", "Проспект Ветеранов" };

    String[] LINE_TWO = { "Парнас", "Проспект Просвещения", "Озерки",
            "Удельная", "Пионерская", "Чёрная речка", "Петроградская",
            "Горьковская", "Невский проспект", "Сенная площадь",
            "Технологический институт", "Фрунзенская", "Московские ворота",
            "Электросила", "Парк Победы", "Московская", "Звёздная", "Купчино" };

    String[] EXPECTED_PATH = { "Академическая", "Политехническая",
            "Площадь Мужества", "Лесная", "Выборгская", "Площадь Ленина",
            "Чернышевская", "Площадь Восстания", "Владимирская", "Пушкинская",
            "Технологический институт", "Сенная площадь", "Невский проспект",
            "Горьковская", "Петроградская" };

    String[] EXPECTED_SIMPLE_PATH = { "Академическая", "Политехническая",
            "Площадь Мужества", "Лесная", "Выборгская", "Площадь Ленина",
            "Чернышевская", "Площадь Восстания", "Владимирская", "Пушкинская" };

    String[] EXPECTED_SIMPLE_REVERSE_PATH = { "Выборгская", "Лесная",
            "Площадь Мужества", "Политехническая", "Академическая" };

    @Before
    public void setUp() throws Exception {
        subway = new SubwayImpl();
    }

    @Test
    public void testSimplePathWithOneLine() {
        givenOneLine();
        whenFindSimplePath();
        thenSimplePathCorrect();
    }

    @Test
    public void testSimpleReversePathWithOneLine() {
        givenOneLine();
        whenFindSimpleReversePath();
        thenSimpleReversePathCorrect();
    }

    @Test
    @Ignore
    public void testPathWithChangeLines() {
        givenOneLine();
        givenTwoLine();
        whenFindChangePath();
        thenPathCorrect();
    }

    private void givenTwoLine() {
        subway.addLine(Arrays.asList(LINE_TWO));
    }

    private void givenOneLine() {
        subway.addLine(Arrays.asList(LINE_ONE));
    }

    private void whenFindSimpleReversePath() {
        path = subway.findPath("Выборгская", "Академическая");
    }

    private void whenFindSimplePath() {
        path = subway.findPath("Академическая", "Пушкинская");
    }

    private void whenFindChangePath() {
        path = subway.findPath("Академическая", "Петроградская");
    }

    private void thenSimpleReversePathCorrect() {
        assertEquals(Arrays.asList(EXPECTED_SIMPLE_REVERSE_PATH), path);
    }

    private void thenSimplePathCorrect() {
        assertEquals(Arrays.asList(EXPECTED_SIMPLE_PATH), path);
    }

    private void thenPathCorrect() {
        assertEquals(Arrays.asList(EXPECTED_PATH), path);
    }

}
