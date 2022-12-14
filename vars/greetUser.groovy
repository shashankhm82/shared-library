def call (String username = 'null'){
    echo "this is shared library greetUser: ${username}"
    pipeline {
        environment {
            USER_NAME = "${username}"
        }
        agent any
        stages {
            stage('SHARED STAGE'){
                steps{
                    echo "hi $USER_NAME, how are you!"
                }
            }
        }
    }
}
