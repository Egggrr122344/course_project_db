package org.spring_boot.course.project_db.repository.customer;

import org.spring_boot.course.project_db.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Customer(
                rs.getInt("customer_id"),
                rs.getInt("user_id"),
                rs.getString("full_name")
        );
    }
}
