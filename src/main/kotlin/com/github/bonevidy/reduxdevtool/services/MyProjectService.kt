package com.github.bonevidy.reduxdevtool.services

import com.github.bonevidy.reduxdevtool.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
