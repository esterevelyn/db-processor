package processor.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Entity
@Data
public class IS  {

    @Id
    private String IS;
    private Long Abstract_PMID;

    @ManyToOne
    private List<Abstract> abstracts;

}
