#!/usr/bin/env groovy
def call(Map params){
  def FinalProjectName = "FromSharedLib"
  if (params.projectName != null){
    FinalProjectName = params.projectName
  }
  pipeline{
    agent any
    
    stages{
      stage("First Stage") {
        steps{
          echo FinalProjectName
          echo "Hai Jay"
        }
      }
      stage("Param Condition"){
        steps{
        
          if (params.CustomPath != null){
            echo "CustomPath var is not null"
            echo "Outside dir block -2 "
            sh "pwd"
            dir(params.CustomPath){
              echo "Inside dir block"
              sh '''
                echo " Changed the working directory"
                pwd
                ls -ltrh
              '''
            }
            echo "Outside dir block -2 "
            sh "pwd"
            
          }
          
          else{
            echo "CustomPath var is null"
            sh "pwd"
          }
        
        }
      }
    }
    
  }
}
