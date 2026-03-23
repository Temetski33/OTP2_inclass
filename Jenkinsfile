pipeline {
    agent any

    tools {
        maven 'Maven3'
    }



    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Temetski33/OTP2_inclass.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Generate Report') {
            steps {
                bat 'mvn jacoco:report'
            }
        }


        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }





    }
}