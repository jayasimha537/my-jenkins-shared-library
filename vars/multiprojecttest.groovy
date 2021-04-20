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
          
            steps {
              if (params.name == 'Jay'){
                echo 'Testing.. Jay'
              } else if (params.name == 'Jayasimha'){
              echo 'Testing.. Jayasimha'
              }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
}
