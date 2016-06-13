package example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryTest {

	@Test
	public void shouldRegisterMembers() {

		// given
		Library library = new Library();

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
		Library library = new Library();
		library.registerMember("Ted");
		
		// when we register with same name
		library.registerMember("Ted");
		
		// then we should see it fail somehow
	}
}
