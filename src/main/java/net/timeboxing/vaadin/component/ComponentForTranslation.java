package net.timeboxing.vaadin.component;

import net.timeboxing.adapter.CustomAdaptedFromTranslation;

public class ComponentForTranslation extends CustomAdaptedFromTranslation<ComponentFor> {
    @Override
    public Class<?> from(ComponentFor instance) {
        return instance.forClass();
    }

    @Override
    public Class<?> to(ComponentFor instance) {
        return VaadinComponent.class;
    }

    @Override
    public Class<? extends Enum<?>> purposeEnum(ComponentFor instance) {
        return instance.purpose().getClass();
    }

    @Override
    public Object purposeValue(ComponentFor instance) {
        return instance.purpose().toString();
    }
}
