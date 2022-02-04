pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ldphong93/JenkinsGradle.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
