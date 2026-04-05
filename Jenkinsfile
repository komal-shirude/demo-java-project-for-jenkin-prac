pipeline {
    agent any

    tools {
        maven 'maven'      // configure in Jenkins (Global Tool Config)
        jdk 'java21'        // or JDK17/21 based on your setup
    }

    environment {
        TOMCAT_HOME = "C:\\Users\\Admin\\Downloads\\apache-tomcat-9.0.113-windows-x64\\apache-tomcat-9.0.113"
        WAR_NAME = "demo-java-0.0.1-SNAPSHOT"
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/komal-shirude/demo-java-project-for-jenkin-prac.git'
            }
        }

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

        stage('Deploy to Tomcat') {
            steps {
                bat '''
                echo ==============================
                echo Stopping Tomcat...
                call "%TOMCAT_HOME%\\bin\\shutdown.bat"

                timeout /t 5

                echo ==============================
                echo Removing old deployment...
                del /Q "%TOMCAT_HOME%\\webapps\\%WAR_NAME%*"

                echo ==============================
                echo Copying new WAR file...
                copy /Y target\\*.war "%TOMCAT_HOME%\\webapps\\"

                echo ==============================
                echo Starting Tomcat...
                call "%TOMCAT_HOME%\\bin\\startup.bat"

                echo ==============================
                echo Deployment Completed!
                '''
            }
        }
    }

    post {
        success {
            echo '✅ Build & Deployment Successful!'
        }
        failure {
            echo '❌ Build Failed!'
        }
    }
}
