package ro.ase.cts.seminar14.unittesting;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("ro.ase.cts.seminar14.unittesting")
@IncludeTags("importante")
class AllTests {

}
