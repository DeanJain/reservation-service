package dev.cassandraguide.repository;

import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;


/**
 * Mapper for accessing Reservation data
 *
 * @author Jeff Carpenter
 */
@Mapper
public interface ReservationMapper {

    @DaoFactory
    ReservationDao reservationDao();

}