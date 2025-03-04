pipeline {
    agent any
    parameters {
        string(name: 'packageType', defaultValue: 'default', description: 'Type of package to build')
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo "Building package type: ${packageType}" abc'
            }
        }
    }

    stages {
        stage('Build2') {
            steps {
                sh 'echo "Building package type: ${packageType}" def'
            }
        }
    }
}