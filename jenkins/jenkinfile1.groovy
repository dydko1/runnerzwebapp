pipeline {
    agent any
    tools {
        maven 'apache-maven-3.9.x'
    }
    stages {
        stage('Example') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}