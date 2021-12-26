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
class ValidateRushOrderItemsTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
            "22,true",
            "12,true",
            "20,true",
            "1,false"
    })
	void test(int mediaId, boolean expected) {
		//when
		boolean isValid = placeRushOrderController.validateItems(mediaId);
		//then
		assertEquals(expected, isValid);
	}

}
