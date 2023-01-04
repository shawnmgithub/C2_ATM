Atm.class: Atm.java User.class Saving.class Checking.class 
	javac -g Atm.java
User.class: User.java
	javac -g User.java
Saving.class: Saving.java
	javac -g Saving.class
Checking.class: Checking.java
	javac -g Checking.java
run: Atm.class
	java Atm
clean:
	rm *.class
