package vn.iostar.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="category")
public class Category implements Serializable{

        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "categoryname", length = 200, columnDefinition = "nvarchar(200) not null")
        @NotEmpty(message ="không được bỏ trống")
        private String categoryname;
        @Column(name = "images", length = 500, columnDefinition = "nvarchar(500)")
        private String images;
        private int status ;

}

