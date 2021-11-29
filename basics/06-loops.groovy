// for
def separator = "--------------------------------------------"
for (int i=1; i<5; i++) {
  println i
}

println(separator)
def j = 1;
for(j; j < 5; ++j) {
  println j
}

// for in
println(separator)
for ( a in 1..5){
  println a;
}

println(separator)
20.upto(25)
{
  println "$it"
}

println(separator)
9.times { println "$it"} 

println(separator)
1.step(10, 2) { println "$it"}

//iterate over array
println(separator)
for (i in [0, 1, 2, 3, 4, 5, 6, 7]){
  println i;
}

//iterate over map
println(separator)
def map = ['abc': 1, 'def': 2, 'xyz': 3]
x = 0;

for ( e in map ){
  println e;
  x += e.value
  println x;
}

println(separator)
int k = 1;
while (k < 5){
  println k;
  k++
}
