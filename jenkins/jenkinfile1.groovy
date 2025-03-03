pipeline {
agent any  
parameters {  
    string(name: 'packageType', defaultValue: 'default tu był mirrorororro')
}  
stages {  
    stage('Build') {  
        steps {  
            sh 'echo "Building package type: ${packageType}"'  
        }  
    }  
}  
}