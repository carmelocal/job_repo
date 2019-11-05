package hudson.plugins.git;

import hudson.plugins.git.*;
import jenkins.model.*;

def scm = new GitSCM("https://github.com/carmelocal/test_repo.git")
scm.branches = [new BranchSpec("*/master")];
def flowDefinition = new org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition(scm, "Jenkinsfile")
def parent = Jenkins.instance
def job = new org.jenkinsci.plugins.workflow.job.WorkflowJob(parent, "Job1")
job.definition = flowDefinition   
def spec = "*/2 * * * *"
hudson.triggers.SCMTrigger newCron = new hudson.triggers.SCMTrigger(spec)
newCron.start(job, true)
job.addTrigger(newCron)
job.save()
parent.reload()
