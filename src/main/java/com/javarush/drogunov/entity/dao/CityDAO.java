package com.javarush.drogunov.entity.dao;

import com.javarush.drogunov.domain.City;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CityDAO {
    private final SessionFactory sessionFactory;

    public CityDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<City> getItems(int offset, int limit) {
        Query<City> query = sessionFactory
                .getCurrentSession()
                .createQuery(
                        "SELECT c FROM City c"
                        , City.class)
                .setFirstResult(offset)
                .setMaxResults(limit);
        return query.list();
    }

    public City getById(Integer id) {
        Query<City> query = sessionFactory.getCurrentSession()
                .createQuery("SELECT c FROM City c where c.id = :ID", City.class);
        query.setParameter("ID", id);
        return query.getSingleResult();
    }

    public int getTotalCount() {
        Query<Long> query = sessionFactory.getCurrentSession().createQuery(
                "SELECT count(c) FROM City c"
                , Long.class
        );
        return Math.toIntExact(query.uniqueResult());
    }
}
