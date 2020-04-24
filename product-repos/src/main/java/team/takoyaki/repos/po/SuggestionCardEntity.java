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
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Table(name = "TAKOYAKI_MEMBER_LOGIN_INFO")
@Data
public class SuggestionCardEntity implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "MEMBER_UID")
	@NotNull
	private Long memberUid;
	
	@Column(name = "TYPE")
	@NotNull
	private String ip;

	@Column(name = "QUESTION_CONTENT")
	@NotNull
	private String questionContent;
	
	@Column(name = "RESPONSE_CONTENT")
	private String responseContent;
	
	@Column(name = "QUESTION_DATETIME")
	@NotNull
	private Timestamp questionDateTime;
	
	@Column(name = "RESPONSE_DATETIME")
	private Timestamp ResponseDateTime;
	
	@Column(name = "STATUS")
	@NotNull
	private char status;
	
}
