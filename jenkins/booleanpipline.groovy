pipeline {
    agent any
    parameters {
        booleanParam(name: 'INCLUDE_DEBUG', defaultValue: false, description: 'Include debug information in the deployment')
    }
    stages {
        stage('Build') {
            steps {
                script {
                    if (INCLUDE_DEBUG) {
                        echo 'Debug information will be included in the deployment. false 11'
                        // Add steps to include debug information
                    } else {
                        echo 'Debug information will NOT be included in the deployment. true 22'
                        // Proceed without debug information
                    }
                }
            }
        }
    }
}