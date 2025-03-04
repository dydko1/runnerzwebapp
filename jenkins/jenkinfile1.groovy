pipeline {
    agent any
    parameters {
        string(name: 'packageType', defaultValue: 'tu był super Miro', description: 'Type of package to build')
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo "Building package type: ${packageType}"'
            }
        }
    }
}