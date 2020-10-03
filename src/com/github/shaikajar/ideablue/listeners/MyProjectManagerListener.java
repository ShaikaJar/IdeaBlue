package com.github.shaikajar.ideablue.listeners;

import com.github.shaikajar.ideablue.services.MyProjectService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManagerListener;
import org.jetbrains.annotations.NotNull;

public class MyProjectManagerListener implements ProjectManagerListener {
    @Override
    public void projectOpened(@NotNull Project project) {
        project.getService(MyProjectService.class);
    }
}
