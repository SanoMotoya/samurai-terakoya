package kadai_018;

public abstract class Kato_Chapter18 {
	
	public String familyName;
	
	public String givenName;
	
	public String address;
	
	abstract public void setGivenName();
	
	public void commonIntroduce() {
		familyName = "加藤";
		address = "東京都中野区◯x";
		System.out.println("名前は" + familyName + "" + givenName);
		System.out.println("住所は" + address);
		
	};
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		setGivenName();
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	};

}
