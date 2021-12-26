package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
/**
 * 
 * @author Nguyen Quang Trung 20180188
 *
 */
class ValidateRushOrderInstructionTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
    	"Nha ben canh quan tap hoa,true",
        "Ngo thu 2 ben phai roi re,true",
        "S# abc,false",
        ",false"
    })
	void test(String instruction, boolean expected) {
		//when
		boolean isValid = placeRushOrderController.validateRushOrderInstruction(instruction);
		//then
		assertEquals(expected, isValid);
	}

}
