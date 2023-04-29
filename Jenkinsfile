pipeline {
    agent any

    stages {
        
        
        stage('Step1-Build') {
            steps {
                echo 'Build'
                build 'SampleBuild'
            }
        }
        
        stage('Step2-Deploy') {
            steps {
                echo 'Deploy'
                build 'SampleDeploy'
            }
        }
        
        stage('Step3-Test') {
            steps {
                echo 'Test'
                build 'SampleTest'
            }
        }
        
        stage('Step4-Release') {
            steps {
                echo 'Release'
                build 'SampleRelease'
            }
        }
          
    }
}
