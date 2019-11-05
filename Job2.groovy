def gitUrl = 'https://github.com/carmelocal/test_repo.git'

job('Job2') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/2 * * * *')
    }
    steps {
        
    }
}
