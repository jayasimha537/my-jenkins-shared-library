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
    }
    
  }
}
