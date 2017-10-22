start:
	make compile && make run
	
compile:
	javac src/*.java lib/*.java Main.java -d .

run:
	java Main
