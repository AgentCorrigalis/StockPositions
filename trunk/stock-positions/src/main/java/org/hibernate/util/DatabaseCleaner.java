package org.hibernate.util;

import org.hibernate.Query;
import org.hibernate.Session;

public class DatabaseCleaner {

	public static void cleanTable(Class<?> hibernateTableClass) {
			Session session = HIbernateUtil.getSessionFactory().getCurrentSession();
			String tableName = hibernateTableClass.getName();
			session.beginTransaction();
			Query deleteQuery = session.createQuery("delete from " + tableName);
			int rows = deleteQuery.executeUpdate();
			if (rows == 0) {
				System.out.println("No rows to delete");
			} else {
				System.out.println("Deleted " + rows + " rows.");
			}
			session.getTransaction().commit();
	}
}
