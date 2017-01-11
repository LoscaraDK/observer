package br.com.cetip.observer.config;

import org.glassfish.jersey.server.ResourceConfig;

import br.com.cetip.observer.application.ObserverApplicationBinder;

public class ObserverResourceConfig extends ResourceConfig {
    public ObserverResourceConfig() {
        register(new ObserverApplicationBinder());
        packages(true, "br.com.cetip.observer");
    }
}