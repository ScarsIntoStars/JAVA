import java.util.List;



public interface ProductDAO {
	// 인터페이스 : 기본 설계도 (리스트, 리드 인서트, 업데이트, 딜리트)의 껍데기 
	public void insert(ProductVO vo)throws Exception; // 인서트라 리턴이 없음, VO에는 모든 것이 있음
	public void update(ProductVO vo)throws Exception;// 리드랑 리스트만 리턴이 있음
	public void delete(int pcode)throws Exception;
	public ProductVO read(int pcode)throws Exception; // vo 하나를 리턴할꺼야
	public List<ProductVO> list()throws Exception; // vo들이 ArrayList에 들어 있음
}
