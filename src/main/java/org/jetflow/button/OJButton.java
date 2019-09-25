package org.jetflow.button;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.jetflow.HasChroming;

@Tag("oj-button")
@JsModule("@oracle/oraclejet/dist/js/libs/oj/debug/ojbutton.js")
@JsModule("knockout/build/output/knockout-latest.debug.js")
@CssImport("@oracle/oraclejet/dist/css/alta/oj-alta-min.css")
@NpmPackage(value = "@oracle/oraclejet", version = "7.2.0")
public class OJButton extends Component implements HasSize, HasStyle, HasText, HasChroming, ClickNotifier<OJButton> {

    public OJButton() {
        getElement().setAttribute("data-oj-binding-provider", "none");
        setChroming(Chroming.FULL);
    }

    public OJButton(String text) {
        this();
        setText(text);
    }

    public OJButton(String text, ComponentEventListener<ClickEvent<OJButton>> listener) {
        this(text);
        addClickListener(listener);
    }


}
