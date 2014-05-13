package martinComp.FMC.IFMA.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class MainPage  extends Composite {
	LayoutPanel mainPage;
	ListBox brotherTypeList;
	private LoginView loginPage;
	
	public MainPage() {
		
	    mainPage = new LayoutPanel();
		initWidget(mainPage);
		mainPage.setSize("773px", "750px");
		
		brotherTypeList = new ListBox();
		brotherTypeList.addItem("All Brothers");
		brotherTypeList.addItem("Active");
		brotherTypeList.addItem("Inactive");
		mainPage.add(brotherTypeList);
		mainPage.setWidgetLeftWidth(brotherTypeList, 0.0, Unit.PX, 87.0, Unit.PX);
		mainPage.setWidgetTopHeight(brotherTypeList, 139.0, Unit.PX, 100.0, Unit.PX);
		brotherTypeList.setVisibleItemCount(5);
	}

	
}
