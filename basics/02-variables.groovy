// Declare variables using def
def name = "Groovy";
println name;

// Could lead to problems, prefer def syntax
String otherName = "Grrooovy";
println otherName;

// literal string using single quotes, ignores ${..}
println 'Name is ${name}';

// template literal using double quotes
println "Name is ${name}";

// will work without curly brackets, prefer using them by convention
println "Name is $name";

//variables are constructed from letters, numbers and underscore, can't start with number
_123a = "It can start with underscore";
_123a_ = "-----------------------------------------------------------------------------";

println _123a;
println _123a_;

// Variables are mutable, language is dynamicaly typed
def x = 20;
x = 10;
println x;

// Variables can be instantiated in a group using below syntax
// if no value is provided null is assigned
// types can be provided optionaly or assigned at runtime

def (a, b, Number c, String d) = [30, 40, 50];
println a;
println b;
println c;
println d;