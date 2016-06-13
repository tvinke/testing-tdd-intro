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
		Member newMember = library.registerMember("Ted");

		// then
		assertThat(newMember.getName(), is(equalTo("Ted")));
	}

}
