package org.javaee7.jpa.ordercolumn.service.bidirectionaljoin;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.javaee7.jpa.ordercolumn.entity.bidirectionaljoin.Parent;

@Stateless
public class OrderColumnTesterService {

    @PersistenceContext
    EntityManager entityManager;

    public Parent save(Parent parent) {
        return entityManager.merge(parent);
    }

    public Parent getParentById(Long id) {
        return entityManager.find(Parent.class, id);
    }

}
