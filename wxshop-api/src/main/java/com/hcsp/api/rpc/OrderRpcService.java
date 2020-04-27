package com.hcsp.api.rpc;

import com.hcsp.api.data.OrderInfo;
import com.hcsp.api.data.RpcOrderGoods;
import com.hcsp.api.generate.Order;

public interface OrderRpcService {
    Order createOrder(OrderInfo orderInfo, Order order);

    RpcOrderGoods deleteOrder(long orderId, long userId);
}