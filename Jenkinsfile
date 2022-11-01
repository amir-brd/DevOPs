pipeline {

agent any

stages {


stage('Build Artifact - Maven') {
steps {
sh "mvn clean package -DskipTests=true"
archive 'target/*.jar'
}
}
	
     stage ('SonarQuality') {
		steps {
			
             sh "mvn sonar:sonar -Dsonar.projectKey=Validation -Dsonar.host.url=http://192.168.56.3:9000 -Dsonar.login=e3c6356bd62f71422becec965d75799558682c05"
	
		}
	}
	
	
	
stage('Nexus Stage') {
steps {
	
	script {
		
nexusArtifactUploader artifacts
		
		[
	
	[
		
	artifactId: "achat",
	classifier: "", file: "target/achat.jar", 
	type: "jar",
	]
     ]
	
	
	credentialsId: "nexus",
	groupId: "tn.esprit.rh",
	nexusUrl: "192.168.56.3:8081",
	nexusVersion: "nexus3",
	protocol: "http", 
	repository: "validatioon-release",
	version: "1.0"

/*sh 'mvn clean deploy -DskipTests'*/
/*sh'mvn clean deploy -Dmaven.test.skip=true -Dresume=false'*/
	
	}	
}
}  


       /*stage('Docker Build and Push') {
       steps {
         withDockerRegistry([credentialsId: "docker-hub", url: ""]) {
           sh 'printenv'
           sh 'sudo docker build -t motazmezrani/ci:latest .'
           sh 'docker push motazmezrani/ci:latest '
         }
       }
     }
*/

/*stage('Docker Compose') {
       steps {
               sh 'docker-compose up --d --force-recreate '
       }
     }
*/

}  

}
