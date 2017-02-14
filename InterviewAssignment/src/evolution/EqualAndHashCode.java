package evolution;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EqualAndHashCode {
	private String id;
	
	@Override// You can override the hashCode() method.
	public int hashCode() {
		return id.hashCode() + 20;// When the ids are the same, the hash code should also be the same.
	}
	
	@Override// You can override the equals() method.
	public boolean equals(Object object) {
		if (object instanceof EqualAndHashCode) {
			EqualAndHashCode equalAndHashCode = (EqualAndHashCode) object;
			if (this.id.equals(equalAndHashCode.getId())) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		EqualAndHashCode obj0 = new EqualAndHashCode("ufo");
		EqualAndHashCode obj1 = new EqualAndHashCode("ufo");
		System.out.println(obj0.equals(obj1));
	}
}
