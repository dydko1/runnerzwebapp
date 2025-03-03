pipeline {
agent any  
parameters {  
    string(name: 'packageType', defaultValue: 'default Miro1233')
}  
stages {  
    stage('Build') {  
        steps {  
            sh 'echo "Building package type: ${packageType}"'  
        }  
    }  
}  
}