package org.zkoss.support.zksmalltalkadaptivedesign.utils;

import org.zkoss.support.zksmalltalkadaptivedesign.model.PersonBean;
import org.zkoss.zul.ListModelList;

public class PersonUtils {

	public static ListModelList<PersonBean> generatePeople(){
		ListModelList<PersonBean> people = new ListModelList<PersonBean>();
		people.add(new PersonBean(1,"Amanda","Nelson","Dental Hygienist",false));
		people.add(new PersonBean(2,"Martha","Chapman","General Manager",true));
		people.add(new PersonBean(3,"Joshua","Rogers","Geological Engineer",true));
		people.add(new PersonBean(4,"Jessica","Lewis","Geological Engineer",true));
		people.add(new PersonBean(5,"Joseph","Parker","Human Resources Manager",true));
		people.add(new PersonBean(6,"Bonnie","Gonzalez","Account Representative III",false));
		people.add(new PersonBean(7,"Ann","Flores","Community Outreach Specialist",false));
		people.add(new PersonBean(8,"Philip","Davis","Financial Advisor",true));
		people.add(new PersonBean(9,"Jennifer","Cook","Senior Sales Associate",false));
		people.add(new PersonBean(10,"Willie","Cole","Senior Financial Analyst",true));
		people.add(new PersonBean(11,"Robert","Johnston","Chief Design Engineer",false));
		people.add(new PersonBean(12,"Matthew","Lane","Nuclear Power Engineer",false));
		people.add(new PersonBean(13,"Phillip","Gordon","Media Manager III",true));
		people.add(new PersonBean(14,"Marilyn","Stanley","Biostatistician IV",true));
		people.add(new PersonBean(15,"Kathleen","Romero","Nurse Practicioner",false));
		people.add(new PersonBean(16,"Carol","Foster","Staff Scientist",false));
		people.add(new PersonBean(17,"Nancy","Carr","Civil Engineer",true));
		people.add(new PersonBean(18,"Teresa","Butler","Cost Accountant",true));
		people.add(new PersonBean(19,"Todd","Hunt","Assistant Media Planner",false));
		people.add(new PersonBean(20,"Doris","Miller","Professor",false));
		return people;
	}
		
}
