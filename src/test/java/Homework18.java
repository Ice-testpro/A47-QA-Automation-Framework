import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homework18 extends BaseTest{
    @Test
    public void playSong(){
        provideEmail("irene.perdon@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }
    public void clickPlay(){
        WebElement playNextButton = driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
        WebElement playButton = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));

         playNextButton.click();
         playButton.click();
    }
    public boolean isSongPlaying(){
        WebElement soundBar = driver.findElement(By.xpath("//div[@class='soundbars'][1]"));
        return soundBar.isDisplayed();
    }

}
