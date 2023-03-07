package step9_04.customer_ex1;

public class CSController {
	
	private CSDAO csDao;
	private CSInsert csInsert;
	private CSModify csModify;
	private CSSelect csSelect;
	private CSSelectAll csSelectAll;
	private CSDelete csDelete;
	
	public CSController() {
		csDao = new CSDAO();
		csInsert = new CSInsert(csDao);
		csModify = new CSModify(csDao);
		csSelect = new CSSelect(csDao);
		csSelectAll = new CSSelectAll(csDao);
		csDelete = new CSDelete(csDao);
	}

	public CSDAO getCsDao() {
		return csDao;
	}

	public CSInsert getCsInsert() {
		return csInsert;
	}

	public CSModify getCsModify() {
		return csModify;
	}

	public CSSelect getCsSelect() {
		return csSelect;
	}

	public CSSelectAll getCsSelectAll() {
		return csSelectAll;
	}

	public CSDelete getCsDelete() {
		return csDelete;
	}
	
}