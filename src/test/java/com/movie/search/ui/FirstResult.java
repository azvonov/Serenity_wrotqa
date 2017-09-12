package com.movie.search.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FirstResult {
	
	public static Target theFirstResult(String searchTerm) {
		return Target.the("query: " + searchTerm)
				.locatedBy(".//*[@id='rso']//h3[@class='r']//a[contains(text(), '"+searchTerm+"')]");
	}
}
