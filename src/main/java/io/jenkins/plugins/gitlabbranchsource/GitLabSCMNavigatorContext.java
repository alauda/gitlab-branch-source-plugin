package io.jenkins.plugins.gitlabbranchsource;

import edu.umd.cs.findbugs.annotations.NonNull;
import jenkins.scm.api.SCMNavigator;
import jenkins.scm.api.SCMSourceObserver;
import jenkins.scm.api.trait.SCMNavigatorContext;

public class GitLabSCMNavigatorContext extends
    SCMNavigatorContext<GitLabSCMNavigatorContext, GitLabSCMNavigatorRequest> {

    private boolean wantSubgroupProjects;

    private int projectNamingStrategy = 1;

    @NonNull
    @Override
    public GitLabSCMNavigatorRequest newRequest(@NonNull SCMNavigator navigator,
        @NonNull SCMSourceObserver observer) {
        return new GitLabSCMNavigatorRequest(navigator, this, observer);
    }

    /**
     * @return whether to include subgroup projects
     */
    public boolean wantSubgroupProjects() {
        return wantSubgroupProjects;
    }

    public GitLabSCMNavigatorContext wantSubgroupProjects(boolean include) {
        this.wantSubgroupProjects = include;
        return this;
    }

    /**
     * Returns the project naming strategy id.
     *
     * @return the project naming strategy id.
     */
    public int withProjectNamingStrategy() {
        return projectNamingStrategy;
    }

    public GitLabSCMNavigatorContext withProjectNamingStrategy(int strategyId) {
        this.projectNamingStrategy = strategyId;
        return this;
    }
}
