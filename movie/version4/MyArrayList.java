package movie.version4;

import java.util.Arrays;

public class MyArrayList
{
	private Object[] objects = new Object[10];
	private int index = 0; // 紀錄有效元素
	// 往數組中添加元素，每次都添加在最後一個有效位置
	public void add(Object object)
	{
		if (index == objects.length) expand();
		objects[index++] = object;
	}
	private void expand()
	{
		objects = Arrays.copyOf(objects, objects.length * 2);
	}
	public Object[] getObjects()
	{
		return objects;
	}
	/**
	 * 根據下標獲取得某個元素
	 * 
	 * @param index
	 *            下標
	 * @return 元素
	 */
	public Object get(int index)
	{
		System.out.println(this.index);
		if (index < 0 && index >= this.index) // 不能超出有效元素的範圍
			throw new ArrayIndexOutOfBoundsException();
		return objects[index];
	}
	/**
	 * 獲取某個對象的下標
	 * 
	 * @param object
	 *            對象
	 * @return 下標
	 */
	public int getDataIndex(Object object)
	{
		for (int i = 0; i < index; i++)
		{
			if (object.equals(objects[i])) return i;
		}
		return -1;
	}
	public boolean contains(Object object)
	{
		for (int i = 0; i < index; i++)
		{
			if (object.equals(objects[i])) return true;
		}
		return false;
	}
	public int getIndex()
	{
		return index;
	}
	public Iterator iterator()
	{
		return new MyIterator();
	}
	private class MyIterator implements Iterator
	{
		private int size = 0;
		@Override
		public Object getCurrent()
		{
			return objects[size];
		}
		@Override
		public boolean isDone()
		{
			return size == index;
		}
		@Override
		public void next()
		{
			size++;
		}
	}
}
