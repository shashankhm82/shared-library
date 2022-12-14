def call (String username = 'null', String designation = 'null'){
    echo "this is shared library greetUser: ${username}"
    pipeline {
        environment {
            USER_NAME = "${username}"
          DESG = "${designation}"
        }
        agent any
        stages {
            stage('SHARED STAGE'){
                steps{
                    echo "hi $USER_NAME, how are you!"
                    echo "Designation: $DESG"
                }
            }
        }
    }
}
