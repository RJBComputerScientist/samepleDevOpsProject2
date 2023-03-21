pipeline{
	agent any
	stages{
		stage('git clone'){
			steps{
				git branch: 'main', url: 'https://github.com/RJBComputerScientist/sampleDevOpsProject2.git'
			}
		}
		stage('Maven Test'){
			steps{
				sh 'mvn test'
			}
		}
		stage('Maven Build'){
			steps{
				sh 'mvn package'
			}
		}
		stage('Maven Deploy'){
			steps{
				echo 'Deploying the war file to the server'
			}
		}

	}
}
