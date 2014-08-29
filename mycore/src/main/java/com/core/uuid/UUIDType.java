package com.core.uuid;

import java.util.List;

import com.core.enums.IndexedEnum;
import com.core.util.EnumUtil;



/**
 * 游戏中的UUID类型
 * @author Thinker
 *
 */
public enum UUIDType implements IndexedEnum 
{
	/** 玩家角色的UUID */
	HUMAN(0,"HumanEntity"),
    /** 武将的UUID */
    PET(1,""),
	/** 场景的UUID */
	SCENE(2,""),
;

	private final int index;
	
	private String dbBeanName;
	/** 按索引顺序存放的枚举数组 */
	private static final List<UUIDType> values = IndexedEnumUtil.toIndexes(UUIDType.values());

	/**
	 * 
	 * @param index
	 *            枚举的索引,从0开始
	 */
	private UUIDType(int index,String dbBeanName)
	{
		this.index = index;
		this.dbBeanName=dbBeanName;
	}

	@Override
	public int getIndex() 
	{
		return this.index;
	}
	
	public String getDbBeanName() {
		return dbBeanName;
	}


	/**
	 * 根据指定的索引获取枚举的定义
	 * 
	 * @param index
	 * @return
	 */
	public static UUIDType valueOf(final int index)
	{
		return EnumUtil.valueOf(values, index);
	}
}
