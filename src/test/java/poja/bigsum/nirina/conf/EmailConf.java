package poja.bigsum.nirina.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import poja.bigsum.nirina.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
