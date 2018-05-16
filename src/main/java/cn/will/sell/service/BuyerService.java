package cn.will.sell.service;


import cn.will.sell.dto.OrderDTO;

/**
 * 买家
 * Created by will
 * 2017-06-22 00:11
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
