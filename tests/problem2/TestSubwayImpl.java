package problem2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import problems2.Subway;
import problems2.SubwayImpl;

public class TestSubwayImpl {

    private Subway subway;
    private List<String> path;

    private final String[] LINE_ONE = { "Девяткино", "Гражданский проспект",
            "Академическая", "Политехническая", "Площадь Мужества", "Лесная",
            "Выборгская", "Площадь Ленина", "Чернышевская",
            "Площадь Восстания", "Владимирская", "Пушкинская",
            "Технологический институт", "Балтийская", "Нарвская",
            "Кировский завод", "Автово", "Ленинский проспект",
            "Проспект Ветеранов" };

    private final String[] LINE_TWO = { "Парнас", "Проспект Просвещения",
            "Озерки", "Удельная", "Пионерская", "Чёрная речка",
            "Петроградская", "Горьковская", "Невский проспект",
            "Сенная площадь", "Технологический институт", "Фрунзенская",
            "Московские ворота", "Электросила", "Парк Победы", "Московская",
            "Звёздная", "Купчино" };

    private final static String[] EXPECTED_PATH = { "Владимирская",
            "Пушкинская", "Технологический институт",
            "Технологический институт", "Сенная площадь", "Невский проспект" };

    private final static String[] EXPECTED_PATH2 = { "Горьковская",
            "Невский проспект", "Сенная площадь", "Технологический институт",
            "Технологический институт", "Балтийская", "Нарвская" };

    private final static String[] EXPECTED_REVERSE_PATH = { "Горьковская",
            "Невский проспект", "Сенная площадь", "Технологический институт",
            "Технологический институт", "Пушкинская", "Владимирская" };

    private final static String[] EXPECTED_SIMPLE_PATH = { "Выборгская",
            "Площадь Ленина", "Чернышевская", "Площадь Восстания",
            "Владимирская", "Пушкинская" };

    private final static String[] EXPECTED_SIMPLE_REVERSE_PATH = {
            "Выборгская", "Лесная", "Площадь Мужества", "Политехническая",
            "Академическая" };

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
    public void testPathWithChangeLines() {
        givenOneLine();
        givenTwoLine();
        whenFindChangePath();
        thenPathCorrect();
    }

    @Test
    public void testReversePathWithChangeLines() {
        givenOneLine();
        givenTwoLine();
        whenFindReverseChangePath();
        thenReversePathCorrect();
    }

    @Test
    public void testFindPathWithChangeLines() {
        givenOneLine();
        givenTwoLine();
        whenFindChangePath2();
        thenPath2Correct();
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
        path = subway.findPath("Выборгская", "Пушкинская");
    }

    private void whenFindChangePath() {
        path = subway.findPath("Владимирская", "Невский проспект");
    }

    private void whenFindReverseChangePath() {
        path = subway.findPath("Горьковская", "Владимирская");
    }

    private void whenFindChangePath2() {
        path = subway.findPath("Горьковская", "Нарвская");
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

    private void thenReversePathCorrect() {
        assertEquals(Arrays.asList(EXPECTED_REVERSE_PATH), path);
    }

    private void thenPath2Correct() {
        assertEquals(Arrays.asList(EXPECTED_PATH2), path);
    }

}
