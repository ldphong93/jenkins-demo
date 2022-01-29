pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ldphong93/JenkinsSample.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
