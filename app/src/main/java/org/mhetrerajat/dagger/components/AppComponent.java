package org.mhetrerajat.dagger.components;

import dagger.Component;
import org.mhetrerajat.App;
import org.mhetrerajat.dagger.modules.ServiceModule;

import javax.inject.Singleton;

@Singleton
@Component(modules={ServiceModule.class})
public interface AppComponent {
    App getApp();
}
