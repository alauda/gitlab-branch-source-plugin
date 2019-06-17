package io.jenkins.plugins.gitlabbranchsource;

import edu.umd.cs.findbugs.annotations.NonNull;
import jenkins.scm.api.SCMHead;

public class BranchSCMHEAD extends SCMHead {

    /**
     * Constructor.
     *
     * @param name the name.of the branch
     */
    public BranchSCMHEAD(@NonNull String name) {
        super(name);
    }

    @Override
    public String getPronoun() {
        return Messages.BranchSCMHead_Pronoun();
    }
}
