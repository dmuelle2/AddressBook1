package client;

import Shared.EntryData;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("submitpost") 
public interface SubmitAddressService extends RemoteService {
	public String submitAddressToServer(EntryData entries);
}