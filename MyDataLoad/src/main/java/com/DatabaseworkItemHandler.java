package com;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class DatabaseworkItemHandler implements WorkItemHandler,java.io.Serializable {

	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		String param1 = (String) workItem.getParameter("MyFirstParam");
		System.out.print("I am here" + param1);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("One", "One");
		 Map<String, Object> results = new HashMap<String, Object>();
		results.put("Result", data);
		System.out.println("Result is: " + results);
		manager.completeWorkItem(workItem.getId(), results);
		
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		System.out.print("I am in out");
	}

}
