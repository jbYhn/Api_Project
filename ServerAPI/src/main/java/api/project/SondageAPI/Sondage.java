package api.project.SondageAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sondage")
@EntityListeners(AuditingEntityListener.class)
public class Sondage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private int id;

    @Column(name = "user_id", nullable = false)
    private int user_id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "lieu", nullable = false)
    private String lieu;


}
