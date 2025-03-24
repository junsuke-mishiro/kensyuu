package ch11;

public class KyotoCleaningShop implements CleaningService {
	String ownerName;
	String adress;
	String phone;

	//シャツを洗う
	public Shirt washShirt(Shirt s) {
		//大型洗濯機15分
		return s;
	}

	//タオルを洗う
	public Tlowl washTowl(Towl t) {
		//大型洗濯機10分
		return t;
	}

	//コートを洗う
	public Coat washCoat(Coar c) {
		//ドライ20分
		return c;
	}
}
