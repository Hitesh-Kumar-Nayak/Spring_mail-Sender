package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	
	private ReportDao dao;
	
	/*@Autowired
	public void setDao(ReportDao dao) {
		this.dao = dao;
	}*/
	
	public ReportService(ReportDao dao) {
		this.dao =dao;
		System.out.println("ReportService :: constructor");
		// TODO Auto-generated constructor stub
	}
	
	
	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated");
	}
	
	
	

}
