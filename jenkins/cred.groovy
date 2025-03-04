pipeline {
    agent any
    parameters {
        password(name: 'API_TOKEN', description: 'Enter the API token for the external service')
    }
    stages {
        stage('Call API') {
            steps {
                script {
                    def apiToken = params.API_TOKEN
                    sh "curl -H 'Authorization: Bearer ${apiToken}' https://api.example.com/data"
                }
            }
        }
    }
}