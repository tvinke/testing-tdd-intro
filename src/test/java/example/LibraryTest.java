package example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	
	private Library library;

	@Before
	public void setUp() {
		library = new Library();
	}

	@Test
	public void shouldRegisterMembers() {

		// when
		Member newMember1 = library.registerMember("Ted");
		Member newMember2 = library.registerMember("Bob");		

		// then
		assertThat(newMember1.getName(), is(equalTo("Ted")));
		assertThat(newMember2.getName(), is(equalTo("Bob")));
	}

	@Test
	public void shouldNotRegisterAgainWhenAlreadyMember() {
		
		// given
		library.registerMember("Ted");
		
		// when we register with same name
		try {
			library.registerMember("Ted");
			fail("should not have registered Ted twice");
		} catch (AlreadyMemberException e) {
			// success!
		}
		
	}
}
