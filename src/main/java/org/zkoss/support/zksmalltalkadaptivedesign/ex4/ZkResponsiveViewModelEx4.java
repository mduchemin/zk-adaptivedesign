package org.zkoss.support.zksmalltalkadaptivedesign.ex4;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.MatchMedia;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.support.zksmalltalkadaptivedesign.model.PersonBean;
import org.zkoss.support.zksmalltalkadaptivedesign.utils.PersonUtils;
import org.zkoss.zul.ListModelList;

public class ZkResponsiveViewModelEx4 {

	public static final String SMALL_TEMPLATE = "smallTemplate";
	public static final String LARGE_TEMPLATE = "largeTemplate";
	private String currentTemplate;
	private ListModelList<PersonBean> myModel;
	
	@Init
	public void init(){
		myModel = PersonUtils.generatePeople();
	}
	
	@MatchMedia("all and (min-width: 800px)")
	@NotifyChange("currentTemplate")
	public void handleLarge(){
		currentTemplate = LARGE_TEMPLATE;
	}

	@MatchMedia("all and (max-width: 800px)")
	@NotifyChange("currentTemplate")
	public void handleSmall(){
		currentTemplate = SMALL_TEMPLATE;
		
	}

	public String getCurrentTemplate() {
		return currentTemplate;
	}

	public void setCurrentTemplate(String currentTemplate) {
		this.currentTemplate = currentTemplate;
	}

	public ListModelList<PersonBean> getMyModel() {
		return myModel;
	}

	public void setMyModel(ListModelList<PersonBean> myModel) {
		this.myModel = myModel;
	}
	
}
