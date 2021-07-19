package org.example.abstractfactory.website;

import org.example.abstractfactory.Developer;
import org.example.abstractfactory.ProjectManager;
import org.example.abstractfactory.ProjectTeamFactory;
import org.example.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
