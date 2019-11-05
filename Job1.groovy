pipelineJob('Job1') {
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
      scriptPath("Jenkinsfile")
    }
  }
  triggers{
    scm('*/2 * * * *')
  }
