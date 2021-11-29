// Arithmetic operators
assert 1 + 2  == 3;
assert 4 - 3  == 1;
assert 3 * 5  == 15;
assert 3 / 2  == 1.5
assert 10 % 3 == 1;
assert 2 ** 3 == 8;
assert 9.intdiv(5) == 1;

//Unary operators
assert +3     == 3;
assert -4     == 0 - 4;
assert -(-1)  == 1;

int i = 10;
println (i++); //10, printed before incrementing
println (++i);
assert i++ == 12;
assert ++i == 14;


def a = 2;
def b = a++ * 3;

assert a==3 && b ==6;

//Assignment arithmetic operatorss
def c = 3;
def d = 0;
d += c;
println d;
assert d == 3;
assert (d %= 3) == 0;
println(d)
assert (d *= 3) == 0;

//Logical operators

assert !false;
assert true && true;
assert false || true;

//Logical not has a higher priority than logical and
assert(!false && false) == false;
assert(!false || false);

//Logical and has higher priority than logical or
assert true || true && false;

// Bitwise operators

int v1 = 20;
int v2 = 25

println Integer.toBinaryString(v1) 
println Integer.toBinaryString(v2)
println (v1 & v2)

// Conditional operators
assert(!true)  == false;
assert(!'foo') == false;
assert (!'')  == true;

def empty = '';
def nonEmpty = 'stuff';

def result = empty ? "Won't go here" : nonEmpty;
assert result == 'stuff';
println result;

//Elvis operator is a shortened ternary operator, usefull as a safeguard

def result2 = nonEmpty ? nonEmpty : "It's Empty";
def elvis = nonEmpty ?: "It's Empty"
