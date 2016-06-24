package com.company.restaurant.controllers;

import com.company.restaurant.model.Course;
import com.company.restaurant.model.Order;

import java.util.List;

/**
 * Created by Yevhen on 17.06.2016.
 */
public interface OrderController {
    Order addOrder(Order order);

    void delOrder(Order order);

    Order findOrderById(int orderId);

    Order closeOrder(Order order);

    List<Order> findAllOrders();

    List<Order> findAllOrders(String stateType);

    List<Order> findAllOpenOrders();

    List<Order> findAllClosedOrders();

    List<Order> findOrderByNumber(String orderNumber);

    String addCourseToOrder(Order order, Course course);

    String takeCourseFromOrder(Order order, Course course);

    List<Course> findAllOrderCourses(Order order);

    Course findOrderCourseByCourseId(Order order, int courseId);

    Order updOrderState(Order order, String stateType);
}
