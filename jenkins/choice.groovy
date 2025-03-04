pipeline{
    agent any
    parameters{
        choice(name: 'VERSION', choices: ['aaaa', 'bbbb', 'cccc'], description: 'stages123456')
    }
    stages{
        stage('Build'){
            steps{
                echo "${VERSION}"
            }
        }
    }
}