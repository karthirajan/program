package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class Locators extends Commonactions{
	
	public Locators() {
		PageFactory.initElements(driver, this);
	}
	
	//wizard
	


	
	@FindBy(xpath="//tr[2]//div[@data-csi-act='ViewSelect']/input[@tabindex='0']")
	private WebElement selectIndex;

	public WebElement getSelectIndex() {
		return selectIndex;
	}
	
	@FindBy(xpath="(//div[text()='winter season'])[1]")
	private WebElement winter;

	public WebElement getWinter() {
		return winter;
	}
	
	@FindBy(xpath="//div/input[@value='New Accessories - Wizard']")
	private WebElement wizard;

	public WebElement getWizard() {
		return wizard;
	}
	
	@FindBy(xpath="//span[text()='Style Type']")
	private WebElement styleType;

	public WebElement getStyleType() {
		return styleType;
	}
	
	@FindBy(xpath="//span[@role='heading' and text()='Push Images to Styles']")
	private WebElement w1;

	public WebElement getW1() {
		return w1;
	}
	
	@FindBy(xpath="//div[contains(text(),'Choose Styles')]")
	private WebElement w2;

	public WebElement getW2() {
		return w2;
	}
	
	@FindBy(xpath="//div[contains(text(),'Choose Images')]")
	private WebElement w3;

	public WebElement getW3() {
		return w3;
	}
	
	@FindBy(xpath="//div[@data-csi-act='ViewSelect']")
	private WebElement w4;

	public WebElement getW4() {
		return w4;
	}
	
	@FindBy(xpath="//div/input[@value='New Apparel - Wizard']")
	private WebElement w5;

	public WebElement getW5() {
		return w5;
	}
	
	@FindBy(xpath="(//td//a[text()='11-0103 EGRET'])[1]")
	private WebElement w6;

	public WebElement getW6() {
		return w6;
	}
	
	@FindBy(xpath="//td//a[text()='11-0103 EGRET - Copy']")
	private WebElement w7;

	public WebElement getW7() {
		return w7;
	}
	
	@FindBy(xpath="(//span[text()='Save'])")
	private WebElement w8;
	
	
	public WebElement getW8() {
		return w8;
	}

	@FindBy(xpath="//span[@role='heading' and text()='Push Colorways to Styles']")
	private WebElement w9;
	
	@FindBy(xpath="//div//label[text()='11-0103 EGRET']")
	private WebElement w10;
	
	@FindBy(xpath="//div//label[text()='11-0103 EGRET - Copy']")
	private WebElement w11;
	
	public WebElement getW11() {
		return w11;
	}

	public WebElement getW9() {
		return w9;
	}

	public WebElement getW10() {
		return w10;
	}

	
	
	
	//user management
	@FindBy(xpath="(//div[@class='fr-element fr-view']/p)[3]")
	private WebElement u1;

	public WebElement getU1() {
		return u1;
	}
	
	@FindBy(xpath="//td[@data-csi-heading='Companies::0']//following-sibling::td[contains(@class,'extra-column')]")
	private WebElement u2;

	public WebElement getU2() {
		return u2;
	}
	
	@FindBy(xpath="//div[contains(@class,'fr-view') and @data-csi-heading='Message::0']")
	private WebElement u3;

	public WebElement getU3() {
		return u3;
	}
	
	@FindBy(xpath="//td[text()='ECIssueType']/ancestor::table/tbody/tr[2]/td/div/input")
	private WebElement issueType;
	
	
	public WebElement getIssueType() {
		return issueType;
	}
	
	@FindBy(xpath="(//span[text()='Delete'])")
	private WebElement delete222;
	
	@FindBy(xpath="(//td[text()='EC-Admin'])/parent::tr")
	private WebElement ecAdmin222;
	
	public WebElement getEcAdmin222() {
		return ecAdmin222;
	}

	public WebElement getDelete222() {
		return delete222;
	}

	@FindBy(xpath="//span[text()='Cancel']")
	private WebElement cancel222;
	
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[1]")
	private WebElement save222;
	
	@FindBy(xpath="(//div[text()='Displaying 70 results'])")
	private WebElement result222;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[1]")
	private WebElement save111;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])")
	private WebElement save000;
	
	@FindBy(xpath="(//div[@data-csi-automation='field-Category2-Form-LabelTemplate']/div[3]/input)[1]")
	private WebElement DontKnow;
	
	
	public WebElement getDontKnow() {
		return DontKnow;
	}

	public WebElement getSave000() {
		return save000;
	}

	public WebElement getSave111() {
		return save111;
	}

	public WebElement getResult222() {
		return result222;
	}

	public WebElement getSave222() {
		return save222;
	}

	public WebElement getCancel222() {
		return cancel222;
	}

	//Theme Color Rule
	@FindBy(xpath="(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]")
	private WebElement Tc1;

	public WebElement getTc1() {
		return Tc1;
	}
	
	@FindBy(xpath="//div[text()='New Theme']//following::div[contains(@class,'Slider')]//span[text()='+']/parent::div")
	private WebElement Tc2;

	public WebElement getTc2() {
		return Tc2;
	}
	
	@FindBy(xpath="//a[contains(text(),'Linen')]//ancestor::tr/td[@data-csi-act='Node Name::0']")
	private WebElement Tc3;

	public WebElement getTc3() {
		return Tc3;
	}
	
	@FindBy(xpath="//a[contains(text(),'Cotton')]//ancestor::tr/td[@data-csi-act='Node Name::0']")
	private WebElement Tc4;

	public WebElement getTc4() {
		return Tc4;
	}
	
	@FindBy(xpath="//div[contains(@class,'Placements')]//span[text()='+']/parent::div")
	private WebElement Tc5;

	public WebElement getTc5() {
		return Tc5;
	}
	
	@FindBy(xpath="//div[contains(@class,'Placements')]//span[text()='-']/parent::div")
	private WebElement Tc6;

	public WebElement getTc6() {
		return Tc6;
	}
	
	@FindBy(xpath="//a[text()='Color Rule Theme']//following::a[text()='Theme Color Rule Season']")
	private WebElement Tc7;

	public WebElement getTc7() {
		return Tc7;
	}
	
	@FindBy(xpath="(//span[text()='close'])[1]")
	private WebElement Tc8;

	public WebElement getTc8() {
		return Tc8;
	}
	
	@FindBy(xpath="//div[contains(@class,'ColorMatchingRules')]//span[text()='+']/parent::div")
	private WebElement Tc9;

	public WebElement getTc9() {
		return Tc9;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Cotton')]//following::td[contains(@data-csi-heading,'DSSection')])[1]")
	private WebElement Tc10;

	public WebElement getTc10() {
		return Tc10;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Linen')]//following::td[contains(@data-csi-heading,'DSSection')])[1]")
	private WebElement Tc11;

	public WebElement getTc11() {
		return Tc11;
	}
	
	@FindBy(xpath="//div[contains(@class,'ColorMatchingRules')]//span[text()='-']/parent::div")
	private WebElement Tc12;

	public WebElement getTc12() {
		return Tc12;
	}
	
	@FindBy(xpath="//*[text()='Theme']//following::a[text()='Color Rule Theme']")
	private WebElement Tc13;

	public WebElement getTc13() {
		return Tc13;
	}
	
	@FindBy(xpath="//*[text()='Contrast']//following::a[text()='Color Rule Theme']")
	private WebElement Tc14;

	public WebElement getTc14() {
		return Tc14;
	}

	//Style Page
	@FindBy(xpath="//span[@data-csi-automation='plugin-Category1-Category2s-refresh']//span[@title='Refresh View']")
	private WebElement sp1;

	public WebElement getSp1() {
		return sp1;
	}
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']/a")
	private WebElement sp2;

	public WebElement getSp2() {
		return sp2;
	}
	
	@FindBy(xpath="//a[@title='Season: winter season' and text()='winter season']")
	private WebElement sp3;

	public WebElement getSp3() {
		return sp3;
	}
	
	@FindBy(xpath="(//a[text()='Denim']//following::td//span[@data-csi-act='Delete'])[2]")
	private WebElement sp4;

	public WebElement getSp4() {
		return sp4;
	}
	
	@FindBy(xpath="//a[text()='Denim']")
	private WebElement sp5;

	public WebElement getSp5() {
		return sp5;
	}
	
	@FindBy(xpath="//a[text()='Mens - Department']")
	private WebElement sp6;

	public WebElement getSp6() {
		return sp6;
	}
	
	@FindBy(xpath="//a[text()='Jeans']//following::td[1]")
	private WebElement sp7;

	public WebElement getSp7() {
		return sp7;
	}
	
	@FindBy(xpath="//a[text()='Jeans']//following::td[2]")
	private WebElement sp8;

	public WebElement getSp8() {
		return sp8;
	}
	
	@FindBy(xpath="//a[@title='Brand: Denim' and text()='Denim']")
	private WebElement sp9;

	public WebElement getSp9() {
		return sp9;
	}
	
	@FindBy(xpath="(//a[text()='Mens']//following::td//span[@data-csi-act='Delete'])[2]")
	private WebElement sp10;

	public WebElement getSp10() {
		return sp10;
	}
	
	@FindBy(xpath="//th[text()='Colorways']")
	private WebElement sp11;

	public WebElement getSp11() {
		return sp11;
	}
	
	@FindBy(xpath="(//a[text()='11-0103 EGRET']//following::span[text()='mode_edit'])[1]")
	private WebElement sp12;

	public WebElement getSp12() {
		return sp12;
	}
	
	@FindBy(xpath="((//div[@class='crumb crumbSearch'])[5]//span)[1]")
	private WebElement sp13;

	public WebElement getSp13() {
		return sp13;
	}
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']//a[text()='11-0103 EGRET-edit']")
	private WebElement sp14;

	public WebElement getSp14() {
		return sp14;
	}
	
	@FindBy(xpath="//div[@class='crumb crumbSearch']//a[text()='Jeans']")
	private WebElement sp15;

	public WebElement getSp15() {
		return sp15;
	}
	
	@FindBy(xpath="//a[text()='Style1-Edited']")
	private WebElement sp16;

	public WebElement getSp16() {
		return sp16;
	}
	
	@FindBy(xpath="(//tr[@aria-label='Push Colorways to Styles ' and @aria-disabled='true'])[2]")
	private WebElement sp17;

	public WebElement getSp17() {
		return sp17;
	}
	
	
	//style Material
	@FindBy(xpath="(//a[contains(text(),'EGRET')])[1]")
	private WebElement sm1;

	public WebElement getSm1() {
		return sm1;
	}
	
	@FindBy(xpath="//div[@role='option' and @item='1']/div")
	private WebElement sm2;

	public WebElement getSm2() {
		return sm2;
	}
	
	@FindBy(xpath="(//a[contains(text(),'EGRET-small')])[1]")
	private WebElement sm3;

	public WebElement getSm3() {
		return sm3;
	}
	
	@FindBy(xpath="//div[contains(@class,'Spec')]//span[text()='+']/parent::div")
	private WebElement sm4;

	public WebElement getSm4() {
		return sm4;
	}
	
	@FindBy(xpath="(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]")
	private WebElement sm5;

	public WebElement getSm5() {
		return sm5;
	}
	
	@FindBy(xpath="(//a[contains(text(),'EGRET')])[2]")
	private WebElement sm6;

	public WebElement getSm6() {
		return sm6;
	}
	
	@FindBy(xpath="(//a[contains(text(),'EGRET')])[1]")
	private WebElement sm7;

	public WebElement getSm7() {
		return sm7;
	}
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-SupplierRequest-StyleQuotes-ToolbarNewActions')]//div/div)[2]")
	private WebElement sm8;

	public WebElement getSm8() {
		return sm8;
	}
	
	@FindBy(xpath="(//span[text()='refresh'])[2]")
	private WebElement sm9;

	public WebElement getSm9() {
		return sm9;
	}
	
	@FindBy(xpath="(//td[contains(text(),'New Inspiration')]//preceding-sibling::td)[1]//input")
	private WebElement sm10;

	public WebElement getSm10() {
		return sm10;
	}
	
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement sm11;

	public WebElement getSm11() {
		return sm11;
	}
	
	@FindBy(xpath="//span[text()='Supplier PO']")
	private WebElement sm12;

	public WebElement getSm12() {
		return sm12;
	}
	
	@FindBy(xpath="(//div[contains(@class,'PurchasedOrder-Orders')]//span[text()='+']/parent::div)[1]")
	private WebElement sm13;

	public WebElement getSm13() {
		return sm13;
	}
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Factory')]/preceding-sibling::td//a[text()='PO-AP1123-colorbased'])")
	private WebElement sm14;

	public WebElement getSm14() {
		return sm14;
	}
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name')]/a[text()='PO-AP1123-colorbased'])[2]")
	private WebElement sm15;

	public WebElement getSm15() {
		return sm15;
	}
	
	@FindBy(xpath="(//span[contains(text(),'Issues')]/parent::div/parent::div/parent::div/preceding-sibling::div)[2]")
	private WebElement sm16;

	public WebElement getSm16() {
		return sm16;
	}
	
	@FindBy(xpath="//span[@data-csi-act='POToIssued' and text()='arrow_forward']")
	private WebElement sm17;

	public WebElement getSm17() {
		return sm17;
	}
	
	@FindBy(xpath="(//span[contains(text(),'Shipment')]/parent::div/parent::div/parent::div/preceding-sibling::div)[2]")
	private WebElement sm18;

	public WebElement getSm18() {
		return sm18;
	}
	
	@FindBy(xpath="(//span[text()='Style' or @data-csi-tab-name='Style'])[2]")
	private WebElement sm19;

	public WebElement getSm19() {
		return sm19;
	}
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")
	private WebElement sm20;

	public WebElement getSm20() {
		return sm20;
	}
	
	@FindBy(xpath="//div[@data-csi-crumb-type='Style']")
	private WebElement sm21;

	public WebElement getSm21() {
		return sm21;
	}
	
	@FindBy(xpath="(//td[contains(text(),'Green')]//following-sibling::td)[1]//input[@tabindex='0']")
	private WebElement sm22;

	public WebElement getSm22() {
		return sm22;
	}
	
	@FindBy(xpath="(//td[contains(text(),'Blue')]//following-sibling::td)[1]//input[@tabindex='0']")
	private WebElement sm23;

	public WebElement getSm23() {
		return sm23;
	}
	
	@FindBy(xpath="(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[1]")
	private WebElement sm24;

	public WebElement getSm24() {
		return sm24;
	}
	
	@FindBy(xpath="(//td[contains(text(),'APPROVED')]//following-sibling::td//div/span[text()='close'])[1]")
	private WebElement sm25;

	public WebElement getSm25() {
		return sm25;
	}
	
	@FindBy(xpath="(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[3]")
	private WebElement sm26;

	public WebElement getSm26() {
		return sm26;
	}
	
	@FindBy(xpath="(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[4]")
	private WebElement sm27;

	public WebElement getSm27() {
		return sm27;
	}
	
	@FindBy(xpath="(//td[@data-csi-heading='State:Child:CurrentRevision:0'])[5]")
	private WebElement sm28;

	public WebElement getSm28() {
		return sm28;
	}
	
	@FindBy(xpath="(//td[contains(text(),'PENDING')]//following-sibling::td//div/span[text()='close'])[1]")
	private WebElement sm29;

	public WebElement getSm29() {
		return sm29;
	}
	
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'filter-SupplierRequest-SRLineItemProductSupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]")
	private WebElement sm30;

	public WebElement getSm30() {
		return sm30;
	}
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'filter-SupplierRequest-SRLineItemProductSupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])[1]")
	private WebElement sm31;

	public WebElement getSm31() {
		return sm31;
	}
	
	@FindBy(xpath="//label[contains(text(),'Changshu')]")
	private WebElement sm32;

	public WebElement getSm32() {
		return sm32;
	}
	
	@FindBy(xpath="//label[contains(text(),'Supplier')]")
	private WebElement sm33;

	public WebElement getSm33() {
		return sm33;
	}
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'filter-SupplierRequest-SRSuppliersStyleSamples-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]")
	private WebElement sm34;

	public WebElement getSm34() {
		return sm34;
	}
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'filter-SupplierRequest-SRSuppliersStyleSamples-Node Name')]//div[contains(@class,'ArrowButton')])[1]")
	private WebElement sm35;

	public WebElement getSm35() {
		return sm35;
	}
	
	@FindBy(xpath="(//span[contains(@data-csi-automation,'plugin-SupplierRequest-StyleSamples-refresh')]/span)")
	private WebElement sm36;

	public WebElement getSm36() {
		return sm36;
	}
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'filter-StyleSourcing-SupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]")
	private WebElement sm37;

	public WebElement getSm37() {
		return sm37;
	}
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'filter-StyleSourcing-SupplierItems-Node Name')]//div[contains(@class,'ArrowButton')])[1]")
	private WebElement sm38;

	public WebElement getSm38() {
		return sm38;
	}
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'filter-Style-ProductSamples-Node Name')]//div[contains(@class,'ArrowButton')])/following-sibling::div[2]/input)[1]")
	private WebElement sm39;

	public WebElement getSm39() {
		return sm39;
	}
	
	@FindBy(xpath="(//td[@data-csi-heading='Node Name::0']/a[contains(text(),'Home')])[1]")
	private WebElement sm40;

	public WebElement getSm40() {
		return sm40;
	}
	
	@FindBy(xpath="//a[text()='01 - Spring 2020']")
	private WebElement sm41;

	public WebElement getSm41() {
		return sm41;
	}
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SKU-Form-RealizedSize']/div)[3]")
	private WebElement sm42;

	public WebElement getSm42() {
		return sm42;
	}
	
	@FindBy(xpath="(//div[@role='option' and @item='2']/div)[1]")
	private WebElement sm43;

	public WebElement getSm43() {
		return sm43;
	}
	
	@FindBy(xpath="(//div[@role='option' and @item='2']/div)[2]")
	private WebElement sm431;

	public WebElement getSm431() {
		return sm431;
	}
	
	@FindBy(xpath="//th[text()='Size']")
	private WebElement sm44;

	public WebElement getSm44() {
		return sm44;
	}
	
	@FindBy(xpath="(//div[@data-csi-automation='field-SKU-Form-RealizedColor']/div)[3]")
	private WebElement sm45;

	public WebElement getSm45() {
		return sm45;
	}
	
	@FindBy(xpath="(//div[@role='option' and @item='2']/div)[2]")
	private WebElement sm46;

	public WebElement getSm46() {
		return sm46;
	}
	
	@FindBy(xpath="//th[text()='Colorway']")
	private WebElement sm47;

	public WebElement getSm47() {
		return sm47;
	}
	
	@FindBy(xpath="//option[@value='Node Name:Child:__Parent__/Child:__Parent__:0']")
	private WebElement sm48;

	public WebElement getSm48() {
		return sm48;
	}
	
	@FindBy(xpath="//option[@value='Node Type:Child:__Parent__/Child:__Parent__:0']")
	private WebElement sm49;

	public WebElement getSm49() {
		return sm49;
	}
	
	@FindBy(xpath="//option[@value='Description::0']")
	private WebElement sm50;

	
	
	@FindBy(xpath="//option[@value='StatusUpdateDate::0']")
	private WebElement sm51;

	
	
	@FindBy(xpath="//option[@value='Comment::0']")
	private WebElement sm52;

	
	
	@FindBy(xpath="//option[@value='DueDate::0']")
	private WebElement sm53;

	
	
	@FindBy(xpath="//option[@value='IssueProductSizes::0']")
	private WebElement sm54;

	
	
	@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Product Colors']")
	private WebElement sm55;

	@FindBy(xpath="//option[@value='Node Name:Child:IssueProductColors:0{IssueProductColors}']")
	private WebElement sm56;

	public WebElement getSm50() {
		return sm50;
	}

	public WebElement getSm51() {
		return sm51;
	}

	public WebElement getSm52() {
		return sm52;
	}

	public WebElement getSm53() {
		return sm53;
	}

	public WebElement getSm54() {
		return sm54;
	}

	public WebElement getSm55() {
		return sm55;
	}

	public WebElement getSm56() {
		return sm56;
	}
	
	@FindBy(xpath="//span[@data-csi-act='Cancel']")
	private WebElement sm57;

	public WebElement getSm57() {
		return sm57;
	}	
		@FindBy(xpath="//th[text()='Sizes']")
		private WebElement sm58;

		public WebElement getSm58() {
			return sm58;
		}	
		
		@FindBy(xpath="//th[text()='Product Colors']")
		private WebElement sm59;

		public WebElement getSm59() {
			return sm59;
		}	
	
		@FindBy(xpath="//div[@data-csi-automation='field-Issue-Form-CreateOneIssuePerColorSize']/input")
		private WebElement sm60;

		public WebElement getSm60() {
			return sm60;
		}
		
		@FindBy(xpath="//input[@name='CreateOneIssuePerColorSize' and @aria-checked='true']")
		private WebElement sm61;

		public WebElement getSm61() {
			return sm61;
		}
		
		@FindBy(xpath="//input[@name='Owner' and contains(@value,'Administrator')]/preceding-sibling::input")
		private WebElement sm62;

		public WebElement getSm62() {
			return sm62;
		}
		
		@FindBy(xpath="//span[@data-csi-act='Save_Copy']")
		private WebElement sm63;

		public WebElement getSm63() {
			return sm63;
		}
		
		@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Cancel']")
		private WebElement sm64;

		public WebElement getSm64() {
			return sm64;
		}
		
		@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Delete']")
		private WebElement sm65;

		public WebElement getSm65() {
			return sm65;
		}
		
		@FindBy(xpath="(//div[@role='option' and @item='2']/div)[1]")
		private WebElement sm66;

		public WebElement getSm66() {
			return sm66;
		}
		
		@FindBy(xpath="(//div[@role='option' and @item='2']/div)[2]")
		private WebElement sm661;

		public WebElement getSm661() {
			return sm661;
		}
		
		@FindBy(xpath="//th[text()='Select All']//following::input[1][@class='dijitReset dijitCheckBoxInput' and @tabindex='0' and @aria-checked='true']")
		private WebElement sm67;

		public WebElement getSm67() {
			return sm67;
		}
		
		@FindBy(xpath="//th[text()='Select All']//following::input[1][@class='dijitReset dijitCheckBoxInput' and @tabindex='0' and @aria-checked='false']")
		private WebElement sm68;

		public WebElement getSm68() {
			return sm68;
		}
		
		@FindBy(xpath="//th[text()='Style SKU']")
		private WebElement sm69;

		public WebElement getSm69() {
			return sm69;
		}
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Collection']")
		private WebElement sm70;

		public WebElement getSm70() {
			return sm70;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Style SKUs']")
		private WebElement sm71;

		public WebElement getSm71() {
			return sm71;
		}
		
		@FindBy(xpath="//*[@data-csi-automation='plugin-StructureItem-AllSKUs-MassCreateSKUs']")
		private WebElement sm72;

		public WebElement getSm72() {
			return sm72;
		}
		
		@FindBy(xpath="(//div[@data-csi-automation='field-SKU-Form-Styles']/div)[3]")
		private WebElement sm73;

		public WebElement getSm73() {
			return sm73;
		}
		
		@FindBy(xpath="(//div[@role='option' and @item='1']/div)[1]")
		private WebElement sm74;

		public WebElement getSm74() {
			return sm74;
		}
		
		@FindBy(xpath="//div[@class='csi-footer']//following::span[text()='3 SKUs created']")
		private WebElement sm75;

		public WebElement getSm75() {
			return sm75;
		}
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Style']")
		private WebElement sm76;

		public WebElement getSm76() {
			return sm76;
		}
		
		@FindBy(xpath="//div[@role='option' and @item='0']/div")
		private WebElement sm77;

		public WebElement getSm77() {
			return sm77;
		}
		
		@FindBy(xpath="//div[@role='option' and @item='1']/div")
		private WebElement sm771;

		public WebElement getSm771() {
			return sm771;
		}
		
		@FindBy(xpath="//th[text()='Alternate Size Range']")
		private WebElement sm78;

		public WebElement getSm78() {
			return sm78;
		}
		
		@FindBy(xpath="//div[@data-csi-automation='field-Sample-Form-RequestSampleCustomQuantity']/input[@name='RequestSampleCustomQuantity']")
		private WebElement sm79;

		public WebElement getSm79() {
			return sm79;
		}
		
		@FindBy(xpath="//table[@class='dgrid-row-table']/tr[1]/th[2]//input[@class='dijitReset dijitInputInner']")
		private WebElement sm80;

		public WebElement getSm80() {
			return sm80;
		}
		
		@FindBy(xpath="//th[@role='columnheader' and text()='Quantity']")
		private WebElement sm81;

		public WebElement getSm81() {
			return sm81;
		}
		
		@FindBy(xpath="(//span[@class='dijitReset dijitInline dijitButtonText' and text()='All'])[1]")
		private WebElement sm82;

		public WebElement getSm82() {
			return sm82;
		}
		
		@FindBy(xpath="//span[@class='csi-header-search-in-title-label' and text()='winter season']")
		private WebElement sm83;

		public WebElement getSm83() {
			return sm83;
		}
		
		@FindBy(xpath="//span[contains(@data-csi-automation,'plugin-Style-Properties-CustomViewActions')]//span[@title='Manage custom views']")
		private WebElement sm84;

		public WebElement getSm84() {
			return sm84;
		}
		
		@FindBy(xpath="//tr[contains(@data-csi-automation,'plugin-Style-Properties-CustomViewManage')]//td[text()='Manage Views']")
		private WebElement sm841;

		public WebElement getSm841() {
			return sm841;
		}
		
		@FindBy(xpath="//div[@data-csi-automation='field-Sample-Form-RequestSampleQuantity']/div[2]/input")
		private WebElement sm85;

		public WebElement getSm85() {
			return sm85;
		}
		
		@FindBy(xpath="//option[@value='Node Name::0']")
		private WebElement sm86;

		public WebElement getSm86() {
			return sm86;
		}
		
		@FindBy(xpath="//option[@value='Code::0']")
		private WebElement sm87;

		public WebElement getSm87() {
			return sm87;
		}
		
		@FindBy(xpath="//option[@value='Description::0']")
		private WebElement sm88;

		public WebElement getSm88() {
			return sm88;
		}
		
		@FindBy(xpath="//option[@value='ProductType::0']")
		private WebElement sm89;

		public WebElement getSm89() {
			return sm89;
		}
		
		@FindBy(xpath="//option[@value='Theme::0']")
		private WebElement sm90;

		public WebElement getSm90() {
			return sm90;
		}
		
		@FindBy(xpath="//option[@value='ProductStructure:Child:Spec:0']")
		private WebElement sm91;

		public WebElement getSm91() {
			return sm91;
		}
		@FindBy(xpath="//div[@class='csiHeadingCellLabel' and text()='Code']")
		private WebElement code1;
		
		


		public WebElement getCode1() {
			return code1;
		}

		@FindBy(xpath="//option[@value='Tool:Child:Spec:0']")
		private WebElement sm92;

		public WebElement getSm92() {
			return sm92;
		}
		
		@FindBy(xpath="//option[@value='DevelopmentType::0']")
		private WebElement sm93;

		public WebElement getSm93() {
			return sm93;
		}
		
		@FindBy(xpath="//option[@value='Active::0']")
		private WebElement sm94;

		public WebElement getSm94() {
			return sm94;
		}
		
		@FindBy(xpath="//option[@value='CarryOver::0']")
		private WebElement sm95;

		public WebElement getSm95() {
			return sm95;
		}
		
		@FindBy(xpath="//th[text()='Sample']")
		private WebElement sm96;

		public WebElement getSm96() {
			return sm96;
		}
		
		@FindBy(xpath="//div[@data-csi-automation='field-Sample-Form-RequestSampleQuantity']//input[@class='dijitReset dijitInputInner']")
		private WebElement sm97;

		public WebElement getSm97() {
			return sm97;
		}
		
		@FindBy(xpath="//th[text()='Quantity']")
		private WebElement sm98;

		public WebElement getSm98() {
			return sm98;
		}
		
		@FindBy(xpath="(//div[@role='option' and @item='1']/div)[2]")
		private WebElement sm99;

		public WebElement getSm99() {
			return sm99;
		}
		
		@FindBy(xpath="(//div[@role='option' and @item='1']/div)[3]")
		private WebElement sm100;

		public WebElement getSm100() {
			return sm100;
		}
		
		@FindBy(xpath="(//a[text()='1-ASample2-Supplier-11-0103 EGRET-small']//following::td/div/span[@data-csi-act='Edit'])[1]")
		private WebElement sm101;

		public WebElement getSm101() {
			return sm101;
		}
		
		@FindBy(xpath="(//div[contains(@data-csi-automation,'Sample-Form-ProductSize')]/div)[1]")
		private WebElement sm102;

		public WebElement getSm102() {
			return sm102;
		}
		
		@FindBy(xpath="(//a[text()='1-ASample2-Supplier-11-0103 EGRET-small']//following::td/div/span[@data-csi-act='Copy'])[1]")
		private WebElement sm103;

		public WebElement getSm103() {
			return sm103;
		}
		
		@FindBy(xpath="(//a[text()='1-ASample2-Supplier-11-0103 EGRET-small-copy']//following::td/div/span[@data-csi-act='Delete'])[1]")
		private WebElement sm104;

		public WebElement getSm104() {
			return sm104;
		}
		
		@FindBy(xpath="(//span[text()='Delete'])")
		private WebElement sm105;

		public WebElement getSm105() {
			return sm105;
		}
		
		@FindBy(xpath="(//tr[@data-csi-act='NewStyle']//following::td[@class='dijitReset dijitMenuItemLabel'])[1]")
		private WebElement sm106;

		public WebElement getSm106() {
			return sm106;
		}
		
		@FindBy(xpath="//div[@data-csi-automation='field-Style-Form-Node Name']//input[@class='dijitReset dijitInputInner']")
		private WebElement sm107;

		public WebElement getSm107() {
			return sm107;
		}
		
		@FindBy(xpath="(//div[@data-csi-automation='field-Style-Form-Auto_Test']/input)[1]")
		private WebElement sm108;

		public WebElement getSm108() {
			return sm108;
		}
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Collection']")
		private WebElement sm109;

		public WebElement getSm109() {
			return sm109;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Collection']")
		private WebElement sm110;

		public WebElement getSm110() {
			return sm110;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Styles']")
		private WebElement sm111;

		public WebElement getSm111() {
			return sm111;
		}
		
		@FindBy(xpath="(//a[@class='browse' and text()='1AStyleSample'])[1]")
		private WebElement sm112;

		public WebElement getSm112() {
			return sm112;
		}
		
		@FindBy(xpath="(//a[@class='browse' and text()='1AStyleSample'])[2]")
		private WebElement sm1121;

		public WebElement getSm1121() {
			return sm1121;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Sourcing']")
		private WebElement sm113;

		public WebElement getSm113() {
			return sm113;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Product Suppliers']")
		private WebElement sm114;

		public WebElement getSm114() {
			return sm114;
		}
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Season']")
		private WebElement sm115;

		public WebElement getSm115() {
			return sm115;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Season']")
		private WebElement sm116;

		public WebElement getSm116() {
			return sm116;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Colorways']")
		private WebElement sm117;

		public WebElement getSm117() {
			return sm117;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Style SKUs']")
		private WebElement sm118;

		public WebElement getSm118() {
			return sm118;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Issues']")
		private WebElement sm119;

		public WebElement getSm119() {
			return sm119;
		}
		
		@FindBy(xpath="(//span[@data-csi-automation='filter-StructureItem-AllSamples-Node Name']/span)[1]")
		private WebElement sm120;

		public WebElement getSm120() {
			return sm120;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Season']")
		private WebElement sm121;

		public WebElement getSm121() {
			return sm121;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Samples']")
		private WebElement sm122;

		public WebElement getSm122() {
			return sm122;
		}
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Brand']")
		private WebElement sm123;

		public WebElement getSm123() {
			return sm123;
		}
		
		@FindBy(xpath="//span[@data-csi-tab-name='Brand']")
		private WebElement sm124;

		public WebElement getSm124() {
			return sm124;
		}
		
		@FindBy(xpath="(//div[@role='option' and @item='1']/div)[1]")
		private WebElement sm125;

		public WebElement getSm125() {
			return sm125;
		}
		
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Department']")
		private WebElement sm126;

		public WebElement getSm126() {
			return sm126;
		}
		
		
		@FindBy(xpath="//span[@data-csi-tab-name='Department']")
		private WebElement sm127;

		public WebElement getSm127() {
			return sm127;
		}
		
		
		@FindBy(xpath="//table[@data-csi-automation='plugin-StructureItem-StructureItemIssues-ToolbarNewActions']")
		private WebElement sm128;

		public WebElement getSm128() {
			return sm128;
		}
		
		
		
		
		// ----MaterialBOMSteps -->Nagarajan

		@FindBy(xpath="(//a[text()='A_MB_Sec1']//following::td[@data-csi-heading='Active::0'])[1]")
		private WebElement Activestate;
		
		@FindBy(xpath="(//a[text()='A_MB_Sec2']//following::td[@data-csi-heading='Active::0'])[1]")
		private WebElement Active2;
		
		@FindBy(xpath="(//a[text()='A_MB_Sec3']//following::td[@data-csi-heading='Active::0'])[1]")
		private WebElement Active3;
		
		@FindBy(xpath="(//a[text()='A_MB_Sec4']//following::td[@data-csi-heading='Active::0'])[1]")
		private WebElement Active4;
		
		@FindBy(xpath="//div//span[contains(@class,'csiActionIcon iconCrumb')]")
		private WebElement iconCrumb;
		
		@FindBy(xpath="//div//span[contains(@class,'csiActionIcon iconCrumb')]")
		private WebElement iconCrumb1;
		
		@FindBy(xpath="//td[text()='A_MB_Sec3']//preceding-sibling::td//input")
		private WebElement sec3;
		
		@FindBy(xpath="//td[text()='A_MB_Sec4']//preceding-sibling::td//input")
		private WebElement sec4;
		
		@FindBy(xpath="//td[text()='A_MB_Sec2']//preceding-sibling::td//input")
		private WebElement sec2;
		
		@FindBy(xpath="//span[@class='attrPrimary' and contains(text(),'All section')]")
		private WebElement AllSection;
		
		@FindBy(xpath="(//div[text()='add'])[2]")
		private WebElement add;
		
		@FindBy(xpath="(//div[text()='add'])[2]")
		private WebElement add1;
		
		@FindBy(xpath="//td[@data-csi-act='Node Name::0']//a[contains(text(),'DestinationBOM')]")
		private WebElement DestinationBom;
		
		@FindBy(xpath="(//div[text()='add'])[2]")
		private WebElement add2;
		
		@FindBy(xpath="//td[@data-csi-act='Node Name::0']//a[contains(text(),'DestinationBOM2')]")
		private WebElement DestinationBom2;

		@FindBy(xpath="(//td[@data-csi-heading='Node Name::0'])[1]")
		private WebElement placement0;
		
		@FindBy(xpath="(//span[text()='A_Plac_02'])[1]")
		private WebElement placement1;
		
		@FindBy(xpath="(//td[@class='dijitReset dijitMenuItemLabel' and text()='Revise'])[1]")
		private WebElement ActionVerify;
		
		@FindBy(xpath="(//td[text()='Review'])[1]")
		private WebElement rev1;
		
		@FindBy(xpath="(//td[text()='Revise'])[1]")
		private WebElement revise3;

		@FindBy(xpath="(//td[text()='Abandon'])[1]")
		private WebElement abandom2;
		
		@FindBy(xpath="(//td[text()='View All Revisions'])[1]")
		private WebElement AllRevi2;

		@FindBy(xpath="(//td[text()='Purge Revisions'])[1]")
		private WebElement purgeRevision2;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Freeze']")
		private WebElement revFreeRevise;
		
		@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Revision 4']")
		private WebElement revBtn;
		
		@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Revision 5']")
		private WebElement revBtn1;
		
		@FindBy(xpath="//a[@class='browse' and text()='BOMStateVerify1']//following::td[@data-csi-heading='State:Child:CurrentRevision:0' and text()='REVIEW']")
		private WebElement copyBom;
		
		@FindBy(xpath="(//a[@class='browse' and text()='BOMStateVerify1']//following::td[@class='actionsColumn noexport']/div/span[@data-csi-act='Copy'])[1]")
		private WebElement copyBom2;
		
		@FindBy(xpath="//a[@class='browse' and text()='BOMStateVerify2']//following::td[@data-csi-heading='State:Child:CurrentRevision:0' and text()='DRAFT']")
		private WebElement DraftCopy;
		
		@FindBy(xpath="//span[@class='csi-name-value-pair-value' and text()='REVISED']")
		private WebElement pairValue;
		
		@FindBy(xpath="(//span[@data-csi-automation='plugin-MaterialBOM-Breadcrumb-Actions']//span[2])[2]")
		private WebElement plugin1;
		
		@FindBy(xpath="//a[@class='browse' and text()='BOMStateVerify1']//following::td[@data-csi-heading='State:Child:CurrentRevision:0' and text()='REVIEW']")
		private WebElement BomStateVerify1;
		
		@FindBy(xpath="(//a[@class='browse' and text()='BOMStateVerify1']//following::td[@class='actionsColumn noexport']/div/span[@data-csi-act='Copy'])[1]")
		private WebElement BomStateVerify2;
		
		@FindBy(xpath="//a[@class='browse' and text()='BOMStateVerify3']//following::td[@data-csi-heading='State:Child:CurrentRevision:0' and text()='DRAFT']")
		private WebElement BomStateVerify5;
		
		@FindBy(xpath="//span[@class='csi-name-value-pair-value' and text()='APPROVED']")
		private WebElement pairvalue2;
		
		@FindBy(xpath="//a[text()='BOMStateVerify1']")
		private WebElement PurgeAction1;
		
		@FindBy(xpath="(//td[@data-csi-heading='State::0' and text()='REVISED'])[1]")
		private WebElement PurgeAction2;
		
		@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Purge']")
		private WebElement PurgeAction3;
		
		@FindBy(xpath="//td[@data-csi-heading='___Revision::0' and text()='5']")
		private WebElement Heading1;
		
		@FindBy(xpath="//td[@data-csi-heading='___Revision::0' and text()='3']")
		private WebElement Heading2;
		
		@FindBy(xpath="//td[@data-csi-heading='State::0' and text()='REVIEW']")
		private WebElement PurgeReview;
		
		@FindBy(xpath="//td[@data-csi-heading='State::0' and text()='SUBMITTED']")
		private WebElement PurgeSubmitted;
		
		@FindBy(xpath="(//td[text()='Purge and Reset Revisions'])[1]")
		private WebElement PurgeReset2;
		
		@FindBy(xpath="//span[@class='dijitReset dijitInline dijitButtonText' and text()='Purge and Reset']")
		private WebElement PurgeReset3;
		
		@FindBy(xpath="//td[@data-csi-heading='State::0' and text()='DRAFT']/preceding-sibling::td[@data-csi-heading='___Revision::0' and text()='1']")
		private WebElement PurgeDraft;

		public WebElement getActivestate() {
			return Activestate;
		}


		public WebElement getActive2() {
			return Active2;
		}


		public WebElement getActive3() {
			return Active3;
		}


		public WebElement getActive4() {
			return Active4;
		}
		
		public WebElement getIconCrumb() {
			return iconCrumb;
		}

		public WebElement getIconCrumb1() {
			return iconCrumb1;
		}


		public WebElement getSec3() {
			return sec3;
		}


		public WebElement getSec4() {
			return sec4;
		}


		public WebElement getSec2() {
			return sec2;
		}


		public WebElement getAllSection() {
			return AllSection;
		}


		public WebElement getAdd() {
			return add;
		}



		public WebElement getAdd1() {
			return add1;
		}



		public WebElement getDestinationBom() {
			return DestinationBom;
		}


		public WebElement getAdd2() {
			return add2;
		}


		public WebElement getDestinationBom2() {
			return DestinationBom2;
		}

		public WebElement getPlacement0() {
			return placement0;
		}


		public WebElement getPlacement1() {
			return placement1;
		}



		public WebElement getActionVerify() {
			return ActionVerify;
		}


		public WebElement getRev1() {
			return rev1;
		}


		public WebElement getAbandom2() {
			return abandom2;
		}


		public WebElement getAllRevi2() {
			return AllRevi2;
		}


		public WebElement getPurgeRevision2() {
			return purgeRevision2;
		}


		public WebElement getRevFreeRevise() {
			return revFreeRevise;
		}


		public WebElement getRevBtn() {
			return revBtn;
		}


		public WebElement getRevBtn1() {
			return revBtn1;
		}


		public WebElement getCopyBom() {
			return copyBom;
		}


		public WebElement getCopyBom2() {
			return copyBom2;
		}


		public WebElement getDraftCopy() {
			return DraftCopy;
		}
		

		public WebElement getRevise3() {
			return revise3;
		}


		public WebElement getPairValue() {
			return pairValue;
		}


		public WebElement getPlugin1() {
			return plugin1;
		}


		public WebElement getBomStateVerify1() {
			return BomStateVerify1;
		}


		public WebElement getBomStateVerify2() {
			return BomStateVerify2;
		}


		public WebElement getBomStateVerify5() {
			return BomStateVerify5;
		}


		public WebElement getPairvalue2() {
			return pairvalue2;
		}


		public WebElement getPurgeAction1() {
			return PurgeAction1;
		}


		public WebElement getPurgeAction2() {
			return PurgeAction2;
		}


		public WebElement getPurgeAction3() {
			return PurgeAction3;
		}


		public WebElement getHeading1() {
			return Heading1;
		}


		public WebElement getHeading2() {
			return Heading2;
		}


		public WebElement getPurgeReview() {
			return PurgeReview;
		}


		public WebElement getPurgeSubmitted() {
			return PurgeSubmitted;
		}

		public WebElement getPurgeReset2() {
			return PurgeReset2;
		}


		public WebElement getPurgeReset3() {
			return PurgeReset3;
		}


		public WebElement getPurgeDraft() {
			return PurgeDraft;
		}
		
		
		// ----MaterialSpecificationPageSteps -->Nagarajan
		
		@FindBy(xpath="(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]")
		private WebElement ApparelView;

		@FindBy(xpath="(//span[text()='Material' or @data-csi-tab='ApparelViews-AllMaterials'])[2]")
		private WebElement ApparelMaterial;
		
		@FindBy(xpath="(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Copy'])[3]")
		private WebElement ApparelView1;
		
		@FindBy(xpath="(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Copy'])[1]")
		private WebElement ApparelCopy;
		
		@FindBy(xpath="(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Delete'])[2]")
		private WebElement ApparelCopy2;
		
		@FindBy(xpath="//div[@role='option' and @item='1']/div")
		private WebElement items;
		
		@FindBy(xpath="(//select[@class='csiPreferenceSelect '])/option[1]")
		private WebElement csiOption;
		
		@FindBy(xpath="(//select[@class='csiPreferenceSelect '])/option[1]")
		private WebElement csiSelect;
		
		
		@FindBy(xpath="(//label[contains(text(),'Filter')]//following-sibling::div)[1]/div[1]")
		private WebElement filter;
		
		@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option[text()='Only For Material Types']")
		private WebElement MaterialType;
		
		@FindBy(xpath="((//a[text()='Blue']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='close'])[1]")
		private WebElement mouseOvr;
		
		@FindBy(xpath="(//span[text()='home'])")
		private WebElement homeTb;
		
		@FindBy(xpath="(//span[@data-csi-act='Delete'])[1]")
		private WebElement DeleteTb;
		
		@FindBy(xpath="(//span[@data-csi-act='Delete'])[1]")
		private WebElement DeleteTb1;
		
		@FindBy(xpath="((//a[contains(text(),'SKU')]/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='close'])[1]")
		private WebElement SKU;
		
		@FindBy(xpath="(//span[text()='Care Label'])")
		private WebElement careLabel;
		
		@FindBy(xpath="//div[contains(@class,'ProductStructure')]//td[@data-csi-heading='Node Name::0']/a")
		private WebElement NameProduct;
		
		@FindBy(xpath="(//div[text()='add' and contains(@class,'icon')])[2]")
		private WebElement addContains;
		
		@FindBy(xpath="((//div[contains(@data-csi-automation,'FixedMaterial')]/div)[3]/input)[1]")
		private WebElement FixedMaterial;
		
		@FindBy(xpath="((//div[contains(@data-csi-automation,'field-MaterialSample-Form-ProductType')])[1]/div[3]/input)[1]")
		private WebElement fabricStand;
		
		@FindBy(xpath="//a[text()='100% Cotton/Rayon Jersey - Copy']")
		private WebElement cottoncopy;
		
		
		public WebElement getCottoncopy() {
			return cottoncopy;
		}
		
		public WebElement getApparelView() {
			return ApparelView;
		}


		public WebElement getApparelMaterial() {
			return ApparelMaterial;
		}


		public WebElement getApparelView1() {
			return ApparelView1;
		}


		public WebElement getApparelCopy() {
			return ApparelCopy;
		}


		public WebElement getApparelCopy2() {
			return ApparelCopy2;
		}


		public WebElement getItems() {
			return items;
		}


		public WebElement getCsiOption() {
			return csiOption;
		}


		public WebElement getCsiSelect() {
			return csiSelect;
		}


		public WebElement getFilter() {
			return filter;
		}


		public WebElement getMaterialType() {
			return MaterialType;
		}


		public WebElement getMouseOvr() {
			return mouseOvr;
		}


		public WebElement getHomeTb() {
			return homeTb;
		}


		public WebElement getDeleteTb() {
			return DeleteTb;
		}


		public WebElement getDeleteTb1() {
			return DeleteTb1;
		}


		public WebElement getSKU() {
			return SKU;
		}


		public WebElement getCareLabel() {
			return careLabel;
		}


		public WebElement getNameProduct() {
			return NameProduct;
		}


		public WebElement getAddContains() {
			return addContains;
		}


		public WebElement getFixedMaterial() {
			return FixedMaterial;
		}


		public WebElement getFabricStand() {
			return fabricStand;
		}
		
		
		
		// ----MerchandisingSteps -->Nagarajan
		
		@FindBy(xpath="(//span[text()='Save'])") 
		private WebElement save;
		
		@FindBy(xpath="//label[text()='Apparel - Color and Size']") 
		private WebElement colorAndSize;
		
		@FindBy(xpath="//label[text()='Option']")
		private WebElement LabelOption;
		
		@FindBy(xpath="//label[text()='Product']")
		private WebElement LabelProduct;
		
		@FindBy(xpath="//span[text()='Save & New']")
		private WebElement SaveAndNew;
		
		@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0'])[3]")
		private WebElement settings;
		
		@FindBy(xpath="//label[text()='Gender']")
		private WebElement gender;
		
		@FindBy(xpath="//label[text()='Product Group']")
		private WebElement PG;
		
		@FindBy(xpath="//label[text()='Department']")
		private WebElement Dept;
		
		@FindBy(xpath="//label[text()='Region']")
		private WebElement LabelRegion;
		
		@FindBy(xpath="//label[text()='Monthly']")
		private WebElement LabelMonthly;
		
		@FindBy(xpath="//label[text()='Segment']")
		private WebElement LabelSegment;//
		
		@FindBy(xpath="//a[text()='System Configuration']")  
		private WebElement systemConfg;
		
		@FindBy(xpath="//a[text()='Product']")
		private WebElement Prod;
		
		@FindBy(xpath="//span[text()='Style Push Templates']")
		private WebElement StyleTemp;
		
		@FindBy(xpath="//a[text()='Product-01']")
		private WebElement Prod1;
		
		@FindBy(xpath="//span[text()='Attribute Name']")
		private WebElement AttrName;
		
		@FindBy(xpath="//div[text()='Apparel - Color and Size']")
		private WebElement ApprColorSize;
		
		@FindBy(xpath="//span[@data-csi-tab-name='Attributes' or text()='Attributes']")
		private WebElement AttrTab;
		
		@FindBy(xpath="(//div[text()='New Folder Type']//following::div[contains(@class,'dijitSliderIncrementIconH')]//span[text()='+']/parent::div)[1]")
		private WebElement NewFolder;
		
		@FindBy(xpath="//a[text()='Summer 2021']")
		private WebElement summer2021;
		
		@FindBy(xpath="//a[text()='Summer 2022']")
		private WebElement summer2022;
		
		@FindBy(xpath="//td[text()='New from Brand']")
		private WebElement NewBrnd;
		
		@FindBy(xpath="//span[text()='1 Styles were updated']")
		private WebElement styleUpdte;
		
		@FindBy(xpath="//span[@data-csi-automation='plugin-Style-Properties-refresh']")
		private WebElement PropRefresh;
		
		
		
		public WebElement getSave() {
			return save;
		}


		public WebElement getColorAndSize() {
			return colorAndSize;
		}


		public WebElement getLabelOption() {
			return LabelOption;
		}


		public WebElement getLabelProduct() {
			return LabelProduct;
		}


		public WebElement getSaveAndNew() {
			return SaveAndNew;
		}


		public WebElement getSettings() {
			return settings;
		}


		public WebElement getGender() {
			return gender;
		}


		public WebElement getPG() {
			return PG;
		}


		public WebElement getDept() {
			return Dept;
		}


		public WebElement getLabelRegion() {
			return LabelRegion;
		}


		public WebElement getLabelMonthly() {
			return LabelMonthly;
		}


		public WebElement getLabelSegment() {
			return LabelSegment;
		}


		public WebElement getSystemConfg() {
			return systemConfg;
		}


		public WebElement getProd() {
			return Prod;
		}


		public WebElement getStyleTemp() {
			return StyleTemp;
		}


		public WebElement getProd1() {
			return Prod1;
		}


		public WebElement getAttrName() {
			return AttrName;
		}


		public WebElement getApprColorSize() {
			return ApprColorSize;
		}


		public WebElement getAttrTab() {
			return AttrTab;
		}


		public WebElement getNewFolder() {
			return NewFolder;
		}


		public WebElement getSummer2021() {
			return summer2021;
		}


		public WebElement getSummer2022() {
			return summer2022;
		}


		public WebElement getNewBrnd() {
			return NewBrnd;
		}


		public WebElement getStyleUpdte() {
			return styleUpdte;
		}


		public WebElement getPropRefresh() {
			return PropRefresh;
		}
		
		
		
		// ----ProductAlternativeSteps -->Nagarajan
		
		
		
		//-----------------------------------------------------
		
		
		
		// ----ProductCustomizationSteps -->Nagarajan
		
		
		@FindBy(xpath="//div[@class='csi-error-message' and text()='This value is out of range.']")
		private WebElement errorMsg;

		@FindBy(xpath="//span[text()='40 created successfully.']")
		private WebElement successfully;
		
		@FindBy(xpath="//option[@value='Active::0']")
		private WebElement Act;
		
		@FindBy(xpath="//option[@value='CarryOver::0']")
		private WebElement carryOver;
		
		@FindBy(xpath="//option[@value='DefaultSize::0']")
		private WebElement defltSize;
		
		@FindBy(xpath="//option[@value='ProductStructure:Child:Spec:0']")
		private WebElement prdtstrct;
		
		@FindBy(xpath="//option[@value='Tool:Child:Spec:0']")
		private WebElement optTool;
		
		@FindBy(xpath="//option[@value='DevelopmentType::0']")
		private WebElement optType;
		
		@FindBy(xpath="//option[@value='ActualSizeRange:Child:Attributes:0']")
		private WebElement optRange;
		
		@FindBy(xpath="//option[@value='Node Name:Child:ProductSourcing/Child:SampleQuote/Child:__Parent__/Child:Agent:0']")
		private WebElement optSrc;
		
		@FindBy(xpath="//option[@value='Supplier:Child:ProductSourcing/Child:SampleQuote/Child:__Parent__:0']")
		private WebElement optSrc1;
		
		@FindBy(xpath="//option[@value='QuoteFactory:Child:ProductSourcing/Child:SampleQuote/Child:CurrentRevision:0']")
		private WebElement optQuo;
		
		@FindBy(xpath="//option[@value='Node Name:Child:ProductSourcing/Child:ProductionQuote/Child:__Parent__/Child:Agent:0']")
		private WebElement optPrd;
		
		@FindBy(xpath="//option[@value='Supplier:Child:ProductSourcing/Child:ProductionQuote/Child:__Parent__:0']")
		private WebElement optPrdSrc;
		
		@FindBy(xpath="//option[@value='QuoteFactory:Child:ProductSourcing/Child:ProductionQuote/Child:CurrentRevision:0']")
		private WebElement optRevision;
		
		@FindBy(xpath="//option[@value='RecentChildComments::0']")
		private WebElement optRecent;
		
		@FindBy(xpath="//span[@data-csi-heading='Node Name::0' and text()='Comment for Style']")
		private WebElement cfs1;
		
		@FindBy(xpath="//a[text()='Comment for Style']")
		private WebElement cfs2;
		
		@FindBy(xpath="//option[@value='CarryOver::0']")
		private WebElement carryovr;
		
		@FindBy(xpath="//option[@value='GTIN::0']")
		private WebElement gtin;
		
		@FindBy(xpath="//option[@value='MasterCartonI2of5::0']")
		private WebElement carton;
		
		@FindBy(xpath="//option[@value='PalletI2of5::0']")
		private WebElement pallet;
		
		@FindBy(xpath="//option[@value='Agent:Child:SKUQuote/Child:__Parent__/Child:Supplier:0']")
		private WebElement skuQuote;
		
		@FindBy(xpath="//option[@value='Supplier:Child:SKUQuote/Child:__Parent__:0']")
		private WebElement supplierSKUquote;
		
		@FindBy(xpath="//option[@value='QuoteFactory:Child:SKUQuote/Child:CurrentRevision:0']")
		private WebElement QuoFact;
		
		@FindBy(xpath="//option[@value='DutyRates:Child:SKUQuote/Child:CurrentRevision:0']")
		private WebElement DutySku;
		
		@FindBy(xpath="//option[@value='DutyAdditional:Child:SKUQuote/Child:CurrentRevision:0']")
		private WebElement DutyAdditional;
		
		@FindBy(xpath="//option[@value='DutyPerItem:Child:SKUQuote/Child:CurrentRevision:0']")
		private WebElement DutyPerItem;
		
		@FindBy(xpath="//option[@value='DutyStatus:Child:SKUQuote/Child:CurrentRevision:0']")
		private WebElement DutyStatus;
		
		@FindBy(xpath="//option[@value='RecentComments:Child:DocumentsAndComments:0']")
		private WebElement RecComments;
		
		@FindBy(xpath="//span[@data-csi-heading='Node Name::0' and text()='Comment for SKU1']")
		private WebElement TwoSku;
		
		@FindBy(xpath="//a[text()='Comment for SKU1']")
		private WebElement skuComment;
		
		@FindBy(xpath="//span[@data-csi-heading='Node Name::0' and text()='Comment for SKU2']")
		private WebElement spancmt;
		
		@FindBy(xpath="//a[text()='Comment for SKU2']")
		private WebElement spancmt2;
		
		@FindBy(xpath="//span[@data-csi-heading='Node Name::0' and text()='Comment for Style']")
		private WebElement Navgsku1;
		
		@FindBy(xpath="//span[@data-csi-heading='Node Name::0' and text()='Comment for SKU1']")
		private WebElement Navgsku2;
		
		@FindBy(xpath="//span[@data-csi-heading='Node Name::0' and text()='Comment for SKU2']")
		private WebElement Navgsku3;
		
		@FindBy(xpath="//a[@data-csi-act='PopupComments' and text()='Comment for SKU1']")
		private WebElement popup;
		
		@FindBy(xpath="(//a[@data-csi-act='Delete'])[2]")
		private WebElement deleteact2;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Collection']")
		private WebElement textCollection;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Season']")
		private WebElement textSeason;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Brand']")
		private WebElement textBrand;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Department']")
		private WebElement textDept;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Select Members']")
		private WebElement SelectMembers;
		
		@FindBy(xpath="//span[@class='material-icons csi-toolbar-btn-icon-User']")
		private WebElement MaterialIcon;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Log Out']")
		private WebElement LoggedOut;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Collection']")
		private WebElement NVCollection;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Season']")
		private WebElement NASeason;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Brand']")
		private WebElement NABrand;
		
		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Department']")
		private WebElement NADepartment;
		
		@FindBy(xpath="//th[text()='Size']")
		private WebElement avbSize;
		
		@FindBy(xpath="//th[text()='Colorway']")
		private WebElement avbColorway;
		
		@FindBy(xpath="//div[@role='option' and @item='2']/div")
		private WebElement roleItems;
		
		@FindBy(xpath="(//div[@role='option' and @item='2']/div)[2]")
		private WebElement roleItems2;
		
		@FindBy(xpath="//span[text()='1 duplicate SKU ignored']")
		private WebElement SKUignored;
		
		@FindBy(xpath="//th[text()='Material SKU']")
		private WebElement DDSKU;
		
		@FindBy(xpath="//span[text()='APIViews-001']")
		private WebElement APIviews;
		
		@FindBy(xpath="//option[@value='Documents:Child:DocumentsAndComments:0']")
		private WebElement DocOpt;
		
		@FindBy(xpath="//span[text()='SKUViews-001']")
		private WebElement TxtSkuViews;
		
		@FindBy(xpath="//tr[@class='csiFormViewRow']//th[text()='Document']")
		private WebElement TrDoc;
		
		@FindBy(xpath="//tr[@class='csiFormViewRow']//th[text()='3D Zip File']")
		private WebElement ZipFile;

		@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Select Security Roles']")
		private WebElement selsecrole;
		
		@FindBy(xpath="//span[@data-csi-automation='filter-Role-SecurityRolesAndGroups-Node Name']/span[1]")
		private WebElement secrolegroup;
		
		@FindBy(xpath="//div[@role='option' and @item='0']/div")
		private WebElement optitemdiv;
		
		public WebElement getSelsecrole() {
			return selsecrole;
		}
		public WebElement getSecrolegroup() {
			return secrolegroup;
		}
		public WebElement getOptitemdiv() {
			return optitemdiv;
		}


		public WebElement getErrorMsg() {
			return errorMsg;
		}


		public WebElement getSuccessfully() {
			return successfully;
		}


		public WebElement getAct() {
			return Act;
		}


		public WebElement getCarryOver() {
			return carryOver;
		}


		public WebElement getDefltSize() {
			return defltSize;
		}


		public WebElement getPrdtstrct() {
			return prdtstrct;
		}


		public WebElement getOptTool() {
			return optTool;
		}


		public WebElement getOptType() {
			return optType;
		}


		public WebElement getOptRange() {
			return optRange;
		}


		public WebElement getOptSrc() {
			return optSrc;
		}


		public WebElement getOptSrc1() {
			return optSrc1;
		}


		public WebElement getOptQuo() {
			return optQuo;
		}


		public WebElement getOptPrd() {
			return optPrd;
		}


		public WebElement getOptPrdSrc() {
			return optPrdSrc;
		}


		public WebElement getOptRevision() {
			return optRevision;
		}


		public WebElement getOptRecent() {
			return optRecent;
		}


		public WebElement getCfs1() {
			return cfs1;
		}


		public WebElement getCfs2() {
			return cfs2;
		}


		public WebElement getCarryovr() {
			return carryovr;
		}


		public WebElement getGtin() {
			return gtin;
		}


		public WebElement getCarton() {
			return carton;
		}


		public WebElement getPallet() {
			return pallet;
		}


		public WebElement getSkuQuote() {
			return skuQuote;
		}


		public WebElement getSupplierSKUquote() {
			return supplierSKUquote;
		}


		public WebElement getQuoFact() {
			return QuoFact;
		}


		public WebElement getDutySku() {
			return DutySku;
		}


		public WebElement getDutyAdditional() {
			return DutyAdditional;
		}


		public WebElement getDutyPerItem() {
			return DutyPerItem;
		}


		public WebElement getDutyStatus() {
			return DutyStatus;
		}


		public WebElement getRecComments() {
			return RecComments;
		}


		public WebElement getTwoSku() {
			return TwoSku;
		}


		public WebElement getSkuComment() {
			return skuComment;
		}


		public WebElement getSpancmt() {
			return spancmt;
		}


		public WebElement getSpancmt2() {
			return spancmt2;
		}


		public WebElement getNavgsku1() {
			return Navgsku1;
		}


		public WebElement getNavgsku2() {
			return Navgsku2;
		}


		public WebElement getNavgsku3() {
			return Navgsku3;
		}


		public WebElement getPopup() {
			return popup;
		}


		public WebElement getDeleteact2() {
			return deleteact2;
		}


		public WebElement getTextCollection() {
			return textCollection;
		}


		public WebElement getTextSeason() {
			return textSeason;
		}


		public WebElement getTextBrand() {
			return textBrand;
		}


		public WebElement getTextDept() {
			return textDept;
		}


		public WebElement getSelectMembers() {
			return SelectMembers;
		}



		public WebElement getMaterialIcon() {
			return MaterialIcon;
		}


		public WebElement getLoggedOut() {
			return LoggedOut;
		}


		public WebElement getNVCollection() {
			return NVCollection;
		}



		public WebElement getNASeason() {
			return NASeason;
		}



		public WebElement getNABrand() {
			return NABrand;
		}



		public WebElement getNADepartment() {
			return NADepartment;
		}


		public WebElement getAvbSize() {
			return avbSize;
		}


		public WebElement getAvbColorway() {
			return avbColorway;
		}


		public WebElement getRoleItems() {
			return roleItems;
		}


		public WebElement getRoleItems2() {
			return roleItems2;
		}


		public WebElement getSKUignored() {
			return SKUignored;
		}

		public WebElement getDDSKU() {
			return DDSKU;
		}


		public WebElement getAPIviews() {
			return APIviews;
		}


		public WebElement getDocOpt() {
			return DocOpt;
		}


		public WebElement getTxtSkuViews() {
			return TxtSkuViews;
		}


		public WebElement getTrDoc() {
			return TrDoc;
		}


		public WebElement getZipFile() {
			return ZipFile;
		}

		
		
		// ----ProJectSteps -->Nagarajan.
		

		
		@FindBy(xpath="(//span[text()='Delete'])") //
		private WebElement DeleteBttn; 

		
		@FindBy(xpath="//span[@title='Click to find global items of this type']/span[1]")
		private WebElement globalSpan;
		
		@FindBy(xpath="//td[contains(text(),'veg pizza')]//preceding-sibling::td//input")
		private WebElement VegPizza;
		
		@FindBy(xpath="(//td[contains(text(),'Apparel - Only Size')]//preceding-sibling::td)//input")
		private WebElement ApparelOnlySize;

		
		@FindBy(xpath="//span[@title='Click to find global items of this type']/span[1]")
		private WebElement ClkGlbalItems;
		
		@FindBy(xpath="(//td[contains(text(),'100% Cotton/Rayon Jersey')]//preceding-sibling::td)//input")
		private WebElement CottonJersey;
		
		@FindBy(xpath="(//td[contains(@class,'CalendarCurrentDate')])[1]")
		private WebElement CalendarCurrentDate;
		
		@FindBy(xpath="//span[@data-csi-tab-name='Style']")
		private WebElement CsitabStyle;
		
		@FindBy(xpath="//span[@data-csi-tab-name='Material']")
		private WebElement CsitabMaterial;
		
		



		public WebElement getDeleteBttn() {
			return DeleteBttn;
		}



		public WebElement getGlobalSpan() {
			return globalSpan;
		}


		public WebElement getVegPizza() {
			return VegPizza;
		}


		public WebElement getApparelOnlySize() {
			return ApparelOnlySize;
		}


		public WebElement getClkGlbalItems() {
			return ClkGlbalItems;
		}


		public WebElement getCottonJersey() {
			return CottonJersey;
		}


		public WebElement getCalendarCurrentDate() {
			return CalendarCurrentDate;
		}


		public WebElement getCsitabStyle() {
			return CsitabStyle;
		}


		public WebElement getCsitabMaterial() {
			return CsitabMaterial;
		}
		
		// ----QualityPageSteps -->Nagarajan
		
		@FindBy(xpath="//div[contains(text(),'Run Template')]//following::td[@data-csi-heading='Node Name::0']/a")
		private WebElement Qualitypge;

		public WebElement getQualitypge() {
			return Qualitypge;
		}
		
		
		
		// ----SizeChartPage -->Nagarajan
		
		
		@FindBy(xpath="//span[@data-csi-automation='plugin-SizeChartAdmin-Increments-CustomViewActions']")
		private WebElement PluginAdmin;
		
		@FindBy(xpath="//tr[@data-csi-automation='plugin-SizeChartAdmin-Increments-CustomViewSaveAs']")
		private WebElement trPluginAdmin;
		
		public WebElement getPluginAdmin() {
			return PluginAdmin;
		}


		public WebElement getTrPluginAdmin() {
			return trPluginAdmin;
		}
		
		
		// ----SizeItemsSteps -->Nagarajan //
		

		

		@FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
		private WebElement Delete22;
		
		@FindBy(xpath="(//span[text()='Characteristic'])[2]")
		private WebElement chrtxT;
		
		
		public WebElement getDelete22() {
			return Delete22;
		}


		public WebElement getChrtxT() {
			return chrtxT;
		}
		
		
		
		// ----SizeLabelPages -->Nagarajan
		
		@FindBy(xpath="//span[@data-csi-act='Save']")
		private WebElement SaveActData;

		public WebElement getSaveActData() {
			return SaveActData;
		}
		
		
		// ----SizesTK -->Nagarajan
		
		
		@FindBy(xpath="//td[text()='DimensionType']//preceding-sibling::td/div/input")
		private WebElement DimType;
		
		@FindBy(xpath="//div[@data-csi-automation='field-Colorway-Form-CreateColorSpecification']/input")
		private WebElement Fieldclrway;
		
		@FindBy(xpath="(//div[@data-csi-automation='field-Colorway-Form-Node Name']//div[2]/div/input)[1]")
		private WebElement Fieldclrway1;
		
		@FindBy(xpath="(//div[@data-csi-automation='field-Colorway-Form-Node Name']//div[2]/div/input)[2]")
		private WebElement Fieldclrway2;
		
		@FindBy(xpath="//span[@data-csi-automation='plugin-Style-ProductColors-refresh']")
		private WebElement PluginRefresh;
		
		@FindBy(xpath="//div[@data-csi-automation='field-Colorway-Form-ColorSpecification']//div[3]/input[1]")
		private WebElement divClrway1;
		
		@FindBy(xpath="//th[text()='Color Specification']")
		private WebElement clrSpecfi;
		
		@FindBy(xpath="//div[text()='The Color Specification must be unique']")
		private WebElement DivUniQue;
		
		@FindBy(xpath="//span[@data-csi-automation='plugin-Category1-Category2s-refresh']//span[@title='Refresh View']")
		private WebElement RefreshView;
		
		@FindBy(xpath="//td[@data-csi-heading='Node Name::0']/a")
		private WebElement tdNodName;
		
		public WebElement getDimType() {
			return DimType;
		}


		public WebElement getFieldclrway() {
			return Fieldclrway;
		}


		public WebElement getFieldclrway1() {
			return Fieldclrway1;
		}


		public WebElement getFieldclrway2() {
			return Fieldclrway2;
		}


		public WebElement getPluginRefresh() {
			return PluginRefresh;
		}

		public WebElement getDivClrway1() {
			return divClrway1;
		}

		public WebElement getClrSpecfi() {
			return clrSpecfi;
		}

		public WebElement getDivUniQue() {
			return DivUniQue;
		}

		public WebElement getRefreshView() {
			return RefreshView;
		}

		public WebElement getTdNodName() {
			return tdNodName;
		}
		
		
		// ----SourcingPageSteps -->Nagarajan
		
		@FindBy(xpath="//div[@role='option' and @item='1']")
		private WebElement roleItm1;
		
		@FindBy(xpath="//th[text()='Secondary Sales Regions']")
		private WebElement SecSaleRegion;
		
		@FindBy(xpath="(//div[@role='option' and @item='1'])[2]")
		private WebElement roleItm2;

		
		@FindBy(xpath="(//td[@data-csi-heading='PcsPerHr::0'])[1]")
		private WebElement pcsperHr;
		
		@FindBy(xpath="(//td[@data-csi-heading='PcsPerHr::0'])[2]")
		private WebElement pcsperHr2;
		
		@FindBy(xpath="(//td[@data-csi-heading='PcsPerHr::0'])[3]")
		private WebElement pcsperHr3;
		
		@FindBy(xpath="(//td[@data-csi-heading='PcsPerHr::0'])[4]")
		private WebElement pcsperHr4;
		
		@FindBy(xpath="//div[@role='option' and @item='1']")
		private WebElement items1;
		
		@FindBy(xpath="(//td[contains(@data-csi-act,'Response')])[1]")
		private WebElement response1;
		
		@FindBy(xpath="(//td[contains(@data-csi-act,'Response')])[2]")
		private WebElement response2;
		
		@FindBy(xpath="(//td[contains(@data-csi-act,'Response')])[3]")
		private WebElement response3;
		
		
		


		public WebElement getSecSaleRegion() {
			return SecSaleRegion;
		}


		public WebElement getRoleItm2() {
			return roleItm2;
		}


		public WebElement getPcsperHr() {
			return pcsperHr;
		}


		public WebElement getPcsperHr2() {
			return pcsperHr2;
		}


		public WebElement getPcsperHr3() {
			return pcsperHr3;
		}


		public WebElement getPcsperHr4() {
			return pcsperHr4;
		}


		public WebElement getItems1() {
			return items1;
		}


		public WebElement getResponse1() {
			return response1;
		}


		public WebElement getResponse2() {
			return response2;
		}


		public WebElement getResponse3() {
			return response3;
		}
		
		public WebElement getRoleItm1() {
			return roleItm1;
		}
		
		
		// ----SpecificationHierarchySteps -->Nagarajan
		
			@FindBy(xpath="//span[text()='Classifiers']")
			private WebElement classify;
			
			public WebElement getClassify() {
				return classify;
			}
			
			
			
			
			
			// ----StyleandThemePageSteps -->Nagarajan
			
			


			@FindBy(xpath="//div[@role='option' and @item='1']")
			private WebElement AndRole;
			
			@FindBy(xpath="//th[text()='Shape']")
			private WebElement shapee;

			
			@FindBy(xpath="//div[@role='option' and @item='1']/div")
			private WebElement divITem;
			
			
			@FindBy(xpath="//th[text()='Subtype']")
			private WebElement sbtype;
			
			@FindBy(xpath="(//td[text()='New from Material'])[2]")
			private WebElement NFmaterial;
			
			@FindBy(xpath="(//td[text()='New from Material'])[1]")
			private WebElement NFmaterial1;
			
			
			public WebElement getAndRole() {
				return AndRole;
			}


			public WebElement getShapee() {
				return shapee;
			}


			public WebElement getDivITem() {
				return divITem;
			}


			public WebElement getSbtype() {
				return sbtype;
			}


			public WebElement getNFmaterial() {
				return NFmaterial;
			}


			public WebElement getNFmaterial1() {
				return NFmaterial1;
			}
		
		
			//Bom creation 
			@FindBy(xpath="(//a[contains(text(),'fabric')]/parent::td//following-sibling::td[contains(@data-csi-act,'PlacementProductType::0')])[1]")
			private WebElement placement_product_type;

			public WebElement getPlacement_product_type() {
				return placement_product_type;
			}
			@FindBy(xpath="(//a[contains(text(),'All')]/parent::td//following-sibling::td[contains(@data-csi-act,'PlacementProductType::0')])[1]")
			private WebElement placement_product_type1;

			public WebElement getPlacement_product_type1() {
				return placement_product_type1;
			}
			@FindBy(xpath="(//a[contains(text(),'fabric')]/parent::td//following-sibling::td[contains(@data-csi-act,'PlacementProductTypes')])[1]")
			private WebElement placement_product_types;

			public WebElement getPlacement_product_types() {
				return placement_product_types;
			}
			@FindBy(xpath="(//a[contains(text(),'Apparel sec')]/parent::td//following-sibling::td[contains(@data-csi-act,'PlacementProductTypes')])[1]")
			private WebElement Apparelsecplacement_product_types;

			public WebElement getApparelsecplacement_product_types() {
				return Apparelsecplacement_product_types;
			}

			@FindBy(xpath="//td/div/span[text()='close']")
			private WebElement BOM_close;

			public WebElement getBOM_close() {
				return BOM_close;
			}
			@FindBy(xpath="(//tr[contains(@data-csi-automation,'plugin-ProductBOMRevision-PartMaterials-CustomViewManage')]//td[text()='Manage Views'])[1]")
			private WebElement BOM_Manageviews;

			public WebElement getBOM_Manageviews() {
				return BOM_Manageviews;
			}

			@FindBy(xpath="//td[contains(@data-csi-act,'Actual')]/a")
			private WebElement Actual;

			public WebElement getActual() {
				return Actual;
			}

			@FindBy(xpath="((//a[contains(text(),'Cotton/Rayon')]/parent::div/parent::td)//following-sibling::td[contains(@data-csi-heading,'CommonColor::0')])")
			private WebElement commoncolor;

			public WebElement getCommoncolor() {
				return commoncolor;
			}
			@FindBy(xpath="//a[contains(text(),'EGRET')]/parent::span/ancestor::tr/td[contains(@data-csi-heading,'CommonColor')]")
			private WebElement EGRETcolor;

			public WebElement getEGRETcolor() {
				return EGRETcolor;
			}
			@FindBy(xpath="//div[@role='option' and @item='1']")
			private WebElement option;

			public WebElement getOption() {
				return option;
			}
			@FindBy(xpath="//th[text()='From Color']")
			private WebElement fromcolor;

			public WebElement getFromcolor() {
				return fromcolor;
			}
			@FindBy(xpath="(//div[@data-csi-act='ValidateBOM:Child:SetupSettings:0']/input[@tabindex='0'])[1]")
			private WebElement Bomvalidate;

			public WebElement getBomvalidate() {
				return Bomvalidate;
			}

			@FindBy(xpath="(//a[text()='Apparel BOM Validation'])[2]")
			private WebElement Bomvalidate2;

			public WebElement getBomvalidate2() {
				return Bomvalidate2;
			}
			@FindBy(xpath="//span[text()='Shoulder']//parent::label//parent::div/div/input")
			private WebElement shoulder;

			public WebElement getShoulder() {
				return shoulder;
			}

			@FindBy(xpath="//th[text()='Placements']")
			private WebElement placements;

			public WebElement getPlacements() {
				return placements;
			}
			@FindBy(xpath="//label[contains(text(),'ANTIQUE')]//parent::div/div/input")
			private WebElement Antique;

			public WebElement getAntique() {
				return Antique;
			}
			@FindBy(xpath="(//a[text()='Apparel BOM Validation copy'])[2]")
			private WebElement BOMvalidationcopy;

			public WebElement getBOMvalidationcopy() {
				return BOMvalidationcopy;
			}
			//Business planning steps
			@FindBy(xpath="//div[contains(@class,'Slider')]//span[text()='+']/parent::div")
			private WebElement Bpslider;

			public WebElement getBpslider() {
				return Bpslider;
			}
			@FindBy(xpath="//td[contains(text(),'Automation')]//parent::tr/td/div/input")
			private WebElement BPAutomation;

			public WebElement getBPAutomation() {
				return BPAutomation;
			}
			@FindBy(xpath="(//div[contains(@data-csi-automation,'filter-Reflection-BusinessObjects')]//div[contains(@class,'ArrowButton')])[1]")
			private WebElement Businessobjectfilter;

			public WebElement getBusinessobjectfilter() {
				return Businessobjectfilter;
			}

			//calendar setup
			
			@FindBy(xpath="//td[contains(@class,'iconEditable firstColumn')]")
			private WebElement editIcon;
			
			public WebElement getEditIcon() {
				return editIcon;
			}

			@FindBy(xpath="//span[@data-csi-automation='plugin-ApparelViews-AllStyles-fullScreen']//span[@title='Enter Full Screen']")
			private WebElement fullScreen;

			public WebElement getFullScreen() {
				return fullScreen;
			}
			
			@FindBy(xpath="//span[text()='Activities']")
			private WebElement Activities;

			public WebElement getActivities() {
				return Activities;
			}
			@FindBy(xpath="//div[@data-csi-automation='field-MaterialBOM-Form-Subtype']/div[3]/input[1]")
			private WebElement MaterialBomfield;

			public WebElement getMaterialBomfield() {
				return MaterialBomfield;
			}
			@FindBy(xpath="//label[contains(text(),'MarketingSegmentName')]")
			private WebElement MArketingsegmentname;

			public WebElement getMArketingsegmentname() {
				return MArketingsegmentname;
			}
			
			@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='PO Group']")
			private WebElement PoGroup;
			
			
			public WebElement getPoGroup() {
				return PoGroup;
			}
			
			@FindBy(xpath="//span[@data-csi-tab-name='PO Colors']")
			private WebElement POColors;

			public WebElement getPOColors() {
				return POColors;
			}

			@FindBy(xpath="//td[@class='dijitReset dijitMenuItemLabel' and text()='Collection']")
			private WebElement textcollet;
			
			
			public WebElement getTextcollet() {
				return textcollet;
			}

			//ColorRole
			@FindBy(xpath="//label[contains(text(),'MaterialFamily')]")
			private WebElement Materialfamily;

			public WebElement getMaterialfamily() {
				return Materialfamily;
			}
			//color specification
			@FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
			private WebElement colorspecDelete;

			public WebElement getColorspecDelete() {
				return colorspecDelete;
			}
			@FindBy(xpath="(//span[@data-csi-act='ReplaceColorSpecifications'])[1]")
			private WebElement Replacecolorspec;

			public WebElement getReplacecolorspec() {
				return Replacecolorspec;
			}
			
			
			
			
			//configuration page
			@FindBy(xpath="//span[@title='Exit Full Screen']")
			private WebElement ExitFullscreen;

			public WebElement getExitFullscreen() {
				return ExitFullscreen;
			}
			@FindBy(xpath="//td[@data-csi-act='CompatibleTypes:Child:Config:0']")
			private WebElement compatibletypes;

			public WebElement getCompatibletypes() {
				return compatibletypes;
			}
			@FindBy(xpath="//div[@role='option' and @item='1']/div")
			private WebElement item1;

			public WebElement getItem1() {
				return item1;
			}
			@FindBy(xpath="//div[@role='option' and @item='2']/div")
			private WebElement item2;

			public WebElement getItem2() {
				return item2;
			}
			@FindBy(xpath="(//div[@data-csi-act='ValidateBOM:Child:SetupSettings:0']/input[@tabindex='0'])[1]")
			private WebElement validate;

			public WebElement getValidate() {
				return validate;
			} 
			@FindBy(xpath="((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[3]")
			private WebElement Finalinspection_subtype;

			public WebElement getFinalinspection_subtype() {
				return Finalinspection_subtype;
			}
			@FindBy(xpath="((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[4]")
			private WebElement Finalinspection_subtype1;

			public WebElement getFinalinspection_subtype1() {
				return Finalinspection_subtype1;
			}
			@FindBy(xpath="((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[5]")
			private WebElement Finalinspection_subtype2;

			public WebElement getFinalinspection_subtype2() {
				return Finalinspection_subtype2;
			}

			@FindBy(xpath="((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[6]")
			private WebElement Finalinspection_subtype3;

			public WebElement getFinalinspection_subtype3() {
				return Finalinspection_subtype3;
			}
			@FindBy(xpath="(//div[@data-csi-act='HasRenewalPeriod:Child:SetupSettings:0']/input[@tabindex='0'])[3]")
			private WebElement Hasrenewalperiod; //

			public WebElement getHasrenewalperiod() {
				return Hasrenewalperiod;
			}
			@FindBy(xpath="(//span[contains(@class,'RightIcon')]/parent::div)[3]")
			private WebElement righticon;

			public WebElement getRighticon() {
				return righticon;
			}
			@FindBy(xpath="((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[5]")
			private WebElement Thememastersubtype;

			public WebElement getThememastersubtype() {
				return Thememastersubtype;
			}
			@FindBy(xpath="((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[4]")
			private WebElement Thememastersubtype1;

			public WebElement getThememastersubtype1() {
				return Thememastersubtype1;
			}
			@FindBy(xpath="((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[3]")
			private WebElement Thememastersubtype2;

			public WebElement getThememastersubtype2() {
				return Thememastersubtype2;
			}
			@FindBy(xpath="//input[@name='AllowMaterialVariationPerColorway']")
			private WebElement Allowvariationpercolorway;

			public WebElement getAllowvariationpercolorway() {
				return Allowvariationpercolorway;
			}

			@FindBy(xpath="((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[4]")
			private WebElement Formmaterialusage;  //

			public WebElement getFormmaterialusage() {
				return Formmaterialusage;
			}
			@FindBy(xpath="((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[5]")
			private WebElement formmaterialusage1;

			public WebElement getFormmaterialusage1() {
				return formmaterialusage1;
			}
			
			@FindBy(xpath="//td[contains(@data-csi-act,'LocaleName')]")
			private WebElement cm;

			public WebElement getCm() {
				return cm;
			}
			
			@FindBy(xpath="//div[contains(@class,'Product')]//span[text()='+']/parent::div")
			private WebElement cm1;

			public WebElement getCm1() {
				return cm1;
			}
			
			@FindBy(xpath="(//a[contains(text(),'Apparel')]//parent::td//following::td[contains(@data-csi-act,'MainMaterialColor')])[1]")
			private WebElement cm2;

			public WebElement getCm2() {
				return cm2;
			}
			
			@FindBy(xpath="//div[contains(@class,'Product')]//span[text()='-']/parent::div")
			private WebElement cm3;

			public WebElement getCm3() {
				return cm3;
			}
			
			@FindBy(xpath="//div[contains(@class,'Sales')]//span[text()='+']/parent::div")
			private WebElement cm4;

			public WebElement getCm4() {
				return cm4;
			}
			
			@FindBy(xpath="(//div[contains(@class,'Sales')]//span[text()='+']/parent::div)[1]")
			private WebElement cm5;

			public WebElement getCm5() {
				return cm5;
			}
			
			
			
			
			
			//Documentpage step
			@FindBy(xpath="(//a[contains(text(),'.txt')]//parent::td//following-sibling::td/div/span[text()='close'])[2]")
			private WebElement txtbutton;

			public WebElement getTxtbutton() {
				return txtbutton;
			}
			@FindBy(xpath="(//td[contains(@class,'firstColumn') and @data-csi-heading='Node Name::0']/a[contains(text(),'Accessories')])[1]")
			private WebElement Accessories;

			public WebElement getAccessories() {
				return Accessories;
			}
			@FindBy(xpath="(//td[contains(@data-csi-heading,'Node Name')]/a[contains(text(),'Cotton/Rayon Jersey')])[1]")
			private WebElement cottonray;

			public WebElement getCottonray() {
				return cottonray;
				}
			
			@FindBy(xpath="(//div[contains(@class,'Documents')]//span[text()='+']/parent::div)[3]")
			private WebElement Documents_right;

			

			public WebElement getDocuments_right() {
				return Documents_right;
			}
			
			@FindBy(xpath="(//div[contains(@class,'Documents')]//span[text()='+']/parent::div)[2]")
			private WebElement Documents_right1;
			
			


			public WebElement getDocuments_right1() {
				return Documents_right1;
			}

			
			
			
			
			//food
			@FindBy(xpath="(//span[text()='Cancel'])")
			private WebElement Food_cancel;

			public WebElement getFood_cancel() {
				return Food_cancel;
			}
			
			@FindBy(xpath="(//span[text()='Save & New'])")
			private WebElement Save_and_New;
			
			

			
			public WebElement getSave_and_New() {
				return Save_and_New;
			}

			@FindBy(xpath="(//td[text()='Eggs']//following::td/div/span[@data-csi-act='Copy'])[1]")
			private WebElement Eggs_copy;

			public WebElement getEggs_copy() {
				return Eggs_copy;
			}
			@FindBy(xpath="(//td[text()='Eggs-Copy']//following::td/div/span[@data-csi-act='Edit'])[1]")
			private WebElement Eggs_Edit;

			public WebElement getEggs_Edit() {
				return Eggs_Edit;
			}
			@FindBy(xpath="(//td[text()='Eggs-Edit']//following::td/div/span[@data-csi-act='Delete'])[1]")
			private WebElement Eggs_Delete;

			public WebElement getEggs_Delete() {
				return Eggs_Delete;
			}
			@FindBy(xpath="(//span[text()='Delete'])")
			private WebElement Food_Delete;

			public WebElement getFood_Delete() {
				return Food_Delete;
			}
			@FindBy(xpath="(//span[text()='Save'])")
			private WebElement Food_save;

			public WebElement getFood_save() {
				return Food_save;
			}
			@FindBy(xpath="(//td[text()='health claims']//following::td/div/span[@data-csi-act='Copy'])[1]")
			private WebElement Health_copy;

			public WebElement getHealth_copy() {
				return Health_copy;
			}
			@FindBy(xpath="(//td[text()='health claims-Copy']//following::td/div/span[@data-csi-act='Edit'])[1]")
			private WebElement Health_edit;

			public WebElement getHealth_edit() {
				return Health_edit;
			}

			@FindBy(xpath="(//td[text()='health claims-Edit']//following::td/div/span[@data-csi-act='Delete'])[1]")
			private WebElement Health_delete;

			public WebElement getHealth_delete() {
				return Health_delete;
			}
			@FindBy(xpath="(//td[text()='Oils']//following::td/div/span[@data-csi-act='Copy'])[1]")
			private WebElement oils_copy;

			public WebElement getOils_copy() {
				return oils_copy;
			}
			@FindBy(xpath="(//td[text()='Oils-Copy']//following::td/div/span[@data-csi-act='Edit'])[1]")
			private WebElement oils_Edit;

			@FindBy(xpath="(//td[text()='Oils-Edit']//following::td/div/span[@data-csi-act='Delete'])[1]")
			private WebElement oils_Delete;

			public WebElement getOils_Edit() {
				return oils_Edit;
			}
			public WebElement getOils_Delete() {
				return oils_Delete;
			}
			@FindBy(xpath="(//td[text()='Proteins']//following::td/div/span[@data-csi-act='Copy'])[1]")
			private WebElement Proteins_copy;

			public WebElement getProteins_copy() {
				return Proteins_copy;
			}

			@FindBy(xpath="(//td[text()='Proteins-Copy']//following::td/div/span[@data-csi-act='Delete'])[1]")
			private WebElement Proteins_delete;

			public WebElement getProteins_delete() {
				return Proteins_delete;
			}
			@FindBy(xpath="(//table[contains(@data-csi-automation,'IngredientItems')]//td)[2]")
			private WebElement Ingredients_items;

			public WebElement getIngredients_items() {
				return Ingredients_items;
			}
			@FindBy(xpath="(//table[contains(@data-csi-automation,'placeholder-FoodLabelDataSheetRevision-IngredientItems-ActionsNew')]//div[text()='New Ingredient Item'])[1]")
			private WebElement Ingredients_itembtn;

			public WebElement getIngredients_itembtn() {
				return Ingredients_itembtn;
			}
			@FindBy(xpath="(//table[@data-csi-automation='plugin-FoodLabelDataSheetRevision-AllergenItems-ToolbarNewActions']//div[text()='New Allergen Item'])[2]")
			private WebElement Allergrn_itembtn;

			public WebElement getAllergrn_itembtn() {
				return Allergrn_itembtn;
			}
			@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-AllergenItems-ToolbarNewActions')]//td[2])[2]")
			private WebElement Allergrn_items2;



			public WebElement getAllergrn_items2() {
				return Allergrn_items2;
			}

			@FindBy(xpath="(//table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-AllergenItems-ToolbarNewActions')]//td[2])[1]")
			private WebElement Allergrn_items1;

			public WebElement getAllergrn_items1() {
				return Allergrn_items1;
			}
			@FindBy(xpath = "(//td[text()='Eggs']//preceding-sibling::td[@data-csi-act='Node Name::0'])[2]")
			private WebElement Eggs;

			public WebElement getEggs() {
				return Eggs;
			}
			@FindBy(xpath = "//div[@data-csi-automation='field-DataPackageTemplate-Form-UseCoverSheet']/input")
			private WebElement Datapackage_template;

			public WebElement getDatapackage_template() {
				return Datapackage_template;
			}

			@FindBy(xpath = "//td[contains(@class,'iconEditable') and @data-csi-heading='DocumentQueryFilter::0']")
			private WebElement Datapackage_template1;
			@FindBy(xpath = "//td[contains(@class,'iconEditable') and @data-csi-heading='CoverSheetView::0']")
			private WebElement Datapackage_template2;

			public WebElement getDatapackage_template1() {
				return Datapackage_template1;
			}
			public WebElement getDatapackage_template2() {
				return Datapackage_template2;
			}
			@FindBy(xpath = "(//span[text()='Data Package Templates'])[2]")
			private WebElement Datapackage_templates;

			public WebElement getDatapackage_templates() {
				return Datapackage_templates;
			}
			@FindBy(xpath = "//td[text()='Supplier Quotes']//preceding::div[1]/input")
			private WebElement supplier_Quotes;

			public WebElement getSupplier_Quotes() {
				return supplier_Quotes;
			}
			@FindBy(xpath = "//option[@value='DataSheets::0']")
			private WebElement Datasheets;

			public WebElement getDatasheets() {
				return Datasheets;
			}
			@FindBy(xpath = "//option[@value='___CT::0']")
			private WebElement skuvalue;

			@FindBy(xpath = "//option[@value='CompetitiveFoods::0']")
			private WebElement competitive_food;

			public WebElement getSkuvalue() {
				return skuvalue;
			}
			
			@FindBy(xpath = "//span[@class='csi-table-header-content' and text()='Created']")
			private WebElement skuvalue_1;
			
			

			
			public WebElement getSkuvalue_1() {
				return skuvalue_1;
			}

			@FindBy(xpath = "//div[@class='csiHeadingCellLabel' and text()='Competitive Foods']")
			private WebElement competitive_foods1;
			
			

			public WebElement getCompetitive_foods1() {
				return competitive_foods1;
			}

			public WebElement getCompetitive_food() {
				return competitive_food;
			}
			@FindBy(xpath = "//option[@value='___CR::0']")
			private WebElement cv_Datasheets;

			public WebElement getCv_Datasheets() {
				return cv_Datasheets;
			}
			@FindBy(xpath = "//span[@class='csi-table-header-content' and text()='Created By']")
			private WebElement Datasheets4;
			
			

			public WebElement getDatasheets4() {
				return Datasheets4;
			}

			@FindBy(xpath = "//option[@value='CurrentRevision::0']")
			private WebElement cr_Datasheets;

			public WebElement getCr_Datasheets() {
				return cr_Datasheets;
			}
			
			@FindBy(xpath = "//option[@value='CoverSheetView::0']")
			private WebElement cs_Datasheets;

			public WebElement getCs_Datasheets() {
				return cs_Datasheets;
			}

			@FindBy(xpath = "//div[@class='csiHeadingCellLabel' and text()='Cover Sheet View']")
			private WebElement Coversheet_view;
			
			
			
			

			public WebElement getCoversheet_view() {
				return Coversheet_view;
			}

			@FindBy(xpath = "//td[text()='SKU Gallery']//preceding::div[1]/input")
			private WebElement SKUgallery;

			public WebElement getSKUgallery() {
				return SKUgallery;
			}
			@FindBy(xpath = "//div[@class='csi-view-title csi-view-title-Food-ProductSKUGallery']")
			private WebElement ProductSKUgallery;

			public WebElement getProductSKUgallery() {
				return ProductSKUgallery;
			}
			@FindBy(xpath = "//option[@value='Documents:Child:DocumentsAndComments:0']")
			private WebElement Documents_and_commments;

			public WebElement getDocuments_and_commments() {
				return Documents_and_commments;
			}
			
			@FindBy(xpath = "//span[@class='csi-table-header-content' and text()='Current Revision']")
			private WebElement current_revision;
			
			

			public WebElement getCurrent_revision() {
				return current_revision;
			}

			@FindBy(xpath = "//span[@class='csi-table-header-content' and text()='Documents']")
			private WebElement Documents;

			public WebElement getDocuments() {
				return Documents;
			}

			@FindBy(xpath = "//option[@value='RequestNumber::0']")
			private WebElement optionsrequestnumber;

			public WebElement getOptionsrequestnumber() {
				return optionsrequestnumber;
			}
			
			@FindBy(xpath = "//option[@value='ModifiedAt::0']")
			private WebElement optionsvaluemodified;
			
			

			public WebElement getOptionsvaluemodified() {
				return optionsvaluemodified;
			}
			
			@FindBy(xpath = "//option[@value='DocumentType::0']")
			private WebElement option_Document_type;
			
			public WebElement getOption_Document_type() {
				return option_Document_type;
			}

			@FindBy(xpath = "//span[@class='csi-table-header-content' and text()='Document Type']")
			private WebElement Document_Type1;
			
			
			
			public WebElement getDocument_Type1() {
				return Document_Type1;
			}

			@FindBy(xpath = "(//a[contains(text(),'J-Artwork')])[2]")
			private WebElement J_Artwork;

			public WebElement getJ_Artwork() {
				return J_Artwork;
			}

			@FindBy(xpath = "(//div[@data-csi-act='Active::0']/input)[1]")
			private WebElement subrouting;

			public WebElement getSubrouting() {
				return subrouting;
			}

			@FindBy(xpath = "(//a[contains(text(),'new')]/parent::td//following-sibling::td//input)")
			private WebElement new_subrouting;

			public WebElement getNew_subrouting() {
				return new_subrouting;
			}

			@FindBy(xpath = "(//table[contains(@data-csi-automation,'actionRow-RoutingRevision')]/tbody/tr/td[2])[1]")
			private WebElement new_subrouting1;

			public WebElement getNew_subrouting1() {
				return new_subrouting1;
				
			}
			
			@FindBy(xpath = "(//div[text()='Add Capability']/ancestor::tbody/tr/td[2])[1]")
			private WebElement Add_Capability;
			
			

			public WebElement getAdd_Capability() {
				return Add_Capability;
			}

			@FindBy(xpath = "(//a[contains(text(),'Sub')]/parent::span/parent::td//following-sibling::td/div/span[text()='content_copy'])[1]")
			private WebElement Content_Copy2;

			public WebElement getContent_Copy2() {
				return Content_Copy2;
			}
			
			@FindBy(xpath = "(//a[contains(text(),'Sub')]/parent::span/parent::td//following-sibling::td/div/span[text()='close'])[2]")
			private WebElement content_close;
			
			

			public WebElement getContent_close() {
				return content_close;
			}

			@FindBy(xpath = "(//span[text()='Food Label Data Sheet Templates'])[2]")
			private WebElement Foodlabeldatasheettemplate;

			public WebElement getFoodlabeldatasheettemplate() {
				return Foodlabeldatasheettemplate;
			}
			@FindBy(xpath = "//div[text()='New Ingredient Item']/ancestor::table[contains(@data-csi-automation,'plugin-FoodLabelDataSheetRevision-IngredientItems')]/tbody/tr/td//div[text()='add']")
			private WebElement Add_ingredient_items;

			public WebElement getAdd_ingredient_items() {
				return Add_ingredient_items;
			}
			@FindBy(xpath = "(//td[@data-csi-act='Node Name::0']/a[contains(text(),'veg pizza')])")
			private WebElement Veg_pizza;

			public WebElement getVeg_pizza() {
				return Veg_pizza;
			}
			
			
			@FindBy(xpath = "(//a[text()='veg pizza'])[2]")
			private WebElement Veg_pizza2;
			
			

			public WebElement getVeg_pizza2() {
				return Veg_pizza2;
			}
			
			@FindBy(xpath = "(//a[text()='veg pizza'])[1]")
			private WebElement Veg_pizza1;
			
			public WebElement getVeg_pizza1() {
				return Veg_pizza1;
			}
			
			

			@FindBy(xpath = "//div[@class='dijitTooltipContainer dijitTooltipContents']/div/a[@data-csi-act='GenerateGTIN']")
			private WebElement GTin;

			public WebElement getGTin() {
				return GTin;
			}
			@FindBy(xpath = "//div[@class='dijitTooltipContainer dijitTooltipContents']/div/a[@data-csi-act='AutoGenerateGTIN']")
			private WebElement Auogenerate_GTin;

			public WebElement getAuogenerate_GTin() {
				return Auogenerate_GTin;
			}

			@FindBy(xpath = "(//td[@data-csi-act='Node Name::0']/a[contains(text(),'Food BOM')])[1]")
			private WebElement Food_BOm;

			public WebElement getFood_BOm() {
				return Food_BOm;
			}

			@FindBy(xpath = "(//table[contains(@data-csi-automation,'plugin-ApparelBOMRevision-FoodFPItems-ToolbarNewActions')]//td[2])")
			private WebElement New_Of_food;

			public WebElement getNew_Of_food() {
				return New_Of_food;
			}

			@FindBy(xpath = "(//table[contains(@data-csi-automation,'FoodFPItems')]/tbody/tr/td/div/div)[1]")
			private WebElement New_Of_food1;

			public WebElement getNew_Of_food1() {
				return New_Of_food1;
			}
			@FindBy(xpath = "(//table[contains(@data-csi-automation,'plugin-ApparelBOMRevision-FoodFPItems-ToolbarNewActions')]//td[2])")
			private WebElement Foodbom_chkkbox;

			public WebElement getFoodbom_chkkbox() {
				return Foodbom_chkkbox;
			}

			@FindBy(xpath = "//label[text()='Fig (Agent)']")
			private WebElement Fig_agent;

			public WebElement getFig_agent() {
				return Fig_agent;
			}

			@FindBy(xpath = "//label[text()='Grape (Agent)']")
			private WebElement Grape_agent;

			public WebElement getGrape_agent() {
				return Grape_agent;
			}
			
			@FindBy(xpath = "//td[@class='dijitReset dijitMenuItemLabel' and text()='Raw Material']")
			private WebElement raw_material;
			
			

			public WebElement getRaw_material() {
				return raw_material;
			}

			@FindBy(xpath = "//a[text()='Doc2']//following::td/div/span[@data-csi-act='Delete']")
			private WebElement Doc2_Delete;
			
			
			
			public WebElement getDoc2_Delete() {
				return Doc2_Delete;
			}

			@FindBy(xpath = "//a[text()='Doc1']//following::span[text()='more_horiz']")
			private WebElement Doc1;
			
			
			
			public WebElement getDoc1() {
				return Doc1;
			}

			@FindBy(xpath = "//a[text()='Doc1']")
			private WebElement Doc_1;
			
			public WebElement getDoc_1() {
				return Doc_1;
			
			}
			
			
			@FindBy(xpath = "//td[@data-csi-heading='Node Name::0' and text()='Doc1']")
			private WebElement Document1;
			
			
			
			public WebElement getDocument1() {
				return Document1;
			}

			@FindBy(xpath = "//*[contains(text(),'Online Supplier Global Role')]//parent::div/div/input")
			private WebElement Global_role;

			public WebElement getGlobal_role() {
				return Global_role;
			}
			@FindBy(xpath = "//*[contains(text(),'f1')]//parent::div/div/input")
			private WebElement f1;

			public WebElement getF1() {
				return f1;
			}
			@FindBy(xpath = "//*[contains(text(),'g1')]//parent::div/div/input")
			private WebElement g1;

			public WebElement getG1() {
				return g1;
			}
			@FindBy(xpath = "//*[contains(text(),'i1')]//parent::div/div/input")
			private WebElement i1;

			@FindBy(xpath = "//*[contains(text(),'All')]//parent::div/div/input")
			private WebElement All;

			public WebElement getI1() {
				return i1;
			}
			public WebElement getAll() {
				return All;
			}
			@FindBy(xpath = "//*[contains(text(),'h1')]//parent::div/div/input")
			private WebElement h1;
			
			

			public WebElement getH1() {
				return h1;
			}

			@FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-body1 MuiTypography-colorTextPrimary' and text()='HTS Codes']")
			private WebElement HTs_codes;

			public WebElement getHTs_codes() {
				return HTs_codes;
			}

			@FindBy(xpath = "//label[text()='Huckleberry']//preceding-sibling::div//input")
			private WebElement Huckleberry;
			@FindBy(xpath = "//label[text()='Iceplant']//preceding-sibling::div//input")
			private WebElement Ice_plant;
			@FindBy(xpath = "//th[text()='Type']")
			private WebElement text1;
			@FindBy(xpath = "//label[text()='SupQteTmp1']//preceding-sibling::div//input")
			private WebElement supQteTmp1;
			@FindBy(xpath = "//label[text()='SupQteTmp2']//preceding-sibling::div//input")
			private WebElement supQteTmp2;

			@FindBy(xpath = "//td[@data-csi-heading='Node Name::0' and text()='Hybrid Agent Materials Role']//following-sibling::td[contains(@class,'actionsColumn')]/div/span[@data-csi-act='AggregateCrewRoleUsers']")
			private WebElement Aggregate_Crew_Roles;

			
			public WebElement getAggregate_Crew_Roles() {
				return Aggregate_Crew_Roles;
			}

			public WebElement getHuckleberry() {
				return Huckleberry;
			}
			public WebElement getIce_plant() {
				return Ice_plant;
			}
			public WebElement gettext1() {
				return text1;
			}
			public WebElement getSupQteTmp1() {
				return supQteTmp1;
			}
			public WebElement getSupQteTmp2() {
				return supQteTmp2;
			}

			@FindBy(xpath = "(//span[contains(@data-csi-automation,'SupplierUserStyleSupplierRequests')]//span[text()='refresh'])[1]")
			private WebElement supplieruserstyle_request;

			public WebElement getText1() {
				return text1;
			}
			public WebElement getSupplieruserstyle_request() {
				return supplieruserstyle_request;
			}
			@FindBy(xpath = "(//span[contains(@data-csi-automation,'SupplierUserStyleSupplierItems')]//span[text()='refresh'])[1]")
			private WebElement supplieruserstyle_items;

			public WebElement getSupplieruserstyle_items() {
				return supplieruserstyle_items;
			}

			@FindBy(xpath = "//td[@data-csi-act='Node Name::0']//a[text()='AUT_HSSRS_001-Huckleberry']")
			private WebElement Huckleberry1;
			
			@FindBy(xpath = "//td[@data-csi-act='Node Name::0']//a[text()='AUT_ISRS_003-Iceplant']")
			private WebElement Iceplant1;
			
			@FindBy(xpath = "//td[@data-csi-act='Node Name::0']//a[contains(text(),'AUT_HMSRS_001-Huckleberry')]")
			private WebElement Huckleberry2;

			public WebElement getHuckleberry2() {
				return Huckleberry2;
			}

			public WebElement getHuckleberry1() {
				return Huckleberry1;
			}
			
			public WebElement getIceplant1() {
				return Iceplant1;
			}
			
			@FindBy(xpath = "//td[@data-csi-act='Node Name::0']//a[contains(text(),'AUT_IMSRS_003-Iceplant')]")
			private WebElement Iceplant2;
			
			public WebElement getIceplant2() {
				return Iceplant2;
			}
			
			@FindBy(xpath = "//span[text()='home']")
			private WebElement Home;
			@FindBy(xpath = "(//a[contains(text(),'AUT_SR_003')])[2]")
			private WebElement Aut_Sr_003;

			public WebElement getHome() {
				return Home;
			}
			public WebElement getAut_Sr_003() {
				return Aut_Sr_003;
			}
			
			@FindBy(xpath = "//a[@class='csi-card-anchor' and @title='AUT_SR_003']")
			private WebElement csicardanchor;
			
			

			public WebElement getCsicardanchor() {
				return csicardanchor;
			}

			//inspection
			@FindBy(xpath = "//span[contains(@class,'DataSetup') and text()='settings']")
			private WebElement Datasetup;

			public WebElement getDatasetup() {
				return Datasetup;
			}

			@FindBy(xpath = "//a[text()='Product Quality Setup']")
			private WebElement productqualitysetup;

			public WebElement getProductqualitysetup() {
				return productqualitysetup;
			}


			@FindBy(xpath = "(//span[contains(@data-csi-automation,'plugin-Style-ProductColors-CustomViewActions')]//span[text()='Views'])[1]")
			private WebElement customviewAction;
			@FindBy(xpath = "(//tr[contains(@data-csi-automation,'plugin-Style-ProductColors-CustomViewManage')]//td[text()='Manage Views'])[1]")
			private WebElement customviewmanage;

			public WebElement getCustomviewAction() {
				return customviewAction;
			}
			public WebElement getCustomviewmanage() {
				return customviewmanage;
			}

			@FindBy(xpath = "(//div[contains(@data-csi-automation,'field-ApparelBOM-Form-Subtype')]//div[3]/input)[1]")
			private WebElement Apparel_BOMsubtype;

			public WebElement getApparel_BOMsubtype() {
				return Apparel_BOMsubtype;
			}

			@FindBy(xpath = "(//span[text()='Material']//following::input[@type='checkbox' and @tabindex='0'])[2]")
			private WebElement Material;

			@FindBy(xpath = "(//span[text()='Material']//following::input[@type='checkbox' and @tabindex='0'])[3]")
			private WebElement Material1;

			public WebElement getMaterial() {
				return Material;
			}
			public WebElement getMaterial1() {
				return Material1;
			}

			@FindBy(xpath = "//span[text()='New Inspection Defect']//following::span[contains(@class,'Button') or text()='â—�']//following-sibling::span[text()='Save']")
			private WebElement Newinspectiondefect_save;

			public WebElement getNewinspectiondefect_save() {
				return Newinspectiondefect_save;
			}
			@FindBy(xpath = "//span[text()='New Batch Section Sample']//following::span[contains(@class,'Button') or text()='â—�']//following-sibling::span[text()='Save']")
			private WebElement Newbatchsectionsample_save;
			@FindBy(xpath = "//span[text()='Manage Custom Views']//following::span[contains(@class,'Button') or text()='â—�']//following-sibling::span[text()='Save']")
			private WebElement Managecustomview;

			public WebElement getNewbatchsectionsample_save() {
				return Newbatchsectionsample_save;
			}
			public WebElement getManagecustomview() {
				return Managecustomview;
			}
			
			@FindBy(xpath = "(//div[contains(@class,'Color')]//span[text()='+']/parent::div)[1]")
			private WebElement Right_slider;
			
			
			

			public WebElement getRight_slider() {
				return Right_slider;
			}

			@FindBy(xpath = "//span[text()='Select Inspection Sections']//following::span[contains(@class,'Button') or text()='â—�']//following-sibling::span[text()='Save']")
			private WebElement select_inspection_sections;

			public WebElement getSelect_inspection_sections() {
				return select_inspection_sections;
			}
			@FindBy(xpath = "//span[text()='Select Test Specifications']//following::span[contains(@class,'Button') or text()='â—�']//following-sibling::span[text()='Save']")
			private WebElement select_testspecification_save;

			public WebElement getSelect_testspecification_save() {
				return select_testspecification_save;
			}
			@FindBy(xpath = "//span[text()='New from Inspection Section Type']//following::span[contains(@class,'Button') or text()='â—�']//following-sibling::span[text()='Save']")
			private WebElement newfrominspectiontype_save;
			@FindBy(xpath = "//span[text()='New Inspection Error Type']//following::span[contains(@class,'Button') or text()='â—�']//following-sibling::span[text()='Save']")
			private WebElement newfrominspectionerrortype_save;

			public WebElement getNewfrominspectiontype_save() {
				return newfrominspectiontype_save;
			}
			public WebElement getNewfrominspectionerrortype_save() {
				return newfrominspectionerrortype_save;
			}
			@FindBy(xpath = "//table[contains(@data-csi-automation,'FinalInspectionSecurityGroup-SecurityGroupFinalInspections')]//div[contains(text(),'New Inspection')]")
			private WebElement newsecuritygroupinspection;

			public WebElement getNewsecuritygroupinspection() {
				return newsecuritygroupinspection;
			}

			@FindBy(xpath = "//span[text()='Move Inspections from']//following::span[contains(@class,'Button') or text()='â—�']//following-sibling::span[text()='Save']")
			private WebElement moveinspectionfrom;

			public WebElement getMoveinspectionfrom() {
				return moveinspectionfrom;
			}
			@FindBy(xpath = "(//div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input)[1]")
			private WebElement FinalInspectionRelevant1 ;
			@FindBy(xpath = "(//div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input)[2]")
			private WebElement FinalInspectionRelevant2 ;
			@FindBy(xpath = "(//div[contains(@data-csi-act,'FinalInspectionRelevant:')]/input)[3]")
			private WebElement FinalInspectionRelevant3 ;

			public WebElement getFinalInspectionRelevant1() {
				return FinalInspectionRelevant1;
			}
			public WebElement getFinalInspectionRelevant2() {
				return FinalInspectionRelevant2;
			}
			public WebElement getFinalInspectionRelevant3() {
				return FinalInspectionRelevant3;
			}
			@FindBy(xpath = "(//table/tbody[1]//tr[1]//td[@data-csi-act='Node Name::0'])")
			private WebElement placementshoulder ;
			@FindBy(xpath = "(//table/tbody[1]//tr[2]//td[@data-csi-act='Node Name::0'])")
			private WebElement placementneck ;

			public WebElement getPlacementshoulder() {
				return placementshoulder;
			}
			public WebElement getPlacementneck() {
				return placementneck;
			}


			@FindBy(xpath = "//*[text()='auto-inspection']")
			private WebElement autoinspection ;

			public WebElement getAutoinspection() {
				return autoinspection;
			}
			//Lookuppage

			@FindBy(xpath = "(//span[contains(text(),'Delete')])[2]")
			private WebElement Lookup_delete ;

			public WebElement getLookup_delete() {
				return Lookup_delete;
			}
//Homepage
			
			@FindBy(xpath = "//span[contains(@data-csi-automation,'PageUser')]")
			private WebElement Page_user ;

			public WebElement getPage_user() {
				return Page_user;
			}
			
			
			@FindBy(xpath = "//span[contains(text(),'Defaults')]")
			private WebElement Defaults ;

			public WebElement getDefaults() {
				return Defaults;
			}
			
		
			
}
