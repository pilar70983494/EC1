package edu.idat.dsw1.demosoap;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country spain = new Country();
		spain.setName("Lunes");
		spain.setCapital("Monday");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);

		countries.put(spain.getName(), spain);

		Country poland = new Country();
		poland.setName("Martes");
		poland.setCapital("Tuesday");
		poland.setCurrency(Currency.PLN);
		poland.setPopulation(38186860);

		countries.put(poland.getName(), poland);

		Country uk = new Country();
		uk.setName("Miercoles");
		uk.setCapital("Wednesday");
		uk.setCurrency(Currency.GBP);
		uk.setPopulation(63705000);

		countries.put(uk.getName(), uk);

		Country jueves = new Country();
		jueves.setName("Jueves");
		jueves.setCapital("Thursday");
		jueves.setCurrency(Currency.GBP);
		jueves.setPopulation(63705000);

		countries.put(jueves.getName(), jueves);

		Country viernes = new Country();
		viernes.setName("Viernes");
		viernes.setCapital("Friday ");
		viernes.setCurrency(Currency.GBP);
		viernes.setPopulation(63705000);

		countries.put(viernes.getName(), viernes);

		Country sabado = new Country();
		sabado.setName("Sabado");
		sabado.setCapital("Saturday ");
		sabado.setCurrency(Currency.GBP);
		sabado.setPopulation(63705000);

		countries.put(sabado.getName(), sabado);

		Country domingo = new Country();
		domingo.setName("Domingo");
		domingo.setCapital("Sunday ");
		domingo.setCurrency(Currency.GBP);
		domingo.setPopulation(63705000);

		countries.put(domingo.getName(), domingo);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}