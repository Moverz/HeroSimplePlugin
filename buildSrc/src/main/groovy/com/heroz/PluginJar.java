package com.heroz;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by Heroz on 2/8/23.
 * Copyright © 2/8/23. All rights reserved.
 * *
 * desc:
 */
class PluginJar implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("buildSrc 方式创建插件完成了");
    }
}
