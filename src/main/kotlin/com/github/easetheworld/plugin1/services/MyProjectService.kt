package com.github.easetheworld.plugin1.services

import com.github.easetheworld.plugin1.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
