pipeline{
    agent any

    stages{

        stage('Build'){

            steps{
                bat 'mvn clean package'

                bat 'docker build -f Dockerfile-currencyconversion -t saxenankit/currency-conversion-service-image: .'


            }

        }
        stage('Create docker image'){

            steps{
                bat 'docker build -f Dockerfile-currencyconversion -t saxenankit/currency-conversion-service-image:${env.BUILD_ID} .'
            }

        }

        stage('Push image to registry'){

            steps{
                bat 'docker push saxenankit/currency-conversion-service-image:${env.BUILD_ID} '
            }

        }


    }



}