package calculator;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    @Test
    void 커스텀_구분자_사용() {
        assertSimpleTest(() -> {
            run("//;\\n1,2:3;4");
            assertThat(output()).contains("결과 : 10");
        });
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("-1,2,3"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("다중 커스텀 문자 테스트")
    void 커스텀_문자_여러개() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("//;;\\n1,2,3;4"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("\\n 누락 테스트")
    void 커스텀_종료자_누락() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("//;1,2,3"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("음수 예외 처리 테스트")
    void 음수_예외_처리() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("-1,2,3:4"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("0 처리")
    void 제로_입력_처리() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("//;\\n1,2,0;4"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("띄어쓰기 입력")
    void 띄어쓰기_입력_처리() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1, 2,3,4"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("잘못된 형식 입력 1")
    void 잘못된_형식_입력_1() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("/;\n1,3,4;5"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("잘못된 형식 입력 2")
    void 잘못된_형식_입력_2() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1,2,3//;\n"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("잘못된 형식 입력 3")
    void 잘못된_형식_입력_3() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1,2,3,//;\n"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
