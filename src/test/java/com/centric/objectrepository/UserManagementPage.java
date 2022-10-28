package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class UserManagementPage extends Commonactions{

	public UserManagementPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@data-csi-tab-name='User Management' or text()='User Management']")
	private WebElement UsrManagement;

	@FindBy(xpath="//span[@data-csi-tab-name='Roles' or text()='Roles']")
	private WebElement usrMgmt_Roles;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Users' or text()='Users']")
	private WebElement usrMgmt_Users;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Users')]//div/div)[2]")
	private WebElement new_user_btn;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Roles')]//div/div)[2]")
	private WebElement new_role_Btn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Role-NewRole-ManagePreferences']/input")
	private WebElement manage_preference_chkbox;
	

	public WebElement getManage_preference_chkbox() {
		return manage_preference_chkbox;
	}

	@FindBy(xpath="(//span[contains(@data-csi-automation,'actions-Site-Roles')]/span/span/span)[1]")
	private WebElement usrMgmt_MoreOptions;
	@FindBy(xpath="(//span[contains(@data-csi-automation,'actions-Site-Roles')]/span/span)[2]")
	private WebElement usrMgmt_MoreOptions1;
	@FindBy(xpath="(//span[contains(@data-csi-automation,'actions-Site-Roles')]/span/span)[3]")
	private WebElement usrMgmt_MoreOptions2;
	@FindBy(xpath="(//span[contains(@data-csi-automation,'actions-Site-Roles')]/span)[4]")
	private WebElement usrMgmt_MoreOptions3;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'NewUser')]/div/div/input)[1]")
	private WebElement user_login;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'NewUser')]/input)[1]")
	private WebElement Active_chkbox;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'NewUser')]/div/div/input)[2]")
	private WebElement firstname;


	
	@FindBy(xpath="((//table[contains(@data-csi-automation,'actions-Site-Roles')]/tbody/tr)[1]/td)[2]")
	private WebElement usrMgmt_SecurityRoles;
	//@FindBy(xpath="(//table[contains(@data-csi-automation,'actions-Site-Roles')]/tbody/tr/td[contains(text(),'Select Security Roles')])[1]")
	//private WebElement usrMgmt_SecurityRoles1;
	@FindBy(xpath="(//table[contains(@data-csi-automation,'actions-Site-Roles-')]/tbody/tr[1]/td[contains(text(),'Select Security Roles')])[1]")
	private WebElement usrMgmt_SecurityRoles2;
	@FindBy(xpath="(//table[contains(@data-csi-automation,'actions-Site-Roles-C10533')]/tbody/tr/td[contains(text(),'Select Security Roles')])[1]")
	private WebElement usrMgmt_SecurityRoles3;
	@FindBy(xpath="(//table[contains(@data-csi-automation,'actions-Site-Roles-C10534')]/tbody/tr/td[contains(text(),'Select Security Roles')])[1]")
	private WebElement usrMgmt_SecurityRoles4;
	@FindBy(xpath="(//div[contains(@data-csi-automation,'SecurityRolesAndGroups')]/div[3]//input)[3]")
	private WebElement selectbtn;
	@FindBy(xpath="//th[contains(@class,'csi-table-selection-column noexport firstColumn')]/div/input")
	private WebElement securityroleschkbox;
	@FindBy(xpath="(//td[text()='EC Admin']/parent::tr/td/div/input)[1]")
	private WebElement selectmemebersAdmin;
	@FindBy(xpath="(//td[text()='EC Edit']/parent::tr/td/div/input)[1]")
	private WebElement selectmemebersEdit;
	@FindBy(xpath="(//td[text()='EC User']/parent::tr/td/div/input)[1]")
	private WebElement selectmemebersUser;
	@FindBy(xpath="(//td[text()='EC View']/parent::tr/td/div/input)[1]")
	private WebElement selectmemebersView;
	
	public WebElement getSelectmemebersAdmin() {
		return selectmemebersAdmin;
	}

	public WebElement getSelectmemebersEdit() {
		return selectmemebersEdit;
	}

	public WebElement getSelectmemebersUser() {
		return selectmemebersUser;
	}

	public WebElement getSelectmemebersView() {
		return selectmemebersView;
	}

	public WebElement getSecurityroleschkbox() {
		return securityroleschkbox;
	}

	public WebElement getSelectbtn() {
		return selectbtn;
	}

	@FindBy(xpath="((//table[contains(@data-csi-automation,'actions-Site-Roles')]/tbody/tr)[2]/td)[2]")
	private WebElement select_members1;
	@FindBy(xpath="(//table[contains(@data-csi-automation,'actions-Site-Roles-C10532')]/tbody/tr/td[contains(text(),'Select Members')])[1]")
	private WebElement select_members2;
	@FindBy(xpath="(//table[contains(@data-csi-automation,'actions-Site-Roles-C10533')]/tbody/tr/td[contains(text(),'Select Members')])[1]")
	private WebElement select_members3;
	@FindBy(xpath="(//table[contains(@data-csi-automation,'actions-Site-Roles-C10534')]/tbody/tr/td[contains(text(),'Select Members')])[1]")
	private WebElement select_members4;
	@FindBy(xpath="//span[@data-csi-tab-name='Enumerations']")
	private WebElement Enumeration_tab;
	@FindBy(xpath="(//input[@type='button']/ancestor::tr/th/span[contains(@data-csi-automation,'filter-Site-Enumerations-Node Name')])[1]")
	private WebElement Enumeration_selecttab;
	@FindBy(xpath="//div[text()='New Enumeration Value']")
	private WebElement Enumeration_Value;
	

	public WebElement getEnumeration_Value() {
		return Enumeration_Value;
	}

	public WebElement getEnumeration_tab() {
		return Enumeration_tab;
	}

	public WebElement getEnumeration_selecttab() {
		return Enumeration_selecttab;
	}

	public WebElement getUsrMgmt_MoreOptions1() {
		return usrMgmt_MoreOptions1;
	}

	public WebElement getUsrMgmt_MoreOptions2() {
		return usrMgmt_MoreOptions2;
	}

	public WebElement getUsrMgmt_MoreOptions3() {
		return usrMgmt_MoreOptions3;
	}

	//public WebElement getUsrMgmt_SecurityRoles1() {
		//return usrMgmt_SecurityRoles1;
	//}

	public WebElement getUsrMgmt_SecurityRoles2() {
		return usrMgmt_SecurityRoles2;
	}

	public WebElement getUsrMgmt_SecurityRoles3() {
		return usrMgmt_SecurityRoles3;
	}

	public WebElement getUsrMgmt_SecurityRoles4() {
		return usrMgmt_SecurityRoles4;
	}

	public WebElement getSelect_members1() {
		return select_members1;
	}

	public WebElement getSelect_members2() {
		return select_members2;
	}

	public WebElement getSelect_members3() {
		return select_members3;
	}

	public WebElement getSelect_members4() {
		return select_members4;
	}

	@FindBy(xpath="//span[contains(@data-csi-automation,'SecurityRolesAndGroups-CustomViewActions')]")
	private WebElement usrMgmt_Views;

	@FindBy(xpath="//table[@data-csi-automation='plugin-Role-SecurityRolesAndGroups-CustomViewActions']//tr[contains(@data-csi-act,'CustomViewManage')]")
	private WebElement usrMgmt_Manage_Views;

	@FindBy(xpath="//span[@widgetid='prefCopy']/span")
	private WebElement usrMgmt_Copy;

	@FindBy(xpath="//input[@id='prefName']")
	private WebElement usrMgmt_Copy_Value;

	@FindBy(xpath="(((//div[@id='customViewsTabContainer']/div)[1]/div)[4]/div/div)[2]")
	private WebElement usrMgmt_Filter;

	@FindBy(xpath="(//span[@title='Add'])[1]")
	private WebElement usrMgmt_Add;

	@FindBy(xpath="(//td[@role='gridcell']//input[@aria-autocomplete='both'])[1]")
	private WebElement usrMgmt_Attribute;

	@FindBy(xpath="(//td[@role='gridcell']//input[@aria-autocomplete='both'])[2]")
	private WebElement usrMgmt_Operator;

	@FindBy(xpath="(//td[@role='gridcell']//input[@aria-autocomplete='list'])")
	private WebElement usrMgmt_Value;

	@FindBy(xpath="(((//div[@id='customViewsTabContainer']/div)[1]/div)[4]/div/div)[6]")
	private WebElement usrMgmt_Options;

	@FindBy(xpath="(//input[@id='querySize'])[1]")
	private WebElement usrMgmt_ResultsSize;

	@FindBy(xpath="//input[@title='Toggle selections of all displayed items']")
	private WebElement usrMgmt_All;

	@FindBy(xpath="//span[@data-csi-tab-name='Announcements' or text()='Announcements']")
	private WebElement usrMgmt_Ancmnts;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'Announcement')]//div/div)[2]")
	private WebElement new_Ancmnt_Btn;

	@FindBy(xpath="//td[contains(@class,'firstColumn') and @data-csi-heading='Message::0']")
	private WebElement usrMgmt_Ancmnts_Msg;

	@FindBy(xpath="//a[@data-csi-context-parent-attr='Announcements']")
	private WebElement usrMgmt_Ancmnts_Edit;

	@FindBy(xpath="//div[@class='fr-element fr-view']")
	private WebElement usrMgmt_Ancmnts_EditMsg_value;

	@FindBy(xpath="//button[@data-cmd='bold']")
	private WebElement usrMgmt_Ancmnts_Bold;

	@FindBy(xpath="//button[@data-cmd='fontSize']")
	private WebElement usrMgmt_Ancmnts_FontSize;

	@FindBy(xpath="//a[@data-cmd='fontSize' and @title='30']")
	private WebElement usrMgmt_Ancmnts_FontSize_30;

	@FindBy(xpath="//button[@data-cmd='textColor']")
	private WebElement usrMgmt_Ancmnts_Color;

	@FindBy(xpath="(//span[@data-cmd='applytextColor'])[5]")
	private WebElement usrMgmt_Ancmnts_purpleColor;

	@FindBy(xpath="//td[@data-csi-heading='EffectiveTo::0']")
	private WebElement usrMgmt_Ancmnts_EffectiveTo;

	@FindBy(xpath="//td[contains(@class,'CurrentDate')]")
	private WebElement usrMgmt_Ancmnts_CurrentDate;

	@FindBy(xpath="//td[@data-csi-heading='Companies::0']")
	private WebElement usrMgmt_Ancmnts_Companies;

	@FindBy(xpath="//input[contains(@value,'CompanyInfo')]")
	private WebElement usrMgmt_Ancmnts_HostCompanies;


	public WebElement getUsrManagement() {
		return UsrManagement;
	}

	public WebElement getUsrMgmt_Roles() {
		return usrMgmt_Roles;
	}

	public WebElement getUsrMgmt_Users() {
		return usrMgmt_Users;
	}

	public WebElement getNew_role_Btn() {
		return new_role_Btn;
	}
	
	public WebElement getNew_user_btn() {
		return new_user_btn;
	}

	public WebElement getUser_login() {
		return user_login;
	}

	public WebElement getActive_chkbox() {
		return Active_chkbox;
	}

	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getUsrMgmt_MoreOptions() {
		return usrMgmt_MoreOptions;
	}

	public WebElement getUsrMgmt_SecurityRoles() {
		return usrMgmt_SecurityRoles;
	}

	public WebElement getUsrMgmt_Views() {
		return usrMgmt_Views;
	}

	public WebElement getUsrMgmt_Manage_Views() {
		return usrMgmt_Manage_Views;
	}

	public WebElement getUsrMgmt_Copy() {
		return usrMgmt_Copy;
	}

	public WebElement getUsrMgmt_Copy_Value() {
		return usrMgmt_Copy_Value;
	}

	public WebElement getUsrMgmt_Filter() {
		return usrMgmt_Filter;
	}

	public WebElement getUsrMgmt_Add() {
		return usrMgmt_Add;
	}

	public WebElement getUsrMgmt_Attribute() {
		return usrMgmt_Attribute;
	}

	public WebElement getUsrMgmt_Operator() {
		return usrMgmt_Operator;
	}

	public WebElement getUsrMgmt_Value() {
		return usrMgmt_Value;
	}

	public WebElement getUsrMgmt_Options() {
		return usrMgmt_Options;
	}

	public WebElement getUsrMgmt_ResultsSize() {
		return usrMgmt_ResultsSize;
	}

	public WebElement getUsrMgmt_All() {
		return usrMgmt_All;
	}

	public WebElement getUsrMgmt_Ancmnts() {
		return usrMgmt_Ancmnts;
	}

	public WebElement getNew_Ancmnt_Btn() {
		return new_Ancmnt_Btn;
	}

	public WebElement getUsrMgmt_Ancmnts_Msg() {
		return usrMgmt_Ancmnts_Msg;
	}

	public WebElement getUsrMgmt_Ancmnts_Edit() {
		return usrMgmt_Ancmnts_Edit;
	}

	public WebElement getUsrMgmt_Ancmnts_EditMsg_value() {
		return usrMgmt_Ancmnts_EditMsg_value;
	}

	public WebElement getUsrMgmt_Ancmnts_Bold() {
		return usrMgmt_Ancmnts_Bold;
	}

	public WebElement getUsrMgmt_Ancmnts_FontSize() {
		return usrMgmt_Ancmnts_FontSize;
	}

	public WebElement getUsrMgmt_Ancmnts_FontSize_30() {
		return usrMgmt_Ancmnts_FontSize_30;
	}

	public WebElement getUsrMgmt_Ancmnts_Color() {
		return usrMgmt_Ancmnts_Color;
	}

	public WebElement getUsrMgmt_Ancmnts_purpleColor() {
		return usrMgmt_Ancmnts_purpleColor;
	}

	public WebElement getUsrMgmt_Ancmnts_EffectiveTo() {
		return usrMgmt_Ancmnts_EffectiveTo;
	}

	public WebElement getUsrMgmt_Ancmnts_CurrentDate() {
		return usrMgmt_Ancmnts_CurrentDate;
	}

	public WebElement getUsrMgmt_Ancmnts_Companies() {
		return usrMgmt_Ancmnts_Companies;
	}

	public WebElement getUsrMgmt_Ancmnts_HostCompanies() {
		return usrMgmt_Ancmnts_HostCompanies;
	}

	//project type
	@FindBy(xpath="//span[@data-csi-tab-name='Shared Teams' or text()='Shared Teams']")
	private WebElement sharedteamtab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'HierarchySecurityGroups-ToolbarNewActions')]//div/div)[2]")
	private WebElement Newsharedbtn;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'field-HierarchySecurityGroup-Form-Node Name')]/div)/div/input)[1]")
	private WebElement sharedname;

	@FindBy(xpath="((//div[contains(@data-csi-automation,'field-HierarchySecurityGroup-Form-ForLevel')]/div)[3]//input)[1]")
	private WebElement sharedtype;


	public WebElement getSharedteamtab() {
		return sharedteamtab;
	}

	public WebElement getNewsharedbtn() {
		return Newsharedbtn;
	}

	public WebElement getSharedname() {
		return sharedname;
	}

		public WebElement getSharedtype() {
		return sharedtype;
	}
//Engineering Change
	@FindBy(xpath="//span[text()='Engineering Change' or @data-csi-tab-name='Engineering']")
	private WebElement Engineering_Change_Tab;
	
	@FindBy(xpath="//span[text()='All Engineering Changes' or @data-csi-tab-name='Engineering']")
	private WebElement AllEngineering_Changes_Tab;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'AllECs')]//div[text()='New Engineering Change']")
	private WebElement New_Engineering_Changebtn;
	
	@FindBy(xpath="//a[text() = 'New Style']")
	private WebElement NeWStylebtn;
	
	@FindBy(xpath="(//a[text()='New Style']//following::span[text()='mode_edit'])[1]")
	private WebElement NewStyle_Edit_btn;
	
	@FindBy(xpath="(//a[text()='Style1']//following::span[text()='close'])[1]")
	private WebElement NewStyle_Close_btn;
	
		@FindBy(xpath="//span[text()='Views']/parent::span[1]")
	private WebElement Viewbtn;
	
	@FindBy(xpath="(//tr[contains(@data-csi-automation,'EngineeringChange-Properties-CustomViewManage')]//td[text()='Manage Views'])")
	private WebElement ManageViewbtn;
	
	@FindBy(xpath="//div[text()='Allowed Revision State']/parent::th/following-sibling::td")
	private WebElement Allrevisionbtn;
	
	@FindBy(xpath="//div[text()='Effective End']/parent::th/following-sibling::td")
	private WebElement Effectiveend_date;
	
	@FindBy(xpath="//span[text()='7']")
	private WebElement Startdate;
	
	@FindBy(xpath="//div[text()='Effective Start']/parent::th/following-sibling::td")
	private WebElement Effectivestart_date;
	
	
	@FindBy(xpath="//span[text()='8']")
	private WebElement Enddate;
	
	@FindBy(xpath="//span[text()='Affected Items' or @data-csi-tab-name='Affected Items']")
	private WebElement Affected_Items;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'AffectedItemsView')]//div[text()='New Affected Item']")
	private WebElement NewAffected_Items;
	
	@FindBy(xpath="(//td[text()='Apparel - Color and Size']//parent::tr//div/input)[7]")
	private WebElement Aparel_colorandsizebtn;
	
	
	@FindBy(xpath="//td[@data-csi-act='AffectedColors::0']")
	private WebElement Affected_Colors;
	
	@FindBy(xpath="//td[@data-csi-act='AffectedSKUs::0']")
	private WebElement Affected_SKU;
	
	@FindBy(xpath="//td[@data-csi-act='AffectedIssues::0']")
	private WebElement Affected_Issue;
	
	@FindBy(xpath="(//label[contains(text(),'EC_Issue')]/parent::div/div)[1]")
	private WebElement Issue_chkbox;
	
	
	@FindBy(xpath="(//label[contains(text(),'11-0103 EGRET')]//parent::div/div[1])[1]")
	private WebElement EGRETCheckbox;
	
	@FindBy(xpath="(//label[contains(text(),'Blue Color faded')]//parent::div/div[1])[1]")
	private WebElement AffectedSku_chkbox;
	
	@FindBy(xpath="//span[text()='Style' or @data-csi-tab-name='Style']")
	private WebElement Style_tab;
	
	@FindBy(xpath="//span[text()='SKUs' or @data-csi-tab-name='SKUs']")
	private WebElement SKUs_tab;
	
	@FindBy(xpath="//span[text()='Issues' or @data-csi-tab-name='Issues']")
	private WebElement Issue_tab;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'Issues')]//div[text()='New Issue']")
	private WebElement NewIssue_btn;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'ProductSKU')]//div[text()='New Style SKU']")
	private WebElement NewStyleSKU;
	
	@FindBy(xpath="(//th[text()='Style SKU']//parent::tr//div/input)[2]")
	private WebElement Style_Skuvalue;
	
	@FindBy(xpath="(//th[text()='Issue']//parent::tr//div/input)[2]")
	private WebElement IssueValue;
	
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'Matrix')]/input)[1]")
	private WebElement Matrixchkbox;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'IssueProductColors')]/div)[1]")
	private WebElement ProductColors_btn;

	@FindBy(xpath="(//label[contains(text(),'All')]//parent::div/div/input[1])[1]")
	private WebElement All_chkbox;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'IssueProductSize')]/div)[1]")
	private WebElement Product_size;

	
	@FindBy(xpath="(//label[contains(text(),'All')]//parent::div/div/input[1])[2]")
	private WebElement All_chkbox2;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-Issue-Form-CreateOneIssuePerColorSize')]/input)[1]")
	private WebElement issuesize_chkbox;

	
	public WebElement getStyle_Skuvalue() {
		return Style_Skuvalue;
	}

	public WebElement getStyle_tab() {
		return Style_tab;
	}

	public WebElement getSKUs_tab() {
		return SKUs_tab;
	}

	public WebElement getIssue_tab() {
		return Issue_tab;
	}

	public WebElement getNewIssue_btn() {
		return NewIssue_btn;
	}

	public WebElement getNewStyleSKU() {
		return NewStyleSKU;
	}

	public WebElement getMatrixchkbox() {
		return Matrixchkbox;
	}

	public WebElement getProductColors_btn() {
		return ProductColors_btn;
	}

	public WebElement getAffectedSku_chkbox() {
		return AffectedSku_chkbox;
	}

	public WebElement getAllrevisionbtn() {
		return Allrevisionbtn;
	}

	public WebElement getEngineering_Change_Tab() {
		return Engineering_Change_Tab;
	}

	public WebElement getAllEngineering_Changes_Tab() {
		return AllEngineering_Changes_Tab;
	}

	public WebElement getNew_Engineering_Changebtn() {
		return New_Engineering_Changebtn;
	}

	public WebElement getNeWStylebtn() {
		return NeWStylebtn;
	}

	public WebElement getNewStyle_Edit_btn() {
		return NewStyle_Edit_btn;
	}

	public WebElement getNewStyle_Close_btn() {
		return NewStyle_Close_btn;
	}

	public WebElement getViewbtn() {
		return Viewbtn;
	}

	public WebElement getManageViewbtn() {
		return ManageViewbtn;
	}

	public WebElement getEffectiveend_date() {
		return Effectiveend_date;
	}

	public WebElement getStartdate() {
		return Startdate;
	}

	public WebElement getEffectivestart_date() {
		return Effectivestart_date;
	}

	public WebElement getEnddate() {
		return Enddate;
	}

	public WebElement getAffected_Items() {
		return Affected_Items;
	}

	public WebElement getNewAffected_Items() {
		return NewAffected_Items;
	}

	public WebElement getAparel_colorandsizebtn() {
		return Aparel_colorandsizebtn;
	}

	public WebElement getAffected_Colors() {
		return Affected_Colors;
	}

	public WebElement getAffected_SKU() {
		return Affected_SKU;
	}

	public WebElement getEGRETCheckbox() {
		return EGRETCheckbox;
	}

	public WebElement getAll_chkbox() {
		return All_chkbox;
	}

	public WebElement getProduct_size() {
		return Product_size;
	}

	public WebElement getAll_chkbox2() {
		return All_chkbox2;
	}

	public WebElement getIssuesize_chkbox() {
		return issuesize_chkbox;
	}

	public WebElement getIssueValue() {
		return IssueValue;
	}

	public WebElement getAffected_Issue() {
		return Affected_Issue;
	}

	public WebElement getIssue_chkbox() {
		return Issue_chkbox;
	}


}
