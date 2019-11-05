def gitUrl = 'https://github.com/carmelocal/test_repo.git'

job('test-job') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        
    }
}
