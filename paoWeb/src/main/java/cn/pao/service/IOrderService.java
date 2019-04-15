package cn.pao.service;

import java.util.List;

import cn.pao.pojo.TOrder;

public interface IOrderService {

	public List<TOrder> queryAllOrders() throws Exception;
}
