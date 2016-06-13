package example;

import java.util.Collection;
import java.util.HashSet;

public class Library {

	private final Collection<Member> members = new HashSet<>();

	/**
	 * Registers a new member using provided name.
	 * 
	 * @param name
	 *            The name of the member
	 * @return registered member
	 * @throws AlreadyMemberException
	 *             in case member with same name already exists
	 */
	public Member registerMember(String name) {

		Member newMember = new Member(name);

		if (!members.add(newMember)) {
			throw new AlreadyMemberException();
		}

		return newMember;
	}

}
