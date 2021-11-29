
try 
{
  int i = 1/0
}
catch(Exception exp) 
{
  println "There was an exception: ${exp.getMessage()}"
  println exp.printStackTrace();
}
////////////////////////////////////////
println "------------------------------"
////////////////////////////////////////
try 
{
  int j = 1/0
}
catch(ArithmeticException exp1){
  println("This will trigger before the superclass Exception, multiple catch blocks can be used")
}
catch(Exception exp) 
{
  println "There was an exception: ${exp.getMessage()}"
  println exp.printStackTrace();
}
finally
{
  pritnln "This code will be reached every time, exception or not"
}