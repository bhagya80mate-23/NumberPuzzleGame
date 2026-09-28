pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Getting code from GitHub...'
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java program...'

                bat '''
                    if not exist build mkdir build
                    javac -d build src\\NumberGuessingGame.java
                '''
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'

                bat '''
                    javac -cp build -d build test\\NumberGuessingGameTest.java
                    java -cp build NumberGuessingGameTest
                '''
            }
        }

        stage('Build Complete') {
            steps {
                echo 'Number Guessing Game build completed successfully!'
            }
        }
    }

    post {

        success {
            echo 'BUILD SUCCESSFUL!'
        }

        failure {
            echo 'BUILD FAILED!'
        }
    }
}
