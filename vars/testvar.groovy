def call(Map config){
  def var1 = config.var1
  printenv
  sh '''
  cat << EOF > pythonfile.py
print ("""""""")
print ("var1 : " + ${var1})
print ("""""""")
EOF
  python pythonfile.py
  '''
}
