package example;

import java.util.ArrayList;
import java.util.Collection;

public class Library {

	private final Collection<Member> members = new ArrayList<>();

	/**
	 * Registers a new member using provided name.
	 * 
	 * @param name
	 *            The name of the member
	 * @return registered member
	 */
	public Member registerMember(String name) {
		
		Member newMember = new Member(name);
		
		if (members.contains(newMember)) {
			throw new AlreadyMemberException();
		}
		
		members.add(newMember);
		return newMember;
	}

}
