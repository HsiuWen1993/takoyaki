package team.takoyaki.repos.po;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "TAKOYAKI_REEOR_LOG")
@Data
public class ErrorLogEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "PROGRAM_NAME")
	@NotNull
	private Long programName;
	
	@Column(name = "PROGRAM_TYPE")
	@NotNull
	private Long programType;
	
	@Column(name = "ERROR_TIME")
	@NotNull
	private Timestamp errorTime;
	
	@Column(name = "ERROR_TYPE")
	@NotNull
	private Long errprType;
	
	@Column(name = "ERROR_CONTENT")
	@NotNull
	private Long errorContent;
}
