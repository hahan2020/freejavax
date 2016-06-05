package org.hahan.javawraper.util;

import java.io.Serializable;

/**
 * 数据环类，环形存储数据，当环被填满时，在环中节点继续覆盖
 * @author 345480567@qq.com
 * @param <E> 环中数据的类型
 */
public interface Ring<E> extends Serializable {
	/**
	 * 添加一个元素
	 * @param e
	 */
	public void add(E e);
	/**
	 * 读取环中当前节点下一个位置的数据
	 * @return
	 */
	public E next();
	/**
	 * @return 数据环是否已经填满
	 */
	public boolean isFull();
	/**
	 * 从环中当前节点为起点，刚刚添加的节点为终点，判断环内数据是否等于另一个数组型数据
	 * @param anothers
	 * @return 是否相等
	 */
	public boolean equals(E[] anothers);
}
