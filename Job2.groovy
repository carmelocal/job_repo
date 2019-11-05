pipelineJob('Job2') {
  definition {
    cpsScm {
      scm {
        git {
           branch('master')
             remote{
                url('https://github.com/carmelocal/test_repo.git')
            }
          }
      }
      scriptPath("JenkinsFile")
    }
  }
  triggers{
    scm('*/2 * * * *')
  }
}
