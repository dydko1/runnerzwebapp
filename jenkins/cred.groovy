pipeline {
    agent any
    parameters {
        credentials(name: 'DEPLOY_KEY', description: 'SSH key for deployment')
    }
    stages {
        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: 'DEPLOY_KEY', keyFileVariable: 'SSH_KEY')]) {
                    sh 'ssh -i $SSH_KEY user@server "deploy-script.sh"'
                }
            }
        }
    }
}