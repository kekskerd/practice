package org.example.abstractfactory.website;

import org.example.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
