package example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LibraryTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

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

		// fail when we register with same name
		thrown.expect(AlreadyMemberException.class);
		library.registerMember("Ted");

	}
}
