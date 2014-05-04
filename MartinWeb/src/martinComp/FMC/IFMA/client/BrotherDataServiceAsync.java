package martinComp.FMC.IFMA.client;

import martinComp.FMC.IFMA.model.BrotherData;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BrotherDataServiceAsync {

	void retriveBrotherData(String parameter, AsyncCallback<BrotherData> callback);

	void addBrotherData(String lastName, String firstName, String position,
			String pledgeClass, double GPA, AsyncCallback<BrotherData> callback);

}
