def call(Map params){

  pipeline {
    agent { label params.agentName}

    stages {
        stage('Build') {
          
            steps {
              echo 'Building..'
            }
        }
        stage('Test') {
          
            steps {
              script {
              if (params.projectName == 'test1'){
                echo 'Testing.. tes1project'
              } else if (params.projectName == 'sidsdsas'){
              echo 'Testing.. otherprject'
              }
            }
            }
        }
        stage('Deploy') {
            steps {
              script {
                if (params.projectName == 'test1'){
                echo 'Deploying .. tes1project'
              } else if (params.projectName == 'sidsdsas'){
              echo 'Deploying .. otherprject'
              }
            }
         
            }
        }
    }
}
}
