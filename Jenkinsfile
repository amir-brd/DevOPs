pipeline {

agent any

stages {


stage('Build Artifact - Maven') {
steps {
sh "mvn clean package -DskipTests=true"
archive 'target/*.jar'
}
}
	
	stage ('SonarQaulity') {
		steps {
			
             sh "mvn sonar:sonar  -Dsonar.projectKey=sonardevops -Dsonar.host.url=http://192.168.56.3:9000 -Dsonar.login=admin -Dsonar.password=cherni"
	
		}
	}
	
/*stage('Nexus') {
steps {
//sh 'mvn clean deploy -DskipTests'
sh'mvn clean deploy -Dmaven.test.skip=true -Dresume=false'
}
}  


       stage('Docker Build and Push') {
       steps {
         withDockerRegistry([credentialsId: "docker-hub", url: ""]) {
           sh 'printenv'
           sh 'sudo docker build -t motazmezrani/ci:latest .'
           sh 'docker push motazmezrani/ci:latest '
         }
       }
     }


stage('Docker Compose') {
       steps {
               sh 'docker-compose up --d --force-recreate '
       }
     }
*/

}  

}
