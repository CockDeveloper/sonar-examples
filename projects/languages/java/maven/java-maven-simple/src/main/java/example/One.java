package example;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    log.info(foo());
  }
}
