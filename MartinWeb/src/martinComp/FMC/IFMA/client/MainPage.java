package martinComp.FMC.IFMA.client;

import martinComp.FMC.IFMA.model.User;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ListBox;

public class MainPage extends Composite {
	private LayoutPanel mainPage;
	private ListBox brotherTypeList;
	
	public MainPage() {
		
	    mainPage = new LayoutPanel();
		initWidget(mainPage);
		mainPage.setSize("773px", "512px");
		
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
