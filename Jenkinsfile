pipeline {
    agent any

    environment {
        IMAGE_NAME = 'devz-automobile:latest'
        CONTAINER_NAME = 'devz-automobile'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build Image') {
            steps {
                sh 'sudo docker build -t ${IMAGE_NAME} .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'sudo docker rm -f ${CONTAINER_NAME} || true'
                sh 'sudo docker run -d --name ${CONTAINER_NAME} -p 8080:8080 ${IMAGE_NAME}'
            }
        }
    }
}