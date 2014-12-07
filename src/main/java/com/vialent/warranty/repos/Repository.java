package com.vialent.warranty.repos;

import com.vialent.warranty.model.Account;
import com.vialent.warranty.model.Device;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    private static final Logger LOGGER = LoggerFactory.getLogger(Repository.class);

    @PersistenceContext
    private EntityManager entityManager;

    public Account findByEmail(String email) {
        try {
            return entityManager.createNamedQuery(Account.FIND_BY_EMAIL, Account.class)
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (PersistenceException e) {
            LOGGER.error("Exception occurred while account query: {}", ExceptionUtils.getMessage(e));
            return null;
        }
    }

    public List<Device> findBySerial(String serial) {
        try {
            List<Device> result = entityManager.createNamedQuery(Device.FIND_BY_SERIAL, Device.class)
                    .setParameter("serial", serial)
                    .getResultList();
            return result;
        } catch (PersistenceException e) {
            LOGGER.error("Exception occurred while device query: {} ", ExceptionUtils.getMessage(e));
            return null;
        }
    }

}
