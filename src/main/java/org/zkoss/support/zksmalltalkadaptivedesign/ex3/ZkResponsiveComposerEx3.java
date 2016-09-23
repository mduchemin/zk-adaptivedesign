package org.zkoss.support.zksmalltalkadaptivedesign.ex3;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.ClientInfoEvent;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Div;
import org.zkoss.zul.Label;

public class ZkResponsiveComposerEx3 extends SelectorComposer<Component> {
	private static final long serialVersionUID = -3633621805909230105L;
	private boolean bigLayout;
	
	@Wire
	private Div main;
	@Wire
	private Div content;
	private Div bigContent;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		bigContent = new Div();
		bigContent.appendChild(new Label("content for large browsers"));
		bigContent.setSclass("box orangeroughy col-md-6 col-lg-6");
		
		comp.addEventListener(Events.ON_CLIENT_INFO, new EventListener<ClientInfoEvent>() {
			public void onEvent(ClientInfoEvent event) throws Exception {
				System.out.println(event.getDesktopWidth());
				if(event.getDesktopWidth()>992 && !bigLayout){
					handleBigLayout();
				}else if(event.getDesktopWidth()<=992 && bigLayout){
					handleSmallLayout();
				}
			}
		});
	}
	
	private void handleBigLayout(){
		bigLayout = true;
		main.removeChild(content);
		main.appendChild(bigContent);
	}

	private void handleSmallLayout(){
		bigLayout = false;
		main.removeChild(bigContent);
		main.appendChild(content);
		
	}

}
