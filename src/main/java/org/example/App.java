package org.example;

import jakarta.persistence.Query;
import org.example.entity.Profile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Profile.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {


            //Profile profile = new Profile("James Mac","www.url.com");
            // creating queries
            // set the entity name for the query to work
            //------- LISTING ALL RECORD
            Profile profile = new Profile();

            // get transaction
//            session.beginTransaction();
//            List<Profile> profiles =
//                    session.createQuery("from profile", Profile.class).getResultList();
//
//            for(Profile p : profiles){
//                System.out.println(p);
//            }
//
//            //session.persist(profile);
//            //System.out.println(profile);
//            // start transaction
//            session.getTransaction().commit();
//            // ------------ END OF LISTING

            // ------------- WHERE CLAUSE
//            session.beginTransaction();
//
//            List<Profile> profiles =
//                    session.createQuery("from profile where displayName = " +
//                                    "'Askey Banks' OR displayName = 'James Mack'",
//                            Profile.class).getResultList();
//
//            for (Profile p : profiles) {
//                System.out.println(p);
//            }
//
//            session.getTransaction().commit();

            // ------------- END OF WHERE CLAUSE

            // ------------- END OF UPDATE

//            session.beginTransaction();
//            String q = "update profile set displayName ='Beans Rice' " +
//                    "where id = :uid ";
//            MutationQuery query =
//            session.createMutationQuery(q);
//            query.setParameter("uid",2);
//            int resultId = query.executeUpdate();
//            System.out.println(resultId);
//            session.getTransaction().commit();

            // ------------- END OF UPDATE
            // -------------- DELETE
//            session.beginTransaction();
//            String q = "delete from profile where id = :id";
//            MutationQuery query = session.createMutationQuery(q);
//            query.setParameter("id",1);
//            int r = query.executeUpdate();
//            System.out.println(q);
//            session.getTransaction().commit();
            // -------------- DELETE

            // --------- INSERT
            session.beginTransaction();
            String q = "insert into profile (displayName,imageUrl)" +
                    "values('Lax Max','url.org')";
            MutationQuery query = session.createMutationQuery(q);
            int r = query.executeUpdate();
            System.out.println(r);
            session.getTransaction().commit();


        } finally {
            factory.close();
            session.close();
        }


    }
}
