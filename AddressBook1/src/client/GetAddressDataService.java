package client;

import java.util.List;

import Shared.EntryData;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


/**
 * The client side stub for the RPC service.
 */
// Note: Name needs to match url-pattern in web.xml
@RemoteServiceRelativePath("entrydata") 
public interface GetAddressDataService extends RemoteService {
	public List<EntryData> getAddressDataFromServer();
}