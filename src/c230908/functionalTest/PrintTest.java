package c230908.functionalTest;

@FunctionalInterface
public interface PrintTest{ //forEach를 구현할 떄 여기서 구현해 가져다 쓴다.
	//혹은 forEach메서드를 가져다 쓴다.
 void print(String name);
 
 public default int test() {
	 return 1;
 }
}
