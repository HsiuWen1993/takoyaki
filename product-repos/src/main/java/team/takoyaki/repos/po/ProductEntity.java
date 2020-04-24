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
@Table(name = "TAKOYAKI_PRODUCT")
@Data
public class ProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="PRODUCT_UID")
	@NotNull
	private Long productUid;
	
	@Column(name ="NAME")
	@NotNull
	private String name;
	
	@Column(name ="BRAND")
	@NotNull
	private String brand;
	
	@Column(name ="PRICE")
	@NotNull
	private int price;
	
	@Column(name ="TYPE")
	@NotNull
	private Long type;
	
	@Column(name ="INVENTORY")
	@NotNull
	private int inventory;
	
	@Column(name ="INFORMATION")
	private String information;
	
}
