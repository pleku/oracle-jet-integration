package org.jetflow.button;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.NoTheme;

@RouteAlias("")
@Route("button")
public class ButtonView extends Div {

    private int count;

    public ButtonView() {
        OJButton ojButton = new OJButton("Oracle JET Button");
        add(ojButton);

        ojButton.addClickListener(event -> Notification.show("Clicked " + count++ + " times."));
    }
}
