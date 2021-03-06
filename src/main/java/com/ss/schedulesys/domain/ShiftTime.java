//package com.ss.schedulesys.domain;
//// Generated Feb 11, 2017 7:27:59 PM by Hibernate Tools 5.0.0.Final
//
//import static javax.persistence.FetchType.LAZY;
//import static javax.persistence.GenerationType.IDENTITY;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
///**
// * ShiftTime generated by hbm2java
// */
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "shift_time", catalog = "schedulesys_db", uniqueConstraints = @UniqueConstraint(columnNames = "shift_time"))
//public class ShiftTime implements java.io.Serializable {
//
//	private static final long serialVersionUID = 4825261635409576644L;
//	
//	@Id
//	@GeneratedValue(strategy = IDENTITY)
//	@Column(name = "id", unique = true, nullable = false)
//	private Long id;
//	
//	@Column(name = "shift_time", unique = true, nullable = false, length = 8)
//	private String shiftTime;
//	
//	@JsonIgnore
//	@OneToMany(fetch = LAZY, mappedBy = "shiftStartTime")
//	private Set<Schedule> shiftStartTimeSchedules = new HashSet<Schedule>(0);
//	
//	@JsonIgnore
//	@OneToMany(fetch = LAZY, mappedBy = "shiftEndTime")
//	private Set<Schedule> shiftEndTimeSchedules = new HashSet<Schedule>(0);
//
//}
