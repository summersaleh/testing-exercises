package virtualPetShelter;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.Set;

import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void shouldIntakePet() {
//		arrange
		VirtualPet pet = new VirtualPet("hope");
		VirtualPetShelter underTest = new VirtualPetShelter();
//		act
		underTest.intake(pet);
		
//		assert
		Set<VirtualPet> pets = underTest.getPets();
		assertThat(pets, contains(pet));
	}
}
