def call(Map params){

  pipeline {
    agent { label params.agentName}

    stages {
        stage('Build') {
          
            steps {
              echo 'Building..'
              sh'''
                printenv
              '''
            }
        }
        stage('Test') {
          
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
