package com.lukashman.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MadCom implements EntryPoint {
	
	private VerticalPanel vp = new VerticalPanel();
	private Button ha = new Button("Hank: Wiki Quote");
	private Button ja = new Button("Jebus: Wiki Quote");
	private Button tr = new Button("Tricky: Wiki Quote");
	private Button au = new Button("Auditor: Wiki Quote");
	
	public void onModuleLoad() {
		vp.add(ha);
		ha.getElement().setId("hav");
		RootPanel.get("vab").add(vp);
		
		
		RootPanel.getBodyElement().setId("bod");
	}
}
