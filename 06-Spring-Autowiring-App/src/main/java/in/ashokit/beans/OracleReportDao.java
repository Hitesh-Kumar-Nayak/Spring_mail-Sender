package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleReportDao implements ReportDao {
	
	
	public void getData() {
		System.out.println("getting data from oracle db....");
		
		// TODO Auto-generated method stub
		
	}

}
