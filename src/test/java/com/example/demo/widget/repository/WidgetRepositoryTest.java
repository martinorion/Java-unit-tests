package com.example.demo.widget.repository;


import com.example.demo.widget.model.Widget;
import com.github.database.rider.core.api.connection.ConnectionHolder;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.DBUnitExtension;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@ExtendWith(DBUnitExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class WidgetRepositoryTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private WidgetRepository repository;

    public ConnectionHolder getConnectionHolder() {
        return () -> dataSource.getConnection();
    }

    @Test
    @DataSet("widgets.yml")
    void find_all() {
        // call findAll method

        // assert that correct number of widgets was returned based on the DataSet
    }

    @Test
    @DataSet("widgets.yml")
    void findByIdSuccess() {
        // call findById method

        // use assert equals on all Widget properties


    }

    @Test
    @DataSet("widgets.yml")
    void testFindByIdNotFound() {
        // test findById for ID that is not present in widgets.yml dataset and assert that it is not found

    }

    @Test
    @DataSet("widgets.yml")
    void find_widgets_with_name_like() {
        // test method findWidgetsWithNameLike that it returns correct number of widgets

    }
}
