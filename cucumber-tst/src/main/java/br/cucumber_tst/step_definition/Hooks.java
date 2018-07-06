package br.cucumber_tst.step_definition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import br.cucumber_tst.factory.WrapperFactory;

public class Hooks {

	@Before
	public void beforeScenario() {
		System.out.println("INICIANDO TESTE");
		WrapperFactory.Init();
	}

	@After
	public void afterScenario() {
		System.out.println("FINALIZANDO TESTE");
		WrapperFactory.quit();
	}

}
