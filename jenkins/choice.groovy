pipeline{
    agent any
    parameters{
        choice(name: 'VERSION', choices: ['aaaa', 'bbbb', 'cccc'], description: 'stages1234')
    }
    stages{
        stage('Build'){
            steps{
                echo "${VERSION}"
            }
        }
    }
}