pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'jdk11'
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}