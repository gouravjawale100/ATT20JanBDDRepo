pipeline {
    agent any

    stages {
        stage('checkout the code') {
            steps {
                git credentialsId: 'f1f87cfe-ab79-4e85-9b9f-053f9a113dfd', url: 'https://github.com/gouravjawale100/ATT20JanBDDRepo.git'
            }
        }

                stage('Executing on Chrome browser') {
                    steps {
                    script
                    {

                    catchError(buildResult:'FAILURE', stageResult: 'FAILURE')
                    {
                    bat "mvn clean test -Dclibrowser=Chrome"
                    }

                    }
                        
                    }
     post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/amazontestreport/reports.html', body: '''<h1>This is customized email report</h1>
<p>Hi Team,<br>
Here are the details for the execution of project:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks  & Regards<br>
ATT 20 Jan Batch</p>
''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email for Chrome Browser', to: 'attevening@gmail.com'
        }
    }
        }

                    stage('Executing on Firefox browser') {
                    steps {
                        script
                    {

                    catchError(buildResult:'FAILURE', stageResult: 'FAILURE')
                    {
                    bat "mvn clean test -Dclibrowser=Firefox"
                    }

                    }
                    }


     post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/amazontestreport/reports.html', body: '''<h1>This is customized email report</h1>
<p>Hi Team,<br>
Here are the details for the execution of project:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks  & Regards<br>
ATT 20 Jan Batch</p>
''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email for Firefox Browser', to: 'attevening@gmail.com'
        }
    }
        }




     }

}
