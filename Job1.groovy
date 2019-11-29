pipelineJob('Test-dmp') {
  definition {
    cpsScm {
      scm {
        git {
           branch('dev')
             remote{
                url('https://tfs.fcaitem.com/tfs/manufacturing/DMI_PROJECT/_git/DMI_PROJECT')
            }
			      def nodeBuilder = NodeBuilder.newInstance()
            def pathRestrictions = nodeBuilder.createNode('hudson.plugins.git.extensions.impl.PathRestriction')
            pathRestrictions.appendNode('includedRegions', 'Folder1/.*')
            extensions {
                extensions << pathRestrictions
            }
          }
      }
      scriptPath("Jenkinsfile2")
    }
  }
  triggers{
    scm('*/2 * * * *')
  }
}
