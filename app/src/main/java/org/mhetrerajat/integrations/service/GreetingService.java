package org.mhetrerajat.integrations.service;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

public class GreetingService {
    public String getGreeting() {
        return "Hello World!";
    }
}
