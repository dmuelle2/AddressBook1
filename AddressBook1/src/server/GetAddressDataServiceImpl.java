package server;

import java.util.List;

import Shared.EntryData;
import client.GetAddressDataService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GetAddressDataServiceImpl extends RemoteServiceServlet implements
		GetAddressDataService {
	public List<EntryData> getEntryDataFromServer() { 
		return AddressListModel.getAddressData();
	}

	@Override
	public List<EntryData> getAddressDataFromServer() {
		// TODO Auto-generated method stub
		return null;
	}
}