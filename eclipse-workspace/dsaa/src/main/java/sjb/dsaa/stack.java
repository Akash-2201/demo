package sjb.dsaa;

public class stack {
	
private int[] array;
private int size;
private int top;
public stack(int size) {

	this.size = size;
	array=new int[size];
	top=-1;
}
public boolean isFull() {
	return (top==size-1);
	
}
}
