package ru.javadaddy.roadmap.step9_Test.topic2_Mockito.task1_OrderService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Mock
    private InventoryService inventoryService;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;


    private Order order;

    @BeforeEach
    void setUp() {
        order = new Order(
                "1",
                2,
                33.0
        );
    }

    @Test
    void testProcessOrderCorrect() {
        when(inventoryService.isProductAvailable("1", 2)).thenReturn(true);

        assertTrue(orderService.processOrder(order));

        verify(inventoryService, times(1)).isProductAvailable("1", 2);
        verify(orderRepository, times(1)).saveOrder(order);
    }

    @Test
    void testProcessOrderFail() {
        when(inventoryService.isProductAvailable("1", 2)).thenReturn(false);
        assertFalse(orderService.processOrder(order));

        verify(inventoryService, times(1)).isProductAvailable("1", 2);
        verify(orderRepository, times(1)).saveOrder(order);
    }
}