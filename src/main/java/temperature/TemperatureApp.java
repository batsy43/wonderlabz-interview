package temperature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import temperature.config.TemperatureAppConfig;
import temperature.model.Temperature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class TemperatureApp {

    public static void main(String[] args) {
        SpringApplication.run(TemperatureAppConfig.class, args);


    }

}
