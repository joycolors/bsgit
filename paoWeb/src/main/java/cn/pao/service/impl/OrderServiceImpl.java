package cn.pao.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.pao.mapper.TOrderMapper;
import cn.pao.pojo.TOrder;
import cn.pao.pojo.TOrderExample;
import cn.pao.service.IOrderService;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {

	private TOrderMapper orderMapper;
	
	public TOrderMapper getOrderMapper(){
		return orderMapper;
	}

	@Override
	public List<TOrder> queryAllOrders() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
/*	@Override
	public List<TOrder> queryAllOrders( ) throws Exception {
		TOrderExample example;
		return orderMapper.selectByExample(example);
	}*/

}
