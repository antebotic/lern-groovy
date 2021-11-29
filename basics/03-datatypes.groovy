/* Types in groovy:

  byte
  short
  int
  long
  float
  double
  char
  Boolean
  string

*/

def separator = "----------------------------------------------------";

println "Byte";
byte b = 10;
println b;
println Byte.MIN_VALUE;
println Byte.MAX_VALUE;
println separator;

println "Short";
short s = 100;
println s;
println Short.MIN_VALUE;
println Short.MAX_VALUE;
println separator

println "Int";
int i = 1000;
println i;
println Integer.MIN_VALUE;
println Integer.MAX_VALUE;
println separator;

println "Long";
long l = 10000;
println l;
println Long.MIN_VALUE;
println Long.MAX_VALUE;
println separator;

println "Float";
float f = 100000.0;
println f;
println Float.MIN_VALUE;
println Float.MAX_VALUE;
println separator;

println "Double";
double d = 1000000.0;
println d;
println Double.MIN_VALUE;
println Double.MAX_VALUE;
println separator;

println 'Char';
char c = 'c';
println c;
println separator;

println "Boolean";
boolean flag = true;
println flag;
println separator;

println "String"
String str = "Groovy"
println str;
println separator;

// using def to instantiate
def num = 10;
println num.getClass().getName() // java.lang.Integer

// casting
def bnum = (byte) num;
println bnum.getClass().getName()