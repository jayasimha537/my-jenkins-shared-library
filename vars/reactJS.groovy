#!/usr/bin/env groovy
def call(Map params){
  pipeline{
    agent any
    
    stages{
      stage("First Stage") {
        steps{
          echo params.projectName
          echo "Hai Jay"
        }
      }
    }
    
  }
}
