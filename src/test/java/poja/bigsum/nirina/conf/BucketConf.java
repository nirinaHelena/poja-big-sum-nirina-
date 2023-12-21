package poja.bigsum.nirina.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import poja.bigsum.nirina.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
