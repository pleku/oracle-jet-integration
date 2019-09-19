package org.vaadin.pekka;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("oj-button")
@JsModule("@oracle/oraclejet/dist/js/libs/oj/debug/ojbutton.js")
@NpmPackage(value = "@oracle/oraclejet", version = "^7.1.0")
public class OJButton extends Component {

    public OJButton() {
    }

}
