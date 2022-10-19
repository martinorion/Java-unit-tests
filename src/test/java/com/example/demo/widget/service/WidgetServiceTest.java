package com.example.demo.widget.service;

import com.example.demo.widget.model.Widget;
import com.example.demo.widget.repository.WidgetRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.mockito.Mockito.doReturn;

@SpringBootTest
public class WidgetServiceTest {
    /**
     * Autowire in the service we want to test
     */
    @Autowired
    private WidgetService service;

    /**
     * Create a mock implementation of the WidgetRepository
     */
    @MockBean
    private WidgetRepository repository;

    @Test
    @DisplayName("Test findById Success")
    void testFindById() {
        // Setup our mock repository
        Widget widget = new Widget(1l, "Widget Name", "Description", 1);
        doReturn(Optional.of(widget)).when(repository).findById(1l);

        // Execute the service call
        Optional<Widget> returnedWidget = service.findById(1l);

        // Assert the response
        Assertions.assertTrue(returnedWidget.isPresent(), "Widget was found");
        Assertions.assertSame(returnedWidget.get(), widget, "The widget returned was the same as the mock");
    }

   @Test
    @DisplayName("Test findById Not FOund")
    void testFindByIdNotFound() {
        // Setup our mock repository
        Widget widget = new Widget(1l, "Widget Name", "Description", 1);
        doReturn(Optional.empty()).when(repository).findById(1l);


        // Execute the service call
        Optional<Widget> returnedWidget = service.findById(1l);

        // Assert the response (widget was not found)
        Assertions.assertFalse(returnedWidget.isPresent(), "Widget was not found");
        Assertions.assertSame(returnedWidget, Optional.empty(), "The widget returned was the same as the mock");
    }

    @Test
    @DisplayName("Test findAll")
    void testFindAll() {
        // Setup our mock repository
        List<Widget> widgets = List.of(new Widget(1l, "Widget Name", "Description", 1));
        doReturn(widgets).when(repository).findAll();

        // Execute the service call
        List<Widget> returnedWidgets = service.findAll();

        // Assert the response (findAll returns 2 widgets)
        Assertions.assertEquals(1, returnedWidgets.size(), "findAll should return 1 widget");
    }

    @Test
    @DisplayName("Test save widget")
    void testSave() {
        // Setup our mock repository
       Widget widget = new Widget(1l, "Widget Name", "Description", 1);
     //doReturn(widget).when(repository).save(widget);
        when(repository.save(widget)).thenReturn(widget);

        // Execute the service cal
        Optional<Widget> returnedWidget = Optional.ofNullable(service.save(widget));

        // Assert the response (saved widget is not null and version is incremented)
        Assertions.assertTrue(returnedWidget.isPresent(), "Widget was  save");
        Assertions.assertEquals(2, returnedWidget.get().getVersion(), "The widget returned was the same as the mock");

    }

    @Test
    @DisplayName("Test deleteById repository.deleteById called with correct Id ")
    void testDelete() {
        // Execute the deleteById
        service.deleteById(1l);
        

        // Assert the deleteById was called use verify (https://www.baeldung.com/mockito-verify)
   
        
    }
}
