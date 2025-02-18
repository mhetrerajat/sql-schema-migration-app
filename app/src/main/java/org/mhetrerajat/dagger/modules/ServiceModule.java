package org.mhetrerajat.dagger.modules;

import dagger.Module;
import dagger.Provides;
import org.mhetrerajat.integrations.service.GreetingService;

import javax.inject.Singleton;

@Module
public class ServiceModule {

    @Singleton
    @Provides
    public GreetingService providesGreetingService(){
       return new GreetingService();
    }
}
