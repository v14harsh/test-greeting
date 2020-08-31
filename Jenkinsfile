pipeline {
	agent any 
	stages {
        stage('Build') {
            steps {
                // get code from our Git repository
                // git 'https://github.com/v14harsh/test-greeting.git'
                checkout scm
                def mvnHome = tool 'Maven3'
                sh "'${mvnHome}/bin/mvn' clean build"
            }
        }
        stage ('Unit Testing') {
            steps {
                sh "'${mvnHome}/bin/mvn' clean build"
            }
        }
    }
}
