package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class StylePage extends Commonactions{
	

	
	public StylePage() {
		
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	
	
	@FindBy(xpath="//span[text()='Seasons' or @data-csi-tab-name='Seasons']")
	private WebElement season_Btn;
	
	@FindBy(xpath="//span[text()='Styles' or @data-csi-tab-name='Styles']")
	private WebElement styles_Btn;
	
	@FindBy(xpath="//span[text()='Hierarchy' or @data-csi-tab-name='Hierarchy']")
	private WebElement hierarchy_btn;
	
	@FindBy(xpath="//span[text()='Style Gallery' or @data-csi-tab-name='Style Gallery']")
	private WebElement style_Gallery_Btn;
	
	@FindBy(xpath="//span[text()='Colorways' or @data-csi-tab-name='Colorways']")
	private WebElement colorwaysBtn;
	
	@FindBy(xpath="//span[text()='Samples' or @data-csi-tab-name='Samples']")
	private WebElement samplesBtn;
	
	@FindBy(xpath="//span[text()='Sample Storage' or @data-csi-tab-name='Sample Storage']")
	private WebElement sampleStorageBtn;
	
	@FindBy(xpath="//span[text()='Style SKUs' or @data-csi-tab-name='Style SKUs']")
	private WebElement style_SKU_Btn;
	
	@FindBy(xpath="//span[text()='Competitive Styles' or @data-csi-tab-name='Competitive Styles']")
	private WebElement competitive_style_Btn;
	
	@FindBy(xpath="//span[text()='Inspiration' or @data-csi-tab-name='Inspiration']")
	private WebElement inspiration_Btn;
	
	@FindBy(xpath="//span[text()='Supplier Requests' or @data-csi-tab-name='Supplier Requests']")
	private WebElement supplier_req_Btn;
	
	@FindBy(xpath="//table[@data-csi-url='centric:']")
	private WebElement new_season_Btn;
	
	@FindBy(xpath="(//span[contains(@class,'material-icons') and text()='add_a_photo'])[1]")
	private WebElement img_icon;
	
	@FindBy(xpath="(//div[@class='dgrid-content ui-widget-content'])[1]/div[6]/table/tr/td[1]")
	private WebElement upload_Btn;
	
	@FindBy(xpath="(//div[@class='attrImage'])[1]/img")
	private WebElement select_img_Btn;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])")
	private WebElement save_img_Btn;
	
	@FindBy(xpath="(//span[@data-csi-act='Edit'])[1]")
	private WebElement edit_Btn;
	
	@FindBy(xpath="//td[contains(@class,'firstColumn') and @data-csi-heading='Node Name::0']/a")
	private WebElement select_season;

	@FindBy(css="[data-csi-automation='field-Collection-Form-LabelTemplate'] .dijitArrowButton")
	private WebElement CollectionTempBtn;
	
	public WebElement getHierarchy_btn() {
		return hierarchy_btn;
	}

	public WebElement getCollectionTempBtn() {
		return CollectionTempBtn;
	}

	public WebElement getSelect_season() {
		return select_season;
	}

	public WebElement getEdit_Btn() {
		return edit_Btn;
	}

	public WebElement getSeason_Btn() {
		return season_Btn;
	}

	public WebElement getStyles_Btn() {
		return styles_Btn;
	}

	public WebElement getStyle_Gallery_Btn() {
		return style_Gallery_Btn;
	}

	public WebElement getColorwaysBtn() {
		return colorwaysBtn;
	}

	public WebElement getSamplesBtn() {
		return samplesBtn;
	}

	public WebElement getSampleStorageBtn() {
		return sampleStorageBtn;
	}

	public WebElement getStyle_SKU_Btn() {
		return style_SKU_Btn;
	}

	public WebElement getCompetitive_style_Btn() {
		return competitive_style_Btn;
	}

	public WebElement getInspiration_Btn() {
		return inspiration_Btn;
	}

	public WebElement getSupplier_req_Btn() {
		return supplier_req_Btn;
	}

	public WebElement getNew_season_Btn() {
		return new_season_Btn;
	}

	public WebElement getImg_icon() {
		return img_icon;
	}

	public WebElement getUpload_Btn() {
		return upload_Btn;
	}

	public WebElement getSelect_img_Btn() {
		return select_img_Btn;
	}

	public WebElement getSave_img_Btn() {
		return save_img_Btn;
	}
	
	///////////////
	@FindBy(xpath="(//span[text()='Actions'])[1]/parent::span")
	private WebElement Actionstab;
	
	@FindBy(xpath="(//td[text()='Push Colorways to Styles'])[1]")
	private WebElement Pushcolorways;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-Style-PushColor')]/div/input)[1]")
	private WebElement colorways;
	
	@FindBy(xpath="(//label[contains(text(),'11-0103 EGRET')]//parent::div/div/input)[1]")
	private WebElement EGRETchkbox;
	
	@FindBy(xpath="(//label[contains(text(),'11-0105 ANTIQUE WHITE')]//parent::div/div/input)[1]")
	private WebElement AntiqueWhitechkbox;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name::0')]/a[text()='Apparel - Color and Size'])")
	private WebElement Apparel_color_and_size;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name::0')]/a[text()='Apparel-BO'])")
	private WebElement Apparel_Bo;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'AttributeGroups')]/div/input)[1]")
	private WebElement Attributegroups;
	
	@FindBy(xpath="//label[contains(text(),'AUT_AWGP02 (Colorway)')]//parent::div/div/input")
	private WebElement colorwayattr;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'PushColorwaysSelectColorways-AddToBOMs')]/input)[1]")
	private WebElement AddtoBOMchkbox;
	
	@FindBy(xpath="(//td[text()='Apparel-BO']/parent::tr/td/div/input)[1]")
	private WebElement ApparelBOchkbox;
	
	@FindBy(xpath="//span[text()='Colorways' or @data-csi-tab-name='Colorways']")
	private WebElement Colorwaystab;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name::0')]/a[text()='11-0103 EGRET'])")
	private WebElement EGRETcolor;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name::0')]/a[text()='11-0105 ANTIQUE WHITE'])")
	private WebElement AntiqueWhiteColor;
	
	@FindBy(xpath="//input[@value='Apparel-BO']")
	private WebElement ApparelBOedit;
	
	@FindBy(xpath="//a[text()='11-0103 EGRET-edit']/ancestor::tr/td[2]")
	private WebElement code;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Collection-Styles-ToolbarNewActions']")
	private WebElement newstyleact;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-Node Name']")
	private WebElement styleinp;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-Auto_Test']")
	private WebElement testautchkbx;
	
	public WebElement getTestautchkbx() {
		return testautchkbx;
	}

	public WebElement getNewstyleact() {
		return newstyleact;
	}

	public WebElement getStyleinp() {
		return styleinp;
	}

	public WebElement getCode() {
		return code;
	}

	
	public WebElement getApparelBOedit() {
		return ApparelBOedit;
	}


	public WebElement getAttributegroups() {
		return Attributegroups;
	}

	public WebElement getColorwayattr() {
		return colorwayattr;
	}

	public WebElement getAddtoBOMchkbox() {
		return AddtoBOMchkbox;
	}

	
	public WebElement getApparelBOchkbox() {
		return ApparelBOchkbox;
	}

	public WebElement getActionstab() {
		return Actionstab;
	}

	public WebElement getPushcolorways() {
		return Pushcolorways;
	}

	public WebElement getColorways() {
		return colorways;
	}

	
	
	public WebElement getEGRETchkbox() {
		return EGRETchkbox;
	}

	public WebElement getAntiqueWhitechkbox() {
		return AntiqueWhitechkbox;
	}

	public WebElement getApparel_color_and_size() {
		return Apparel_color_and_size;
	}

	public WebElement getApparel_Bo() {
		return Apparel_Bo;
	}

	public WebElement getColorwaystab() {
		return Colorwaystab;
	}

	
	
	public WebElement getEGRETcolor() {
		return EGRETcolor;
	}

	public WebElement getAntiqueWhiteColor() {
		return AntiqueWhiteColor;
	}
////////////////////////////////////////////////////
	@FindBy(xpath="//div[text()='New Sample Storage']")
	private WebElement Newsamplebtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-SampleStorage')]/div/div/input")
	private WebElement sample_storage_input;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-SampleStorage')]/div[2]/input)[1]")
	private WebElement sample_storage_bin;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-SampleStorage-Form-MaxBinNumber')]/div[2]/input)[1]")
	private WebElement sample_storage_maxbin;

	@FindBy(xpath="//a[text()='AUT_sample']//ancestor::tr/td/div/input")
	private WebElement sample_chkbox ;

	@FindBy(xpath="//a[text()='AUT_sample']")
	private WebElement AUT_samplebtn ;

	@FindBy(xpath="//a[text()='AUT_sample']/ancestor::tr/td/div/span[text()='mode_edit']")
	private WebElement AUT_sample_edit ;

	public WebElement getAUT_sample_edit() {
		return AUT_sample_edit;
	}
	@FindBy(xpath="//a[text()='AUT_sample1']/ancestor::tr/td/div/span[text()='close']")
	private WebElement AUT_sample_close ;

	@FindBy(xpath="//span[text()='Material Samples' or @data-csi-tab-name='Material Samples']")
	private WebElement Materialsamplestab ;
	
	@FindBy(xpath="//span[text()='Style Samples' or @data-csi-tab-name='Style Samples']")
	private WebElement stylesamplestab ;

	@FindBy(xpath="(//div[text()='New Material Sample'])[1]")
	private WebElement newMaterialsample_btn ;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-MaterialSample-Form-ProductType')]/div/input)[3]")
	private WebElement materail_Type ;
	
	@FindBy(xpath="(//span[text()='remove_circle_outline'])[1]")
	private WebElement Delete_circle ;
	
	@FindBy(xpath="(//span[text()='mode_edit'])[2]")
	private WebElement Edit_material ;
	
	@FindBy(xpath="(//div[text()='Select Style Samples'])[1]")
	private WebElement New_style_sample_btn ;
	
	@FindBy(xpath="(//td[text()='Apparel - Color and Size']//ancestor::tr/td/div/input)[1]")
	private WebElement Apparel_Color_chkbox ;
	
	@FindBy(xpath="//a[text()='Changshu']/parent::td/following-sibling::td/div/span[text()='content_copy']")
	private WebElement content_copy_Apparel ;
	
	@FindBy(xpath="(//a[text()='Changshu']/parent::td/following-sibling::td/div/span[text()='remove_circle_outline'])[1]")
	private WebElement Delete_Apparel ;
	
	
	public WebElement getNewsamplebtn() {
		return Newsamplebtn;
	}
	
	public WebElement getSample_storage_input() {
		return sample_storage_input;
	}
	
	
	public WebElement getMaterialsamplestab() {
		return Materialsamplestab;
	}

	public WebElement getStylesamplestab() {
		return stylesamplestab;
	}

	public WebElement getNewMaterialsample_btn() {
		return newMaterialsample_btn;
	}
	public WebElement getSample_storage_bin() {
		return sample_storage_bin;
	}
	
	public WebElement getSample_storage_maxbin() {
		return sample_storage_maxbin;
	}
	public WebElement getSample_chkbox() {
		return sample_chkbox;
	}
	
	public WebElement getAUT_sample_close() {
		return AUT_sample_close;
	}
	
	
	
	public WebElement getMaterail_Type() {
		return materail_Type;
	}

	public WebElement getDelete_circle() {
		return Delete_circle;
	}

	public WebElement getEdit_material() {
		return Edit_material;
	}

	public WebElement getNew_style_sample_btn() {
		return New_style_sample_btn;
	}
	public WebElement getAUT_samplebtn() {
		return AUT_samplebtn;
	}
	

	public WebElement getApparel_Color_chkbox() {
		return Apparel_Color_chkbox;
	}

	public WebElement getContent_copy_Apparel() {
		return content_copy_Apparel;
	}

	public WebElement getDelete_Apparel() {
		return Delete_Apparel;
	}

}
