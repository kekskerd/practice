package org.example.abstractfactory.banking;

import org.example.abstractfactory.Developer;
import org.example.abstractfactory.ProjectManager;
import org.example.abstractfactory.ProjectTeamFactory;
import org.example.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
