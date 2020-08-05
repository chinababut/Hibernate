package com.nt.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

   public class HibernateUtil {

	private static SessionFactory factory = null;

	static {

		Configuration cfg = null;

		try {

			cfg = new Configuration();
			cfg.configure("com/nt/configuration/insurencepolocy.cfg.xml");
			System.out.println("cfg:" + cfg);
			factory = cfg.buildSessionFactory();
			System.out.println("factory:" + factory);
		}

		catch (HibernateException he) {
			System.out.println("Util:hibernateException");
			he.printStackTrace();
		    }

	}

	public static Session getSession() {

		if (factory != null)
			return factory.openSession();
		else
			return null;

	}

	public static void closeSession(Session ses) {
		if (ses != null)
			ses.close();
	}

	public static void closeSessionFactory() {
		if (factory != null)
			factory.close();
	}

}
