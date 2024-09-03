import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void befourAll(){
        System.out.println("###  BeforeAll\n" );
    }

 @BeforeEach
 void beforeEach(){
     System.out.println("###   beforeEach()");
     result = getResult();
 }

    @AfterEach
    void afterEach(){
        System.out.println("###   afterEach()\n");
        result = 0;
    }


    @Test
     void firstTest() {
        System.out.println("###    firstTest");
        Assertions.assertTrue(result>2);
    }



    @Test
    void secondTest() {
        System.out.println("###    secondTest");
        Assertions.assertTrue(result>2);
    }

    @Test
    void thirdTest() {
        int result = getResult();
        System.out.println("###    thirdTest");
        Assertions.assertTrue(result>2);
    }
    private int getResult() {
        return 3;
}
}
