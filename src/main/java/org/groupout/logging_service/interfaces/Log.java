package org.groupout.logging_service.interfaces;

public interface Log {
	
	public void setServiceName();
	public void setLogMessage();
	public void log();
	public void log(String serviceName, String logMessage);
}
