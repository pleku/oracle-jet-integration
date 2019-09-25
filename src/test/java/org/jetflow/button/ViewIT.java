package org.jetflow.button;

import com.vaadin.flow.theme.NoTheme;
import org.jetflow.AbstractViewTest;
import org.junit.Assert;
import org.junit.Test;

import com.vaadin.testbench.TestBenchElement;

public class ViewIT extends AbstractViewTest {

    @Test
    public void componentWorks() {
        final TestBenchElement button = $("oj-button").first();

        Assert.assertTrue(
                button.$(TestBenchElement.class).all().size() > 0);
    }
}
