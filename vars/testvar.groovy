def call(map config){
  sh '''
  cat << EOF > pythonfile.py
  print ("""""""")
  print ("var1" + config.var1)
  print ("""""""")
  EOF
  '''
}
