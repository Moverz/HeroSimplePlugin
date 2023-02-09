package com.hero.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by Heroz on 2/8/23.
 * Copyright © 2/8/23. All rights reserved.
 * *
 * desc:
 */
class HeroSimplePlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("单独项目远程方式创建插件完成了");
    }
}
