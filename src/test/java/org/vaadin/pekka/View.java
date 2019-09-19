package org.vaadin.pekka;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends Div {

    public View() {
        OJButton ojButton = new OJButton();
        add(ojButton);
    }
}
