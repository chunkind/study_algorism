echo compile starting...

javac -cp ./bin -d ./bin src/util/*.java

#javac -cp ./bin -d ./bin src/study/day01/q01/*.java
#javac -cp ./bin -d ./bin src/study/day01/q02/*.java
#javac -cp ./bin -d ./bin src/study/day01/q03/*.java
#javac -cp ./bin -d ./bin src/study/day01/q04/*.java
#javac -cp ./bin -d ./bin src/study/day01/q05/*.java
#javac -cp ./bin -d ./bin src/study/day01/q06/*.java
#javac -cp ./bin -d ./bin src/study/day01/q07/*.java
#javac -cp ./bin -d ./bin src/study/day01/*.java

#javac -cp ./bin -d ./bin src/study/day02/q01/*.java
#javac -cp ./bin -d ./bin src/study/day02/q02/*.java
#javac -cp ./bin -d ./bin src/study/day02/q03/*.java
#javac -cp ./bin -d ./bin src/study/day02/*.java

javac -cp ./bin -d ./bin src/study/bj/*.java

echo service starting...

#java -cp ./bin study.day01.Start
#java -cp ./bin study.day02.Start
java -cp ./bin study.bj.Start
