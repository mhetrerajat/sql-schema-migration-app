/*
 * This source file was generated by the Gradle 'init' task
 */
package org.mhetrerajat;

import javax.inject.Inject;
import lombok.RequiredArgsConstructor;
import org.mhetrerajat.dagger.components.DaggerAppComponent;
import org.mhetrerajat.integrations.service.GreetingService;

@RequiredArgsConstructor(onConstructor_ = {@Inject})
public class App {
    private final GreetingService greetingService;

    public String getGreeting() {
        return greetingService.getGreeting();
    }

    public static void main(String[] args) {
        App app = DaggerAppComponent.create().getApp();
        System.out.println(app.getGreeting());
    }
}
