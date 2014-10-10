package com.core.util;

import java.lang.reflect.Array;
import java.util.BitSet;

/**
 * 泛型属性数组
 * @author Thinker
 * 
 */
public class GenericPropertyArray
{
	
	private final int[] values;
	private final BitSet bitSet;

	@SuppressWarnings("unchecked")
	public GenericPropertyArray(int size)
	{
		values = new int[size];
		bitSet = new BitSet(size);
	}

	/**
	 * 从指定的数值对象src拷贝数据到本实例
	 * 
	 * @param src
	 *            数据的来源
	 */
	public void copyFrom(GenericPropertyArray src)
	{
		System.arraycopy(src.values, 0, values, 0, values.length);
		this.bitSet.set(0, values.length, true);
	}
	
	public boolean isChanged()
	{
		return !this.bitSet.isEmpty();
	}
	
	/**
	 * 指定的索引是否有修改
	 * 
	 * @param index
	 * @return true,有修改;false,无修改
	 */
	public boolean isChanged(int index)
	{
		return this.bitSet.get(index);
	}

	public void resetChanged() 
	{
		this.bitSet.clear();
	}
	
	
	public int get(int index)
	{
		return values[index];
	}
	
	public void set(int index, int val)
	{
		int _old = this.values[index];
		boolean _changed = false;
		if (_old != 0)
		{
			_changed = true;
		} else if (val != 0) 
		{
			_changed = true;
		}
		if (_changed)
		{
			this.values[index] = val;
			this.bitSet.set(index);
		}
	}
	
	public int size()
	{
		return values.length;
	}
	
	/**
	 * 将当前的修改标识填充到toBitSet中
	 * 
	 * @param toBitSet
	 * @return false,如果当前的属性没有修改;true,当前的属性有修改,并且已经将对应的值设置到toBitSet中
	 */
	public boolean fillChangedBit(final BitSet toBitSet)
	{
		if (this.bitSet.isEmpty())
		{
			return false;
		} else 
		{
			toBitSet.or(this.bitSet);
			return true;
		}
	}
	/**
	 * 取得被修改过的的属性索引及其对应的值
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public KeyValuePair<Integer,Integer>[] getChanged()
	{
		KeyValuePair<Integer,Integer>[] _changed=new KeyValuePair[bitSet.cardinality()];
		for (int i = bitSet.nextSetBit(0), j = 0; i >= 0; i = bitSet.nextSetBit(i + 1), j++)
		{
			_changed[j]=new KeyValuePair<Integer,Integer>(i,values[i]);
		}
		return _changed;
	}

	public String toString() 
	{
		return StringUtils.obj2String(this, null);
	}

	
	/**
	 * 清空状态,将values重置为0;将所有属性都设置为changed
	 */
	public void clear()
	{
		for (int i = 0; i < values.length; i++)
		{
			if (values[i]!=0)
			{
				this.bitSet.set(i);
			}
			
			values[i] = 0;
		}
	}
	
	/**
	 * 增加index对应的值
	 * 
	 * @param index
	 *            属性的索引
	 * @param value
	 *            将要增加的值
	 * @return 增加后的值
	 */
	public int add(int index, int value)
	{
		int _o = values[index];
		if (value!=0) 
		{
			int _n = _o + value;
			values[index] = _n;
			bitSet.set(index);
		}
		return values[index];
	}
	
	
	
	public KeyValuePair<Integer, Integer>[] getIndexValuePairs()
	{
		KeyValuePair<Integer, Integer>[] indexValuePairs = KeyValuePair.newKeyValuePairArray(values.length);
		for (int i = 0; i < indexValuePairs.length; i++) 
		{
			indexValuePairs[i] = new KeyValuePair<Integer, Integer>(Integer.valueOf(i), Integer.valueOf(values[i]));
		}
		return indexValuePairs;
	}
}
