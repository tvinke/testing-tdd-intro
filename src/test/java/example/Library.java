package example;

public class Library {

	/**
	 * Registers a new member using provided name.
	 * 
	 * @param name
	 *            The name of the member
	 * @return registered member
	 */
	public Member registerMember(String name) {
		return new Member(name);
	}

}
