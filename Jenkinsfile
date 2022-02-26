pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'jdk11'
    }
    stages {
        stage ('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
    }
}