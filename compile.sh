#export LANG;LANG=ko

echo compile starting...
#javac -cp ./bin -d ./bin src/practice/chap01/Q15.java
#javac -encoding utf-8 -cp ./bin -d ./bin src/chap01/*.java
javac -encoding utf-8 -cp ./bin -d ./bin src/chap02/*.java
#javac -cp ./bin -d ./bin src/day02/P3046.java

#javac -encoding utf-8 -cp ./bin -d ./bin src/main/Start.java

echo service starting...
#java -cp ./bin main/Start
#java -cp ./bin chap02.ReverseArray
#java -cp ./bin day02.P3046
java -cp ./bin -d ./bin char02.CardConvRev
