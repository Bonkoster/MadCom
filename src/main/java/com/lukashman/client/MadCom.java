package com.lukashman.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MadCom implements EntryPoint {
	
	private Button ha = new Button("Hank: Wiki Quote");
	private Button ja = new Button("Jebus: Wiki Quote");
	private Button tr = new Button("Tricky: Wiki Quote");
	private Button au = new Button("Auditor: Wiki Quote");
	
	
	
	public void onModuleLoad() {
		setAll();
		RootPanel.getBodyElement().setId("bod");
	}
	
	public void setAll(){
		Button[] buts = {ha,ja,tr,au};
		String[] di = {"vab","vac","vax","vaz"};
		
		for(int i=0;i<=3;i++){
			buts[i].getElement().setId("hav");
			RootPanel.get(di[i]).add(buts[i]);
		}
	}
}
