package org.hibernate.util;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.domain.QuoteData;

public class DatabaseReader {

	@SuppressWarnings("unchecked")
	public List<QuoteData> readTable(Class<?> hibernateTableClass) {
		Session session = HIbernateUtil.getSessionFactory().getCurrentSession();
		String tableName = hibernateTableClass.getName();
		session.beginTransaction();
		List<QuoteData> resultSet = session.createQuery("from " + tableName).list();
		session.getTransaction().commit();
		return resultSet;
	}
	
}
