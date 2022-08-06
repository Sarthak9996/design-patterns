package proxy_pattern;

interface DatabaseExecutor {
	public void executeDatabase(String query) throws Exception;
}

class DatabaseExecutorImpl implements DatabaseExecutor {

	@Override
	public void executeDatabase(String query) throws Exception {
		System.err.println("Going to execute query : " + query);
	}

}

class DatabaseExecutorProxy implements DatabaseExecutor {

	boolean isAdmin;
	DatabaseExecutorImpl dbExecutor;

	public DatabaseExecutorProxy(String name, String password) {
		if (("admin").equalsIgnoreCase(name) && ("admin123").equalsIgnoreCase(password)) {
			isAdmin = true;
			dbExecutor = new DatabaseExecutorImpl();
		}
	}

	@Override
	public void executeDatabase(String query) throws Exception {
		if (isAdmin) {
			dbExecutor.executeDatabase(query);
		} else {
			if (query.equals("Delete")) {
				throw new Exception("Delete not allowed for non-admin users.");
			} else {
				dbExecutor.executeDatabase(query);
			}
		}
	}

}

public class ProxyPattern {
	public static void main(String[] args) throws Exception {
		DatabaseExecutor nonAdminExecutor = new DatabaseExecutorProxy("NonAdmin", "admin123");
		nonAdminExecutor.executeDatabase("Select");

		DatabaseExecutor adminExecutor = new DatabaseExecutorProxy("Admin", "admin123");
		adminExecutor.executeDatabase("Delete");
	}
}
