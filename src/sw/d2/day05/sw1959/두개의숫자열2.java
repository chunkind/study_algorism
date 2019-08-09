package sw.d2.day05.sw1959;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class 두개의숫자열2 {
	public static void main(String[] args) {
		while(true) {
			try {
				JdbcUtil ju = new JdbcUtil("", "", "");
				ju.start();
				Thread.sleep(1000 * 60 * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class JdbcUtil{
	private String url, user, pass;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private List<String> keyList;
	JdbcUtil(String url, String user, String pass){
		this.url = url;
		this.user = user;
		this.pass = pass;
		this.keyList = new ArrayList<String>();
	}
	public void start() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
			ps = conn.prepareStatement(SqlUtil.selectPinList);
			rs = ps.executeQuery();
			while(rs.next()) {
				keyList.add(rs.getString(1));
			}
			for(int i=0; i<keyList.size(); i++) {
				ps = conn.prepareStatement(SqlUtil.insertHistOne);
				ps.setString(1, keyList.get(i));
				int insertResult = ps.executeUpdate();
				if(insertResult == 1) {
					ps = conn.prepareStatement(SqlUtil.updateBaseOne);
					ps.setString(1, keyList.get(i));
					int updateResult = ps.executeUpdate();
					if(updateResult == 1) {
						Calendar calendar = Calendar.getInstance();
			            java.util.Date date = calendar.getTime();
			            String today = (new SimpleDateFormat("yyyyMMddHHmmss").format(date));
						System.out.println(keyList.get(i) + "성공 시간 : " + today);
					}else {
						System.out.println(keyList.get(i) + "base update 실패!");
					}
				} else {
					System.out.println(keyList.get(i) + "hist insert 실패!");
				}
			}
			if(conn!=null) conn.close();
			if(ps!=null) ps.close();
			if(rs!=null) rs.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
interface SqlUtil{
	public static final String selectPinList =
	 "SELECT crspk_pin_no FROM op_crspk_base"
	+"WHERE 1=1"
	+"	--and TO_CHAR(sys_reg_dtime,'YYYYMMDDHH24') >= '2019080810'"
	+"	AND chl_cd='3'"
	+"	AND crspk_corp_cd='3000'"
	+"	AND chl_dlv_inv_no like 'SMP%'"
	+"	AND pickup_stat_cd ='10'"
	+"	AND crspk_pin_no in ("
	+"		SELECT cpn_no FROM ST_API_LINK_LOG"
	+"		WHERE 1=1"
	+"		AND log_sn > 7572944"
	+"		AND sys_regr_id='3'"
	+"		AND link_url_addr like '%5700.do'"
	+"		AND proc_cd <>'S'"
	+"		AND cpn_no not in ("
	+"		  SELECT cpn_no FROM ST_API_LINK_LOG"
	+"		  WHERE 1=1"
	+"			AND log_sn > 7572944"
	+"			AND sys_regr_id='3'"
	+"			AND link_url_addr like '%5700.do'"
	+"			AND proc_cd ='S'"
	+"		)"
	+"	)"
	+"ORDER BY sys_reg_dtime DESC";
	public static final String insertHistOne =
	 "INSERT INTO OP_CRSPK_LINK_HIST("
	+"CRSPK_PIN_NO"
	+", CRSPK_LINK_HIST_SN"
	+", LINK_TLGR_NO"
	+", PICKUP_STAT_CD"
	+", LINK_RSLT_CD"
	+", PROC_DTIME"
	+", SYS_REG_DTIME"
	+", SYS_REGR_ID"
	+", SYS_MOD_DTIME"
	+", SYS_MODR_ID"
	+") VALUES "
	+"(?,OP_CRSPK_LINK_HIST_SQ01.NEXTVAL"
	+", '5110'"
	+", '20'"
	+", '0000'"
	+", SYSDATE"
	+", SYSDATE"
	+", 3"
	+", SYSDATE"
	+", 'dgkim23'"
	+")";
	public static final String updateBaseOne =
	 "update op_crspk_base"
	+"set pickup_stat_cd = '20'"
	+"  , sys_mod_dtime = sysdate"
	+"  , sys_modr_id = 'dgkim23'"
	+"where pickup_stat_cd = '10'"
	+"and crspk_pin_no=?";
}