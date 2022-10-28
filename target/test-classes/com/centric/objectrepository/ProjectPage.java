package com.centric.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;
public class ProjectPage extends Commonactions{

	public ProjectPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="//span[@data-csi-tab-name='Projects']")
	private WebElement ProjectsTab;

	@FindBy(xpath="(//span[@data-csi-tab-name='Projects'])[2]")
	private WebElement AllProjectsTab;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Data-AllProjects-ToolbarNewActions']//div/div[2]")
	private WebElement NewProjectBtn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Project-Form-Subtype']//div[3]/input[1]")
	private WebElement SubTypeInput;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Project-Form-Node Name']//div/div/input")
	private WebElement ProjectNameInput;
	
	@FindBy(xpath="//span[text()='Cancel']")
	private WebElement cancelbutton;

	@FindBy(xpath="//div[@data-csi-automation='field-Project-Form-RevisionBehavior']//div[3]/input[1]")
	private WebElement RevisionBehaviourDrp;
	
	@FindBy(xpath="//div[@class='stateWrapper draft csi-state-other csi-state csi-state-draft']")
	private WebElement DraftState;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Items']")
	private WebElement itemTab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Styles']")
	private WebElement StylesTab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Materials']")
	private WebElement MaterialsTab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Properties']")
	private WebElement PropertiesTab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Documents']")
	private WebElement DocumentsTab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Team']")
	private WebElement TeamTab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Presentation']")
	private WebElement PresentationTab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Schedule']")
	private WebElement ScheduleTab;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Project-Items-ToolbarNewActions']")
	private WebElement AddItemBtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Project-Items-ToolbarNewActions']//td[2]")
	private WebElement AddItemDDL;
	
	@FindBy(xpath="//tr[@data-csi-act='NewFood']")
	private WebElement NewFoodsBtn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Food-Form-Subtype']//div[3]/input[1]")
	private WebElement FoodSubTypeInput;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Food-Form-Node Name']//div/div/input")
	private WebElement FoodNameInput;
	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Project-StyleTab-ToolbarNewActions']")
	private WebElement AddStyleBtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Project-StyleTab-ToolbarNewActions']//td[2]")
	private WebElement AddStyleDDL;
	
	@FindBy(xpath="//tr[@data-csi-act='NewStyle']")
	private WebElement NewStyleBtn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-HierarchyForm-ParentSeason']//div[3]/input")
	private WebElement SeasonInput;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-HierarchyForm-Category1']//div[3]/input")
	private WebElement BrandInput;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-HierarchyForm-Category2']//div[3]/input")
	private WebElement DptInput;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-HierarchyForm-Collection']//div[3]/input")
	private WebElement CollectionInput;
	
	@FindBy(xpath="//span[@data-csi-act='NextPage']")
	private WebElement NextBtn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-ProductType']//div[3]/input")
	private WebElement StyleTypeInput;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-Node Name']//div/div/input")
	private WebElement StyleNameInput;
	
	@FindBy(xpath="//span[@data-csi-act='Finish']")
	private WebElement FinishBtn;

	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Project-MaterialTab-ToolbarNewActions']")
	private WebElement AddMaterialBtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Project-MaterialTab-ToolbarNewActions']//td[2]")
	private WebElement AddMaterialDDL;
	
	@FindBy(xpath="//tr[@data-csi-act='NewMaterial']")
	private WebElement NewMaterialBtn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Material-Form-ProductType']//div[3]/input[1]")
	private WebElement MaterialTypeInput;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Material-Form-Node Name']//div/div/input")
	private WebElement MaterialNameInput;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Material-Form-Code']//div/div/input")
	private WebElement MaterialCodeInput;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-ProjectLineItem')]/div[3]//input)[1]")
	private WebElement producttypedrp;
	
	
	public WebElement getProducttypedrp() {
		return producttypedrp;
	}

	public WebElement getProjectsinp() {
		return ProjectsTab;
	}

	public WebElement getAllProjectsinp() {
		return AllProjectsTab;
	}

	public WebElement getNewProjectBtninp() {
		return NewProjectBtn;
	}

	public WebElement getProjectNameInputinp() {
		return ProjectNameInput;
	}
	
	public WebElement getSubTypeInputinp() {
		return SubTypeInput;
	}
	

	public WebElement getCancelButton() {
		return cancelbutton;
	}
	
	public WebElement getRevisionBehaviourDrp() {
		return RevisionBehaviourDrp;
	}
	
	public WebElement getDraftState() {
		return DraftState;
	}
	public WebElement getStylesTab() {
		return StylesTab;
	}
	public WebElement getItemTab() {
		return itemTab;
	}
	public WebElement getMaterialsTab() {
		return MaterialsTab;
	}
	
	public WebElement getPropertiesTab() {
		return PropertiesTab;
	}
	public WebElement getDocumentsTab() {
		return DocumentsTab;
	}
	public WebElement getTeamTab() {
		return TeamTab;
	}
	public WebElement getPresentationTab() {
		return PresentationTab;
	}
	public WebElement getScheduleTab() {
		return ScheduleTab;
	}

	
	public WebElement getAddItemBtn() {
		return AddItemBtn;
	}
	public WebElement getAddItemDDL() {
		return AddItemDDL;
	}
	
	public WebElement getNewFoodsBtn() {
		return NewFoodsBtn;
	}
	
	public WebElement getFoodNameInput() {
		return FoodNameInput;
	}
	public WebElement getFoodSubTypeInput() {
		return FoodSubTypeInput;
	}
	
	public WebElement getAddStyleBtn() {
		return AddStyleBtn;
	}
	public WebElement getAddStyleDDL() {
		return AddStyleDDL;
	}
	
	public WebElement getNewStyleBtn() {
		return NewStyleBtn;
	}
	
	public WebElement getSeasonInput() {
		return SeasonInput;
	}
	public WebElement getBrandInput() {
		return BrandInput;
	}
	public WebElement getDptInput() {
		return DptInput;
	}
	public WebElement getCollectionInput() {
		return CollectionInput;
	}
	public WebElement getNextBtn() {
		return NextBtn;
	}
	
	public WebElement getStyleTypeInput() {
		return StyleTypeInput;
	}
	public WebElement getStyleNameInput() {
		return StyleNameInput;
	}
	public WebElement getFinishBtn() {
		return FinishBtn;
	}
	
	
	
	public WebElement getAddMaterialBtn() {
		return AddMaterialBtn;
	}
	public WebElement getAddMaterialDDL() {
		return AddMaterialDDL;
	}
	
	public WebElement getNewMaterialDDL() {
		return NewMaterialBtn;
	}
	
	public WebElement getMaterialTypeInput() {
		return MaterialTypeInput;
	}
	public WebElement getMaterialNameInput() {
		return MaterialNameInput;
	}
	public WebElement getMaterialCodeInput() {
		return MaterialCodeInput;
	}
	
	// set 3
	
	@FindBy(xpath="//span[text()='WBS Management' or @data-csi-tab-name='WBS Management']")
	private WebElement WBS_Management;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Wbs')]//div/div)[2]")
	private WebElement WBS_Btn;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-Wbs-Form-Node Name')]/div/div/input[1]")
	private WebElement WBS_Value;
	
	@FindBy(xpath="//td[@data-csi-heading='ApplicableForTypes::0']")
	private WebElement ApplicapleTypes;
	
	@FindBy(xpath="//label[text()='Engineering Change']/parent::div//input")
	private WebElement EngChn_ChkBX;
	
	@FindBy(xpath="//label[text()='EngineeringChange']/parent::div//input")
	private WebElement EngChn_ChkBX1;
	
	@FindBy(xpath="//label[text()='Material']/parent::div//input")
	private WebElement Material_ChkBx;
	
	@FindBy(xpath="//label[text()='Project']/parent::div//input")
	private WebElement Project_ChkBx;
	
	@FindBy(xpath="//label[text()='Style']/parent::div//input")
	private WebElement Style_ChkBx;
	
	@FindBy(xpath="//div[text()='WBS Settings']")
	private WebElement Settings;
	
	@FindBy(xpath="//td[@data-csi-heading='MilestoneTemplates::0']")
	private WebElement Milestone_Temp;
	
	@FindBy(xpath="//label[text()='Project A']/parent::div//input")
	private WebElement Prjct_A_ChkBx;
	
	@FindBy(xpath="//label[text()='Project B']/parent::div//input")
	private WebElement Prjct_B_ChkBx;
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0'])/a[text()='Project A']")
	private WebElement projectName_A;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Wbs-WbsTemplateElements')]//div/div)[2]")
	private WebElement Wbs_TaskBtn;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-WbsElement-Form-Node Name')]/div/div/input[1]")
	private WebElement WBS_TaskValue;
	
	@FindBy(xpath="(//span[text()='Task 1']/parent::td//following-sibling::td[@data-csi-heading='PlannedDuration::0'])")
	private WebElement Duration_1;
	
	@FindBy(xpath="(//span[text()='Task 2']/parent::td//following-sibling::td[@data-csi-heading='PlannedDuration::0'])")
	private WebElement Duration_2;
	
	@FindBy(xpath="//span[@title='Click to browse siblings of item']/span[1]")
	private WebElement search;
	
	@FindBy(xpath="//td[@data-csi-heading='PlannedStart::0']")
	private WebElement Start_Date;
	
	@FindBy(xpath="//a[@class='browse' and text()='Project-With All ProductTypes Selected']")
	private WebElement AllProducts_name;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Schedule']")
	private WebElement scheduleTab;
	
	@FindBy(xpath="//span[text()='Select WBS']")
	private WebElement select_WBS_Btn;
	
	@FindBy(xpath="(//td[contains(text(),'A')]//preceding-sibling::td)//input")
	private WebElement A_ChkBx;
	
	@FindBy(xpath="(//span[contains(text(),'Actions')])[1]")
	private WebElement Action;
	
	@FindBy(xpath="(//td[contains(text(),'Start WBS')])[1]")
	private WebElement Start_WBS;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'WState::0')])[1]")
	private WebElement state;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Gantt']")
	private WebElement Gantt_Tab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Milestone Report']")
	private WebElement MilestoneReport_Tab;
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-WbsAdmin-ProjectMilestoneReport-MilestoneTemplate']//div/input)[3]")
	private WebElement noneTab;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'WbsAdmin-ProjectMilestoneReport-CustomViewSelect')])/div)[2]")
	private WebElement star;
	
	@FindBy(xpath="((//span[contains(@data-csi-automation,'WbsAdmin-ProjectMilestoneReport-CustomViewActions')])/span)[1]")
	private WebElement MilestoneViews;
	
	@FindBy(xpath="(//tr[@data-csi-context-parent='centric://REFLECTION/INSTANCE/WbsAdmin/BLANK']//td[contains(text(),'Save')])[1]")
	private WebElement MilestoneSave;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Deliverables Report']")
	private WebElement DelieverReport_Tab;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'ScheduleStatus:Child:WBS')]/span)")
	private List<WebElement> dates;



	public WebElement getProjectsTab() {
		return ProjectsTab;
	}

	public WebElement getAllProjectsTab() {
		return AllProjectsTab;
	}

	public WebElement getNewProjectBtn() {
		return NewProjectBtn;
	}

	public WebElement getSubTypeInput() {
		return SubTypeInput;
	}

	public WebElement getProjectNameInput() {
		return ProjectNameInput;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}

	public WebElement getNewMaterialBtn() {
		return NewMaterialBtn;
	}

	public WebElement getWBS_Management() {
		return WBS_Management;
	}

	public WebElement getWBS_Btn() {
		return WBS_Btn;
	}

	public WebElement getWBS_Value() {
		return WBS_Value;
	}

	public WebElement getApplicapleTypes() {
		return ApplicapleTypes;
	}

	public WebElement getEngChn_ChkBX() {
		return EngChn_ChkBX;
	}
	
	public WebElement getEngChn_ChkBX1() {
		return EngChn_ChkBX1;
	}

	public WebElement getMaterial_ChkBx() {
		return Material_ChkBx;
	}

	public WebElement getProject_ChkBx() {
		return Project_ChkBx;
	}

	public WebElement getStyle_ChkBx() {
		return Style_ChkBx;
	}

	public WebElement getSettings() {
		return Settings;
	}

	public WebElement getMilestone_Temp() {
		return Milestone_Temp;
	}

	public WebElement getPrjct_A_ChkBx() {
		return Prjct_A_ChkBx;
	}

	public WebElement getPrjct_B_ChkBx() {
		return Prjct_B_ChkBx;
	}

	public WebElement getProjectName_A() {
		return projectName_A;
	}

	public WebElement getWbs_TaskBtn() {
		return Wbs_TaskBtn;
	}

	public WebElement getWBS_TaskValue() {
		return WBS_TaskValue;
	}

	public WebElement getDuration_1() {
		return Duration_1;
	}

	public WebElement getDuration_2() {
		return Duration_2;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getStart_Date() {
		return Start_Date;
	}

	public WebElement getAllProducts_name() {
		return AllProducts_name;
	}

	public WebElement getSelect_WBS_Btn() {
		return select_WBS_Btn;
	}

	public WebElement getA_ChkBx() {
		return A_ChkBx;
	}

	public WebElement getAction() {
		return Action;
	}

	public WebElement getStart_WBS() {
		return Start_WBS;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getGantt_Tab() {
		return Gantt_Tab;
	}

	public WebElement getMilestoneReport_Tab() {
		return MilestoneReport_Tab;
	}

	public WebElement getNoneTab() {
		return noneTab;
	}

	public WebElement getStar() {
		return star;
	}

	public WebElement getMilestoneViews() {
		return MilestoneViews;
	}

	public WebElement getMilestoneSave() {
		return MilestoneSave;
	}

	public WebElement getDelieverReport_Tab() {
		return DelieverReport_Tab;
	}

	public List<WebElement> getDates() {
		return dates;
	}
	
	//set 4 5 6 
	

	@FindBy(xpath="//span[contains(@data-csi-automation,'Project-Items-CustomViewActions')]//span[text()='Views']")
	private WebElement itemview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Project-Items-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement itemamanage;

	@FindBy(xpath="//td[text()='Project Item']")
	private WebElement projectitem;

	@FindBy(xpath="//option[text()='Project Colors Images']")
	private WebElement projecctcolor;

	@FindBy(xpath="//td[text()='SKUs']")
	private WebElement projectsku;

	@FindBy(xpath="//option[text()='Base SKU']")
	private WebElement Basesku;

	@FindBy(xpath="//a[text()='MaterialInPrjTypeAll']")
	private WebElement MaterialInPrjTypeAll;

	@FindBy(xpath="//span[@data-csi-tab-name='Material' or text()='Material']")
	private WebElement MaterialTab;

	@FindBy(xpath="//span[@data-csi-tab-name='Properties' or text()='Properties']")
	private WebElement propertiesTab;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Material-Properties-CustomViewActions')]//span[text()='Views']")
	private WebElement MAtPropertview;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Material-Properties-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement MATPropManageview;

	@FindBy(xpath="//option[text()='Projects']")
	private WebElement Projects;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Material-ProductColors-ToolbarNewActions')]//td)[2]")
	private WebElement MatPdtColorExp;

	@FindBy(xpath="//td[text()='New from Color Specification']")
	private WebElement Newfromcolorspf;

	@FindBy(xpath="//div[contains(text(),'Displaying')]")
	private WebElement DisplayItems;

	@FindBy(xpath="//span[text()='Color Specification']//ancestor::tr/th/div/input")
	private WebElement colorspecification;

	@FindBy(xpath="//span[@data-csi-tab-name='SKUs' or text()='SKUs']")
	private WebElement SKUTab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Material-ProductSKU-ToolbarNewActions')]//div/div)[2]")
	private WebElement MATSKUBtn;

	@FindBy(xpath="//a[text()='StyleInPrjTypeAll']")
	private WebElement StyleInPrjTypeAll;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Style-Properties-CustomViewActions')]//span[text()='Views']")
	private WebElement StylePropView;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'Style-Properties-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement Stylemanageview;

	@FindBy(xpath="//span[@data-csi-tab-name='Colorways']")
	private WebElement colorwaystab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Style-ProductColors-ToolbarNewActions')]//td)[2]")
	private WebElement stylecolorwaybtn;

	@FindBy(xpath="//span[text()='Color Specification']//ancestor::tr/th/div/input")
	private WebElement stylecolorspecf;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Style-ProductSKU-ToolbarNewActions')]//div/div)[2]")
	private WebElement StyleSKUBtn;

	@FindBy(xpath="//a[text()='MaterialInPrjTypeAll']//following::span[text()='more_horiz'][1]")
	private WebElement Materialdoticon;

	@FindBy(xpath="//span[text()='Material SKU']//ancestor::tr/th/div/input")
	private WebElement materialskuchkbox;

	@FindBy(xpath="//td[text()='Select Project Colors']")
	private WebElement selectprojectcolor;

	@FindBy(xpath="//span[text()='Colored Material']//ancestor::tr/th/div/input")
	private WebElement materialcolorchkbox;

	@FindBy(xpath="//a[text()='StyleInPrjTypeAll']//following::span[text()='more_horiz'][1]")
	private WebElement Styledoticon;

	@FindBy(xpath="//span[text()='Style SKU']//ancestor::tr/th/div/input")
	private WebElement styleskuchkbox;

	@FindBy(xpath="//span[text()='Colorway']//ancestor::tr/th/div/input")
	private WebElement stylecolorchkbox;

	@FindBy(xpath="//a[text()='MaterialInPrjTypeAll']//following::span[text()='content_copy'][1]")
	private WebElement materialcopy;

	@FindBy(xpath="//a[text()='StyleInPrjTypeAll']//following::span[text()='content_copy'][1]")
	private WebElement stylecopy;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'DocumentContainer-Documents-ToolbarNewActions')]//td)[2]")
	private WebElement newdocexpbtn;

	@FindBy(xpath="//td[text()='New Document']")
	private WebElement newdocument;

	@FindBy(xpath="//a[text()='All Project Document']//following::span[text()='more_horiz']")
	private WebElement docdoticon;

	@FindBy(xpath="//td[text()='Share Document']")
	private WebElement sharedoc;

	@FindBy(xpath="(//td[contains(text(),'Material')]//preceding-sibling::td)/div//input")
	private WebElement sharematerialchkbox;

	@FindBy(xpath="//span[contains(@title,'Click')]/span[1]")
	private WebElement clickicon;

	@FindBy(xpath="//a[text()='All Project Document']")
	private WebElement Allprjdoc;

	@FindBy(xpath="//span[contains(@title,'All Product')]/span[1]")
	private WebElement productclick;

	@FindBy(xpath="//span[text()='Manage Team']//parent::span/span[1]")
	private WebElement teamtoolbar;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-CrewHolder-ParentCrews-ToolbarNewActions')]//div/div)[2]")
	private WebElement newshareteambtn;

	@FindBy(xpath="(//td[contains(text(),'Project')]//preceding-sibling::td)/div//input")
	private WebElement shareprojectchkbox;

	@FindBy(xpath="//span[contains(@data-csi-automation,'Project-Print-htmlToolbars')]/span/span/span[1]")
	private WebElement presentationtoolbar;


	public WebElement getItemview() {
		return itemview;
	}

	public WebElement getItemamanage() {
		return itemamanage;
	}

	public WebElement getProjectitem() {
		return projectitem;
	}

	public WebElement getProjecctcolor() {
		return projecctcolor;
	}

	public WebElement getProjectsku() {
		return projectsku;
	}

	public WebElement getBasesku() {
		return Basesku;
	}

	public WebElement getMaterialInPrjTypeAll() {
		return MaterialInPrjTypeAll;
	}

	public WebElement getMaterialTab() {
		return MaterialTab;
	}

	public WebElement getMAtPropertview() {
		return MAtPropertview;
	}

	public WebElement getMATPropManageview() {
		return MATPropManageview;
	}

	public WebElement getProjects() {
		return Projects;
	}

	public WebElement getMatPdtColorExp() {
		return MatPdtColorExp;
	}

	public WebElement getNewfromcolorspf() {
		return Newfromcolorspf;
	}

	public WebElement getDisplayItems() {
		return DisplayItems;
	}

	public WebElement getColorspecification() {
		return colorspecification;
	}

	public WebElement getSKUTab() {
		return SKUTab;
	}

	public WebElement getMATSKUBtn() {
		return MATSKUBtn;
	}

	public WebElement getStyleInPrjTypeAll() {
		return StyleInPrjTypeAll;
	}

	public WebElement getStylePropView() {
		return StylePropView;
	}

	public WebElement getStylemanageview() {
		return Stylemanageview;
	}

	public WebElement getColorwaystab() {
		return colorwaystab;
	}

	public WebElement getStylecolorwaybtn() {
		return stylecolorwaybtn;
	}

	public WebElement getStylecolorspecf() {
		return stylecolorspecf;
	}

	public WebElement getStyleSKUBtn() {
		return StyleSKUBtn;
	}

	public WebElement getMaterialdoticon() {
		return Materialdoticon;
	}

	public WebElement getMaterialskuchkbox() {
		return materialskuchkbox;
	}

	public WebElement getSelectprojectcolor() {
		return selectprojectcolor;
	}

	public WebElement getMaterialcolorchkbox() {
		return materialcolorchkbox;
	}

	public WebElement getStyledoticon() {
		return Styledoticon;
	}

	public WebElement getStyleskuchkbox() {
		return styleskuchkbox;
	}

	public WebElement getStylecolorchkbox() {
		return stylecolorchkbox;
	}

	public WebElement getMaterialcopy() {
		return materialcopy;
	}

	public WebElement getStylecopy() {
		return stylecopy;
	}

	public WebElement getNewdocexpbtn() {
		return newdocexpbtn;
	}

	public WebElement getNewdocument() {
		return newdocument;
	}

	public WebElement getDocdoticon() {
		return docdoticon;
	}

	public WebElement getSharedoc() {
		return sharedoc;
	}

	public WebElement getSharematerialchkbox() {
		return sharematerialchkbox;
	}

	public WebElement getClickicon() {
		return clickicon;
	}

	public WebElement getAllprjdoc() {
		return Allprjdoc;
	}

	public WebElement getProductclick() {
		return productclick;
	}

	public WebElement getTeamtoolbar() {
		return teamtoolbar;
	}

	public WebElement getNewshareteambtn() {
		return newshareteambtn;
	}

	public WebElement getShareprojectchkbox() {
		return shareprojectchkbox;
	}

	public WebElement getPresentationtoolbar() {
		return presentationtoolbar;
	}



	@FindBy(xpath="//option[text()='Assigned Product Suppliers']")
	private WebElement AssignedProdSupp;

	@FindBy(xpath="//span[contains(text(),'Material')]//following::td[@data-csi-act='Node Name:Child:Product:0']/div/a")
	private WebElement Materialproduct;

	@FindBy(xpath="//span[text()='Product Suppliers' or @data-csi-tab-name='Product Suppliers']")
	private WebElement prodSupplier;

	@FindBy(xpath="//div[text()='New from Suppliers']")
	private WebElement newfromsupplier;

	@FindBy(xpath="(//td[contains(text(),'Huckleberry')]//preceding-sibling::td)/div//input")
	private WebElement huckleberrychkbox;

	@FindBy(xpath="//td[@data-csi-heading='DesignatedProductSource::0']")
	private WebElement designatesProdSrc;

	@FindBy(xpath="//span[contains(text(),'Material')]//following::td[@data-csi-act='AssignedProductSources::0']")
	private WebElement MatProdSrc;

	@FindBy(xpath="//label[contains(text(),'Huckleberry')]//parent::div/div/input")
	private WebElement MatProdSuppvalue;

	@FindBy(xpath="//div[text()='DRAFT']//following::span[text()='arrow_forward']")
	private WebElement DRAFTFWD;

	@FindBy(xpath="//span[contains(text(),'Style')]//following::span[text()='mode_edit']")
	private WebElement styledit;

	@FindBy(xpath="//span[contains(text(),'Food')]//following::span[text()='mode_edit']")
	private WebElement foodedit;

	@FindBy(xpath="//span[contains(text(),'Material')]//following::span[text()='mode_edit']")
	private WebElement materialedit;

	@FindBy(xpath="//div[@data-csi-automation='field-ProjectLineItem-Form-Node Name']/div[2]/div/input")
	private WebElement itemeditvalue;

	@FindBy(xpath="//div[text()='IN PROGRESS']//following::span[text()='arrow_forward']")
	private WebElement CompletedFWD;

	@FindBy(xpath="//div[text()='IN PROGRESS']//following::span[text()='arrow_back']")
	private WebElement CompletedBWD;

	@FindBy(xpath="//span[@data-csi-act='ProjectToCanceled' or text()='close']")
	private WebElement CloseProject;

	@FindBy(xpath="//span[@data-csi-act='ProjectBackToDraft' or text()='subdirectory_arrow_right']")
	private WebElement BacktoDraft;

	@FindBy(xpath="//span[@data-csi-automation='plugin-User-HeaderToolbar-User']")
	private WebElement Logouticon;
	
	@FindBy(xpath="//td[text()='Log Out']")
	private WebElement Logout;

	public WebElement getAssignedProdSupp() {
		return AssignedProdSupp;
	}

	public WebElement getMaterialproduct() {
		return Materialproduct;
	}

	public WebElement getProdSupplier() {
		return prodSupplier;
	}

	public WebElement getNewfromsupplier() {
		return newfromsupplier;
	}

	public WebElement getHuckleberrychkbox() {
		return huckleberrychkbox;
	}

	public WebElement getDesignatesProdSrc() {
		return designatesProdSrc;
	}

	public WebElement getMatProdSrc() {
		return MatProdSrc;
	}

	public WebElement getMatProdSuppvalue() {
		return MatProdSuppvalue;
	}

	public WebElement getDRAFTFWD() {
		return DRAFTFWD;
	}

	public WebElement getStyledit() {
		return styledit;
	}

	public WebElement getFoodedit() {
		return foodedit;
	}

	public WebElement getMaterialedit() {
		return materialedit;
	}

	public WebElement getItemeditvalue() {
		return itemeditvalue;
	}

	public WebElement getCompletedFWD() {
		return CompletedFWD;
	}

	public WebElement getCompletedBWD() {
		return CompletedBWD;
	}

	public WebElement getCloseProject() {
		return CloseProject;
	}

	public WebElement getBacktoDraft() {
		return BacktoDraft;
	}

	public WebElement getLogouticon() {
		return Logouticon;
	}

	public WebElement getLogout() {
		return Logout;
	}

		
}