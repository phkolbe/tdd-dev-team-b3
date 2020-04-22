package gft.com.tddb3;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeEngines("junit-jupiter")
@SelectPackages({"gft.com.tddb3.sparring", "gft.com.tddb3.lutador"})
public class AllTests {

}
