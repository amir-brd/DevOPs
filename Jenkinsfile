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
	
	
	stage('Building our image') { 
            steps { 
                script { 
                  dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            } 
        }

        stage('Deploy our image') { 
            steps { 
                script { 
                   docker.withRegistry( '', registryCredential ){ 
                       dockerImage.push() 
                   }
                } 
            }
        }
	stage('Nexus Stage') {
steps {
	
	
sh 'mvn clean deploy -DskipTests'
sh'mvn clean deploy -Dmaven.test.skip=true -Dresume=false'
	
}	
	
}
}   
}
