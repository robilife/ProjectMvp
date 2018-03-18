package com.example.robilife.mvpproject.di.component;

import com.example.robilife.mvpproject.di.PerService;
import com.example.robilife.mvpproject.di.module.ServiceModule;

import dagger.Component;

/**
 * Created by khalifa on 1/4/18.
 */

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {
}
