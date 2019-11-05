pipelineJob('Job2') {
  definition {
    cpsScm {
      scm {
        git('https://github.com/carmelocal/test_repo.git')
      }
      scriptPath("JenkinsFile")
    }
  }
  triggers{
    scm('*/2 * * * *')
  }
}
