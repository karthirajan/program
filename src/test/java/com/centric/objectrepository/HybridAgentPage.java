package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class HybridAgentPage  extends Commonactions{

	
		
	public HybridAgentPage() {
			
			PageFactory.initElements(Commonactions.driver, this);
		}
	@FindBy(xpath="//span[text()='Supplier' or @data-csi-tab-name='Supplier']")
	private WebElement suppliertab;
	
	@FindBy(xpath="//span[text()='Export/Import' or @data-csi-tab-name='Export/Import']")
	private WebElement eximtab;	
	
	@FindBy(xpath="//span[text()='Import Jobs' or @data-csi-tab-name='Import Jobs']")
	private WebElement importjobtab;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-ExternalExporterRegistry-ImportSchedule-ToolbarNewActions']")
	private WebElement newjobactbtn;
	
	@FindBy(xpath="//td[text()='Native Import']/following::td[@data-csi-act='File:Child:Executable:0:ImportExecutable']")
	private WebElement filetextbox;
	
	@FindBy(xpath="//td[text()='Native Import']/following::td[@data-csi-act='Kind:Child:Schedule:0:_CS_Schedule_Universal']")
	private WebElement typetextbox;
	
		@FindBy(xpath="//span[text()='Service' or @data-csi-tab-name='Service']")
	private WebElement servicetab;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-LibSourcing-Suppliers-ToolbarNewActions']//div/div[2]")
	private WebElement newsupplieraction;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Supplier-Form-Node Name']//div[2]//input")
	private WebElement supplierinput;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Supplier-Form-IsSupplier']//input")
	private WebElement issupchk;
	
	@FindBy(xpath="//a[text()='Huckleberry']/parent::td//following-sibling::td[@data-csi-act='AllAgents::0']")
	private WebElement agenthucdrp;
	
	@FindBy(xpath="//a[text()='Iceplant']/parent::td//following-sibling::td[@data-csi-act='AllAgents::0']")
	private WebElement iceagentdrop;
	
	@FindBy(xpath="//span[@data-csi-automation='filter-Site-Roles-Node Name']")
	private WebElement rolesalldrpdown;
	
	@FindBy(xpath="//label[text()='Online Supplier Global Role']//preceding-sibling::div//input")
	private WebElement onlisupchkbox;
	
	@FindBy(xpath="//td[@data-csi-act='Node Name::0' and text()='Online Supplier Global Role']//following::td[@class='actionsColumn noexport']//div//span[1]")
	private WebElement threedotonlsup;
	
	@FindBy(xpath="//td[text()='Select Members']")
	private WebElement selectmemblink;
	
	@FindBy(xpath="(//span[@data-csi-automation='filter-Site-Users-UserID']//span[@role='button'])[2]")
	private WebElement useridalldrp;
	
	@FindBy(xpath="//tr[@data-csi-act='TableHeader']//div[1]//input[@title='Toggle selections of all displayed items']")
	private WebElement userallchek;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Companies' or text()='Companies']")
	private WebElement companytab;
	
	@FindBy(xpath="(//a[text()='Grape (Agent)']/parent::td//preceding-sibling::td//div//input)[2]")
	private WebElement graperadiobt;
	
	@FindBy(xpath="(//a[text()='Fig (Agent)']/parent::td//preceding-sibling::td//div//input)[2]")
	private WebElement figradiobt;
	
	@FindBy(xpath="//span[@data-csi-tab='Crew-OnlineRoleUsers']")
	private WebElement rolestab;
	
	@FindBy(xpath="//td[text()='Hybrid Agent In Agent Crew Role']//following-sibling::td[contains(@class,'actionsColumn')]//div//span[@data-csi-act='AggregateCrewRoleUsersFromAll']")
	private WebElement hybridactico;
	
	@FindBy(xpath="(//span[@data-csi-automation='filter-CrewHolder-AvailableCrewRoleUsers-UserID']//span[@role='button'])[1]")
	private WebElement crewalldrpdw;
	
	@FindBy(xpath="//a[text()='Huckleberry']/parent::td//preceding-sibling::td//div//input")
	private WebElement huckleberryradiobt;
	
	@FindBy(xpath="//a[text()='Iceplant']/parent::td//preceding-sibling::td//div//input")
	private WebElement iceplantradiobt;
	
	@FindBy(xpath="//td[text()='Online Supplier Admin']//following-sibling::td[contains(@class,'actionsColumn')]//div//span[@data-csi-act='AggregateCrewRoleUsersFromAll']")
	private WebElement onsupadmactico;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-SourcingViews-DutyRates-ToolbarNewActions']")
	private WebElement htsactionbtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-SiteLibSupplierItem-SupplierItemTemplates-ToolbarNewActions']")
	private WebElement sqtactbtn;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SupplierItem-SupplierQuoteTemplateForm-Node Name']//input)[2]")
	private WebElement supquotinpt;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Supplier Quote' or text()='Supplier Quote']")
	private WebElement SQTSupQuotetab;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-SupplierItemRevision-DutyPerUsage-ToolbarNewActions']")
	private WebElement sqtsupquoactbtn;
	
	@FindBy(xpath="//td[text()='HTSCode1']//preceding-sibling::td//div//input")
	private WebElement htschkbox;
	
	@FindBy(xpath="//td[text()='HTSCode2']//preceding-sibling::td//div//input")
	private WebElement hts2chkbox;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-SizeChartAdmin-DataPackageTemplates-ToolbarNewActions']//div[2]")
	private WebElement datapacactbtn;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-DataPackageTemplate-Form-Node Name']//input)[2]")
	private WebElement datapackinp;
	
	@FindBy(xpath="//div[text()='New Supplier']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div")
	private WebElement slidersup;
	
	@FindBy(xpath="//span[text()='Agents']")
	private WebElement agenttext;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-DataPackageTemplate-Form-TemplateType']//input)[1]")
	private WebElement datapaccktypedrop;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-DataPackageTemplate-DataSheets-ToolbarNewActions']")
	private WebElement datasheettempact;
	
	@FindBy(xpath="//div[@data-csi-automation='field-DataPackageTemplateSheet-Form-Type']//div[3]//input[1]")
	private WebElement datasheettempdrpdown;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-DataPackageTemplateSheet-Form-Type']//input)[1]")
	private WebElement statedropdwn;
	
	@FindBy(xpath="//span[@class='MuiTypography-root MuiTypography-body1' and text()='Data Package Templates']")
	private WebElement datapacklink;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-SiteLibSupplierItem-SupplierRequestTemplates-ToolbarNewActions']")
	private WebElement suprqtempact;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SupplierRequestTemplate-Form-Node Name']//input)[2]")
	private WebElement suprqtemip;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SupplierRequestTemplate-Form-RequestType']//div[3]//input[1]")
	private WebElement typedropdown;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SupplierRequestTemplate-Form-SRTSuppliers']//input)[1]")
	private WebElement supdrpdown;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SupplierRequestTemplate-Form-SRTQuotes']//input)[1]")
	private WebElement supquotempdropdwn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SupplierRequestTemplate-Form-SampleType']//div[3]//input[1]")
	private WebElement samptypedrpdwn;
	
	@FindBy(xpath="//span[@class='MuiTypography-root MuiTypography-body1' and text()='Supplier Quote Templates']")
	private WebElement supquotemplink;
	
	@FindBy(xpath="//*[@data-csi-automation='plugin-ApparelViews-MaterialSecurityGroups-ToolbarNewActions']")
	private WebElement msgactbtn;
	
	@FindBy(xpath="//span[text()='Team' or data-csi-tab-name='Team']")
	private WebElement teamtab;
	
	@FindBy(xpath="//span[text()='Roles' or data-csi-tab-name='Roles']")
	private WebElement roletab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Materials']")
	private WebElement matstab;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-MaterialSecurityGroup-SecurityGroupMaterials-ToolbarNewActions']")
	private WebElement newmatactbtn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Material-Form-ProductType']//div[1]//input")
	private WebElement mattypedrp;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Material-Form-Node Name']//div[1]//input)[2]")
	private WebElement materiinp;
	
	@FindBy(xpath="(//span[@data-csi-automation='filter-MaterialSecurityGroup-AvailableCrewRoleUsers-UserID']//span[@role='button'])[1]")
	private WebElement alldrpdwnmat;
	
	@FindBy(xpath="(//a[text()='Accessories - No color and Size'])[1]")
	private WebElement accessorlink;
	
	@FindBy(xpath="//a[text()='AUT_SR_001']")
	private WebElement autsr1link;
	
	@FindBy(xpath="//a[text()='AUT_SR_003']")
	private WebElement autsr3link;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-SupplierRequest-StyleQuotes-ToolbarNewActions']/tbody/tr/td[1]")
	private WebElement supqotactbtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-SupplierRequest-MaterialQuotes-ToolbarNewActions']/tbody/tr/td[1]")
	private WebElement matsupqotactbtn;
	
	@FindBy(xpath="(//span[text()='Material' or @data-csi-tab-name='Material'])[1]")
	private WebElement materialBtn;
	
	@FindBy(xpath="(//span[text()='Material' or @data-csi-tab-name='Material'])[2]")
	private WebElement materialBtn2;	
	
	@FindBy(xpath="//a[text()='100% Cotton/Rayon Jersey']")
	private WebElement cottonlink;
	
	@FindBy(xpath="//a[text()='AUT_MSR_001']")
	private WebElement autmsr1link;	
	
	@FindBy(xpath="//a[text()='AUT_MSR_003']")
	private WebElement autmsr3link;
	
	@FindBy(xpath="(//span[@data-csi-act='IssueRequest'])[1]")
	private WebElement arrowbtn;
	
	@FindBy(xpath="//span[@data-csi-act='ReIssueRequest']")
	private WebElement reissarrowbtn;
	
	@FindBy(xpath="//span[@data-csi-act='CloseRequest']")
	private WebElement arrowbtn2;

	@FindBy(xpath="(//span[@data-csi-tab-name='Styles'])[2]")
    private WebElement styletab;
    
    @FindBy(xpath="(//span[@data-csi-tab-name='Materials'])[2]")
    private WebElement materialsubtab;
    
    @FindBy(xpath="(//span[@data-csi-tab-name='Supplier POs'])[2]")
    private WebElement SupplierPOtab;

    @FindBy(xpath="//span[@data-csi-tab-name='Setup']")
    private WebElement setuptab;
    
    @FindBy(xpath="//table[@data-csi-automation='plugin-SupplierRequest-MaterialSamples-ToolbarNewActions']//div[2]")
    private WebElement sampactbtn;
    
    @FindBy(xpath="(//div[@data-csi-automation='field-MaterialSample-Form-Node Name']//input)[2]")
    private WebElement matsampinput;
    
    @FindBy(xpath="//span[@data-csi-tab-name='Material Samples']")
    private WebElement matersamtab;
    
	@FindBy(xpath="//div[@data-csi-automation='field-SupplierRequest-Form-SRSuppliers']//div[3]//span")
  	private WebElement SupplierSRreq;
  
    public WebElement getSupplierSRreq() {
	return SupplierSRreq;
}
    public WebElement getMatersamtab() {
		return matersamtab;
	}

	public WebElement getReissarrowbtn() {
		return reissarrowbtn;
	}
    
    public WebElement getMatsampinput() {
		return matsampinput;
	}

	public WebElement getSampactbtn() {
		return sampactbtn;
	}

	public WebElement getSetuptab() {
		return setuptab;
	}

	public WebElement getStyletab() {
    	return styletab;
    }

    public WebElement getMaterialsubtab() {
    	return materialsubtab;
    }

    public WebElement getSupplierPOtab() {
    	return SupplierPOtab;
    }

	public WebElement getAutmsr1link() {
		return autmsr1link;
	}
	
	public WebElement getArrowbtn2() {
		return arrowbtn2;
	}

	public WebElement getArrowbtn() {
		return arrowbtn;
	}

	public WebElement getMatsupqotactbtn() {
		return matsupqotactbtn;
	}

	public WebElement getAutmsr3link() {
		return autmsr3link;
	}

	public WebElement getCottonlink() {
		return cottonlink;
	}

	public WebElement getMaterialBtn() {
		return materialBtn;
	}

	public WebElement getMaterialBtn2() {
		return materialBtn2;
	}

	public WebElement getAutsr3link() {
		return autsr3link;
	}
	
	public WebElement getSupqotactbtn() {
		return supqotactbtn;
	}

	public WebElement getAutsr1link() {
		return autsr1link;
	}

	public WebElement getAccessorlink() {
		return accessorlink;
	}

	public WebElement getAlldrpdwnmat() {
		return alldrpdwnmat;
	}

	public WebElement getMattypedrp() {
		return mattypedrp;
	}

	public WebElement getMateriinp() {
		return materiinp;
	}

	public WebElement getNewmatactbtn() {
		return newmatactbtn;
	}

	public WebElement getRoletab() {
		return roletab;
	}

	public WebElement getMatstab() {
		return matstab;
	}

	public WebElement getTeamtab() {
		return teamtab;
	}

	public WebElement getMsgactbtn() {
		return msgactbtn;
	}

	public WebElement getSupquotemplink() {
		return supquotemplink;
	}

	public WebElement getSamptypedrpdwn() {
		return samptypedrpdwn;
	}

	public WebElement getSupquotempdropdwn() {
		return supquotempdropdwn;
	}

	public WebElement getSupdrpdown() {
		return supdrpdown;
	}

	public WebElement getTypedropdown() {
		return typedropdown;
	}

	public WebElement getSuprqtemip() {
		return suprqtemip;
	}

	public WebElement getSuprqtempact() {
		return suprqtempact;
	}

	public WebElement getDatapacklink() {
		return datapacklink;
	}

	public WebElement getStatedropdwn() {
		return statedropdwn;
	}

	public WebElement getDatasheettempdrpdown() {
		return datasheettempdrpdown;
	}

	public WebElement getDatasheettempact() {
		return datasheettempact;
	}

	public WebElement getDatapaccktypedrop() {
		return datapaccktypedrop;
	}

	public WebElement getAgenttext() {
		return agenttext;
	}

	public WebElement getSlidersup() {
		return slidersup;
	}

	public WebElement getDatapacactbtn() {
		return datapacactbtn;
	}

	public WebElement getHts2chkbox() {
		return hts2chkbox;
	}

	public WebElement getHtschkbox() {
		return htschkbox;
	}

	public WebElement getSqtsupquoactbtn() {
		return sqtsupquoactbtn;
	}

	public WebElement getSQTSupQuotetab() {
		return SQTSupQuotetab;
	}

	public WebElement getSupquotinpt() {
		return supquotinpt;
	}

	public WebElement getSqtactbtn() {
		return sqtactbtn;
	}

	public WebElement getHtsactionbtn() {
		return htsactionbtn;
	}

	public WebElement getFigradiobt() {
		return figradiobt;
	}

	public WebElement getIceplantradiobt() {
		return iceplantradiobt;
	}

	public WebElement getOnsupadmactico() {
		return onsupadmactico;
	}

	public WebElement getHuckleberryradiobt() {
		return huckleberryradiobt;
	}

	public WebElement getCrewalldrpdw() {
		return crewalldrpdw;
	}

	public WebElement getHybridactico() {
		return hybridactico;
	}

	public WebElement getGraperadiobt() {
		return graperadiobt;
	}

	public WebElement getRolestab() {
		return rolestab;
	}

	public WebElement getCompanytab() {
		return companytab;
	}

	public WebElement getUserallchek() {
		return userallchek;
	}

	public WebElement getUseridalldrp() {
		return useridalldrp;
	}

	public WebElement getSelectmemblink() {
		return selectmemblink;
	}

	public WebElement getThreedotonlsup() {
		return threedotonlsup;
	}

	public WebElement getOnlisupchkbox() {
		return onlisupchkbox;
	}

	public WebElement getRolesalldrpdown() {
		return rolesalldrpdown;
	}

	public WebElement getIceagentdrop() {
		return iceagentdrop;
	}

	public WebElement getAgenthucdrp() {
		return agenthucdrp;
	}

	public WebElement getIssupchk() {
		return issupchk;
	}

	public WebElement getSupplierinput() {
		return supplierinput;
	}

	public WebElement getNewsupplieraction() {
		return newsupplieraction;
	}

	public WebElement getSuppliertab() {
		return suppliertab;
	}
	public WebElement getTypetextbox() {
		return typetextbox;
	}

	public WebElement getNewjobactbtn() {
		return newjobactbtn;
	}

	public WebElement getFiletextbox() {
		return filetextbox;
	}

	public WebElement getServicetab() {
		return servicetab;
	}

	public WebElement getEximtab() {
		return eximtab;
	}

	public WebElement getImportjobtab() {
		return importjobtab;
	}

	public WebElement getDatapackinp() {
		return datapackinp;
	}
	
	@FindBy(xpath="(//a[contains(text(),'No color')])[1]")
    private WebElement noclorandsize;
    
	@FindBy(xpath="(//a[contains(text(),'AUT_SR_001')])[2]")
    private WebElement AUT_SR_001;
	
	@FindBy(xpath="(//a[contains(text(),'AUT_SR_001')])[1]")
    private WebElement AUT_SR_001one;
	
	public WebElement getAUT_SR_001one() {
		return AUT_SR_001one;
	}
	@FindBy(xpath="//a[contains(text(),'AUT_SR_003')]")
    private WebElement AUT_SR_003;
    
	@FindBy(xpath="//span[contains(@title,'Click')]/span[1]")
    private WebElement clickicon;
    
	@FindBy(xpath="//table[@data-csi-automation='plugin-SupplierRequest-StyleSamples-ToolbarNewActions']//div[text()='New Sample']")
    private WebElement newsamplebtn;
    
	@FindBy(xpath="//div[@data-csi-automation='field-Sample-Form-Node Name']/div[2]/div/input")
    private WebElement samplename;
    
	@FindBy(xpath="//span[@data-csi-act='ReIssueRequest']")
    private WebElement resissue;
    
	@FindBy(xpath="(//td[contains(text(),'No color')]//preceding-sibling::td)/div//input")
    private WebElement nocolrchkbox;
	
	@FindBy(xpath="//a[contains(text(),'Mat 4 Fig')]")
    private WebElement mat4;	
	
	@FindBy(xpath="//a[contains(text(),'Mat 6 Grape')]")
    private WebElement mat6;	

@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Supplier Request']")
	private WebElement SRsearch;
	
	public WebElement getSRsearch() {
		return SRsearch;
	}
	
	public WebElement getNoclorandsize() {
		return noclorandsize;
	}

	public WebElement getAUT_SR_001() {
		return AUT_SR_001;
	}
	
	public WebElement getAUT_SR_003() {
		return AUT_SR_003;
	}

	public WebElement getClickicon() {
		return clickicon;
	}

	public WebElement getNewsamplebtn() {
		return newsamplebtn;
	}

	public WebElement getSamplename() {
		return samplename;
	}

	public WebElement getResissue() {
		return resissue;
	}

	public WebElement getNocolrchkbox() {
		return nocolrchkbox;
	}

	public WebElement getMat4() {
		return mat4;
	}

	public WebElement getMat6() {
		return mat6;
	}
    
    

}

		