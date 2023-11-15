/**
 * 
 */
package com.jakkulaClasses.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

/**
 * @author Mounika Jakkula S560445
 * Nov 13, 2023
 */
public class Trainer {

	@Id
	private int trainerId;
	private String trainerName;
	private String trainerAddress;
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}
	
	
}
