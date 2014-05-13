package martinComp.FMC.IFMA.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class BrotherTrackerUi implements EntryPoint {
	LoginView view;
	@Override
	public void onModuleLoad() {
		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		view = new LoginView();
		rootLayoutPanel.add(view);
		RootLayoutPanel.get().setWidgetTopBottom(view, 0.0, Unit.PX, 0.0, Unit.PX);
		RootLayoutPanel.get().setWidgetLeftRight(view, 0.0, Unit.PX, 0.0, Unit.PX);
	}

}
