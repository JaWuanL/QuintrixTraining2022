import org.testng.annotations.Test;

public class NewTest {

private boolean result;

@Test
  public void equalSameValue() {
	  
	  int x = 4 + 4;
	  int y = 8;
	  
	  
	  result = x == y;
	  
	  	  
	  System.out.println("two values equals same result: " + result);
	  
  }


@Test
public void assertDblEquals() {
	
	  String student = "A";
	  String student2 = "A";
	  
	  
	  result = student == student2;
	  
	  	  
	  System.out.println("two values equals same result: " + result);
	  
 }

@Test
public void canEqualSame() {
	
	String student = "A";
	String student2 = "A";
	
	result = student.equals(student2);
	
	System.out.println("two values equals same result: " + result);
	
 }

@Test
public void usesAnd() {
	
	int x = 8;
	
	boolean y =(x > 7) && (x < 9);
	
	System.out.println(x);
	
	
 }

@Test
public void usesOr() {
	
	int x = 10;
	
	boolean y = (x > 9) || (++x <10);
	
	System.out.println(x);
 }

@Test
public void showsIncrease() {
	
	int x = 5;
	
	System.out.println(++x);
	
	System.out.println(x--);
	
	
 }

@Test
public void makeIncorrect() {
	
	int x = 5;
	
	boolean y = (x != 5);
	
	System.out.println(y);
 }

@Test
public void useIf() {
	
	int x = 4;
	
	if(x > 5) {
		System.out.println("Large number");
	}
	if(x < 5) {
		System.out.println("Use number");
	}
	
 }

@Test
public void useIfElse() {
	
	String mood = null;
	String happy = null;
	
	
	
		
	if(mood != happy) {
		System.out.println("Good mood");		
	}
	else {
		System.out.println("Bad mood");
	}

 }

@Test
public void showsNestedForLoop() {
	
	for(int i = 2; i < 5; ++i) {
		
		for(int j = 3; j > 2; j--)
			
		System.out.println(i + j);
		
		
	}
	
 }



}

