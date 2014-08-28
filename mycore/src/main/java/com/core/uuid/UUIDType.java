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
	HUMAN(0),
    /** 武将的UUID */
    PET(1),
	/** 场景的UUID */
	SCENE(2),
	/** 武将酒馆的UUID */
    PETPUB(3),
    /** 玩家神器的UUID */
    GODEQUIP(4),
    /** 副本的UUID */
    MISSION(5),
    /** 公共信息id */
    COMMONRECORD(6),
    /** 星星奖励id */
    MISSIONSTARREWARD(7),
    /** 竞技场的UUID */
    ARENA(8),
    /** 竞技场战斗日志的UUID */
    ARENALOG(9),
    /** 过关斩将的UUID */
    CUTPET(10),
    /** 竞技场战斗日志的UUID */
    ARENARANKBONUS(11),
    /** 副本挂机id */
    MISSIONHOOK(12),
    /** 占用位数的id */
    CHARID(13),
    /** 好友id */
    FRIENDID(14),
    /** 好友id */
    MAILID(15),
    /** vipid */
    VIPID(16),
    /** rankid */
    RANKID(17),
    /** vimid */
    VIMID(18),
    /** 玩家信息id */
    USERRECORD(19),
    /** 玩家友情信息ID */
    USERFRIENDPOINT(20),
    /** 退出原因ID */
    EXITREASONID(21),
    /** 武将附身ID */
    PETPOSSESSEDID(22),
    /**全服补偿用户ID */
    COMPENSATIONUSERID(23),
    /**聚宝盆ID */
    TREASUREBOWLID(24),
	/** 武将PVP的UUID */
    PETPVP(25),
    /** 武将PVP奖励的UUID */
    PETPVPRANKBONUS(26),

    /** 活跃度*/
    LIVENESSID(27),

    /**世界bossID */
    HUMANWORLDBOSSID(28),
    
    /**每周登陆奖励 */
    WEEKLOGINBYUSERID(29),
    /** 玩家离线组队信息ID */
    USEROFFLINETEAM(30),
    /** 神秘商店ID */
    USERMYSTERYMALLID(31),
    /** 武将图鉴 */
    PETBOOKID(32),
    /** 过关斩将挂机的UUID */
    CUTPETHOOK(33),
    /** 玩家活动数据的UUID */
    HUMANACTIVITYID(34),
    /** 玩家消费明细UUID */
    CONSUMEDETAILID(35),
    /**玩家天书数据的UUID*/
    HUMANGODBOOKID(36),
    /**无尽副本数据的UUID*/
    ENDLESSMISSIONID(37),
    /**武将招募积分*/
    PETPUBSCOREID(38),
    /** 玩家奖励信息ID */
    USERFRIENDAWARD(39),
;

	private final int index;
	/** 按索引顺序存放的枚举数组 */
	private static final List<UUIDType> values = IndexedEnumUtil.toIndexes(UUIDType.values());

	/**
	 * 
	 * @param index
	 *            枚举的索引,从0开始
	 */
	private UUIDType(int index)
	{
		this.index = index;
	}

	@Override
	public int getIndex() 
	{
		return this.index;
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
