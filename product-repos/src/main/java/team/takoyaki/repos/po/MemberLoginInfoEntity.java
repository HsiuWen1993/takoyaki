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
@Table(name = "TAKOYAKI_MEMBER_LOGIN_INFO")
@Data
public class MemberLoginInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "MEMBER_UID")
	@NotNull
	private Long memberUid;
	
	@Column(name = "IP")
	@NotNull
	private String ip;

	@Column(name = "LOGIN_DATETIME")
	@NotNull
	private Timestamp localDateTime ;
}