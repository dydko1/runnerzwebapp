pipeline {
agent any  
parameters {  
    string(name: 'packageType', defaultValue: 'default', description: 'Type of package to build Miro')
}  
stages {  
    stage('Build') {  
        steps {  
            sh 'echo "Building package type: ${packageType}"'  
        }  
    }  
}  
}