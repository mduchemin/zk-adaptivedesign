package org.zkoss.support.zksmalltalkadaptivedesign.ex2;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.ClientInfoEvent;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Div;

public class ZkResponsiveComposer extends SelectorComposer<Component> {
	private static final long serialVersionUID = -3633621805909230105L;
	private boolean bigLayout;
	
	@Wire
	private Div content;
	@Wire
	private Div menuitem2;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
		comp.addEventListener(Events.ON_CLIENT_INFO, new EventListener<ClientInfoEvent>() {
			public void onEvent(ClientInfoEvent event) throws Exception {
				System.out.println(event.getDesktopWidth());
				if(event.getDesktopWidth()>800 && !bigLayout){
					handleBigLayout();
				}else if(event.getDesktopWidth()<=800 && bigLayout){
					handleSmallLayout();
				}
			}
		});
	}
	
	private void handleBigLayout(){
		bigLayout = true;
		content.setHflex("4");
		menuitem2.setHflex("2");
				
	}

	private void handleSmallLayout(){
		bigLayout = false;
		content.setHflex("1");
		menuitem2.setHflex("1");
	}

}
