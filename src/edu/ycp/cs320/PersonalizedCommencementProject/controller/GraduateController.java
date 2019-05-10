package edu.ycp.cs320.PersonalizedCommencementProject.controller;

import edu.ycp.cs320.PersonalizedCommencementProject.databaseModel.Advisor;
import edu.ycp.cs320.PersonalizedCommencementProject.databaseModel.ContentComponent;
import edu.ycp.cs320.PersonalizedCommencementProject.databaseModel.Graduate;
import edu.ycp.cs320.PersonalizedCommencementProject.databaseModel.InfoState;
import edu.ycp.cs320.PersonalizedCommencementProject.persist.DatabaseProvider;
import edu.ycp.cs320.PersonalizedCommencementProject.persist.DerbyDatabase;
import edu.ycp.cs320.PersonalizedCommencementProject.persist.IDatabase;

// Graduate controller class
public class GraduateController extends UserController{
	IDatabase db = null;
	private Graduate model;
	
	
	public GraduateController() {
		// creates DB instance
		DatabaseProvider.setInstance(new DerbyDatabase());
		db = DatabaseProvider.getInstance();
	}
	
	public void setModel(Graduate model) {
		this.model = model;
	}

	public void insertGraduateMediaIntoContentComponentTable(String username, String string, ContentComponent content) {
		db.insertGraduateMediaIntoContentComponentTable(username, string, content);
	}

	public void setInfoAtIndex(int index, ContentComponent content) {
		model.getPendingInfo().setContentAtIndex(index, content);
	}
	
	
}
