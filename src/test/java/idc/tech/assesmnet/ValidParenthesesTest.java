package idc.tech.assesmnet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        this.validParentheses = new ValidParentheses();
    }

    @Test
    @DisplayName("should return true when input is '()'")
    void isValid_1() {
        boolean result = this.validParentheses.isValid("()");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("should return true when input is ()[]{}")
    void isValid_2(){
        boolean result = this.validParentheses.isValid("()[]{}");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("should return false when input is (] ")
    void isValid_3(){
        boolean result = this.validParentheses.isValid("(]");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("should return false when input is  ([)]")
    void isValid_4(){
        boolean result = this.validParentheses.isValid("([)]");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("should return true when input is  {[]}")
    void isValid_5(){
        boolean result = this.validParentheses.isValid("{[]}");
        Assertions.assertTrue(result);
    }


}