package org.groupout.logging_service.interfaces;

import javax.json.JsonObject;

public interface LogQueue {

	public void pushToQueue(JsonObject logObject);
	public void flushQueue();
	public JsonObject popFromQueue();
}
