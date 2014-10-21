package com.common.constants;

import com.core.annotation.SysI18nString;

/**
 * 语言相关的常量定义
 * 
 * @author Thinker
 * 
 */
public class LangConstants {

	@SysI18nString(content = "")
	public static final Integer NULL = 0;

	/** 公用常量 1 ~ 10000 */
	public static Integer COMMON_BASE = 0;
	@SysI18nString(content = "[f6d2a0]{0}为空[-]", comment = "{0}角色名或宠物名或签名")
	public static final Integer GAME_INPUT_NULL = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]{0}最小长度为{1}个字符[-]", comment = "{0}角色名或宠物名或签名,{1}为长度")
	public static final Integer GAME_INPUT_TOO_SHORT = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]{0}最大长度为{1}个字符[-]", comment = "{0}角色名或宠物名或签名,{1}为长度")
	public static final Integer GAME_INPUT_TOO_LONG = ++COMMON_BASE;
	@SysI18nString(content = "[ff0000]{0}包含异常字符[-]", comment = "{0}输入项")
	public static final Integer GAME_INPUT_ERROR1 = ++COMMON_BASE;
	@SysI18nString(content = "[ff0000]{0}包含屏蔽字符[-]", comment = "{0}输入项")
	public static final Integer GAME_INPUT_ERROR2 = ++COMMON_BASE;
	@SysI18nString(content = "[ff0000]{0}包含非法字符[-]", comment = "{0}输入项")
	public static final Integer GAME_INPUT_ERROR3 = ++COMMON_BASE;
	@SysI18nString(content = "角色名")
	public static final Integer GAME_INPUT_TYPE_CHARACTER_NAME = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您获得了{0}个{1}[-]", comment = "{0}获得事物的个数{1}获得的事物名称")
	public static final Integer GET_SOMETHING = ++COMMON_BASE;
	@SysI18nString(content = "[ff0000]加载角色列表错误[-]")
	public static final Integer LOAD_PLAYER_ROLES = ++COMMON_BASE;
	@SysI18nString(content = "[ff0000]加载角色信息错误[-]")
	public static final Integer LOAD_PLAYER_SELECTED_ROLE = ++COMMON_BASE;
	@SysI18nString(content = "确定")
	public static final Integer OK = ++COMMON_BASE;
	@SysI18nString(content = "取消")
	public static final Integer CANCEL = ++COMMON_BASE;
	@SysI18nString(content = "[ff0000]您的账号存在异常[-]")
	public static final Integer GM_KICK = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您的元宝不足,请充值后再进行此操作![-]")
	public static final Integer DIAMOND_NOT_ENOUGH = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您获得了[ffffff]{0}[-]银两[-]")
	public static final Integer GET_GOLD = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您获得了[ffffff]{0}[-]元宝[-]")
	public static final Integer GET_DIAMOND = ++COMMON_BASE;
	@SysI18nString(content = "[ff0000]您的友情点不足！[-]")
	public static final Integer FRIENDPOINT_NOT_ENOUGH = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]该功能尚未开启！！！[-]")
	public static final Integer FUNCTION_NOT_OPEN = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您获得了{0}战功[-]")
	public static final Integer GET_EXPLOIT = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您获得了{0}友情点[-]")
	public static final Integer GET_FRIENDPOINT = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您获得了{0}魂玉[-]")
	public static final Integer GET_SOUL = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您获得了{0}将魂[-]")
	public static final Integer GET_PETEXPPOOL = ++COMMON_BASE;
	@SysI18nString(content = "[ff0000]您的魂玉不足！[-]")
	public static final Integer SOUL_NOT_ENOUGH = ++COMMON_BASE;
	@SysI18nString(content = "[ff0000]您由于{0},被暂时禁言到{1}![-]")
	public static final Integer GM_FORBID_SPEEK = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您获得了{0}体力![-]")
	public static final Integer GM_VIM = ++COMMON_BASE;
	@SysI18nString(content = "{0}[-]")
	public static final Integer DEPICT_BY_COLOUR = ++COMMON_BASE;
	@SysI18nString(content = "[f6d2a0]您获得了{0}经验![-]")
	public static final Integer GM_EXP = ++COMMON_BASE;
	
	
	/** 道具、背包相关的常量 10001 ~ 13000 */
	public static Integer ITEM_BASE = 10000;
	@SysI18nString(content = "道具包")
	public static final Integer BAG_NAME_PRIM = ++ITEM_BASE;
	@SysI18nString(content = "装备槽上装备")
	public static final Integer BAG_NAME_SLOT_EQUIP = ++ITEM_BASE;
	@SysI18nString(content = "装备宝石背包")
	public static final Integer BAG_NAME_EQUIP_GEM = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]此道具当前不可用[-]")
	public static final Integer ITEM_NOT_AVAILABLE = ++ITEM_BASE;
	@SysI18nString(content = "[f6d2a0]已经没有额外的空间来放置该物品了[-]")
	public static final Integer ITEM_NOT_ENOUGH_SPACE = ++ITEM_BASE;
	@SysI18nString(content = "[f6d2a0]{0}中需要{1}个空位[-]", comment = "{0}需要腾出空间的包的名字{1}留出空位个数")
	public static final Integer ITEM_MAKE_SPACE = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]等级不够，无法装备[-]")
	public static final Integer ITEM_USEFAIL_LEVEL = ++ITEM_BASE;
	@SysI18nString(content = "[f6d2a0]阵营不符合要求[-]")
	public static final Integer ITEM_USEFAIL_ALLIANCE = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]该物品不存在[-]")
	public static final Integer ITEM_NOT_EXIST = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]您的{0}因过使用期限而被删除[-]", comment = "{0}道具名称")
	public static final Integer ITEM_DELETE_SINCE_EXPIRED = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]当前状态不可以拆分道具[-]")
	public static final Integer ITEM_CANNOT_SLIT = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]当前状态不可以丢弃道具[-]")
	public static final Integer ITEM_CANNOT_DROP_NOW = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]移动道具失败[-]")
	public static final Integer MOVE_ITEM_FAIL = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]绑定物品不可以出售[-]")
	public static final Integer CAN_NOT_SELL_FREEZE = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]您的等级不足[-]")
	public static final Integer ITEM_LEVEL_OVER_MAX_LEVEL = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]扣除元宝发言失败[-]")
	public static final Integer ITEM_SUONA__COST_DIAMOND_ERR = ++ITEM_BASE;
	@SysI18nString(content = "[f6d2a0]已使用{0}获得{1}点体力[-]")
	public static final Integer USEITEM_GIVE_VIM = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]武魂合成个数不够！[-]")
	public static final Integer PETSOUL_COMPOUSE_NO_ENOUGH = ++ITEM_BASE;
	@SysI18nString(content = "[f6d2a0]您获得武将{0}[-]")
	public static final Integer PETSOUL_COMPOUSE_PET_TIPS = ++ITEM_BASE;
	@SysI18nString(content = "[f6d2a0]当前神器为最大品阶[-]")
	public static final Integer GOD_EQUIP_IS_MAX_LEVEL = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]升阶材料不足[-]")
	public static final Integer GOD_EQUIP_COST_NOT_ENOUGH = ++ITEM_BASE;
	@SysI18nString(content = "[f6d2a0]您的{0}已成功进阶为{1}品质[-]")
	public static final Integer ADD_EQUIP_LEVEL_SUCC = ++ITEM_BASE;
	@SysI18nString(content = "[f6d2a0]您的{0}已经达到{1}品质或以上啦[-]")
	public static final Integer ADD_EQUIP_LEVEL_NOTOP_TIPS = ++ITEM_BASE;
	
	@SysI18nString(content = "[f6d2a0]当前武将已经是本职业，无需转职！[-]")
	public static final Integer TRANSFER_VOCATION_FAIL = ++ITEM_BASE;
	@SysI18nString(content = "[f6d2a0]转职成功[-]")
	public static final Integer TRANSFER_VOCATION_SUCC = ++ITEM_BASE;
	@SysI18nString(content = "[ff0000]信物转化成魂玉个数不够！[-]")
	public static final Integer PETSOUL_SOUL_NO_ENOUGH = ++ITEM_BASE;
	
	
	/** 装备强化开始 13001~14000 */
	public static Integer EQUIP_ENHANGCE_BASE = 13000;
	@SysI18nString(content = "[f6d2a0]强化等级已经满级[-]")
	public static final Integer EQUIP_ENHANCE_LEVEL_FULL = ++EQUIP_ENHANGCE_BASE;
	@SysI18nString(content = "[ff0000]系统错误,此装备无法强化[-]")
	public static final Integer EQUIP_ENHANCE_COST_CONFIG = ++EQUIP_ENHANGCE_BASE;
	@SysI18nString(content = "[f6d2a0]该装备已最高阶[-]")
	public static final Integer EQUIP_ADVANCED_LEVEL_FULL = ++EQUIP_ENHANGCE_BASE;
	@SysI18nString(content = "[ff0000]装备升阶数据错误！[-]")
	public static final Integer EQUIP_ADVANCED_DATA_ERROR = ++EQUIP_ENHANGCE_BASE;
	@SysI18nString(content = "[ff0000]装备升阶材料个数不够！[-]")
	public static final Integer EQUIP_ADVANCED_COSTITEM_NO_ENOUGH = ++EQUIP_ENHANGCE_BASE;
	@SysI18nString(content = "[f6d2a0]该装备已是真·装备[-]")
	public static final Integer EQUIP_IS_ADVANCED = ++EQUIP_ENHANGCE_BASE;
	@SysI18nString(content = "[f6d2a0]装备点化成功[-]")
	public static final Integer EQUIP_REVEAL_SUCC= ++EQUIP_ENHANGCE_BASE;
	
	/** 装备强化开始 14001~15000 */
	public static Integer EQUIP_EMBED_GEM_BASE = 16000;
	@SysI18nString(content = "[ff0000]镶嵌宝石装备不存在！[-]")
	public static final Integer EMBED_GEM_EQUIP_NO_EXIST = ++EQUIP_EMBED_GEM_BASE;
	@SysI18nString(content = "[ff0000]镶嵌宝石不存在！[-]")
	public static final Integer EMBED_GEM_GEM_NO_EXIST = ++EQUIP_EMBED_GEM_BASE;
	@SysI18nString(content = "[f6d2a0]装备镶嵌宝石孔无效[-]")
	public static final Integer EMBED_GEM_HOLEID_INVALID = ++EQUIP_EMBED_GEM_BASE;
	@SysI18nString(content = "[f6d2a0]装备宝石孔不存在宝石数据[-]")
	public static final Integer HOLEID_GEMDATA_NO_EXIST = ++EQUIP_EMBED_GEM_BASE;
	@SysI18nString(content = "[f6d2a0]宝石已经满级！[-]")
	public static final Integer GEM_ENHANCE_LEVEL_FULL = ++EQUIP_EMBED_GEM_BASE;
	@SysI18nString(content = "[ff0000]宝石数据错误！[-]")
	public static final Integer GEM_DATA_ERROR = ++EQUIP_EMBED_GEM_BASE;
	@SysI18nString(content = "[ff0000]升级宝石精华个数不够！[-]")
	public static final Integer UP_GEM_GEM_NO_ENOUGH = ++EQUIP_EMBED_GEM_BASE;
	@SysI18nString(content = "[ff0000]装备宝石孔不存在宝石[-]")
	public static final Integer HOLEID_GEM_NO_EXIST = ++EQUIP_EMBED_GEM_BASE;

	/** 货币相关的常量15000 ~ 20000 */
	public static Integer CURRENCY_BASE = 19000;
	@SysI18nString(content = "元宝")
	public static final Integer CURRENCY_NAME_DIAMOND = ++CURRENCY_BASE;
	@SysI18nString(content = "银两")
	public static final Integer CURRENCY_NAME_GOLD = ++CURRENCY_BASE;
	@SysI18nString(content = "点券")
	public static final Integer CURRENCY_NAME_COUPON = ++CURRENCY_BASE;
	@SysI18nString(content = "[ff0000]没有足够的银两[-]")
	public static final Integer GOLD_NOT_ENOUGH = ++CURRENCY_BASE;
	@SysI18nString(content = "木材")
	public static final Integer CURRENCY_NAME_WOOD = ++CURRENCY_BASE;
	@SysI18nString(content = "石料")
	public static final Integer CURRENCY_NAME_STONE = ++CURRENCY_BASE;
	@SysI18nString(content = "水晶")
	public static final Integer CURRENCY_NAME_CRYSTAL = ++CURRENCY_BASE;
	@SysI18nString(content = "特殊资源")
	public static final Integer CURRENCY_NAME_SPECIAL = ++CURRENCY_BASE;

	/** 人物相关的常量 20001 ~ 30000 */
	public static Integer HUMAN_BASE = 22000;
	@SysI18nString(content = "[f6d2a0]您已经绑定好友码[-]")
	public static final Integer HAS_BIND_FRIEND_CODE = ++HUMAN_BASE;
	@SysI18nString(content = "[ff0000]您输入的邀请码不正确，请重新输入[-]")
	public static final Integer FRIEND_CODE_NOTEXIST = ++HUMAN_BASE;
	@SysI18nString(content = "[f6d2a0]不可以输入自己的邀请码[-]")
	public static final Integer FRIEND_CODE_IS_MYSELF = ++HUMAN_BASE;
	/** 职业相关常量 71901 ~ 72200 */
	public static Integer ALLIANCE_BASE = 25000;
	@SysI18nString(content = "无阵营")
	public static final Integer ALLIANCE_LESS = ++ALLIANCE_BASE;

	
}