package intTests;
import java.io.File;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

import org.testng.Assert;

public class SeleniumTest {

        @Test

        public void TestTitle1() {


            File src = new File("C:/Users/mgisca/Documents/phantomjs-2.1.1-windows/bin/phantomjs.exe");

            System.setProperty("phantomjs.binary.path", src.getAbsolutePath());

            WebDriver driver = new PhantomJSDriver();

            driver.get("http://192.168.10.16:8080/");

            String title1=driver.getTitle();

            Assert.assertTrue(title1.contains("kins"));



        }

    }
