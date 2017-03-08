package com.lukashman;

import com.lukashman.client.MadComTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MadComSuite extends GWTTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Tests for MadCom");
		suite.addTestSuite(MadComTest.class);
		return suite;
	}
}
