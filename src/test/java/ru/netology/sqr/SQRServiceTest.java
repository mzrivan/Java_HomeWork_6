package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/SQR.csv")
    public void SQRtest(int start, int ending, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(start, ending);

        Assertions.assertEquals(actual, expected);
    }

}
