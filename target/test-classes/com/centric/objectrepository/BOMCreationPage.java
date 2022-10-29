package com.centric.objectrepository;

import com.centric.resources.Commonactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Yuvaraj
 *
 */
public class BOMCreationPage extends Commonactions {

  
	
	public BOMCreationPage() {
		
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	

	@FindBy(xpath="//a[text()='Product Specification Setup']")
	private WebElement ProdSpecSetup;

	@FindBy(xpath="//a/span[text()='BOM Sections']")
	private WebElement BOMSection;

	@FindBy(xpath="//table[contains(@data-csi-automation,'StyleBOMSectionDefinitions')]//div[text()='New BOM Section']")
	private WebElement NewBomSecBtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BOMSectionDefinition')]//div[2]/div/input")
	private WebElement BOMSecVaue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-BOMSectionDefinition-Form-SortOrder')]//div[2]/input[1]")
	private WebElement Sortvalue;

	@FindBy(xpath="//div[text()='Sort Order must be unique for each BOM Section.']")
	private WebElement errormessage;

	@FindBy(xpath="(//td[contains(@data-csi-act,'ApplicableStyleTypes')])[3]")
	private WebElement applicablestyletype ;

	@FindBy(xpath="//label[text()='Accessories - Only Color']//parent::div/div/input")
	private WebElement AccOnlyColor;

	@FindBy(xpath="//label[text()='Apparel - Color and Size']//parent::div/div/input")
	private WebElement AppColorandSize;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'QueryFilter')])[2]")
	private WebElement QueryFilter;

	@FindBy(xpath="//input[@id='editFilterName']")
	private WebElement FilterName;

	@FindBy(xpath="//span[text()='Add Filter']")
	private WebElement AddFilter;

	@FindBy(xpath="(//div[@role='region']//div[text()='Material'])[2]")
	private WebElement MaterialFilter;

	@FindBy(xpath="//tr[@role=\"presentation\"]//span[text()='Equals']")
	private WebElement CheckEquals;

	@FindBy(xpath="//td[text()='Matches']")
	private WebElement Matches;

	@FindBy(xpath="//div/input[@name='value1']")
	private WebElement Filtervalue;

	@FindBy(xpath="//span[@data-csi-act='Delete' or text()='close']")
	private WebElement DeletestyleBom;

	@FindBy(xpath="//span[@data-csi-act='Edit' or text()='mode_edit']")
	private WebElement EditStyleBOM;

	@FindBy(xpath="//table[contains(@data-csi-automation,'MaterialBOMSections')]//div[text()='New BOM Section']")
	private WebElement materailBomSectionBtn ;

	@FindBy(xpath="//td[contains(@data-csi-act,'ApplicableMaterialTypes')]/div")
	private WebElement AppMaterialType;

	@FindBy(xpath="//label[text()='Fabric - Stanadlone']//parent::div/div/input")
	private WebElement Fabricstandalone;

	@FindBy(xpath="//td[contains(@data-csi-act,'PlacementProductTypes')]")
	private WebElement PlacementProductTypes;

	@FindBy(xpath="//div[contains(text(),'Material BOM')]//parent::div//span[@data-csi-act='Delete' or text()='close']")
	private WebElement deleteMAterialBOM;

	@FindBy(xpath="//div[contains(text(),'Material BOM')]//parent::div//span[@data-csi-act='Edit' or text()='mode_edit']")
	private WebElement EditMaterialBOM;

	@FindBy(xpath="//span[@title='Enter Full Screen']")
	private WebElement fullScreen;

	@FindBy(xpath="//table[@data-csi-act='ViewPrint']//td[@role='button']")
	private WebElement PrintBtn;

	@FindBy(xpath="//table[contains(@data-csi-automation,'StyleBOMSectionDefinitions-print')]//td[text()='Print Preview']")
	private WebElement printreview;

	@FindBy(xpath="//a/span[text()='BOM Templates']")
	private WebElement BomTemplate;

	@FindBy(xpath="//div[@data-csi-automation='field-ApparelBOM-Form-Subtype']//div[3]/input[1]")
	private WebElement TemplateSubType;

	@FindBy(xpath="//table[contains(@data-csi-automation,'StyleBOMTemplates')]//div[text()='New Style BOM Template']")
	private WebElement NewStyleBOMTemplate;

	@FindBy(xpath="//div[@data-csi-automation='field-ApparelBOM-Form-Node Name']//div/div/input")
	private WebElement StyleBOM;

	@FindBy(xpath="//span[@data-csi-tab-name='TDS' or text()='TDS']")
	private WebElement TDS;

	@FindBy(xpath="//span[@data-csi-tab-name='Canvas' or text()='Canvas']")
	private WebElement Canvas;

	@FindBy(xpath="//span[@data-csi-tab-name='Composition' or text()='Care & Composition']")
	private WebElement Composition;

	@FindBy(xpath="//span[@data-csi-tab-name='Placements']")
	private WebElement Placement;

	@FindBy(xpath="//span[@data-csi-tab-name='Multi-level Placement' or contains(text(),'Multi-level Placement')]")
	private WebElement Multi_level_Placement;

	@FindBy(xpath="//span[text()='Create a new Canvas']")
	private WebElement NewCanvasbtn;

	@FindBy(xpath="//span[@title='Line']")
	private WebElement Line;

	@FindBy(xpath="//table[contains(@data-csi-automation,'CareSymbol')]//div[text()='Select Care Labels']")
	private WebElement carelabelBtn;

	@FindBy(xpath="(//span[text()='Select Care Labels']//following::input[@type='checkbox'])[2]")
	private WebElement carelabelcheckbox;

	@FindBy(xpath="//div/span[@data-csi-act='Remove']")
	private WebElement Removecarelabel;

	@FindBy(xpath="//table[contains(@data-csi-automation,'Languages')]//div[text()='Select Translations']")
	private WebElement Translation;

	@FindBy(xpath="(//span[text()='Language']//following::input[@type='checkbox'])[2]")
	private WebElement Langaugecheckbox1;

	@FindBy(xpath="(//span[text()='Language']//following::input[@type='checkbox'])[4]")
	private WebElement Langaugecheckbox2;

	@FindBy(xpath="//table[contains(@data-csi-automation,'ToolbarNewAction')]//td[contains(text(),'New of Material')]")
	private WebElement Newofmaterial;

	@FindBy(xpath="(//span[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-Actions']//span[text()='Actions'])[1]")
	private WebElement Action1;
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-Actions']//span[text()='Actions'])[2]")
	private WebElement Action2;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-Sections']//td[text()='Sections'])[1]")
	private WebElement Sections1;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-Sections']//td[text()='Sections'])[2]")
	private WebElement Sections2;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-BomSectionMenuSelect']//td[text()='Select Section'])[2]")
	private WebElement SelectSections;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-BomSectionMenuSelect']//td[text()='Select Section'])[1]")
	private WebElement SelectSection;

	@FindBy(xpath="//span[text()='BOM Section']//following::th//input[@type='checkbox']")
	private WebElement SectionCheckBox;

	@FindBy(xpath="(//span[text()='BOM Section']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")
	private WebElement slider1;
	
	@FindBy(xpath="(//span[text()='-']/parent::div)[1]")
	private WebElement slider3;

	@FindBy(xpath="(//span[text()='BOM Section']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[2]")
	private WebElement slider2;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-BomSectionMenuCreate']//td[text()='Create Section'])[2]")
	private WebElement CreateSection;

	@FindBy(xpath="//div[@data-csi-automation='field-BOMSectionDefinition-AdHocForm-Node Name']//div/div/input")
	private WebElement CreateBOMValue;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-BomSectionMenuArrange'])[2]")
	private WebElement arrangeSection;

	@FindBy(xpath="//span[text()='Arrange BOM Section']//following::span[@class=\"csi-dnd-handle\"]")
	private WebElement Arrangefrom;

	@FindBy(xpath="//span[@data-csi-automation='plugin-BOMSectionContainer-ArrangeBOMSections-BomSectionMenuSort' or text()='Restore Site Order']")
	private WebElement Restoresite;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-BomSectionMenuDelete'])[2]")
	private WebElement deletesection;

	@FindBy(xpath="//td[contains(text(),'Delete')]//parent::tr//input")
	private WebElement deletesectioncheckbox;

	@FindBy(xpath="//span[contains(text(),'fabric section')]//following::td[@role='button']")
	private WebElement fabricsectionexpand;

	@FindBy(xpath="//span[contains(text(),'Apparel section')]//following::td[@role='button']")
	private WebElement apparelsectionexpand;

	@FindBy(xpath="//span[contains(text(),'All section')]//following::td[@role='button']")
	private WebElement AllsectionExpand;

	@FindBy(xpath="//span[text()='New from Material']//following::input[@type='checkbox']")
	private WebElement Sectionmaterialcheckbox;

	@FindBy(xpath="//span[text()='chat_bubble_outline']")
	private WebElement EditbuttonBom;

	@FindBy(xpath="//div[@class='fr-element fr-view']")
	private WebElement commentBOM;

	@FindBy(xpath="//td/div/span[text()='content_copy']")
	private WebElement CopyBOMsection;

	@FindBy(xpath="(//td/div/span[text()='close'])[2]")
	private WebElement DeleteBOMSection;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'actionRow-ProductBOMRevision-PartMaterials')]//td[@role='button'])[2]")
	private WebElement fabricsec;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'actionRow-ProductBOMRevision-PartMaterials')]//td//div[text()='add'])[1]")
	private WebElement Apparelsec;
			
	@FindBy(xpath="(//table[contains(@data-csi-automation,'actionRow-ProductBOMRevision-PartMaterials')]//td[@role='button'])[4]")
	private WebElement Allsec;

	public WebElement getProdSpecSetup() {
		return ProdSpecSetup;
	}

	public WebElement getBOMSection() {
		return BOMSection;
	}

	public WebElement getNewBomSecBtn() {
		return NewBomSecBtn;
	}

	public WebElement getBOMSecVaue() {
		return BOMSecVaue;
	}

	public WebElement getSortvalue() {
		return Sortvalue;
	}

	public WebElement getErrormessage() {
		return errormessage;
	}

	public WebElement getApplicablestyletype() {
		return applicablestyletype;
	}

	public WebElement getAccOnlyColor() {
		return AccOnlyColor;
	}

	public WebElement getAppColorandSize() {
		return AppColorandSize;
	}

	public WebElement getQueryFilter() {
		return QueryFilter;
	}

	public WebElement getMaterialFilter() {
		return MaterialFilter;
	}

	public WebElement getFilterName() {
		return FilterName;
	}

	public WebElement getAddFilter() {
		return AddFilter;
	}

	public WebElement getCheckEquals() {
		return CheckEquals;
	}

	public WebElement getMatches() {
		return Matches;
	}

	public WebElement getFiltervalue() {
		return Filtervalue;
	}

	public WebElement getDeletestyleBom() {
		return DeletestyleBom;
	}

	public WebElement getEditStyleBOM() {
		return EditStyleBOM;
	}

	public WebElement getMaterailBomSectionBtn() {
		return materailBomSectionBtn;
	}

	public WebElement getAppMaterialType() {
		return AppMaterialType;
	}

	public WebElement getFabricstandalone() {
		return Fabricstandalone;
	}

	public WebElement getPlacementProductTypes() {
		return PlacementProductTypes;
	}

	public WebElement getDeleteMAterialBOM() {
		return deleteMAterialBOM;
	}

	public WebElement getEditMaterialBOM() {
		return EditMaterialBOM;
	}

	public WebElement getFullScreen() {
		return fullScreen;
	}

	public WebElement getPrintBtn() {
		return PrintBtn;
	}

	public WebElement getPrintreview() {
		return printreview;
	}

	public WebElement getBomTemplate() {
		return BomTemplate;
	}

	public WebElement getTemplateSubType() {
		return TemplateSubType;
	}

	public WebElement getNewStyleBOMTemplate() {
		return NewStyleBOMTemplate;
	}

	public WebElement getStyleBOM() {
		return StyleBOM;
	}

	public WebElement getTDS() {
		return TDS;
	}

	public WebElement getCanvas() {
		return Canvas;
	}

	public WebElement getComposition() {
		return Composition;
	}

	public WebElement getPlacement() {
		return Placement;
	}

	public WebElement getMulti_level_Placement() {
		return Multi_level_Placement;
	}

	public WebElement getNewCanvasbtn() {
		return NewCanvasbtn;
	}

	public WebElement getLine() {
		return Line;
	}

	public WebElement getCarelabelBtn() {
		return carelabelBtn;
	}

	public WebElement getCarelabelcheckbox() {
		return carelabelcheckbox;
	}

	public WebElement getRemovecarelabel() {
		return Removecarelabel;
	}

	public WebElement getTranslation() {
		return Translation;
	}

	public WebElement getLangaugecheckbox1() {
		return Langaugecheckbox1;
	}

	public WebElement getLangaugecheckbox2() {
		return Langaugecheckbox2;
	}

	public WebElement getNewofmaterial() {
		return Newofmaterial;
	}

	public WebElement getAction1() {
		return Action1;
	}
	
	public WebElement getAction2() {
		return Action2;
	}

	public WebElement getSections1() {
		return Sections1;
	}

	public WebElement getSections2() {
		return Sections2;
	}

	public WebElement getSelectSections() {
		return SelectSections;
	}
	
	public WebElement getSelectSection() {
		return SelectSection;
	}

	public WebElement getSectionCheckBox() {
		return SectionCheckBox;
	}

	public WebElement getSlider1() {
		return slider1;
	}
	
	public WebElement getSlider3() {
		return slider3;
	}

	public WebElement getSlider2() {
		return slider2;
	}

	public WebElement getCreateSection() {
		return CreateSection;
	}

	public WebElement getCreateBOMValue() {
		return CreateBOMValue;
	}

	public WebElement getArrangeSection() {
		return arrangeSection;
	}

	public WebElement getArrangefrom() {
		return Arrangefrom;
	}

	public WebElement getRestoresite() {
		return Restoresite;
	}

	public WebElement getDeletesection() {
		return deletesection;
	}

	public WebElement getDeletesectioncheckbox() {
		return deletesectioncheckbox;
	}

	public WebElement getFabricsectionexpand() {
		return fabricsectionexpand;
	}
	
	public WebElement getApparelsectionexpand() {
		return apparelsectionexpand;
	}
	

	public WebElement getAllsectionExpand() {
		return AllsectionExpand;
	}

	public WebElement getSectionmaterialcheckbox() {
		return Sectionmaterialcheckbox;
	}

	public WebElement getEditbuttonBom() {
		return EditbuttonBom;
	}

	public WebElement getCommentBOM() {
		return commentBOM;
	}

	public WebElement getCopyBOMsection() {
		return CopyBOMsection;
	}

	public WebElement getDeleteBOMSection() {
		return DeleteBOMSection;
	}
	
	public WebElement getFabricsec() {
		return fabricsec;
	}

	public WebElement getApparelsec() {
		return Apparelsec;
	}

	public WebElement getAllsec() {
		return Allsec;
	}

	@FindBy(xpath="//td[text()='Color']")
	private WebElement Colorsection;
	
	@FindBy(xpath="//option[text()='Created']")
	private WebElement colorcreated;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='< Remove'])[1]")
	private WebElement Remove;
	
	@FindBy(xpath="//option[text()='Color']")
	private WebElement Color;
	
	@FindBy(xpath="((//span[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-SelectProductColors'])[2]/span[2]/div/div/input)[1]")
	private WebElement colorField;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'ToolbarNewAction')]//td[contains(text(),'New of Material')]")
	private WebElement newofmaterial;
	
	@FindBy(xpath="//td[contains(@data-csi-act,'Actual')]")
	private WebElement Product;
	
	@FindBy(xpath="(//span[contains(@data-csi-tab-name,'Specification') or text()='Specification'])")
	private WebElement materialspec;
	
	@FindBy(xpath="(//span[contains(@data-csi-tab-name,'Season Availability') or text()='Season Availability'])")
	private WebElement seasonavailability;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'SeasonAvailability')]//div[contains(text(),'Select Season')]")
	private WebElement Selectseason;
	
	@FindBy(xpath="(//td[text()='winter season']//parent::tr/td/div)[1]")
	private WebElement Winterradiobox;
	
	@FindBy(xpath="//a[text()='Apparel BOM Validation']")
	private WebElement BOMvalidationname;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'Node Name')])[2]")
	private WebElement placementname;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-BomSectionMenuCreate']//td[text()='Create Section'])[1]")
	private WebElement createSec;
	
	public WebElement getCreateSec() {
		return createSec;
	}

	@FindBy(xpath="(//span[text()='more_vert'])[1]/parent::span")
	private WebElement source;
	
	@FindBy(xpath="(//span[text()='more_vert'])[2]/parent::span")
	private WebElement source1;
	
	@FindBy(xpath="//span[contains(text(),'Material section')]")
	private WebElement target;
	
	@FindBy(xpath="//td[text()='Apparel section']//parent::tr//input[@type='checkbox']")
	private WebElement apparelSecCBX;
	
	@FindBy(xpath="//td[text()='fabric section']//parent::tr//input[@type='checkbox']")
	private WebElement fabricSecCBX;
	
	@FindBy(xpath="(//span[contains(text(),'Apparel section')]//following::div[text()='add'])[1]")
	private WebElement apparelAdd;
	
	@FindBy(xpath="//span[contains(text(),'Apparel section')]//following::td[@role='button']")
	private WebElement apparelSecEXP;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'ProductBOMRevision-PartMaterials')]//td[contains(text(),'New from Style')]")
	private WebElement newFromStyle;
	
	@FindBy(xpath="(//td[contains(text(),'Apparel')]//parent::tr//input[@type='checkbox'])[1]")
	private WebElement BOchkBX;
	
	@FindBy(xpath="(//span[contains(text(),'fabric section')]//following::td[@role='button'])[1]")
	private WebElement fabricSecEXP;
	
	@FindBy(xpath="//table[contains(@data-csi-automation,'ProductBOMRevision-PartMaterials')]//td[contains(text(),'New Special')]")
	private WebElement newSpecial;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-Material-NewSpecialMaterial-Node Name')]/div[2]/div/input")
	private WebElement specilaVal;
	
	@FindBy(xpath="(//a[contains(text(),'Cotton/Rayon')]/parent::div/parent::td)//following-sibling::td[contains(@data-csi-act,'CommonColor')]")
	private WebElement commColor2;
	
	@FindBy(xpath="//div[contains(text(),'New Colored Material')]")
	private WebElement newColoredMat;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-ColorMaterial-Form-Node Name')]/div[2]/div/input")
	private WebElement commColorVal;
	
	@FindBy(xpath="(//a[contains(text(),'Cotton Jersey')]/parent::div/parent::td//following-sibling::td[contains(@data-csi-act,'CommonColor')])[1]")
	private WebElement commColor1;
	
	@FindBy(xpath="((//a[contains(text(),'Cotton/Rayon')]/parent::td)//following-sibling::td[contains(@data-csi-act,'PMCColor:Child:PartMaterialColors:0{PartMaterialColors}')])[2]")
	private WebElement PartMaterialColors;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-CopyColor']//td[text()='Copy Color'])[1]")
	private WebElement copyColor;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'ToColors')]/div)[1]/input)[1]")
	private WebElement ToColor;
	
	@FindBy(xpath="(//span[text()='Neck - placement']/parent::td//following-sibling::td[contains(@data-csi-heading,'BOMLineQuote::0')])")
	private WebElement BOMquote;
	
	@FindBy(xpath="(//span[text()='Neck - placement']/parent::td//following-sibling::td//span[contains(text(),'more')])[1]")
	private WebElement moreAction;
	
	@FindBy(xpath="(//*[contains(text(),'Cotton')]/parent::td//following-sibling::td//span[contains(text(),'more')])[1]")
	private WebElement moreActionnew;

	@FindBy(xpath="(//td[contains(text(),'Update Unit Cost, UOM')])[1]")
	private WebElement UpdateUOM;
	
	@FindBy(xpath="(//span[text()='Neck - placement']/parent::td//following-sibling::td[contains(@data-csi-heading,'UnitPriceAct::0')])")
	private WebElement UnitCost;
	
	@FindBy(xpath="(//td[contains(text(),'Update Unit Cost on All')])[1]")
	private WebElement updateUnitCost;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-EditColors']//td[text()='Edit Colors'])[1]")
	private WebElement editColor;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-EditColors']//td[text()='Edit Colors'])[2]")
	private WebElement editColor2;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Colorways')]/div)[1]/input)[1]")
	private WebElement colorways;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'To')]/div)[1]/input)[1]")
	private WebElement To;
	
	@FindBy(xpath="(//span[text()='Shoulder - placement']/parent::td//following-sibling::td//span[contains(text(),'more')])[1]")
	private WebElement shouldMore;
	
	@FindBy(xpath="(//td[contains(text(),'Edit Variations by Color')])[1]")
	private WebElement EVBColor;
	
	@FindBy(xpath="(//td[contains(@data-csi-act,'PMCColor::0')])[2]")
	private WebElement EVPMColor;

	@FindBy(xpath="(//td[contains(text(),'Match Colors')])[1]")
	private WebElement EVMatchColr;

	@FindBy(xpath="(//span[text()='Match Colors'])[2]")
	private WebElement MatchColorBtn;

	@FindBy(xpath="(//td[contains(text(),'Edit Variations by Size')])[1]")
	private WebElement EVBSize;

	@FindBy(xpath="(//td[contains(@data-csi-act,'PMSSize:Parent:PMSBOMSizes:0:PartMaterialSize{Matrix}')])[2]")
	private WebElement EVPMSize;

	@FindBy(xpath="//span[@data-csi-automation='plugin-PartMaterial-PartMaterialSizesMapping-BomSizeVariationPMSSize']//span[text()='Size']")
	private WebElement Sizebtn;
	
	@FindBy(xpath="(//span[text()='Shoulder - placement']/parent::td//following-sibling::td[contains(@data-csi-act,'CommonSize::0')])")
	private WebElement commSize;

	@FindBy(xpath="(//td[contains(text(),'Reset Variations by Size')])[1]")
	private WebElement RVBSize;

	@FindBy(xpath="(//span[text()='Reset'])")
	private WebElement Reset;

	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-ValidateBOM']//td[text()='Validate BOM'])[1]")
	private WebElement validBOM;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-ValidateBOM']//td[text()='Validate BOM'])[2]")
	private WebElement validBOM2;

	@FindBy(xpath="(//span//span[text()='Actions']/following-sibling::span)[1]")
	private WebElement approveAction;

	@FindBy(xpath="(//td[text()='Approve'])[2]")
	private WebElement approve;

	@FindBy(xpath="(//td[text()='Approve'])[1]")
	private WebElement approve1;
	
	@FindBy(xpath="(//span[text()='Continue'])")
	private WebElement Continue;

	@FindBy(xpath="(//a[text()='Apparel - Color and Size'])")
	private WebElement clickApparel;

	@FindBy(xpath="(//a[text()='Apparel BOM Validation'])/parent::td//following-sibling::td/div/span[text()='content_copy']")
	private WebElement BOM_copy;

	@FindBy(xpath="(//a[text()='Apparel BOM Validation copy'])")
	private WebElement clickCopy;

	@FindBy(xpath="(//td[text()='Freeze'])[2]")
	private WebElement freeze;

	@FindBy(xpath="(//td[text()='Freeze'])[1]")
	private WebElement freeze1;
	
	@FindBy(xpath="(//td[text()='Reopen'])[2]")
	private WebElement reopen;

	@FindBy(xpath="(//td[text()='Reopen'])[1]")
	private WebElement reopen1;

	@FindBy(xpath="(//td[contains(text(),'Apparel - Color and Size')]//parent::tr//input[@type='checkbox'])[1]")
	private WebElement apparelColchkBX;

	@FindBy(xpath="(//span[contains(@data-csi-tab-name,'Multi-level Placements') or text()='Multi-level Placements'])")
	private WebElement multiLevelPlacements;

	@FindBy(xpath="(((//span[contains(text(),'Neck')])//parent::td/parent::tr)[2]/following-sibling::tr[2]/td/span)[2]")
	private WebElement icon;
	
	@FindBy(xpath="(((//span[contains(text(),'Neck')])//parent::td/parent::tr)[4]/following-sibling::tr[2]/td/span)[2]")
	private WebElement icon2;

	@FindBy(xpath="//option[text()='Tracking Change']")
	private WebElement trackingChange;

	@FindBy(xpath="//option[text()='Tracking Comments']")
	private WebElement trackingComm;

	@FindBy(xpath="(//td[@data-csi-act='TrackingComments::0' or @data-csi-heading='TrackingComments::0'])[1]")
	private WebElement trckView;

	public WebElement getFreeze1() {
		return freeze1;
	}

	public WebElement getReopen1() {
		return reopen1;
	}

	public WebElement getApprove1() {
		return approve1;
	}
	
	public WebElement getColorsection() {
		return Colorsection;
	}

	public WebElement getColorcreated() {
		return colorcreated;
	}

	public WebElement getRemove() {
		return Remove;
	}

	public WebElement getColor() {
		return Color;
	}

	public WebElement getColorField() {
		return colorField;
	}

	public WebElement getProduct() {
		return Product;
	}

	public WebElement getMaterialspec() {
		return materialspec;
	}

	public WebElement getSeasonavailability() {
		return seasonavailability;
	}

	public WebElement getSelectseason() {
		return Selectseason;
	}

	public WebElement getWinterradiobox() {
		return Winterradiobox;
	}

	public WebElement getBOMvalidationname() {
		return BOMvalidationname;
	}

	public WebElement getPlacementname() {
		return placementname;
	}

	public WebElement getSource() {
		return source;
	}
	
	public WebElement getSource1() {
		return source1;
	}

	public WebElement getTarget() {
		return target;
	}

	public WebElement getApparelSecCBX() {
		return apparelSecCBX;
	}

	public WebElement getFabricSecCBX() {
		return fabricSecCBX;
	}

	public WebElement getApparelAdd() {
		return apparelAdd;
	}

	public WebElement getApparelSecEXP() {
		return apparelSecEXP;
	}

	public WebElement getNewFromStyle() {
		return newFromStyle;
	}

	public WebElement getBOchkBX() {
		return BOchkBX;
	}

	public WebElement getFabricSecEXP() {
		return fabricSecEXP;
	}

	public WebElement getNewSpecial() {
		return newSpecial;
	}

	public WebElement getSpecilaVal() {
		return specilaVal;
	}

	public WebElement getCommColor2() {
		return commColor2;
	}

	public WebElement getNewColoredMat() {
		return newColoredMat;
	}

	public WebElement getCommColorVal() {
		return commColorVal;
	}

	public WebElement getCommColor1() {
		return commColor1;
	}

	public WebElement getPartMaterialColors() {
		return PartMaterialColors;
	}

	public WebElement getCopyColor() {
		return copyColor;
	}

	public WebElement getToColor() {
		return ToColor;
	}

	public WebElement getBOMquote() {
		return BOMquote;
	}

	public WebElement getMoreAction() {
		return moreAction;
	}

	public WebElement getMoreActionnew() {
		return moreActionnew;
	}

	public WebElement getUpdateUOM() {
		return UpdateUOM;
	}

	public WebElement getUnitCost() {
		return UnitCost;
	}

	public WebElement getUpdateUnitCost() {
		return updateUnitCost;
	}

	public WebElement getEditColor() {
		return editColor;
	}
	
	public WebElement getEditColor2() {
		return editColor2;
	}

	public WebElement getColorways() {
		return colorways;
	}

	public WebElement getTo() {
		return To;
	}

	public WebElement getShouldMore() {
		return shouldMore;
	}

	public WebElement getEVBColor() {
		return EVBColor;
	}

	public WebElement getEVPMColor() {
		return EVPMColor;
	}

	public WebElement getEVMatchColr() {
		return EVMatchColr;
	}

	public WebElement getMatchColorBtn() {
		return MatchColorBtn;
	}

	public WebElement getEVBSize() {
		return EVBSize;
	}

	public WebElement getEVPMSize() {
		return EVPMSize;
	}

	public WebElement getSizebtn() {
		return Sizebtn;
	}

	public WebElement getCommSize() {
		return commSize;
	}

	public WebElement getRVBSize() {
		return RVBSize;
	}

	public WebElement getReset() {
		return Reset;
	}

	public WebElement getValidBOM() {
		return validBOM;
	}
	
	public WebElement getValidBOM2() {
		return validBOM2;
	}

	public WebElement getApproveAction() {
		return approveAction;
	}

	public WebElement getApprove() {
		return approve;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getClickApparel() {
		return clickApparel;
	}

	public WebElement getBOM_copy() {
		return BOM_copy;
	}

	public WebElement getClickCopy() {
		return clickCopy;
	}

	public WebElement getFreeze() {
		return freeze;
	}

	public WebElement getReopen() {
		return reopen;
	}

	public WebElement getApparelColchkBX() {
		return apparelColchkBX;
	}

	public WebElement getMultiLevelPlacements() {
		return multiLevelPlacements;
	}

	public WebElement getIcon() {
		return icon;
	}
	public WebElement getIcon2() {
		return icon2;
	}

	public WebElement getTrackingChange() {
		return trackingChange;
	}

	public WebElement getTrackingComm() {
		return trackingComm;
	}

	public WebElement getTrckView() {
		return trckView;
	}

	@FindBy(xpath="//a[text()='100% Cotton/Rayon Jersey']")
	private WebElement cottonlink;
	
	@FindBy(xpath="//a[text()='Linen - Ok for CS - False']")
	private WebElement linenlink;
	
	
	@FindBy(xpath="//span[text()='BOM' or @data-csi-tab-name='BOM']")
	private WebElement bomBtn;
	
	@FindBy(xpath="//span[text()='Dimensions' or @data-csi-tab-name='Dimensions']")
	private WebElement dimenBtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-Material-BOMs-ToolbarNewActions']//div[2]")
	private WebElement bomactBtn;	
	
	@FindBy(xpath="(//div[@data-csi-automation='field-MaterialBOM-Form-Node Name']//input)[2]")
	private WebElement bominput;		
	
	@FindBy(xpath="(//a[text()='11-0103 EGRET'])[1]")
	private WebElement egrval;
	
	@FindBy(xpath="(//a[text()='11-0104 VANILLA ICE'])[1]")
	private WebElement vanillaval;
	
	@FindBy(xpath="//td[text()='small']")
	private WebElement smallval;	
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-ToolbarNewActionsCreate']//div[contains(text(),'Create')])[2]")
	private WebElement placecretebtn;	
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-ToolbarNewActionsCreate']//div[contains(text(),'Create')])[1]")
	private WebElement placecretebtn2;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-ToolbarNewActionsCreate']//td[contains(text(),'New from Material')]")
	private WebElement placenewfrommatebtn;	
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-ToolbarNewActionsCreate']//td[contains(text(),'New of Material')]")
	private WebElement placenewofmatebtn;	

	@FindBy(xpath="//table[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-ToolbarNewActionsCreate']//td[contains(text(),'New from BOM')]")
	private WebElement placenewfrombombtn;

	@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='New Special']")
	private WebElement newspecialbtn;

	@FindBy(xpath="//td[text()='100% Cotton/Rayon Jersey']//preceding-sibling::td//input")
	private WebElement cottonchkbx;
	
	@FindBy(xpath="//td[text()='100% Polyester Chiffon']//preceding-sibling::td//input")
	private WebElement chiffonchkbx;
	
	@FindBy(xpath="//td[text()='Linen - Ok for CS - False']//preceding-sibling::td//input")
	private WebElement linenchkbx;
	
	@FindBy(xpath="//td[text()='Polyster - Ok for CS - False']//preceding-sibling::td//input")
	private WebElement polystchkbx;	
	
	@FindBy(xpath="(//td[text()='AUT_BOMHSHC']//preceding-sibling::td//input)[1]")
	private WebElement bomhshcradbx;	
	
	@FindBy(xpath="//td[text()='APlac_01']//preceding-sibling::td//input")
	private WebElement plac1chk;
	
	@FindBy(xpath="//td[text()='APlac_02']//preceding-sibling::td//input")
	private WebElement plac2chk;	
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-Sections']//following::td[1][@class='dijitReset dijitMenuItemLabel' and text()='Sections'])[1]")
	private WebElement sectionbtn;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-Sections']//following::td[1][@class='dijitReset dijitMenuItemLabel' and text()='Sections'])[2]")
	private WebElement sectionbtn2;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-BomSectionMenuSelect']//following::td[1][@class='dijitReset dijitMenuItemLabel' and text()='Select Section'])[1]")
	private WebElement selsectbtn;	
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-BomSectionMenuSelect']//following::td[1][@class='dijitReset dijitMenuItemLabel' and text()='Select Section'])[2]")
	private WebElement selsectbtn2;
	
	@FindBy(xpath="(//tr[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-BomSectionMenuSelect']//following::td[1][@class='dijitReset dijitMenuItemLabel' and text()='Select Section'])[3]")
	private WebElement selsectbtn3;
	

	@FindBy(xpath="//div//input[@title='Toggle selections of all displayed items']")
	private WebElement allchkbombtn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-BOMSectionDefinition-Form-SortOrder']//div[2]//input")
	private WebElement bomsortvalue;
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-Actions'])[2]")
	private WebElement actiondrp;
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-Actions'])[1]")
	private WebElement actiondrp1;

	@FindBy(xpath="//span[@data-csi-tab-name='TDS' or text()='TDS']")
	private WebElement tdstab;
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-MaterialBOMRevision-TDS-htmlToolbars'])[1]")
	private WebElement togglebtn;
	
//	@FindBy(xpath="(//span[@data-csi-automation='plugin-MaterialBOMRevision-TDS-htmlToolbars'])[2]")
//	private WebElement togglebtn2;
	
	@FindBy(xpath="//span[@class='dijit dijitReset dijitInline dijitButton csiAction']//following::a[text()='Linen - Ok for CS - False']")
	private WebElement linenbompg;
	
	@FindBy(xpath="(//td[@class='dijitReset dijitMenuItemLabel' and text()='Push Section'])[2]")
	private WebElement pushsection;
	
	@FindBy(xpath="(//td[@class='dijitReset dijitMenuItemLabel' and text()='Delete Section'])[2]")
	private WebElement deletesect;
	
	@FindBy(xpath="//td[text()='DestinationBOM']//preceding-sibling::td//input")
	private WebElement destinachk;
	
	@FindBy(xpath="//td[text()='DestinationBOM2']//preceding-sibling::td//input")
	private WebElement destina2chk;
	
	@FindBy(xpath="//span[text()='Replace']")
	private WebElement replace;
	
	@FindBy(xpath="//span[text()='Append']")
	private WebElement apend;

	@FindBy(xpath="//a[text()='AUT_BOMHSHC']")
	private WebElement autbomlink;
	
	@FindBy(xpath="//a[text()='DestinationBOM2']")
	private WebElement destin2link;
	
	@FindBy(xpath="//a[text()='DestinationBOM']")
	private WebElement destinlink;

	@FindBy(xpath="//span[@data-csi-act='BUTTON_DELETE']")
	private WebElement deletesecbtn;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Material-NewSpecialMaterial-ProductType']//div[1]//input")
	private WebElement mattypedrop;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Material-NewSpecialMaterial-Node Name']//div[2]//input")
	private WebElement materinput;
	
	@FindBy(xpath="//a[text()='Polyster - Ok for CS - False']")
	private WebElement polysterlink;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-MaterialBOM-Breadcrumb-Actions']//span[2]")
	private WebElement matactionbtn;
	
	@FindBy(xpath="//a[@title='Material: Polyster - Ok for CS - False']")
	private WebElement polyesterbomlink;
	
	@FindBy(xpath="//a[text()='BOMStateVerify2']")
	private WebElement bom2link;
	
	@FindBy(xpath="//a[text()='BOMStateVerify3']")
	private WebElement bom3link;
	
	@FindBy(xpath="(//td[@class='dijitReset dijitMenuItemLabel' and text()='Revise'])[1]")
	private WebElement revise;
	
	@FindBy(xpath="(//td[@class='dijitReset dijitMenuItemLabel' and text()='Review'])[1]")
	private WebElement review;
	
	@FindBy(xpath="(//td[@class='dijitReset dijitMenuItemLabel' and text()='Abandon'])[1]")
	private WebElement abandon;
	
	@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Revision 1']")
	private WebElement revision1;
	
	@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Revision 2']")
	private WebElement revision2;
	
	@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Revision 3']")
	private WebElement revision3;
	
	@FindBy(xpath="//span[@class='csi-name-value-pair-value' and text()='DRAFT']")
	private WebElement draft;
	
	@FindBy(xpath="//span[@class='csi-name-value-pair-value' and text()='PENDING']")
	private WebElement pending;
	
	@FindBy(xpath="//span[@class='csi-name-value-pair-value' and text()='REVIEW']")
	private WebElement reviewact;
	
	@FindBy(xpath="//div[@class='csi-breadcrumb-revision']//span[contains(text(),'Revision')]")
	private WebElement revision;
	
	@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Purge Revisions']")
	private WebElement purgerev;
	
	@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='View All Revisions']")
	private WebElement allrevision;
	
	@FindBy(xpath="(//span[@data-csi-automation='plugin-ProductBOMRevision-PartMaterials-Actions'])[2]")
	private WebElement actionbtn;
	

	public WebElement getActionbtn() {
		return actionbtn;
	}

	public WebElement getAllrevision() {
		return allrevision;
	}

	public WebElement getPurgerev() {
		return purgerev;
	}

	public WebElement getRevision() {
		return revision;
	}

	public WebElement getBom3link() {
		return bom3link;
	}

	public WebElement getRevision1() {
		return revision1;
	}

	public WebElement getRevision2() {
		return revision2;
	}

	public WebElement getRevision3() {
		return revision3;
	}

	public WebElement getDraft() {
		return draft;
	}

	public WebElement getPending() {
		return pending;
	}

	public WebElement getReviewact() {
		return reviewact;
	}

	public WebElement getAbandon() {
		return abandon;
	}

	public WebElement getRevise() {
		return revise;
	}
	public WebElement getReview() {
		return review;
	}
	public WebElement getBom2link() {
		return bom2link;
	}

	public WebElement getPolyesterbomlink() {
		return polyesterbomlink;
	}

	public WebElement getMatactionbtn() {
		return matactionbtn;
	}

	public WebElement getPolysterlink() {
		return polysterlink;
	}

	public WebElement getMaterinput() {
		return materinput;
	}

	public WebElement getMattypedrop() {
		return mattypedrop;
	}

	public WebElement getDestinlink() {
		return destinlink;
	}

	public WebElement getNewspecialbtn() {
		return newspecialbtn;
	}


	public WebElement getDeletesecbtn() {
		return deletesecbtn;
	}

	public WebElement getDestin2link() {
		return destin2link;
	}

	public WebElement getDeletesect() {
		return deletesect;
	}

	public WebElement getDestina2chk() {
		return destina2chk;
	}

	public WebElement getApend() {
		return apend;
	}


	public WebElement getAutbomlink() {
		return autbomlink;
	}

	public WebElement getReplace() {
		return replace;
	}

	public WebElement getDestinachk() {
		return destinachk;
	}

	public WebElement getPushsection() {
		return pushsection;
	}

	public WebElement getLinenbompg() {
		return linenbompg;
	}

	public WebElement getActiondrp1() {
		return actiondrp1;
	}

	public WebElement getSelsectbtn2() {
		return selsectbtn2;
	}
	
	public WebElement getSelsectbtn3() {
		return selsectbtn3;
	}
	public WebElement getTogglebtn() {
		return togglebtn;
	}

	public WebElement getTdstab() {
		return tdstab;
	}

	public WebElement getActiondrp() {
		return actiondrp;
	}

	public WebElement getBomsortvalue() {
		return bomsortvalue;
	}

	public WebElement getAllchkbombtn() {
		return allchkbombtn;
	}

	public WebElement getSelsectbtn() {
		return selsectbtn;
	}

	public WebElement getSectionbtn() {
		return sectionbtn;
	}
	public WebElement getSectionbtn2() {
		return sectionbtn2;
	}
	public WebElement getPlac1chk() {
		return plac1chk;
	}

	public WebElement getPlac2chk() {
		return plac2chk;
	}

	public WebElement getBomhshcradbx() {
		return bomhshcradbx;
	}

	public WebElement getPlacenewofmatebtn() {
		return placenewofmatebtn;
	}

	public WebElement getPlacecretebtn2() {
		return placecretebtn2;
	}

	public WebElement getPlacenewfrombombtn() {
		return placenewfrombombtn;
	}
	
	public WebElement getCottonchkbx() {
		return cottonchkbx;
	}

	public WebElement getChiffonchkbx() {
		return chiffonchkbx;
	}

	public WebElement getLinenchkbx() {
		return linenchkbx;
	}

	public WebElement getPolystchkbx() {
		return polystchkbx;
	}

	public WebElement getPlacecretebtn() {
		return placecretebtn;
	}

	public WebElement getPlacenewfrommatebtn() {
		return placenewfrommatebtn;
	}

	public WebElement getEgrval() {
		return egrval;
	}

	public WebElement getVanillaval() {
		return vanillaval;
	}

	public WebElement getSmallval() {
		return smallval;
	}

	public WebElement getDimenBtn() {
		return dimenBtn;
	}

	public WebElement getBominput() {
		return bominput;
	}

	public WebElement getBomactBtn() {
		return bomactBtn;
	}

	public WebElement getBomBtn() {
		return bomBtn;
	}

	public WebElement getCottonlink() {
		return cottonlink;
	}
	
	public WebElement getLinenlink() {
		return linenlink;
	}



}
