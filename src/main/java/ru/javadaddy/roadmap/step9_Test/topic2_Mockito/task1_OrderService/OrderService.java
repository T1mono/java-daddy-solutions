package ru.javadaddy.roadmap.step9_Test.topic2_Mockito.task1_OrderService;


/**
 * Метод processOrder проверяет наличие товара, а затем сохраняет заказ.
 * Используем Mockito для тестирования зависимостей InventoryService и OrderRepository
 *
 * Написать тест, который проверяет успешную обработку заказа.
 * Написать тест, который проверяет отказ в обработке заказа (товара нет в наличии).
 * Использовать Mockito.verify() для проверки вызова зависимостей.
 */
public class OrderService {
    private InventoryService inventoryService;
    private OrderRepository orderRepository;

    public OrderService(InventoryService inventoryService, OrderRepository orderRepository) {
        this.inventoryService = inventoryService;
        this.orderRepository = orderRepository;
    }

    public boolean processOrder(Order order) {
        if (inventoryService.isProductAvailable(order.getProductId(), order.getQuantity())) {
            orderRepository.saveOrder(order);
            return true;
        }
        return false;
    }
}
