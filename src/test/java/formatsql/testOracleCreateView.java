
package formatsql;

/*
 * Date: 11-4-6
 */

import gudusoft.gsqlparser.EDbVendor;
import gudusoft.gsqlparser.TGSqlParser;
import gudusoft.gsqlparser.pp.para.GFmtOpt;
import gudusoft.gsqlparser.pp.para.GFmtOptFactory;
import gudusoft.gsqlparser.pp.stmtformatter.FormatterFactory;
import junit.framework.TestCase;

public class testOracleCreateView extends TestCase
{

	public static void test1( )
	{
		GFmtOpt option = GFmtOptFactory.newInstance( new Exception( ).getStackTrace( )[0].getClassName( )
				+ "."
				+ new Exception( ).getStackTrace( )[0].getMethodName( ) );

		TGSqlParser sqlparser = new TGSqlParser( EDbVendor.dbvoracle );
		sqlparser.sqltext = "CREATE OR REPLACE FORCE VIEW \"POTC_PO_LINES\" (\"A$CHART_OF_ACCOUNTS_NAME\", \"A$CONTRACT_NUMBER\", \"A$HAZARD_CLASS\", \"A$ITEM_DESCRIPTION\", \"A$JOB_NAME\", \"A$LEDGER_NAME\", \"A$LINE_CREATION_DATE\", \"A$LINE_TYPE\", \"A$OPERATING_UNIT_NAME\", \"A$PO_NUMBER\", \"A$TERMS\", \"A$UN_HAZARD_MATL_NUMBER\", \"A$VENDOR_NAME\", \"A$VENDOR_NUMBER\", \"A$VENDOR_PRODUCT_NUMBER\", \"A$ZZ__________________________\", \"ALLOW_PRICE_OVERRIDE_FLAG\", \"AMOUNT\", \"AUCTION_DISPLAY_NUMBER\", \"AUCTION_LINE_NUMBER\", \"AUTHORIZATION_STATUS\", \"BASE_CURRENCY_CODE\", \"BID_LINE_NUMBER\", \"BID_NUMBER\", \"CANCEL_DATE\", \"CANCEL_FLAG\", \"CANCEL_REASON\", \"CAPITAL_EXPENSE_FLAG\", \"CHART_OF_ACCOUNTS_NAME\", \"CLOSED_CODE\", \"CLOSED_DATE\", \"CLOSED_REASON\", \"CONSIGNED_CONSUMPTION_FLAG\", \"CONTRACT_NUMBER\", \"CONTRACTOR_ASSIGN_END_DATE\", \"CONTRACTOR_ASSIGN_START_DATE\", \"CONTRACTOR_FIRST_NAME\", \"CONTRACTOR_LAST_NAME\", \"CURRENCY\", \"HAZARD_CLASS\", \"INCOME_TAX_TYPE\", \"ITEM$INVENTORY_ITEM_ID\", \"ITEM$ORGANIZATION_ID\", \"ITEM$SV$ITEM\", \"ITEMCAT$CV$ITEM_CATEGORY_KFF\", \"ITEMCAT$CATEGORY_ID\", \"ITEM_DESCRIPTION\", \"ITEM_REVISION\", \"JOB_NAME\", \"LEDGER_NAME\", \"LINE_CREATION_DATE\", \"LINE_TYPE\", \"LIST_PRICE_PER_UNIT\", \"LIST_PRICE_PER_UNIT_BASE\", \"MANUAL_PRICE_CHANGE_FLAG\", \"MARKET_PRICE\", \"MARKET_PRICE_BASE\", \"MATCHING_BASIS\", \"NEGOTIATED_BY_PREPARER_FLAG\", \"NOTE_TO_VENDOR\", \"OPEN_FLAG\", \"OPERATING_UNIT_NAME\", \"OVER_TOLERANCE_ERROR_FLAG\", \"POLIN$ATTRIBUTE_CATEGORY\", \"POLIN$ATTRIBUTE_13\", \"POLIN$ORDER_SEQUENCE\", \"PO_LINE_NUMBER\", \"PO_NUMBER\", \"PRICE_TYPE\", \"PRICE_TYPE_LOOKUP_CODE\", \"PURCHASE_BASIS\", \"QTY_RECEIVED_TOLERANCE_PCT\", \"QUANTITY\", \"RATE\", \"RATE_DATE\", \"RATE_TYPE\", \"SET_OF_BOOKS_NAME\", \"SHIPMENT_LINE_NUMBER\", \"SHIPMENT_LINE_STATUS\", \"SHIPMENT_QUANTITY\", \"TAXABLE_FLAG\", \"TERMS\", \"TRANSACTION_REASON_CODE\", \"UN_HAZARD_MATL_NUMBER\", \"UNIT_OF_MEASURE\", \"UNIT_PRICE\", \"UNIT_PRICE_BASE\", \"UNORDERED_FLAG\", \"VEND$SUPPLIER_HOME_PAGE\", \"VENDOR_NAME\", \"VENDOR_NUMBER\", \"VENDOR_PRODUCT_NUMBER\", \"Z$$_________________________\", \"Z$POTC_PO_LINES\") AS   SELECT   XMAP.CHART_OF_ACCOUNTS_NAME A$Chart_Of_Accounts_Name,   Contract_Number.SEGMENT1 A$Contract_Number,   Hazard_Class.HAZARD_CLASS A$Hazard_Class,   POLIN.ITEM_DESCRIPTION A$Item_Description,   Job_Name.NAME A$Job_Name,   XMAP.LEDGER_NAME A$Ledger_Name,   POLIN.CREATION_DATE A$Line_Creation_Date,   Line_Type.LINE_TYPE A$Line_Type,   XMAP.OPERATING_UNIT_NAME A$Operating_Unit_Name,   POHDR.SEGMENT1 A$PO_Number,   Terms.NAME A$Terms,   UN_Hazard_Matl_Number.UN_NUMBER A$UN_Hazard_Matl_Number,   VEND.VENDOR_NAME A$Vendor_Name,   VEND.SEGMENT1 A$Vendor_Number,   POLIN.VENDOR_PRODUCT_NUM A$Vendor_Product_Number,   'A$ZZ__________________________Copyright Noetix Corporation 1992-2010' A$ZZ__________________________,   NVL(POLIN.ALLOW_PRICE_OVERRIDE_FLAG,'Y') Allow_Price_Override_Flag,   NVL(POLIN.AMOUNT,0) Amount,   POLIN.AUCTION_DISPLAY_NUMBER Auction_Display_Number,   POLIN.AUCTION_LINE_NUMBER Auction_Line_Number,   Authorization_Status.MEANING Authorization_Status,   GLSOB.CURRENCY_CODE Base_Currency_Code,   POLIN.BID_LINE_NUMBER Bid_Line_Number,   POLIN.BID_NUMBER Bid_Number,   POLIN.CANCEL_DATE Cancel_Date,   NVL(POLIN.CANCEL_FLAG,'N') Cancel_Flag,   POLIN.CANCEL_REASON Cancel_Reason,   NVL(POLIN.CAPITAL_EXPENSE_FLAG,'N') Capital_Expense_Flag,   XMAP.CHART_OF_ACCOUNTS_NAME Chart_Of_Accounts_Name,   NVL(POLIN.CLOSED_CODE,'OPEN') Closed_Code,   POLIN.CLOSED_DATE Closed_Date,   POLIN.CLOSED_REASON Closed_Reason,   NVL(POHDR.CONSIGNED_CONSUMPTION_FLAG,'N') Consigned_Consumption_Flag,   Contract_Number.SEGMENT1 Contract_Number,   POLIN.EXPIRATION_DATE Contractor_Assign_End_Date,   POLIN.START_DATE Contractor_Assign_Start_Date,   POLIN.CONTRACTOR_FIRST_NAME Contractor_First_Name,   POLIN.CONTRACTOR_LAST_NAME Contractor_Last_Name,   POHDR.CURRENCY_CODE Currency,   Hazard_Class.HAZARD_CLASS Hazard_Class,   POLIN.TYPE_1099 Income_Tax_Type,   MSTK1.INVENTORY_ITEM_ID Item$Inventory_Item_Id,   MSTK1.ORGANIZATION_ID Item$Organization_Id,   MSTK1.SV$Item Item$SV$Item,   ItemCat.CV$Item_Category_KFF ItemCat$CV$Item_Category_KFF,   ItemCat.CATEGORY_ID ItemCat$Category_Id,   POLIN.ITEM_DESCRIPTION Item_Description,   POLIN.ITEM_REVISION Item_Revision,   Job_Name.NAME Job_Name,   XMAP.LEDGER_NAME Ledger_Name,   POLIN.CREATION_DATE Line_Creation_Date,   Line_Type.LINE_TYPE Line_Type,   POLIN.LIST_PRICE_PER_UNIT List_Price_Per_Unit,   POLIN.LIST_PRICE_PER_UNIT * NVL(POHDR.RATE, DECODE(POHDR.CURRENCY_CODE,GLSOB.CURRENCY_CODE,1,NULL)) List_Price_Per_Unit_Base,   NVL(POLIN.MANUAL_PRICE_CHANGE_FLAG,'N') Manual_Price_Change_Flag,   POLIN.MARKET_PRICE Market_Price,   POLIN.MARKET_PRICE * NVL(POHDR.RATE, DECODE(POHDR.CURRENCY_CODE,GLSOB.CURRENCY_CODE,1,NULL)) Market_Price_Base,   Matching_Basis.MEANING Matching_Basis,   NVL(POLIN.NEGOTIATED_BY_PREPARER_FLAG,'N') Negotiated_By_Preparer_Flag,   POLIN.NOTE_TO_VENDOR Note_To_Vendor,   DECODE(NVL(POLIN.CLOSED_CODE,'OPEN')||NVL(POLIN.CANCEL_FLAG,'N'),'OPENN','Y','N') Open_Flag,   XMAP.OPERATING_UNIT_NAME Operating_Unit_Name,   NVL(POLIN.OVER_TOLERANCE_ERROR_FLAG,'N') Over_Tolerance_Error_Flag,   POLIN.ATTRIBUTE_CATEGORY POLIN$ATTRIBUTE_CATEGORY,   POLIN.ATTRIBUTE13 POLIN$Attribute_13,   decode(POLIN.ATTRIBUTE_CATEGORY,'2052',POLIN.ATTRIBUTE1,null) POLIN$Order_Sequence,   POLIN.LINE_NUM PO_Line_Number,   POHDR.SEGMENT1 PO_Number,   Price_Type.MEANING Price_Type,   POLIN.PRICE_TYPE_LOOKUP_CODE Price_Type_Lookup_Code,   Purchase_Basis.MEANING Purchase_Basis,   POLIN.QTY_RCV_TOLERANCE Qty_Received_Tolerance_Pct,   NVL(POLIN.QUANTITY,0) Quantity,   POHDR.RATE Rate,   POHDR.RATE_DATE Rate_Date,   POHDR.RATE_TYPE Rate_Type,   TO_CHAR(NULL) Set_Of_Books_Name,   TO_NUMBER(NULL) Shipment_Line_Number,   TO_CHAR(NULL) Shipment_Line_Status,   TO_NUMBER(NULL) Shipment_Quantity,   NVL(POLIN.TAXABLE_FLAG,'N') Taxable_Flag,   Terms.NAME Terms,   POLIN.TRANSACTION_REASON_CODE Transaction_Reason_Code,   UN_Hazard_Matl_Number.UN_NUMBER UN_Hazard_Matl_Number,   Unit_Of_Measure.DESCRIPTION Unit_Of_Measure,   POLIN.UNIT_PRICE Unit_Price,   POLIN.UNIT_PRICE * NVL(POHDR.RATE, DECODE(POHDR.CURRENCY_CODE,GLSOB.CURRENCY_CODE,1,NULL)) Unit_Price_Base,   NVL(POLIN.UNORDERED_FLAG,'N') Unordered_Flag,   VEND.ATTRIBUTE14 VEND$Supplier_Home_Page,   VEND.VENDOR_NAME Vendor_Name,   VEND.SEGMENT1 Vendor_Number,   POLIN.VENDOR_PRODUCT_NUM Vendor_Product_Number,   'Z$$_________________________' Z$$_________________________,   POLIN.rowid Z$POTC_PO_Lines  FROM       PO.PO_HEADERS_ALL Contract_Number,       dev_602_medium_tc.XXK_Mtl_Cat_S2 ItemCat,       HR.PER_JOBS Job_Name,       PO.PO_UN_NUMBERS_TL UN_Hazard_Matl_Number,       PO.PO_HAZARD_CLASSES_TL Hazard_Class,       PO.PO_LINE_TYPES_TL Line_Type,       INV.MTL_UNITS_OF_MEASURE_TL Unit_Of_Measure,       AP.AP_TERMS_TL Terms,       dev_602_medium_tc.N_PO_LOOKUPS_VL Matching_Basis,       dev_602_medium_tc.N_PO_LOOKUPS_VL Purchase_Basis,       dev_602_medium_tc.N_PO_LOOKUPS_VL Price_Type,       dev_602_medium_tc.N_PO_LOOKUPS_VL Authorization_Status,       dev_602_medium_tc.XXK_Sys_Item MSTK1,       INV.MTL_SYSTEM_ITEMS_B ITEM,       GL.GL_LEDGERS GLSOB,       AP.FINANCIALS_SYSTEM_PARAMS_ALL FIN,       AP.AP_SUPPLIERS VEND,       PO.PO_HEADERS_ALL POHDR,       dev_602_medium_tc.POTC_OU_ACL_Map_Base XMAP,       PO.PO_LINES_ALL POLIN WHERE 'Copyright Noetix Corporation 1992-2010' is not null   AND POLIN.PO_HEADER_ID = POHDR.PO_HEADER_ID   AND NVL(POLIN.ORG_ID,-9999) = XMAP.ORG_ID   AND POHDR.VENDOR_ID = VEND.VENDOR_ID   AND POHDR.TYPE_LOOKUP_CODE = 'STANDARD'   AND POLIN.ITEM_ID = ITEM.INVENTORY_ITEM_ID(+)   AND NVL(ITEM.ORGANIZATION_ID,FIN.INVENTORY_ORGANIZATION_ID) = FIN.INVENTORY_ORGANIZATION_ID   AND NVL(POHDR.ORG_ID,-9999) = NVL(FIN.ORG_ID,-9999)   AND FIN.SET_OF_BOOKS_ID = GLSOB.LEDGER_ID   AND POHDR.AUTHORIZATION_STATUS = Authorization_Status.LOOKUP_CODE(+)   AND Authorization_Status.LOOKUP_TYPE(+) = 'AUTHORIZATION STATUS'   AND Authorization_Status.LANGUAGE (+) = NOETIX_ENV_PKG.GET_LANGUAGE   AND Authorization_Status.SECURITY_GROUP_ID(+) = NOETIX_APPS_SECURITY_PKG.LOOKUP_SECURITY_GROUP       (Authorization_Status.LOOKUP_TYPE(+),Authorization_Status.VIEW_APPLICATION_ID(+))   AND POLIN.PRICE_TYPE_LOOKUP_CODE = Price_Type.LOOKUP_CODE(+)   AND Price_Type.LOOKUP_TYPE(+) = 'PRICE TYPE'   AND Price_Type.LANGUAGE (+) = NOETIX_ENV_PKG.GET_LANGUAGE   AND Price_Type.SECURITY_GROUP_ID(+) = NOETIX_APPS_SECURITY_PKG.LOOKUP_SECURITY_GROUP       (Price_Type.LOOKUP_TYPE(+),Price_Type.VIEW_APPLICATION_ID(+))   AND POLIN.PURCHASE_BASIS = Purchase_Basis.LOOKUP_CODE(+)   AND Purchase_Basis.LOOKUP_TYPE(+) = 'PURCHASE BASIS'   AND Purchase_Basis.LANGUAGE (+) = NOETIX_ENV_PKG.GET_LANGUAGE   AND Purchase_Basis.SECURITY_GROUP_ID(+) = NOETIX_APPS_SECURITY_PKG.LOOKUP_SECURITY_GROUP       (Purchase_Basis.LOOKUP_TYPE(+),Purchase_Basis.VIEW_APPLICATION_ID(+))   AND POLIN.MATCHING_BASIS = Matching_Basis.LOOKUP_CODE(+)   AND Matching_Basis.LOOKUP_TYPE(+) = 'MATCHING BASIS'   AND Matching_Basis.LANGUAGE (+) = NOETIX_ENV_PKG.GET_LANGUAGE   AND Matching_Basis.SECURITY_GROUP_ID(+) = NOETIX_APPS_SECURITY_PKG.LOOKUP_SECURITY_GROUP       (Matching_Basis.LOOKUP_TYPE(+),Matching_Basis.VIEW_APPLICATION_ID(+))   AND POHDR.TERMS_ID = Terms.TERM_ID(+)   AND Terms.LANGUAGE (+) = NOETIX_ENV_PKG.GET_LANGUAGE   AND POLIN.UNIT_MEAS_LOOKUP_CODE = Unit_Of_Measure.UNIT_OF_MEASURE(+)   AND Unit_Of_Measure.LANGUAGE (+) = NOETIX_ENV_PKG.GET_LANGUAGE   AND POLIN.LINE_TYPE_ID = Line_Type.LINE_TYPE_ID(+)   AND Line_Type.LANGUAGE (+) = NOETIX_ENV_PKG.GET_LANGUAGE   AND POLIN.HAZARD_CLASS_ID = Hazard_Class.HAZARD_CLASS_ID(+)   AND Hazard_Class.LANGUAGE (+) = NOETIX_ENV_PKG.GET_LANGUAGE   AND POLIN.UN_NUMBER_ID = UN_Hazard_Matl_Number.UN_NUMBER_ID(+)   AND UN_Hazard_Matl_Number.LANGUAGE (+) = NOETIX_ENV_PKG.GET_LANGUAGE   AND POLIN.JOB_ID = Job_Name.JOB_ID(+)   AND POLIN.CATEGORY_ID = ItemCat.CATEGORY_ID(+)   AND POLIN.CONTRACT_ID = Contract_Number.PO_HEADER_ID(+)   AND ITEM.INVENTORY_ITEM_ID = MSTK1.INVENTORY_ITEM_ID (+)   AND ITEM.ORGANIZATION_ID = MSTK1.ORGANIZATION_ID (+)";

		// System.out.println(sqlparser.sqltext);
		assertTrue( sqlparser.parse( ) == 0 );
		String result = FormatterFactory.pp( sqlparser, option );
		String leftExpr = result.trim( );
		//System.out.println(leftExpr);

		String rightExpr = "CREATE OR REPLACE FORCE VIEW \"POTC_PO_LINES\" (\"A$CHART_OF_ACCOUNTS_NAME\",\n"
				+ "                                              \"A$CONTRACT_NUMBER\",\n"
				+ "                                              \"A$HAZARD_CLASS\",\n"
				+ "                                              \"A$ITEM_DESCRIPTION\",\n"
				+ "                                              \"A$JOB_NAME\",\n"
				+ "                                              \"A$LEDGER_NAME\",\n"
				+ "                                              \"A$LINE_CREATION_DATE\",\n"
				+ "                                              \"A$LINE_TYPE\",\n"
				+ "                                              \"A$OPERATING_UNIT_NAME\",\n"
				+ "                                              \"A$PO_NUMBER\",\n"
				+ "                                              \"A$TERMS\",\n"
				+ "                                              \"A$UN_HAZARD_MATL_NUMBER\",\n"
				+ "                                              \"A$VENDOR_NAME\",\n"
				+ "                                              \"A$VENDOR_NUMBER\",\n"
				+ "                                              \"A$VENDOR_PRODUCT_NUMBER\",\n"
				+ "                                              \"A$ZZ__________________________\",\n"
				+ "                                              \"ALLOW_PRICE_OVERRIDE_FLAG\",\n"
				+ "                                              \"AMOUNT\",\n"
				+ "                                              \"AUCTION_DISPLAY_NUMBER\",\n"
				+ "                                              \"AUCTION_LINE_NUMBER\",\n"
				+ "                                              \"AUTHORIZATION_STATUS\",\n"
				+ "                                              \"BASE_CURRENCY_CODE\",\n"
				+ "                                              \"BID_LINE_NUMBER\",\n"
				+ "                                              \"BID_NUMBER\",\n"
				+ "                                              \"CANCEL_DATE\",\n"
				+ "                                              \"CANCEL_FLAG\",\n"
				+ "                                              \"CANCEL_REASON\",\n"
				+ "                                              \"CAPITAL_EXPENSE_FLAG\",\n"
				+ "                                              \"CHART_OF_ACCOUNTS_NAME\",\n"
				+ "                                              \"CLOSED_CODE\",\n"
				+ "                                              \"CLOSED_DATE\",\n"
				+ "                                              \"CLOSED_REASON\",\n"
				+ "                                              \"CONSIGNED_CONSUMPTION_FLAG\",\n"
				+ "                                              \"CONTRACT_NUMBER\",\n"
				+ "                                              \"CONTRACTOR_ASSIGN_END_DATE\",\n"
				+ "                                              \"CONTRACTOR_ASSIGN_START_DATE\",\n"
				+ "                                              \"CONTRACTOR_FIRST_NAME\",\n"
				+ "                                              \"CONTRACTOR_LAST_NAME\",\n"
				+ "                                              \"CURRENCY\",\n"
				+ "                                              \"HAZARD_CLASS\",\n"
				+ "                                              \"INCOME_TAX_TYPE\",\n"
				+ "                                              \"ITEM$INVENTORY_ITEM_ID\",\n"
				+ "                                              \"ITEM$ORGANIZATION_ID\",\n"
				+ "                                              \"ITEM$SV$ITEM\",\n"
				+ "                                              \"ITEMCAT$CV$ITEM_CATEGORY_KFF\",\n"
				+ "                                              \"ITEMCAT$CATEGORY_ID\",\n"
				+ "                                              \"ITEM_DESCRIPTION\",\n"
				+ "                                              \"ITEM_REVISION\",\n"
				+ "                                              \"JOB_NAME\",\n"
				+ "                                              \"LEDGER_NAME\",\n"
				+ "                                              \"LINE_CREATION_DATE\",\n"
				+ "                                              \"LINE_TYPE\",\n"
				+ "                                              \"LIST_PRICE_PER_UNIT\",\n"
				+ "                                              \"LIST_PRICE_PER_UNIT_BASE\",\n"
				+ "                                              \"MANUAL_PRICE_CHANGE_FLAG\",\n"
				+ "                                              \"MARKET_PRICE\",\n"
				+ "                                              \"MARKET_PRICE_BASE\",\n"
				+ "                                              \"MATCHING_BASIS\",\n"
				+ "                                              \"NEGOTIATED_BY_PREPARER_FLAG\",\n"
				+ "                                              \"NOTE_TO_VENDOR\",\n"
				+ "                                              \"OPEN_FLAG\",\n"
				+ "                                              \"OPERATING_UNIT_NAME\",\n"
				+ "                                              \"OVER_TOLERANCE_ERROR_FLAG\",\n"
				+ "                                              \"POLIN$ATTRIBUTE_CATEGORY\",\n"
				+ "                                              \"POLIN$ATTRIBUTE_13\",\n"
				+ "                                              \"POLIN$ORDER_SEQUENCE\",\n"
				+ "                                              \"PO_LINE_NUMBER\",\n"
				+ "                                              \"PO_NUMBER\",\n"
				+ "                                              \"PRICE_TYPE\",\n"
				+ "                                              \"PRICE_TYPE_LOOKUP_CODE\",\n"
				+ "                                              \"PURCHASE_BASIS\",\n"
				+ "                                              \"QTY_RECEIVED_TOLERANCE_PCT\",\n"
				+ "                                              \"QUANTITY\",\n"
				+ "                                              \"RATE\",\n"
				+ "                                              \"RATE_DATE\",\n"
				+ "                                              \"RATE_TYPE\",\n"
				+ "                                              \"SET_OF_BOOKS_NAME\",\n"
				+ "                                              \"SHIPMENT_LINE_NUMBER\",\n"
				+ "                                              \"SHIPMENT_LINE_STATUS\",\n"
				+ "                                              \"SHIPMENT_QUANTITY\",\n"
				+ "                                              \"TAXABLE_FLAG\",\n"
				+ "                                              \"TERMS\",\n"
				+ "                                              \"TRANSACTION_REASON_CODE\",\n"
				+ "                                              \"UN_HAZARD_MATL_NUMBER\",\n"
				+ "                                              \"UNIT_OF_MEASURE\",\n"
				+ "                                              \"UNIT_PRICE\",\n"
				+ "                                              \"UNIT_PRICE_BASE\",\n"
				+ "                                              \"UNORDERED_FLAG\",\n"
				+ "                                              \"VEND$SUPPLIER_HOME_PAGE\",\n"
				+ "                                              \"VENDOR_NAME\",\n"
				+ "                                              \"VENDOR_NUMBER\",\n"
				+ "                                              \"VENDOR_PRODUCT_NUMBER\",\n"
				+ "                                              \"Z$$_________________________\",\n"
				+ "                                              \"Z$POTC_PO_LINES\") \n"
				+ "AS \n"
				+ "  SELECT xmap.chart_of_accounts_name                                                                         a$chart_of_accounts_name,\n"
				+ "         contract_number.segment1                                                                            a$contract_number,\n"
				+ "         hazard_class.hazard_class                                                                           a$hazard_class,\n"
				+ "         polin.item_description                                                                              a$item_description,\n"
				+ "         job_name.NAME                                                                                       a$job_name,\n"
				+ "         xmap.ledger_name                                                                                    a$ledger_name,\n"
				+ "         polin.creation_date                                                                                 a$line_creation_date,\n"
				+ "         line_type.line_type                                                                                 a$line_type,\n"
				+ "         xmap.operating_unit_name                                                                            a$operating_unit_name,\n"
				+ "         pohdr.segment1                                                                                      a$po_number,\n"
				+ "         terms.NAME                                                                                          a$terms,\n"
				+ "         un_hazard_matl_number.un_number                                                                     a$un_hazard_matl_number,\n"
				+ "         vend.vendor_name                                                                                    a$vendor_name,\n"
				+ "         vend.segment1                                                                                       a$vendor_number,\n"
				+ "         polin.vendor_product_num                                                                            a$vendor_product_number,\n"
				+ "         'A$ZZ__________________________Copyright Noetix Corporation 1992-2010'                              a$zz__________________________,\n"
				+ "         Nvl(polin.allow_price_override_flag,'Y')                                                            allow_price_override_flag,\n"
				+ "         Nvl(polin.amount,0)                                                                                 amount,\n"
				+ "         polin.auction_display_number                                                                        auction_display_number,\n"
				+ "         polin.auction_line_number                                                                           auction_line_number,\n"
				+ "         authorization_status.meaning                                                                        authorization_status,\n"
				+ "         glsob.currency_code                                                                                 base_currency_code,\n"
				+ "         polin.bid_line_number                                                                               bid_line_number,\n"
				+ "         polin.bid_number                                                                                    bid_number,\n"
				+ "         polin.cancel_date                                                                                   cancel_date,\n"
				+ "         Nvl(polin.cancel_flag,'N')                                                                          cancel_flag,\n"
				+ "         polin.cancel_reason                                                                                 cancel_reason,\n"
				+ "         Nvl(polin.capital_expense_flag,'N')                                                                 capital_expense_flag,\n"
				+ "         xmap.chart_of_accounts_name                                                                         chart_of_accounts_name,\n"
				+ "         Nvl(polin.closed_code,'OPEN')                                                                       closed_code,\n"
				+ "         polin.closed_date                                                                                   closed_date,\n"
				+ "         polin.closed_reason                                                                                 closed_reason,\n"
				+ "         Nvl(pohdr.consigned_consumption_flag,'N')                                                           consigned_consumption_flag,\n"
				+ "         contract_number.segment1                                                                            contract_number,\n"
				+ "         polin.expiration_date                                                                               contractor_assign_end_date,\n"
				+ "         polin.start_date                                                                                    contractor_assign_start_date,\n"
				+ "         polin.contractor_first_name                                                                         contractor_first_name,\n"
				+ "         polin.contractor_last_name                                                                          contractor_last_name,\n"
				+ "         pohdr.currency_code                                                                                 currency,\n"
				+ "         hazard_class.hazard_class                                                                           hazard_class,\n"
				+ "         polin.type_1099                                                                                     income_tax_type,\n"
				+ "         mstk1.inventory_item_id                                                                             item$inventory_item_id,\n"
				+ "         mstk1.organization_id                                                                               item$organization_id,\n"
				+ "         mstk1.sv$item                                                                                       item$sv$item,\n"
				+ "         itemcat.cv$item_category_kff                                                                        itemcat$cv$item_category_kff,\n"
				+ "         itemcat.category_id                                                                                 itemcat$category_id,\n"
				+ "         polin.item_description                                                                              item_description,\n"
				+ "         polin.item_revision                                                                                 item_revision,\n"
				+ "         job_name.NAME                                                                                       job_name,\n"
				+ "         xmap.ledger_name                                                                                    ledger_name,\n"
				+ "         polin.creation_date                                                                                 line_creation_date,\n"
				+ "         line_type.line_type                                                                                 line_type,\n"
				+ "         polin.list_price_per_unit                                                                           list_price_per_unit,\n"
				+ "         polin.list_price_per_unit * Nvl(pohdr.rate, Decode(pohdr.currency_code,glsob.currency_code,1,NULL)) list_price_per_unit_base,\n"
				+ "         Nvl(polin.manual_price_change_flag,'N')                                                             manual_price_change_flag,\n"
				+ "         polin.market_price                                                                                  market_price,\n"
				+ "         polin.market_price * Nvl(pohdr.rate, Decode(pohdr.currency_code,glsob.currency_code,1,NULL))        market_price_base,\n"
				+ "         matching_basis.meaning                                                                              matching_basis,\n"
				+ "         Nvl(polin.negotiated_by_preparer_flag,'N')                                                          negotiated_by_preparer_flag,\n"
				+ "         polin.note_to_vendor                                                                                note_to_vendor,\n"
				+ "         Decode(Nvl(polin.closed_code,'OPEN')\n"
				+ "                  ||Nvl(polin.cancel_flag,'N'),'OPENN','Y','N')                                              open_flag,\n"
				+ "         xmap.operating_unit_name                                                                            operating_unit_name,\n"
				+ "         Nvl(polin.over_tolerance_error_flag,'N')                                                            over_tolerance_error_flag,\n"
				+ "         polin.attribute_category                                                                            polin$attribute_category,\n"
				+ "         polin.attribute13                                                                                   polin$attribute_13,\n"
				+ "         Decode(polin.attribute_category,'2052',polin.attribute1,NULL)                                       polin$order_sequence,\n"
				+ "         polin.line_num                                                                                      po_line_number,\n"
				+ "         pohdr.segment1                                                                                      po_number,\n"
				+ "         price_type.meaning                                                                                  price_type,\n"
				+ "         polin.price_type_lookup_code                                                                        price_type_lookup_code,\n"
				+ "         purchase_basis.meaning                                                                              purchase_basis,\n"
				+ "         polin.qty_rcv_tolerance                                                                             qty_received_tolerance_pct,\n"
				+ "         Nvl(polin.quantity,0)                                                                               quantity,\n"
				+ "         pohdr.rate                                                                                          rate,\n"
				+ "         pohdr.rate_date                                                                                     rate_date,\n"
				+ "         pohdr.rate_type                                                                                     rate_type,\n"
				+ "         To_char(NULL)                                                                                       set_of_books_name,\n"
				+ "         To_number(NULL)                                                                                     shipment_line_number,\n"
				+ "         To_char(NULL)                                                                                       shipment_line_status,\n"
				+ "         To_number(NULL)                                                                                     shipment_quantity,\n"
				+ "         Nvl(polin.taxable_flag,'N')                                                                         taxable_flag,\n"
				+ "         terms.NAME                                                                                          terms,\n"
				+ "         polin.transaction_reason_code                                                                       transaction_reason_code,\n"
				+ "         un_hazard_matl_number.un_number                                                                     un_hazard_matl_number,\n"
				+ "         unit_of_measure.description                                                                         unit_of_measure,\n"
				+ "         polin.unit_price                                                                                    unit_price,\n"
				+ "         polin.unit_price * Nvl(pohdr.rate, Decode(pohdr.currency_code,glsob.currency_code,1,NULL))          unit_price_base,\n"
				+ "         Nvl(polin.unordered_flag,'N')                                                                       unordered_flag,\n"
				+ "         vend.attribute14                                                                                    vend$supplier_home_page,\n"
				+ "         vend.vendor_name                                                                                    vendor_name,\n"
				+ "         vend.segment1                                                                                       vendor_number,\n"
				+ "         polin.vendor_product_num                                                                            vendor_product_number,\n"
				+ "         'Z$$_________________________'                                                                      z$$_________________________,\n"
				+ "         polin.ROWID                                                                                         z$potc_po_lines\n"
				+ "  FROM   po.po_headers_all contract_number,\n"
				+ "         dev_602_medium_tc.xxk_mtl_cat_s2 itemcat,\n"
				+ "         hr.per_jobs job_name,\n"
				+ "         po.po_un_numbers_tl un_hazard_matl_number,\n"
				+ "         po.po_hazard_classes_tl hazard_class,\n"
				+ "         po.po_line_types_tl line_type,\n"
				+ "         inv.mtl_units_of_measure_tl unit_of_measure,\n"
				+ "         ap.ap_terms_tl terms,\n"
				+ "         dev_602_medium_tc.n_po_lookups_vl matching_basis,\n"
				+ "         dev_602_medium_tc.n_po_lookups_vl purchase_basis,\n"
				+ "         dev_602_medium_tc.n_po_lookups_vl price_type,\n"
				+ "         dev_602_medium_tc.n_po_lookups_vl authorization_status,\n"
				+ "         dev_602_medium_tc.xxk_sys_item mstk1,\n"
				+ "         inv.mtl_system_items_b item,\n"
				+ "         gl.gl_ledgers glsob,\n"
				+ "         ap.financials_system_params_all fin,\n"
				+ "         ap.ap_suppliers vend,\n"
				+ "         po.po_headers_all pohdr,\n"
				+ "         dev_602_medium_tc.potc_ou_acl_map_base xmap,\n"
				+ "         po.po_lines_all polin\n"
				+ "  WHERE  'Copyright Noetix Corporation 1992-2010' IS NOT NULL\n"
				+ "         AND polin.po_header_id = pohdr.po_header_id\n"
				+ "         AND Nvl(polin.org_id,-9999) = xmap.org_id\n"
				+ "         AND pohdr.vendor_id = vend.vendor_id\n"
				+ "         AND pohdr.type_lookup_code = 'STANDARD'\n"
				+ "         AND polin.item_id = item.inventory_item_id(+)\n"
				+ "         AND Nvl(item.organization_id,fin.inventory_organization_id) = fin.inventory_organization_id\n"
				+ "         AND Nvl(pohdr.org_id,-9999) = Nvl(fin.org_id,-9999)\n"
				+ "         AND fin.set_of_books_id = glsob.ledger_id\n"
				+ "         AND pohdr.authorization_status = authorization_status.lookup_code(+)\n"
				+ "         AND authorization_status.lookup_type(+) = 'AUTHORIZATION STATUS'\n"
				+ "         AND authorization_status.LANGUAGE (+) = noetix_env_pkg.get_language\n"
				+ "         AND authorization_status.security_group_id(+) = noetix_apps_security_pkg.Lookup_security_group (authorization_status.lookup_type(+),authorization_status.view_application_id(+))\n"
				+ "         AND polin.price_type_lookup_code = price_type.lookup_code(+)\n"
				+ "         AND price_type.lookup_type(+) = 'PRICE TYPE'\n"
				+ "         AND price_type.LANGUAGE (+) = noetix_env_pkg.get_language\n"
				+ "         AND price_type.security_group_id(+) = noetix_apps_security_pkg.Lookup_security_group (price_type.lookup_type(+),price_type.view_application_id(+))\n"
				+ "         AND polin.purchase_basis = purchase_basis.lookup_code(+)\n"
				+ "         AND purchase_basis.lookup_type(+) = 'PURCHASE BASIS'\n"
				+ "         AND purchase_basis.LANGUAGE (+) = noetix_env_pkg.get_language\n"
				+ "         AND purchase_basis.security_group_id(+) = noetix_apps_security_pkg.Lookup_security_group (purchase_basis.lookup_type(+),purchase_basis.view_application_id(+))\n"
				+ "         AND polin.matching_basis = matching_basis.lookup_code(+)\n"
				+ "         AND matching_basis.lookup_type(+) = 'MATCHING BASIS'\n"
				+ "         AND matching_basis.LANGUAGE (+) = noetix_env_pkg.get_language\n"
				+ "         AND matching_basis.security_group_id(+) = noetix_apps_security_pkg.Lookup_security_group (matching_basis.lookup_type(+),matching_basis.view_application_id(+))\n"
				+ "         AND pohdr.terms_id = terms.term_id(+)\n"
				+ "         AND terms.LANGUAGE (+) = noetix_env_pkg.get_language\n"
				+ "         AND polin.unit_meas_lookup_code = unit_of_measure.unit_of_measure(+)\n"
				+ "         AND unit_of_measure.LANGUAGE (+) = noetix_env_pkg.get_language\n"
				+ "         AND polin.line_type_id = line_type.line_type_id(+)\n"
				+ "         AND line_type.LANGUAGE (+) = noetix_env_pkg.get_language\n"
				+ "         AND polin.hazard_class_id = hazard_class.hazard_class_id(+)\n"
				+ "         AND hazard_class.LANGUAGE (+) = noetix_env_pkg.get_language\n"
				+ "         AND polin.un_number_id = un_hazard_matl_number.un_number_id(+)\n"
				+ "         AND un_hazard_matl_number.LANGUAGE (+) = noetix_env_pkg.get_language\n"
				+ "         AND polin.job_id = job_name.job_id(+)\n"
				+ "         AND polin.category_id = itemcat.category_id(+)\n"
				+ "         AND polin.contract_id = contract_number.po_header_id(+)\n"
				+ "         AND item.inventory_item_id = mstk1.inventory_item_id (+)\n"
				+ "         AND item.organization_id = mstk1.organization_id (+)";

		//System.out.println(rightExpr);
		assertTrue( leftExpr.equalsIgnoreCase( rightExpr ) );
		// System.out.println(result);
	}

}
