package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryTest {

	@Test
	public void shouldRegisterMembers() {
		
		// given
		Library library = new Library();
		
		// when
		Member newMember = library.registerMember("Ted");
		
		// then check for member's name to be same
	}

}
