package client;

import java.util.List;

import Shared.EntryData;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GetAddressDataServiceAsync {
	public void getAddressDataFromServer(AsyncCallback<List<EntryData>> asyncCallback);
}