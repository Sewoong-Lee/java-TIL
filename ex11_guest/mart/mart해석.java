package ex11_guest.mart;


import java.util.ArrayList;
import java.util.List;

interface ProductCorner{ //공산품코너
	public List<String> getProductItem(); 
	public void setProductItem(String...s);
	void productNamePrint();
}
interface MeatCornet{ //정육코너
	public List<String> getMeatItem();
	public void setMeatItem(List<String> meatItem);
	void meatNamePrint();
}
interface  ClothCorner{ //의류코너
	public List<String> getClothItem();
	public void setClothItem(List<String> clothItem);
	void clothNamePrint(String...s);
}
class  HeadOffice{ //본사
	private String companyName ="국제 마트";
	private String registrationNumber = "888-88-88888";
	void companyInfoPrint() {
		System.out.println("★★★★★" + companyName + "★★★★★");
		System.out.println("[NO]" + registrationNumber);
	}
}

class Branch1 extends HeadOffice implements MeatCornet,ProductCorner{//지점1
	private String branchName="신림점";
	private List<String> meatItem; 
	private List<String> productItem = new ArrayList<>(); //공산품 상품 목록
	
	//세터, 게터 
	@Override
	public List<String> getProductItem() {
		return productItem;
	}
	@Override
	public void setProductItem(String...s) {
		for(String item :s) {
			productItem.add(item);
		}
	}
	@Override
	public List<String> getMeatItem() {
		return meatItem;
	}
	@Override
	public void setMeatItem(List<String> meatItem) {
		this.meatItem = meatItem;
	}	
	
	@Override
	public void productNamePrint() {
		System.out.println("[" + branchName +"] 공산품 코너");
		System.out.print("***");
		for(String item:productItem) {
			System.out.print(item +" ");
		}
		System.out.println();
	}
	@Override
	public void meatNamePrint() {
		System.out.println("[" + branchName +"] 정육점 코너");
		System.out.print("***");
		for(String item:meatItem) {
			System.out.print(item +" ");
		}
		System.out.println();		
	}

}

public class mart해석 {
	public static void main(String[] args) {
		Branch1 b1= new Branch1();
		b1.companyInfoPrint();
		System.out.println("--------------------");
		//공산품코너:가변인자 
		b1.setProductItem("생활용품","문구", "침구", "가전");
		b1.productNamePrint();
		//고기코너:상품리스트 객체생성
		List<String> meatItem = new ArrayList<>();
		meatItem.add("소고기");
		meatItem.add("돼지고기");
		b1.setMeatItem(meatItem);
		b1.meatNamePrint();
		
		
	}
}

