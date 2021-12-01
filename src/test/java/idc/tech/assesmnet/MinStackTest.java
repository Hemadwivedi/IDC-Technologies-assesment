package idc.tech.assesmnet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    private IMinStack minStack;

    @BeforeEach
    void setUp() {
        this.minStack = new MinStack();
    }

    @Test
    @DisplayName("[[],[-2],[0],[-3],[],[],[],[]]")
    void isTure() {
        this.minStack.push(-2);
        this.minStack.push(0);
        this.minStack.push(-3);
        Assertions.assertEquals(-3, this.minStack.getMin());
        this.minStack.pop();
        Assertions.assertEquals(0, this.minStack.top());
        Assertions.assertEquals(-2, this.minStack.getMin());
    }
}