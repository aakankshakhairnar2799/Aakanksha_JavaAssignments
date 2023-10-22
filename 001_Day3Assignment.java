--------------------------------
Developer Code
Name: Aakanksha Khairnar
--------------------------------
/**
 * 
 */
package devpack;

/**
 * @author Developer
 *
 */
public class Pack1 {
private int num;

/**
 * @return the num
 */
public int getNum() {
	return num;
}

/**
 * @param num the num to set
 */
public void setNum(int num) {
	this.num = num;
}

/**
 * @param num
 */
public Pack1(int num) {
	super();
	this.num = num;
}
	
}


*******************************************
/**
 * 
 */
package devpack;

/**
 * @author Developer
 *
 */
public class Pack2 {
 private String s;

/**
 * @param
 */
public Pack2(String s) {
	super();
	this.s = s;
}



/**
 * @param s the s to set
 */
public void setS(String s) {
	this.s = s;
}



/**
 * @return the s
 */
public String getS() {
	return s;
}
	
}
----------------------------------
Client Code
----------------------------------
package javaAssignment;

import devpack.Pack1;
import devpack.Pack2;

public class Client {

	public static void main(String[] args) {
		Pack1 p = new Pack1(3);
	 System.out.println(p.getNum());
	 p.setNum(4);
	 System.out.println(p.getNum());

	 Pack2 p2 = new Pack2("Hello");
	 System.out.println(p2.getS());
	 p2.setS("Hiii");
	 System.out.println(p2.getS());

	}

}

