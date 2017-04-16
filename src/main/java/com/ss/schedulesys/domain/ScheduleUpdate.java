package com.ss.schedulesys.domain;
// Generated Feb 11, 2017 7:27:59 PM by Hibernate Tools 5.0.0.Final

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ScheduleUpdate generated by hbm2java
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "schedule_update", catalog = "schedulesys_db")
public class ScheduleUpdate implements java.io.Serializable {

	private static final long serialVersionUID = -2814404248018116582L;
	
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "scheduleId", column = @Column(name = "schedule_id", nullable = false)),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false)) })
	private ScheduleUpdateId id;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schedule_id", nullable = false, insertable = false, updatable = false,
		foreignKey = @ForeignKey(name = "fk_scheduleupdate_schedule"))
	private Schedule schedule;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false,
		foreignKey = @ForeignKey(name = "fk_scheduleupdate_user"))
	private ScheduleSysUser scheduleSysUser;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date", nullable = false, length = 19)
	private Date updateDate;

}