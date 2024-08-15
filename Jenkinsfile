pipeline {
    agent any

    stages {
        stage('checkout the code') {
            steps {
                git 'https://github.com/gouravjawale100/ATT20JanBDDRepo.git'
            }
        }

                stage('Executing on Chrome browser') {
                    
            steps {
                    sh "mvn clean test -Dclibrowser=Chrome"
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

   




     }

}
