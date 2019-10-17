package com.deals.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            System.out.println("Hibernate Java Config serviceRegistry created");
            try {
                sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
                return sessionFactory;
            } catch (Exception e) {
                StandardServiceRegistryBuilder.destroy(serviceRegistry);
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
