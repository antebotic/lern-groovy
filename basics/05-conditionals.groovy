def num = 18;

if(num == 19) {
  println "number is 19"
} else {
  println "number is not 19"
}

if (num ==18)
  println "number is 18"
else
  println "number is not 18"


def x = 10;
def result = '';

switch (x) {
  case 0:
    results = "x is 0";
    break;
  case {x > 0}:
    result = "x is positive";
    break;
  case { x < 0}:
    result = "x is negative";
    break;
  default:
    result = "Invalid number"; 
};

println(result)