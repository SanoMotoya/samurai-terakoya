package kadai_021;

import java.util.HashMap;

public class Dictionary_Capter21 {
	private HashMap<String,String> fruit;
	
	public Dictionary_Capter21() {
	
//	HashMap<String,String> fruit = new HashMap<String,String>();
   
	fruit = new HashMap<String,String>();
	fruit.put("apple" ,"りんご");
	fruit.put("peach" ,"桃");
	fruit.put("banana" ,"バナナ");
	fruit.put("lemon" ,"レモン");
	fruit.put("pear" ,"梨");
	fruit.put("kiwi" ,"キウイ");
	fruit.put("strawberry" ,"いちご");
	fruit.put("grape" ,"ぶどう");
	fruit.put("muscat" ,"マスカット");
	fruit.put("cherry" ,"さくらんぼ");
	}
	
	public void searchWord (String[] wordArray) {
		for(String word : wordArray) {
		if(fruit.get(word) == null) {
			System.out.println(word + "は辞書に存在しません。");
		}else {
			System.out.println(word + "の意味は" + fruit.get(word) + "です");
		}
	}
	
}
	
}
	
