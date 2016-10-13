package com.apress.prodmserver.vehicle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "ID")
	    private Long id;

	    @Column(name = "VEHICLE_NO", length = 20, nullable = false, unique = true)
	    private String vehicleNo;

	    @Column(name = "COLOR", length = 20)
	    private String color;

	    @Column(name = "WHEEL")
	    private int wheel;

	    @Column(name = "SEAT")
	    private int seat;

	    @Column(name = "STATUS", length = 10, nullable = false)
	    private Status status;

		public void setId(Long id) {
			this.id = id;
		}

		public Long getId() {
			return id;
		}

		public void setVehicleNo(String vehicleNo) {
			this.vehicleNo = vehicleNo;
		}

		public String getVehicleNo() {
			return vehicleNo;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		public void setWheel(int wheel) {
			this.wheel = wheel;
		}

		public int getWheel() {
			return wheel;
		}

		public void setSeat(int seat) {
			this.seat = seat;
		}

		public int getSeat() {
			return seat;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public Status getStatus() {
			return status;
		}

}
