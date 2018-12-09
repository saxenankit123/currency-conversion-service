pipeline{
    agent any

    stages{

        stage('Build'){

            steps{
                sh 'mvn package'
           }

        }
        stage('Create docker image'){

            steps{
       
                sh 'docker build -f Dockerfile-currencyconversion -t saxenankit/currency-conversion-service-image:latest .'
            }

        }

        stage('Push image to registry'){

            steps{
                sh 'docker login --username=saxenankit --password=Hello@123'
                sh 'docker push saxenankit/currency-conversion-service-image:latest '
            }

        }


    }



}