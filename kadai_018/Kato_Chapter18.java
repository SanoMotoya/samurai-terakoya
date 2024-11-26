package kadai_018;

public abstract class Kato_Chapter18 {
	
	public String familyName = "加藤";
	
	public String givenName;
	
	public String address = "東京都中野区○×";
	
	abstract public void setGivenName();
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + "" + givenName);
		System.out.println("住所は" + address);
	};
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	};

}
