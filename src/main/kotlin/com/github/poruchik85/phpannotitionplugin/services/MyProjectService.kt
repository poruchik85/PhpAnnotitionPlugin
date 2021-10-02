package com.github.poruchik85.phpannotitionplugin.services

import com.intellij.openapi.project.Project
import com.github.poruchik85.phpannotitionplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
