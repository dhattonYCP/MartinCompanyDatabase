package martinComp.FMC.IFMA.server;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import martinComp.FMC.IFMA.db.DBUtil;
import martinComp.FMC.IFMA.shared.BrotherData;

 @SuppressWarnings("serial")
public class TableDisplayInfo extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {

		// The path info is the part of the URL that follows the
		// part identifying the servlet.  For example, if the
		// URL was http://hostname/receipts/42, and assuming that
		// "/receipts" is the path to the servlet, the path info
		// would be "/42".
		String info = req.getPathInfo();
		System.out.println("Path info is: " + info);

		if(info == null){
			List<BrotherData> brodata = DBUtil.instance().getBroData(null);
			resp.setStatus(HttpServletResponse.SC_OK);
			resp.setContentType("text/plain");

			for(BrotherData e: brodata){
				resp.getWriter().println(e.getId() + " , " + e.getLastName() );
			}

		}else{
			if(info.startsWith("/")){
				info.substring(1);
			}
			try{
				//int id = Integer.parseInt(info);
			}catch(NumberFormatException e){
				badRequest(resp);
				return;
			}
		}
		} catch (SQLException e) {
			throw new ServletException("SQL exception getting brother data", e);
		}
	}

	private void badRequest(HttpServletResponse resp) throws IOException {
		resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		resp.setContentType("text/plain");
		resp.getWriter().println("invalid entry");
	}
}
