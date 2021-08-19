package temperature;

import org.springframework.boot.CommandLineRunner;
import temperature.model.Temperature;

import java.util.*;

public class TemperatureRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        List<Temperature> items = new ArrayList<>();
        items.add(new Temperature(16.3));
        items.add(new Temperature(17.0));
        items.add(new Temperature(23.3));
        items.add(new Temperature(15.0));

        items.sort(Comparator.comparing(Temperature::getCelsiusTemp));

        if((items.size())%2==0)
        {
            int middleIndex = items.size()/2;

            double median = ((items.get(middleIndex-1).getCelsiusTemp())+(items.get(middleIndex).getCelsiusTemp()))/2;

            System.out.println(median);
        }
        else
        {
            int middleIndex = items.size()/2;
            double median = items.get(middleIndex).getCelsiusTemp();

            System.out.println(median);
        }

        items.forEach(temperature -> System.out.println(temperature.getCelsiusTemp()));


    }

}
