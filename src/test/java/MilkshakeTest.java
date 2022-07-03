import com.milkshake.IceCream;
import com.milkshake.Milkshake;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MilkshakeTest {

    @Test (description = "Check if Chocolate Milkshake with Almonds flavor and Chocolate Milkshake with Nuts have the same price", priority = 10)
    public void verifyIfChocolateMilkshakeWithAlmonsHasTheSamePriceAsChocolateMilkshakeWithNuts(){
        int actualResult = Milkshake.chocolateMilkshakeWithAlmonds();
        int expectedResult= Milkshake.chocolateMilkshakeWithNuts();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test (description = "Check if Chocolate Milkshake with Almonds and Chocolate Milkshake with Caramel sauce do not have the same price", priority = 20)
    public void verifyIfChocolateMilkshakeWithAlmonsHasNotTheSamePriceAsChocolateMilkshakeWithCaramelSauce() {
        Assert.assertNotEquals(Milkshake.chocolateMilkshakeWithAlmonds(), Milkshake.chocolateMilkshakeWithCaramelSauce());
    }

    @Test (description = "Check if the Chocolate Milkshake with Caramel is not empty", priority = 30)
    public void verifyIfChocolateMilkshakeWithCaramelSauceHasValue() {
        Assert.assertNotNull(Milkshake.chocolateMilkshakeWithCaramelSauce());
    }

    @Test (description = "•\tCheck if Chocolate Milkshake with Almonds flavor and Chocolate Milkshake with Pistachios have got the same price", priority = 40)
    public void verifyIfChocolateMilkshakeWithAlmonsHasTheSamePriceAsChocolateMilkshakeWithPistachios(){
        int actualResult = Milkshake.chocolateMilkshakeWithAlmonds();
        int expectedResult= Milkshake.chocolateMilkshakeWithPistachios();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test (description = "Check the object", priority = 50)
    public void checkTheObject(){
        IceCream chocolateIceCream = null;
        Assert.assertNull(chocolateIceCream);

        IceCream vanillaIceCream= new IceCream();
        Assert.assertNotNull(vanillaIceCream);
    }
}
