pipeline {

agent any
	 environment {
        registry = "fatmabe/DevOPs"
        registryCredential = 'dockerHub'
        dockerImage = ''
    }
stages {
	
stage('Build Artifact - Maven') {
steps {
sh "mvn clean package -Dmaven.test.skip=true"
archive 'target/*.jar'
}
}
	stage("build & SonarQube analysis") {
            steps {
                sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.1.10:9000 -Dsonar.login=admin -Dsonar.password=sonar'
            }
	}
	
          stage('nexus'){
             steps{
                 sh 'mvn deploy -e '

             }
         }
	
            
29
        

	
       
     }
}
