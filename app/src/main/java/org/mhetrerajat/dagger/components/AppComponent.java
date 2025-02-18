package org.mhetrerajat.dagger.components;

import dagger.Component;
import javax.inject.Singleton;
import org.mhetrerajat.App;
import org.mhetrerajat.dagger.modules.ServiceModule;

@Singleton
@Component(modules = {ServiceModule.class})
public interface AppComponent {
    App getApp();
}
