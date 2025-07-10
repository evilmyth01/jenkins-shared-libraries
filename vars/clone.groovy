def call(String url, String branch){
  echo "cloning the code here"
  git url: "${url}", branch: "${branch}"
  echo "Code cloning successful"
}
