echo compile starting...
javac -cp ./bin -d ./bin src/util/*.java

#javac -cp ./bin -d ./bin src/study/day02/q01/*.java
#javac -cp ./bin -d ./bin src/study/day02/q02/*.java
#javac -cp ./bin -d ./bin src/study/day02/q03/*.java
#javac -cp ./bin -d ./bin src/study/day02/*.java

#javac -cp ./bin -d ./bin src/study/day03/q01/*.java
#javac -cp ./bin -d ./bin src/study/day03/q02/*.java
#javac -cp ./bin -d ./bin src/study/day03/*.java


javac -cp ./bin -d ./bin src/study/day04/q01/*.java
javac -cp ./bin -d ./bin src/study/day04/*.java

echo service starting...
#java -cp ./bin study.day02.Start
#java -cp ./bin study.day03.Start
java -cp ./bin study.day04.Start
