import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal implements Comparable<Dog>{
	String name;
	int num_of_legs;
	Dog(String name, int num_of_legs){
		this.name = name;
		this.num_of_legs = num_of_legs;
	}
	public String toString() {
		return name + "|" + num_of_legs;
	}
//	static final Comparator<Dog> Collections = new Comparator<Dog>(){
//			public int compare(Dog dog1, Dog dog2) {
//				return dog1.num_of_legs - dog2.num_of_legs;
//			}
//	};
	public int getLegs() {
		return num_of_legs;
	}
	public String getName() {
		return name;
	}
    public int compareTo(Dog dog2){
//	    System.out.printf("This:%s|%d  and Dog2:%s|%d\n", this.getName(), this.getLegs(), dog2.getName(), dog2.getLegs());
    	String name1 = this.getName().toUpperCase();
    	String name2 = dog2.getName().toUpperCase();
        return name1.compareTo(name2);
    }
}
