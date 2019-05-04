package com.cg.TraineeManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@Id
	private int TraineeId;
	private String TraineeName;
	private String TraineeLocation;
	private String TraineeDomain;
	public int getTraineeId() {
		return TraineeId;
	}
	public void setTraineeId(int traineeId) {
		TraineeId = traineeId;
	}
	public String getTraineeName() {
		return TraineeName;
	}
	public void setTraineeName(String traineeName) {
		TraineeName = traineeName;
	}
	public String getTraineeLocation() {
		return TraineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		TraineeLocation = traineeLocation;
	}
	public String getTraineeDomain() {
		return TraineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		TraineeDomain = traineeDomain;
	}
	
}
