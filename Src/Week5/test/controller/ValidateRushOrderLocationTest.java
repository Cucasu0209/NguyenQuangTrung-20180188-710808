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
class ValidateRushOrderLocationTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
            "Ha noi,true",
            "Ho Chi Minh,true",
            "Ha,false",
            "S# a,false"
    })
	void test(String cityName, boolean expected) {
		//when
		boolean isValid = placeRushOrderController.validateLocation(cityName);
		//then
		assertEquals(expected, isValid);
	}

}
