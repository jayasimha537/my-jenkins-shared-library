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
              if (${JOB_NAME} == 'test1'){
                echo 'Testing.. tes1project'
              } else if (${JOB_NAME} == 'sidsdsas'){
              echo 'Testing.. otherprject'
              }
            }
            }
        }
        stage('Deploy') {
            steps {
              script {
                if (${JOB_NAME} == 'test1'){
                echo 'Deploying .. tes1project'
              } else if (${JOB_NAME} == 'sidsdsas'){
              echo 'Deploying .. otherprject'
              }
            }
         
            }
        }
    }
}
}
