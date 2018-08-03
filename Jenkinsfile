pipeline {
	agent any

	tools {
		gradle "Gradle 3.5"
	}

	stages {
		stage('Checkout Repository') {
			steps {
				sh 'ls -la'
			}
		}
		stage('Testing') {
			steps {
				sh 'gradle clean test'
			}
		}
		stage('Build') {
			steps {
				sh 'gradle build'
			}
		}
    stage('Deploy to DEVELOP'){
      steps {
        echo 'Deploying to Develop...'
      }
    }
    stage('Deploy to QA'){
      steps {
        echo 'Deploying to QA...'
      }
    }
    stage('Deploy to PROD'){
      steps {
        echo 'Deploying to Prod...'
      }
    }
	}
}
