pipelineJob('example') {
  definition {
    cpsScm {
      scm {
        git('https://github.com/carmelocal/test_repo.git')
      }
      triggers {
        scm('*/2 * * * *')
      }
      scriptPath("JenkinsFile")
    }
  }
}
