package s0623;

public class Computer {
    String cpu;
    int ram;
    String board;
    Computer(String cpu, int ram, String board ){
    	this.cpu = cpu;
    	this.ram = ram;
    	this.board = board;
    	
    }
    void printinfo() {
    	System.out.println("CPU : " + cpu);
    	System.out.println("RAM : " + ram + "G");
    	System.out.println("Main Board : " + board);
    }
  }
