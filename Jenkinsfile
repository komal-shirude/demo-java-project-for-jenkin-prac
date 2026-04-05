pipeline {
    agent any

    tools {
        jdk 'java21'
        maven 'maven'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy step (you can improve later)'
            }
        }
    }
}
