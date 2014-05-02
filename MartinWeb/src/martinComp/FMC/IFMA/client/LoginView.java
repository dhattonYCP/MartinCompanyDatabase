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

public class LoginView extends Composite {
	
	private LayoutPanel layoutPanel;
	private TextBox usernameTextBox;
	private PasswordTextBox passwordTextBox;
	private Button loginButton;
	private Label passwordLabel;
	private TextBox usernameTextbox;
	private Label usernameLabel;
	private Label resultLabel;
	
	
	public LoginView() {
		layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("721px", "526px");
		
		loginButton = new Button("New button");
		loginButton.setText("Login");
		layoutPanel.add(loginButton);
		layoutPanel.setWidgetLeftWidth(loginButton, 329.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(loginButton, 408.0, Unit.PX, 30.0, Unit.PX);
	
	    passwordTextBox = new PasswordTextBox();
		layoutPanel.add(passwordTextBox);
		layoutPanel.setWidgetLeftWidth(passwordTextBox, 288.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(passwordTextBox, 370.0, Unit.PX, 32.0, Unit.PX);
		
		passwordLabel = new Label("Password");
		layoutPanel.add(passwordLabel);
		layoutPanel.setWidgetLeftWidth(passwordLabel, 341.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(passwordLabel, 346.0, Unit.PX, 18.0, Unit.PX);
		
		usernameTextbox = new TextBox();
		layoutPanel.add(usernameTextbox);
		layoutPanel.setWidgetLeftWidth(usernameTextbox, 288.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(usernameTextbox, 306.0, Unit.PX, 34.0, Unit.PX);
		
		usernameLabel = new Label("Username");
		layoutPanel.add(usernameLabel);
		layoutPanel.setWidgetLeftWidth(usernameLabel, 341.0, Unit.PX, 69.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(usernameLabel, 282.0, Unit.PX, 18.0, Unit.PX);
		
		resultLabel = new Label("");
		layoutPanel.add(resultLabel);
		layoutPanel.setWidgetLeftWidth(resultLabel, 288.0, Unit.PX, 173.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(resultLabel, 258.0, Unit.PX, 18.0, Unit.PX);
	}
	protected void handleLogInClicked() {
		RPC_Login.login.findLogin(usernameTextBox.getText(),passwordTextBox.getText(),new AsyncCallback<User>(){
			@Override
			public void onSuccess(User result){
				if(result == null){
					resultLabel.setText("Failed login please re-try");
				}else {
					resultLabel.setText("Success!");
					
				}
			}
			@Override
			public void onFailure(Throwable caught){
				resultLabel.setText("Could not reach server please try again later");
			}
	
		});
	}
}
