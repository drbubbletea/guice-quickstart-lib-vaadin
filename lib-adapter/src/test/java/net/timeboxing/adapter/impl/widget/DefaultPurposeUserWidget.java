package net.timeboxing.adapter.impl.widget;

import net.timeboxing.adapter.AdaptedFrom;
import net.timeboxing.adapter.Adaptee;
import net.timeboxing.adapter.impl.User;

import javax.inject.Inject;

@AdaptedFrom(from = User.class, to = Widget.class)
public class DefaultPurposeUserWidget implements Widget {

    private final User user;
    @Inject
    public DefaultPurposeUserWidget(@Adaptee User user) {
        this.user = user;
    }
    @Override
    public String display() {
        return user.name() + "!!!";
    }
}