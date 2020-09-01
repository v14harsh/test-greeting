pipeline {
	agent any
	tools {
        	maven 'Maven3'
        	jdk 'jdk1.8'
    	}
	stages {
        stage('Build') {
            steps {
                // get code from our Git repository
                // git 'https://github.com/v14harsh/test-greeting.git'
                checkout scm;
                sh "'${maven}/bin/mvn' clean build";
            }
        }
        stage ('Unit Testing') {
            steps {
                sh "'${mvnHome}/bin/mvn' test";
            }
        }
    }
}
