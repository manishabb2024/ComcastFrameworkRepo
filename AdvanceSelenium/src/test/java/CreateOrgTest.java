import org.testng.annotations.Test;

import com.client.vtiger.objectRepository.OrgPageOR;
import com.vtiger.generic.baseUtility.BaseClass;

public class CreateOrgTest extends BaseClass {
	
	@Test
	public void createOrgTest()
	{
		OrgPageOR or=new OrgPageOR(driver);
		or.org.click();
		or.add.click();
		or.accfield.sendKeys("abcd");
		or.savebtn.click();
		
	}
}
