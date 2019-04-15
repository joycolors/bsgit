package cn.pao.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	public PageInfo<TOrder> queryAllOrders(int currentPage, int pageSize) throws Exception {
		PageHelper.startPage(currentPage, pageSize);
		TOrderExample example;
		List<TOrder> orders = orderMapper.selectByExample(example);
		PageInfo<TOrder> pageInfo = new PageInfo<>(orders);
		return pageInfo;
	}
	
/*	@Override
	public List<TOrder> queryAllOrders( ) throws Exception {
		TOrderExample example;
		return orderMapper.selectByExample(example);
	}*/

}
