pipeline{
    agent any

    stages{

        stage('Build'){

            steps{
                sh 'mvn clean package'

                sh 'docker build -f Dockerfile-currencyconversion -t saxenankit/currency-conversion-service-image: .'


            }

        }
        stage('Create docker image'){

            steps{
                sh 'docker build -f Dockerfile-currencyconversion -t saxenankit/currency-conversion-service-image:${env.BUILD_ID} .'
            }

        }

        stage('Push image to registry'){

            steps{
                sh 'docker push saxenankit/currency-conversion-service-image:${env.BUILD_ID} '
            }

        }


    }



}