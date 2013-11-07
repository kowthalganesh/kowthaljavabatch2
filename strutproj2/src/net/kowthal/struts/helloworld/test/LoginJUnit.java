package net.kowthal.struts.helloworld.test;

import static org.junit.Assert.*;
import static junit.framework.Assert.*;

import org.junit.Test;

import net.kowthal.struts.helloworld.action.LoginAction;
import net.kowthal.struts.helloworld.form.LoginForm;
public class LoginJUnit {

	@Test
	public void test() {
		   String concatenated =LoginForm.con("kowthal","ofs");
        assertEquals("kowthal,ofs",concatenated);
	
	}

}



