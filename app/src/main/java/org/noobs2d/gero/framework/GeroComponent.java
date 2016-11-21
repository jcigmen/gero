package org.noobs2d.gero.framework;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Julious Igmen
 */
@Component(modules = {
    CacheModule.class,
    UtilityModule.class,
    WebServiceModule.class
})
@Singleton
public interface GeroComponent {
}