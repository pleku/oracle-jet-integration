package org.jetflow;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasChroming extends HasElement {

    final static PropertyDescriptor<String, String> CHROMING =
            PropertyDescriptors.attributeWithDefault("chroming", Chroming.FULL.toString().toLowerCase(), false);

    default void setChroming(Chroming chroming) {
        CHROMING.set(this, chroming == null ? null : chroming.toString().toLowerCase());
    }

    default Chroming getChroming() {
        return Chroming.valueOf(CHROMING.get(this).toUpperCase());
    }

    enum Chroming {
        FULL, HALF, OUTLINED;
    }
}
