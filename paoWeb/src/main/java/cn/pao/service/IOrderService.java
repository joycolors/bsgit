package cn.pao.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.pao.pojo.TOrder;

public interface IOrderService {

	public PageInfo<TOrder> queryAllOrders(int currentPage, int pageSize) throws Exception;
}
