package hooks;

import drivers.DriverManager;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class Hooks {

    @Before
    public void  beforeScenario(){
        System.out.println("Hook Iniciado");

        DriverManager.setDriver(
                DriverFactory.createDriver()
        );

        System.out.println("Driver Criado");

        DriverManager.getDriver().get(
                ConfigReader.get("url")
        );
    }

    @After
    public void afterScenario(){
        DriverManager.quitDriver();
    }
}
