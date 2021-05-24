package ex11_guest;

import java.util.List;

public interface pocketinter {
		//추가
		int insert(pocketDTO pdto);
		//수정
		int updatetra(pocketDTO pdto);
		//삭제
		int deldtd(int qty);
		//한건조회
//		pocketDTO selectOne(String traid);
		//전체조회
		List<pocketDTO> selsctList();
		
		
	}

