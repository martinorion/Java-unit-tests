package com.example.demo.fridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FridgeServiceTest
{
    @InjectMocks
    private FridgeService fridgeService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void should_add_item_to_fridge() {
        String milk = "milk";
        fridgeService.put(milk);
        assertTrue(fridgeService.contains(milk));
    }

    @Test
    public void should_not_have_item_after_taken_out() {
        String milk = "milk";
        fridgeService.put(milk);
        try
        {
            fridgeService.take(milk);
        }
        catch(NoSuchItemException e)
        {
            e.printStackTrace();
        }
        assertFalse(fridgeService.contains(milk));

    }
}
