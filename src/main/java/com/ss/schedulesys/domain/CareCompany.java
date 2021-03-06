package com.ss.schedulesys.domain;
// Generated Feb 11, 2017 7:27:59 PM by Hibernate Tools 5.0.0.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * CareCompany generated by hbm2java
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"companyContacts", "schedules"})
@EqualsAndHashCode(exclude = {"companyContacts", "schedules"})
@Table(name = "care_company", catalog = "schedulesys_db", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class CareCompany implements java.io.Serializable {

	private static final long serialVersionUID = 1041669434223222143L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "type_id", nullable = false, foreignKey = @ForeignKey(name = "fk_carecompany_type"))
	private CareCompanyType careCompanyType;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "insurance_company_id", foreignKey = @ForeignKey(name = "fk_carecompany_insurance"))
	private InsuranceCompany insuranceCompany;
	
	@Size(min = 2, max = 50)
	@Column(name = "name", unique = true, nullable = false, length = 50)
	private String name;
	
	@Size(max = 50)
	@Column(name = "address", nullable = false, length = 50)
	private String address;
	
	@Size(max = 10)
	@Column(name = "phone_number", nullable = false, length = 10)
	private String phoneNumber;
	
	@Size(max = 10)
	@Column(name = "fax", nullable = false, length = 10)
	private String fax;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "careCompany")
	private Set<CompanyContact> companyContacts = new HashSet<CompanyContact>(0);
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "careCompany")
	private Set<Schedule> schedules = new HashSet<Schedule>(0);
	
	public CareCompany careCompanyType(CareCompanyType careCompanyType) {
		this.careCompanyType = careCompanyType;
		return this;
	}
	
	public CareCompany insuranceCompany(InsuranceCompany insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
		return this;
	}

}
