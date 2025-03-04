pipeline{
    agent any
    parameters{
        choice(name: 'VERSION',  defaultValue: 'cccc', choices: ['aaaa', 'bbbb', 'cccc'], description: 'stages1234')
    }
    stages{
        stage('Build'){
            steps{
                echo "${params.VERSION}"
            }
        }
    }
}