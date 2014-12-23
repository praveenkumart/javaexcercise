package com.imrokraft.sample;

public class Checkvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Student soffin=new Student(1,"soffin","mtech");
		System.out.println(soffin.getRollno());
		System.out.println(soffin.getName());
		System.out.println(soffin.getBatch());
		soffin.setName("Soffin");
		System.out.println(soffin.getName());*/
		System.out.println("---------------------");
		System.out.println("UnderGraduate student");
		System.out.println("---------------------");
		Undergraduate ug=new Undergraduate(1, "praveen", "ece",50000,2015,"Ece");
		System.out.println(ug.getRollno());
		System.out.println(ug.getName());
		System.out.println(ug.getFee());
		System.out.println(ug.getDepartment());
		System.out.println("---------------------");
		System.out.println("PostGraduate student");
		System.out.println("---------------------");
		Postgraduate pg=new Postgraduate(2, "vipin", "s4", 70000, "mtech", "vlsi");
		System.out.println(pg.getRollno());
		System.out.println(pg.getName());
		System.out.println(pg.department);
		System.out.println(pg.specialised_topic);
		System.out.println("---------------------");
		System.out.println("Phd student");
		System.out.println("---------------------");
		Phd pd=new Phd(3, "Anil", "iitmadras", "optoelctronics", 2500000, 3);
		System.out.println(pd.getRollno());
		System.out.println(pd.name);
		System.out.println(pd.thesis);
		System.out.println(pd.duration);
	}

}
