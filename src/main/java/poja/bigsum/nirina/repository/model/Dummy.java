package poja.bigsum.nirina.repository.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import poja.bigsum.nirina.PojaGenerated;

@PojaGenerated
@Entity
@Getter
@Setter
public class Dummy {
  @Id private String id;
}
