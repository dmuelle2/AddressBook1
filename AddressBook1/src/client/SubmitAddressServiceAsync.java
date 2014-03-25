package client;

import Shared.EntryData;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface SubmitAddressServiceAsync {
	public void submitAddressToServer(EntryData entries,
			AsyncCallback<String> asyncCallback);
}
