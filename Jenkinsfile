pipeline {
    agent any
    tools {
        maven 'Maven 3.8.1'
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