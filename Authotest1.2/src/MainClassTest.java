import org.junit.Test;

public class MainClassTest {
    MainClass Main = new MainClass();
    @Test
    public void testGetClassNumber(){
    int x = Main.getClassNumber();
    if (x > 45) {
        System.out.println("Correct");
    } else {
        System.out.println("Invalid number: " + x);
    }

    }
}
