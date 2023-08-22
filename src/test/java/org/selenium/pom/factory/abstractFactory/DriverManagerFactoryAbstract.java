package org.selenium.pom.factory.abstractFactory;

import org.selenium.pom.constants.DriverType;
import org.selenium.pom.factory.ChromeDrivenManger;
import org.selenium.pom.factory.DriverManager;
import org.selenium.pom.factory.FirefoxManager;

public class DriverManagerFactoryAbstract {

    public static DriverManagerAbstract getManager(DriverType driverType) {
        switch (driverType) {
            case CHROME -> {
                return new ChromeDrivenMangerAbstract();
            }
            case FIREFOX -> {
                return new FirefoxManagerAbstract();
            }
            default -> throw new IllegalStateException("No such name of driver: " + driverType);
        }
    }

}
