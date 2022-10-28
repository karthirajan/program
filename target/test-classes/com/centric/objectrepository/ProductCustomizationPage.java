package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class ProductCustomizationPage extends Commonactions{

	public ProductCustomizationPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="//span[@data-csi-tab-name='Sourcing' or text()='Sourcing']")
	private WebElement StylesSourcing;

	@FindBy(xpath="//span[@data-csi-tab-name='Product Suppliers' or text()='Product Suppliers']")
	private WebElement StyleProductSuppliers;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-StyleSourcing-ProductSources-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewProductSuppliers;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Style' or text()='Style']")
	private WebElement StyleStyleTab;

	@FindBy(xpath="//span[@data-csi-tab-name='Samples']")
	private WebElement StyleSampleTab;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-Style-ProductSamples-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewStyleSamples;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Sample-Form-Supplier']//div[3]/input[1]")
	private WebElement SupplierValue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'RequestSampleQuantity')]/div[2]/input)[1]")
	private WebElement QuantityValue;
	
	@FindBy(xpath="//div[@data-csi-automation='field-Sample-Form-RequestSampleDimensions']//div[3]/input[1]")
	private WebElement SampleDim;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-Sample-Form-Node Name')]/div/div/input)[1]")
	private WebElement SampleNameValue;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Properties']")
	private WebElement StylePropertiesTab;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-Style-Properties-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement StylePropView;
	
	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-Style-Properties-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement StylePropViewManage;
	
	@FindBy(xpath="//span[text()='< Remove']")
	private WebElement Remove_Btn;
	
	@FindBy(xpath="//span[@data-csi-tab-name='SKUs']")
	private WebElement StyleSKUTab;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-Style-ProductSKU-ToolbarNewActions')]//div/div)[2]")
	private WebElement NewStyleSKU;
		
	@FindBy(xpath="(//div[contains(@data-csi-automation,'field-SKU-Form-Node Name')]/div[2]/div/input)[1]")
	private WebElement SyleSKUValue;
	
	@FindBy(xpath="//div[text()='Recent Conversations']")
	private WebElement RecentConvHeading;
	
	@FindBy(xpath="//td[@data-csi-heading='RecentChildComments::0']")
	private WebElement ConversationsArea;
	
	@FindBy(xpath="//td[@data-csi-heading='RecentComments:Child:DocumentsAndComments:0']")
	private WebElement SKUConversationsArea;
	
	@FindBy(xpath="//a[@class='csiAction' and text()='View Conversations']")
	private WebElement ViewConversations;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-CommentContainer-Comments-ToolbarNewActions']")
	private WebElement NewConversationsBtn;
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement ConvSubject;
	
	@FindBy(xpath="//div[@class='fr-element fr-view']")
	private WebElement ConvBody;
	
	@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Close']")
	private WebElement Close_btn;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-SKU-Properties-CustomViewActions')]//span[@title='Manage custom views']")
	private WebElement SKUPropView;
	
	@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-SKU-Properties-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement SKUPropViewManage;
	
	@FindBy(xpath="//span[@data-csi-tab-name='SKU']")
	private WebElement SKUNodeSKUTab;

	
	
	@FindBy(xpath="//span[text()='Delete']")
	private WebElement Deletebtn;
	
	@FindBy(xpath="//table[@id='csiHeaderSearchSelect']")
	private WebElement HeaderSearch;
	
	@FindBy(how = How.CSS,using = "Input[name='headerSearchText']")
	private WebElement HeaderSearchField;
	
	@FindBy(how = How.CSS,using = ".iconSearch")
	private WebElement SearchIcon;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Hierarchy']")
	private WebElement HierarchyTab;
	
	@FindBy(xpath="//span[@data-csi-tab-name='Styles']")
	private WebElement AllStylesTab;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-Collection-Styles-ToolbarNewActions']//td[2])[1]")
	private WebElement CollectiontabNewStyleBtn;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-StructureItem-AllStyles-ToolbarNewActions']//td[2])[1]")
	private WebElement StylesTabStyleBtn;
	
	
	@FindBy(xpath="(//td[@class='dijitReset dijitMenuItemLabel' and text()='Move Styles from'])[1]")
	private WebElement MoveStyleFromCol;
	
	@FindBy(xpath="(//td[@class='dijitReset dijitMenuItemLabel' and text()='Move Styles from'])[2]")
	private WebElement MoveStyleFromStylesTab;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SKU-Form-RealizedSize']//div[3]/span")
	private WebElement SKUSizeDDL1;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SKU-Form-RealizedSize']//div[3]/input[1]")
	private WebElement SKUSizeDDL2;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SKU-Form-RealizedColor']//div[3]/span")
	private WebElement SKUColorwayDDL1;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SKUMaterial-Form-RealizedColor']//div[3]/span")
	private WebElement SKUMatColorwayDDL1;
	
	@FindBy(xpath="//div[@data-csi-automation='field-SKU-Form-RealizedColor']//div[3]/input[1]")
	private WebElement SKUColorwayDDL2;
	
	@FindBy(xpath="(//label[@class='dijitMenuItemLabel' and text()='None'])[1]")
	private WebElement Nonelabel1;
	
	@FindBy(xpath="(//label[@class='dijitMenuItemLabel' and text()='None'])[2]")
	private WebElement Nonelabel2;
	
	@FindBy(xpath="//div[@class='csiHeadingCellLabel' and text()='Documents']")
	private WebElement Documentslabel;
	
	@FindBy(xpath="//td[@data-csi-heading='Documents:Child:DocumentsAndComments:0']")
	private WebElement DocumentsArea;
	
	@FindBy(xpath="//a[@class='csiAction' and text()='View Documents']")
	private WebElement ViewDocumentsLink;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-DocumentContainer-Documents-ToolbarNewActions']//td[2])[1]")
	private WebElement AddDocumentsDDLBtn;
	
	@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Add 3D Document']")
	private WebElement Add3DDocumentsLink;
	
	@FindBy(xpath="//span[text()='Cancel']")
	private WebElement CancelBtn;
	
	@FindBy(xpath="//table[@data-csi-automation='plugin-DocumentContainer-ReferencedDocuments-ToolbarNewActions']")
	private WebElement RefDocumentsBtn;
	
	@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Approve']")
	private WebElement ApproveLabel;
	
	

	public WebElement getStylesSourcing() {
		return StylesSourcing;
	}

	public WebElement getStyleProductSuppliers() {
		return StyleProductSuppliers;
	}

	public WebElement getNewProductSuppliers() {
		return NewProductSuppliers;
	}
	
	public WebElement getStyleStyleTab() {
		return StyleStyleTab;
	}

	public WebElement getStyleSampleTab() {
		return StyleSampleTab;
	}

	public WebElement getNewStyleSamples() {
		return NewStyleSamples;
	}
	public WebElement getSupplierValue() {
		return SupplierValue;
	}

	public WebElement getSampleDim() {
		return SampleDim;
	}
	public WebElement getSampleNameValue() {
		return SampleNameValue;
	}

	public WebElement getQuantityValue() {
		return QuantityValue;
	}
	public WebElement getStylePropertiesTab() {
		return StylePropertiesTab;
	}
	
	public WebElement getStylePropView() {
		return StylePropView;
	}
	public WebElement getStylePropViewManage() {
		return StylePropViewManage;
	}
	public WebElement getRemove_Btn() {
		return Remove_Btn;
	}
	public WebElement getStyleSKUTab() {
		return StyleSKUTab;
	}
	public WebElement getNewStyleSKU() {
		return NewStyleSKU;
	}
	public WebElement getSyleSKUValue() {
		return SyleSKUValue;
	}
	public WebElement getRecentConvHeading() {
		return RecentConvHeading;
	}
	public WebElement getConversationsArea() {
		return ConversationsArea;
	}
	
	public WebElement getSKUConversationsArea() {
		return SKUConversationsArea;
	}
	
	public WebElement getViewConversations() {
		return ViewConversations;
	}
	
	public WebElement getNewConversationsBtn() {
		return NewConversationsBtn;
	}
	public WebElement getConvSubject() {
		return ConvSubject;
	}
	
	public WebElement getConvBody() {
		return ConvBody;
	}
	public WebElement getClose_btn() {
		return Close_btn;
	}

	public WebElement getSKUPropView() {
		return SKUPropView;
	}
	public WebElement getSKUPropViewManage() {
		return SKUPropViewManage;
	}
	
	public WebElement getSKUNodeSKUTab() {
		return SKUNodeSKUTab;
	}

	public WebElement getDeletebtn() {
		return Deletebtn;
	}
	
	public WebElement getHierarchyTab() {
		return HierarchyTab;
	}
	
	public WebElement getCollectiontabNewStyleBtn() {
		return CollectiontabNewStyleBtn;
	}
	public WebElement getHeaderSearch() {
		return HeaderSearch;
	}
	
	public WebElement getHeaderSearchField() {
		return HeaderSearchField;
	}
	public WebElement getMoveStyleFromColbtn() {
		return MoveStyleFromCol;
	}
	public WebElement getSearchIcon() {
		return SearchIcon;
	}
	public WebElement getAllStylesTab() {
		return AllStylesTab;
	}
	public WebElement getStylesTabStyleBtn() {
		return StylesTabStyleBtn;
	}
	public WebElement getMoveStyleFromStylesTabBtn() {
		return MoveStyleFromStylesTab;
	}
	public WebElement getSKUSizeDDL1() {
		return SKUSizeDDL1;
	}
	public WebElement getSKUColorwayDDL1() {
		return SKUColorwayDDL1;
	}
	public WebElement getSKUMatColorwayDDL1() {
		return SKUMatColorwayDDL1;
	}
	
	public WebElement getSKUSizeDDL2() {
		return SKUSizeDDL2;
	}
	public WebElement getSKUColorwayDDL2() {
		return SKUColorwayDDL2;
	}
	public WebElement getNonelabel1() {
		return Nonelabel1;
	}
	public WebElement getNonelabel2() {
		return Nonelabel2;
	}
	public WebElement getDocumentslabel() {
		return Documentslabel;
	}
	
	public WebElement getDocumentsArea() {
		return DocumentsArea;
	}
	public WebElement getViewDocumentsLink() {
		return ViewDocumentsLink;
	}
	public WebElement getAddDocumentsDDLBtn() {
		return AddDocumentsDDLBtn;
	}
	public WebElement getAdd3DDocumentsLink() {
		return Add3DDocumentsLink;
	}
	public WebElement getCancelBtn() {
		return CancelBtn;
	}
	public WebElement getRefDocumentsBtn() {
		return RefDocumentsBtn;
	}
	public WebElement getApproveLabel() {
		return ApproveLabel;
	}
	
	}