package com.qa.main;

public class Turtle {
	int age;
	int type;
	boolean shell; //True means has a shell
	String turtColor;
	String turtName;
	int food;
	
	public void eat(int amount) {
		for (int i = 0; i <= amount; i++) {
			System.out.println("I have ate food");
			food--;
		}
		System.out.println("Yum yum that food was good, I ate " + amount + " much food");
	}
	public void whoAmI() { //Would do this as a public string, but for this example all void
		System.out.println(this.turtName + this.turtColor);
	}
	
	public Boolean haveShell() {
		return shell;
	}
	}
	
	
	
}
