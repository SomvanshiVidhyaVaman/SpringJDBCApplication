package org.example.dao;

import org.example.domain.JDBCInsert;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class JDBCInsertDao {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public JDBCInsertDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;

    }
    private final String SQL_FOR_PROJECT = "INSERT INTO JDBCINSERT VALUES(:insertId,:title,:description,:duration,:status)";
    public int insertProjects(JDBCInsert jdbcInsert){
        MapSqlParameterSource parameterSource=new MapSqlParameterSource();
        parameterSource.addValue("insertId",jdbcInsert.getInsertId());
        parameterSource.addValue("title",jdbcInsert.getTitel());
        parameterSource.addValue("description",jdbcInsert.getDescripction());
        parameterSource.addValue("duration",jdbcInsert.getDuration());
        parameterSource.addValue("status",jdbcInsert.getStatus());

        int rowCount=namedParameterJdbcTemplate.update(SQL_FOR_PROJECT,parameterSource);
        return rowCount;
    }
}
