package com.github.shaikajar.ideablue.services;

import com.github.shaikajar.ideablue.MyBundle;
import com.intellij.openapi.project.Project;

public class MyProjectService {
    MyProjectService(Project project){
        System.out.println(MyBundle.message("projectService", project.getName()));
    }


}
