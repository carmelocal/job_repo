def gitUrl = 'https://github.com/carmelocal/test_repo.git'

job('Job1') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/2 * * * *')
    }
    steps {
        
    }
}
