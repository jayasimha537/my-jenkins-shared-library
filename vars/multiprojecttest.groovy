def call(Map params){

  pipeline {
    agent none

    stages {
        stage('Build') {
          agent { label params.agentName}
            steps {
              echo 'Building..'
              sh'''
                printenv
              '''
            }
        }
        stage('Test') {
          agent { label params.agentName}
          when {
              expression {
                params.name == 'Jay' 
              }
            }
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
          agent { label params.agentName}
          when {
              expression {
                params.name == 'Jayasimha' 
              }
            }
            steps {
                echo 'Deploying....'
            }
        }
    }
}
}
