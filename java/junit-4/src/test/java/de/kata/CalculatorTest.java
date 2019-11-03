package de.kata;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CalculatorTest {
    @Test
    public void testAssertJIsAlwaysBetter() {
        var test = true;
        assertThat(test).isTrue();
    }
}