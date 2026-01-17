package exception_handling;

import java.util.ArrayList;
import java.util.List;

class LogFetchException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LogFetchException(String message) {
		super(message);
	}
}

class LogSource {
	String serviceName;
	boolean isAvailable;
	String logData;

	public LogSource(String serviceName, boolean isAvailable, String logData) {
		this.serviceName = serviceName;
		this.isAvailable = isAvailable;
		this.logData = logData;
	}

	public String fetchLog() throws LogFetchException {
		if (!isAvailable) {
			throw new LogFetchException("Service unavailable: " + serviceName);
		}
		return logData;
	}
}

class LogAggregator {
	List<LogSource> sources;
	List<String> successfulLogs;
	List<String> failedServices;

	public LogAggregator(List<LogSource> sources) {
		this.sources = sources;
		this.successfulLogs = new ArrayList<>();
		this.failedServices = new ArrayList<>();
	}

	public void collectLogs() {
		for (LogSource source : sources) {
			try {
				String log = source.fetchLog();
				successfulLogs.add(log);
			} catch (LogFetchException e) {
				System.out.println("Error: " + e.getMessage());
				failedServices.add(source.serviceName);
			}
		}
	}
}

public class LogSystem {

	public static void main(String[] args) {

		LogSource serviceA = new LogSource("Service A", true, "Auth service log");
		LogSource serviceB = new LogSource("Service B", false, null);
		LogSource serviceC = new LogSource("Service C", true, "Payment service log");

		List<LogSource> sources = new ArrayList<>();
		sources.add(serviceA);
		sources.add(serviceB);
		sources.add(serviceC);

		// Aggregating logs
		LogAggregator aggregator = new LogAggregator(sources);
		aggregator.collectLogs();

		// Displaying results
		System.out.println("\nSuccessful Logs:");
		for (String log : aggregator.successfulLogs) {
			System.out.println(log);
		}

		System.out.println("\nFailed Services:");
		for (String service : aggregator.failedServices) {
			System.out.println(service);

		}
	}

}
