package problem2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
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

    String[] expectedPath = { "Академическая", "Политехническая",
            "Площадь Мужества", "Лесная", "Выборгская", "Площадь Ленина",
            "Чернышевская", "Площадь Восстания", "Владимирская", "Пушкинская" };

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

    private void givenOneLine() {
        subway.addLine(Arrays.asList(LINE_ONE));
    }

    private void whenFindSimplePath() {
        path = subway.findPath("Академическая", "Пушкинская");
    }

    private void thenSimplePathCorrect() {
        assertEquals(Arrays.asList(expectedPath), path);
    }

}
