package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
/**
 * 
 * @author Nguyen Qung Trung 20180188
 *
 */
class ValidateReceiveTimeTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
    	"12-12-2021 14:00,true",
        "08/08/2020 14:00,false",
        "08-13-2020 14:00,false",
        "13-12-2021 14:00,true",
        "08-08-2020 23:00,false"
    })
	void test(String time, boolean expected) {
		//when
		boolean isValid = placeRushOrderController.validateReceiveTime(time);
		//then
		assertEquals(expected, isValid);
	}

}
