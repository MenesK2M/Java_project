def call() {
  container('jnlp'){
               git branch: 'dev', url: 'https://github.com/MenesK2M/Java_project.git'
               
               script{
                   COMMIT_ID = sh (
                       script: "git log -n 1 --pretty=format:'%H' | cut -c1-5",
                       returnStdout: true)
               }
           }
}
