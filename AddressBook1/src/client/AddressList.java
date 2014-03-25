import java.util.List;

import Shared.EntryData;
import client.GetAddressDataService;
import client.SubmitAddressService;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FormPanel;

public class AddressList implements EntryPoint {
	private final AddressListView glView = new AddressListView();
	private final GetAddressDataServiceAsync postDataService = GWT
			.create(GetAddressDataService.class);
	private final SubmitAddressServiceAsync submitPostService = GWT
			.create(SubmitAddressService.class);

	public void onModuleLoad() {
	    // Wire controller to view
		//  Note: Model is on server side - can only
		//   communicate to Model through RPC calls
		//   Cannot wire it directly as a class attribute
		glView.setController(AddressList.this);
		// Show welcome page
		//glView.viewWelcomePage();
		//RootPanel rootPanel = RootPanel.get();
		//rootPanel.clear();
	}


	public AddressListView getView() {
		return glView;
	}

	public void viewAddressDataFromServer(){
		addressDataService.getAddressDataFromServer(
				new AsyncCallback<List<EntryData>>() {
					public void onFailure(Throwable caught) {
						return;
					}

					@Override
					public void onSuccess(List<EntryData> entries) {
						glView.viewAddressData(entries);
					}
				});
	}

	public void handleAddressFromSubmit(EntryData entries) {
		submitAddressService.submitAddressToServer(entries, 
				new AsyncCallback<String>() {
			public void onFailure(Throwable caught) {
				return;
			}

			@Override
			public void onSuccess(String result) {
				glView.sendSuccessfulPostmessage();
			}
		});

	}

	public void handleTitleSearchRequest(String title) {
		// Need to implement servlet communication
	}
}