package cn.will.sell.service;


import cn.will.sell.dto.OrderDTO;

/**
 * 推送消息
 * Created by will
 * 2017-07-30 22:08
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
