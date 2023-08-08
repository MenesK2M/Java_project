def call() {
  container('jnlp'){
    git branch: 'main', url: 'https://github.com/MenesK2M/Java_project.git'
  }
}
