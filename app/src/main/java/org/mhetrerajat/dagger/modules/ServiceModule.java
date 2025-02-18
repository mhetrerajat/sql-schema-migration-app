package org.mhetrerajat.dagger.modules;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import org.mhetrerajat.integrations.service.GreetingService;

@Module
public class ServiceModule {

    @Singleton
    @Provides
    public GreetingService providesGreetingService() {
        return new GreetingService();
    }
}
