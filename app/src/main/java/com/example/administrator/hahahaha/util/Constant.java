package com.example.administrator.hahahaha.util;

/**
 * 常量
 *
 * @author rongbei
 */
public class Constant {
    ////************************************线上环境***begin************************************************************
    /**
     * 线上环境URL
     */
//    public static final String URL = "https://api.irongbei.com/";
    public static final String URL = "https://www.irongbei.com/";
    public static final String TIME_URL = "https://static.irongbei.com/Index/getTime";//线上环境，时间链接
//////**********************************线上环境******end*************************************************************

////**********************************测试环境******begin*************************************************************
//    /**
//     * 测试环境URL
    //     */
//    public static final String URL = "http://testhf.irongbei.com/";
//    public static final String TIME_URL = "http://testhf.irongbei.com/";//测试环境，时间链接
//*********************************测试环境*****end***************************************************************
    /**
     * 线上环境服务器地址 》》网络协议：https
     */
    public static final String SERVER_IP = Constant.URL + "AppApi4/";

    //-----------------------------------------------------页面监听跳转---------------------------------------------begin
    public static final String JIAN_BEI_KE = Constant.URL + Constant.M_FUDAI;//"https://www.irongbei.com/Spread/mfudai";//捡贝壳分享链接
    public static final String TO_LIST = Constant.URL + Constant.NOT_OT_P_LIST;//"https://www.irongbei.com/AppStatics/noToT#plist";// 跳转到：出借列表
    public static final String TO_CHARGE = Constant.URL + Constant.NOT_OT_CHARGE;//"https://www.irongbei.com/AppStatics/noToT#charge";//  跳转到：确认购买页面（从哪进回哪去）
    public static final String TO_INVEST_LIST = Constant.URL + Constant.NOT_OT_INTEST_LIST;//"https://www.irongbei.com/AppStatics/noToT#investList";//跳转到：出借记录

    public static final String M_FUDAI = "Spread/mfudai";
    public static final String NOT_OT_P_LIST = "AppStatics/noToT#plist";
    public static final String NOT_OT_CHARGE = "AppStatics/noToT#charge";
    public static final String NOT_OT_INTEST_LIST = "AppStatics/noToT#investList";
    //-----------------------------------------------------页面监听跳转---------------------------------------------end

    //APIName---------------------------------------begin-----
    /**
     * key前缀
     */
    public static final String KEY_PREFIXION = "RongbeiAppApi";
    /**
     * 登录
     */
    public static final String CHECK_USER = "checkUser";
    /**
     * 修改登录密码
     */
    public static final String UPDATE_PWD = "updateLoginPass";
    /**
     * 充值入口页
     */
    public static final String CHARGE_CONFIRM = "chargeConfirm";
    /**
     * 汇付充值页面
     */
    public static final String CREATE_CHARGE = "createCharge";
    /**
     * 注册验证码
     */
    public static final String GET_MESSAGE = "getMessage";
    /**
     * 生成债权项目
     */
    public static final String CREATE_ASSIGN = "createAssign";


    public static final String CREATE_USER = "createUser";
    /**
     * 奖励管理
     */
    public static final String GET_REWARD_LIST = "getRewardlist";
    /**
     * 记录用户提交的省市信息
     */
    public static final String RECORDS_FEEDBACK_ADDRESS = "recordsFeedbackAddress";
    /**
     * 我的出借
     */
    public static final String INVEST_LIST = "investList";
    /**
     * 分享许愿后处理
     */
    public static final String SHARE_HANDLE = "shareHandle";
    /**
     * 许愿池首页
     */
    public static final String GET_WISH_DATA = "getWishData";
    /**
     * 我的出借---债转
     */
    public static final String ASSIGN_DATA_LIST = "assignDataList";
    /**
     * 积分兑换记录
     */
    public static final String INTEGRAL_EXCHANGE_LOG_GET = "integralExchangeLogGet";
    /**
     * 优惠券
     */
    public static final String VOUCHER_LIST = "voucherList";
    /**
     * 收益
     */
    public static final String GET_EXPECT_MOENY = "getExpectMoney";
    /**
     * 获取总收益总出借 修改注释  by----付坤---20160512
     */
    public static final String GET_COUNT = "getCount";
    /**
     * 我的账户
     */
    public static final String GET_ACCOUNT = "getAccount";
    /**
     * 捡贝壳红点
     */
    public static final String RED_DOT_SHOW = "redDotShow";
    /**
     * 意见反馈
     */
    public static final String GET_FEED_BACK = "getFeedback";
    /**
     * 邀请好友
     */
    public static final String INVITE_INFO = "inviteInfo";
    /**
     * 已登录用户许愿
     */
    public static final String ADD_WISH_DATA_ONE = "addWishDataOne";
    /**
     * 未登录用户许愿
     */
    public static final String ADD_WISH_DATA_TWO = "addWishDataTwo";

    /**
     * 出借者联盟
     */
    public static final String LEAGUE_HOME = "leagueHome";
    /**
     * 联盟换一批
     */
    public static final String LEAGUE_LIST = "leagueList";
    /**
     * 联盟排行
     */
    public static final String LEAGUE_WELFARE = "leagueWelfare";
    /**
     * 联盟进阶任务
     */
    public static final String LEAGUE_STAGE_REWARD = "leagueStageReward";
    /**
     * 联盟进阶任务
     */
    public static final String LEAGUE_MEMBER = "leagueMember";
    /**
     * 个人信息
     */
    public static final String USER_MESSAGE_GET = "userMessageGet";
    /**
     * 捡贝壳规则
     */
    public static final String JIAN_QIAN_RULE = "jianQianRule";
    /**
     * 积分明细
     */
    public static final String MY_INTEGRAL = "myIntegral";
    /**
     * 折让金
     */
    public static final String ASSIGN_STEP_ONE = "assignStepOne";
    /**
     * 收货地址
     */
    public static final String USER_ADDRESS_UPDATE = "userAddressUpdate";
    /**
     * 收货地址
     */
    public static final String USER_UPDATE_LOGIN_PASS = "updateLoginPass";
    /**
     * 绑定邮箱
     */
    public static final String USER_EMAIL_SENT = "userEmailSent";
    /**
     * 开户
     */
    public static final String CREATE_HF_USER = "createHfUser";

    /**
     * 捡贝壳
     */
    public static final String Jian_BK = "jianQian";
    /**
     * 消息列表
     */
    public static final String MSG_LIST = "msgList";
    /**
     * 消息详情
     */
    public static final String MSG_CONTENT = "msgContent";
    /**
     * 将一条消息标记为已读
     */
    public static final String UPDATE_MSG = "updateMsg";
    /**
     * 获取app版本号
     */
    public static final String GET_VESION = "getVesion";
    /**
     * 提现入口页
     */
    public static final String DISCHARGE_CONFIRM = "dischargeConfirm";
    /**
     * 汇付提现页面
     */
    public static final String CREATE_DISCHARGE = "createDischarge";
    /**
     * 标准化
     */
    public static final String JX_USER_AUTO_AUTHSTART = "jxUserAutoAuthStart";

    /**
     * 查卡接口
     */
    public static final String GET_BANKS = "getBanks";
    /**
     * 绑卡接口
     */
    public static final String CREATE_BANK = "createBanks";
    /**
     * 删卡接口
     */
    public static final String DEL_BANK = "delBanks";
    /**
     * 获取bunder
     */
    public static final String GET_BUNDER = "getBanner";
    /**
     * 获取联系方式
     */
    public static final String GET_CONTACT = "getContact";
    /**
     * 积分商城bunder
     */
    public static final String SHOP_BANNER = "shopBanner";
    /**
     * 获取图片接口
     */
    public static final String GET_IMG = "getImg";
    /**
     * 收益走势（折线图）
     */
    public static final String GAINS_CHART = "gainsChart";
    /**
     * 商品列表
     */
    public static final String PRODUCT_LIST = "integralMallClassGetList";


    /**
     * 查询用户出借记录
     */
    public static final String ACCOUNT_LIST = "accountList";
    /**
     * 商品详情
     */
    public static final String PRODUCT_DETAIL = "integralMallGoodsDetail";


    public static final String WEB_AD_LIST = "webAdList";
    /**
     * 获取项目列表
     */
    public static final String GET_PROJECT_LIST = "getPlist";
    /**
     * 获取项目详情
     */
    public static final String GET_PROJECT_DETAIL = "getPdetail";
    /**
     * 出借确认页信息
     */
    public static final String INVEST_CONFIRM = "investConfirm";
    /**
     * 使用优惠券
     */
    public static final String USER_VOUCHER = "useVoucher";
    /**
     * 出借_点击确认出借按钮后跳转至汇付出借页面
     */
    public static final String CREATE_INVEST = "createInvest";
    /**
     * 邀请活动规则
     */
    public static final String URL_INVITE = "WeiXinUserCenter/inviterules?from=app";
    /**
     * 安全认证
     */
    public static final String URL_SAFE = "MCommon/help?diff=safe";
    /**
     * 常见问题
     */
    public static final String URL_QUESTION = "MCommon/help?diff=question";
    /**
     * 充值提现
     */
    public static final String URL_ON_MONEY = "MCommon/help?diff=onmoney";
    /**
     * 积分
     */
    public static final String URL_POINTS = "MCommon/help?diff=points";
    /**
     * 新手出借
     */
    public static final String URL_NEWBIE = "MCommon/help?diff=newbie";
    /**
     * 收益与费用
     */
    public static final String URL_YIELID = "MCommon/help?diff=yielid";
    /**
     * 债权转让
     */
    public static final String URL_ASSIGN = "MCommon/help?diff=assign";
    /**
     * 注册登陆
     */
    public static final String URL_ABOUTUSER = "MCommon/help?diff=aboutuser";
    /**
     * 资金托管
     */
    public static final String URL_DEPOSIT = "MCommon/help?diff=deposit";
    /**
     * 安全保障
     */
    public static final String URL_PROTECT_MONEY = "MCommon/protectMoney";
    /**
     * 注册协议
     */
    public static final String MUSER_REGISTER = "MUserRegister/agreement?from=app";
    /**
     * 了解融贝
     */
    public static final String URL_ABOUT_RB = "MCommon/aboutRB";
    /**
     * 小司聊
     */
    public static final String URL_FINANCE = "MCommon/finance";
    /**
     * 充值页面 银行卡限额说明
     */
    public static final String BANK_LIMIT = "MUserCenter/jxlimitbank?from=app";
    /**
     * 开户和绑卡页面  银行卡限额说明
     */
    public static final String BANK_LIMIT_2 = "MUserCenter/jxlimitbank?from=app&isbind=1";
    /**
     * 开户页面三方协议链接
     */
    public static final String JX_THREE_AGREEMENT = "MCommon/jxthreeagreement?form=app";
    /**
     * webView监听，打开用户中心“我的”
     */
    public static final String TO_USERCENTER = Constant.URL + "MUserCenter/index?from=app";
    /**
     * 项目详情跳转H5”
     */
    public static final String GET_PROJECT_DETAIL_H5 = "MCommon/getProjectDetail?pid=";

    /**
     * 债转列表
     */
    public static final String ASSIGN_LISTS = "assignLists";
    /**
     * 获取债权详情
     */
    public static final String ASSIGN_DETAIL = "assignDetail";
    /**
     * 债权出借确认
     */
    public static final String ASSIGN_OK = "assignOk";
    /**
     * 获取服务器时间戳,服务器状态
     */
    public static final String GET_TIMESTAMP = "getTime";
    /**
     * 债权购买
     */
    public static final String ASSIGN_BUY = "assignBuy";
    /**
     * 项目出借记录页
     */
    public static final String GET_PROJECT_INVEST_LIST = "getPInvestList";

    /**
     * 合同预览
     */
    public static final String PREVIEW_PACT = "previewPact";
    /**
     * 合同
     */
    public static final String FORMAL_PACT = "formalPact";


    /**
     * 收益计算
     */
    public static final String COMPUTE_INCOME = "computeIncome";
    /**
     * 确认兑换 页面地址
     */
    public static final String EXCHANGE_ADDRESS = "integralGoodsExchangeVerify";
    /**
     * 兑换 提交订单
     */
    public static final String EXCHANGE = "integralGoodsExchangeIng";
//    /**
//     * 小司聊
//     */
//    public static final String XIAO_SI = "http://testhf.irongbei.com/MCommon/finance";

    /**
     * 收款计划(日历)
     */
    public static final String INCOME_LIST = "incomeList";
    /**
     * 商品详情（获取积分）
     */
    public static final String DETAIL_JIFEN = "integralMallIndex";
    /**
     * 了解融贝的分享地址
     */
    public static final String ABOUT_RONGBEI_SHARE = "MUserRegister/registerspread";
    /**
     * 什么是银行存管
     */
    public static final String JXBANK_SPECIAL_ASPX = "MCommon/jxBankSpecialAspx";
    /**
     * 银行卡限额说明
     */
    public static final String JX_LIMIT_BANK = "MUserCenter/jxlimitbank?from=app";
    /**
     * 分享增加捡贝壳次数
     */
    public static final String SHARED_ADD_TIME = "sharedAddTime";
    /**
     * 通讯录对比
     */
    public static final String ADDRESS_LIST = "addressList";
    /**
     * 创建联盟
     */
    public static final String CREATE_LEAGUE = "createLeague";
    /**
     * 修改联盟公告
     */
    public static final String UPDATE_LEAGUE_NOTICE = "updateLeagueNotice";

    /**
     * 发送组队邀请
     */
    public static final String TEAM_ASK = "teamAsk";
    /**
     * 动态处理 (同意)
     */
    public static final String DYNAMIC_HANDLE = "dynamicHandle";
    /**
     * 联盟详情
     */
    public static final String LEAGUE_DETAIL = "leagueDetail";
    /**
     * 我的动态
     */
    public static final String MY_Dynamic = "myDynamic";
    /**
     * 进阶任务奖励领取
     */
    public static final String REWARD_RECEIVE = "rewardReceive";

    /**
     * 成员操作（退出联盟 解散联盟 删除成员）
     */
    public static final String MEMBER_OPERATION = "memberOperation";
    /**
     * 联盟转让
     */
    public static final String CHANGE_LEAGUE_USER = "changeLeagueUser";
    /**
     * 司聊文章列表
     */
    public static final String GETSiLiao_ArticleList = "getSiliaoArticlesList";
    /**
     * 司聊分享中奖
     */
    public static final String SHARE_GETSPEAR = "shareGetSpear";
    /**
     * 开通江西银行存管
     */
    public static final String JXBANK_OPEN_ACCOUNT = "jxBankOpenAccount";
    /**
     * 设置交易密码手机验证
     */
    public static final String JXBANK_SET_PSW = "TradePassWordHandle";

    /**
     * 账户激活-----江西银行-----
     */
    public static final String ACTIVATION_ACCOUNT = "activationAccount";
    /**
     * 汇付资金迁移
     */
    public static final String MIGRATION_MONEY = "migrationMoney";
    /**
     * 联行号入口页 获取省市联动
     */
    public static final String GET_DISCHARGE_PRCTY = "getDischagePrcty";
    /**
     * 获取联行号列表
     */
    public static final String GET_BANK_CNAPS = "getCardBankCnaps";
    /**
     * 江西银行发送手机验证码
     */
    public static final String GET_JXBANK_MOBILE_CODE = "getJxBankMobileCode";

    public static final String REFRESH_DIFFRENCE_MONEY = "refreshDiffrenceMoney";
    /**
     * 获取用户汇付开户信息
     */
    public static final String GET_USER_HF_INFO = "getUserHfInfo";
    /**
     * 联盟排名
     */
    public static final String LEAGUE_RANKING = "leagueRanking";
    /**
     * 用户--跳过风险测评
     */
    public static final String LATER_RISK_SCORE = "laterRiskScore";
    /**
     * 风险测评
     */
    public static final String SURVER_MRISKSCORE = "Survey/mriskscore?app=android";
    /**
     * 金运通充值短信
     */
    public static final String CREATE_JYT_CHARGE = "createJytCharge";
    /**
     * 邀请好友
     */
    public static final String INVITE_FRIEND = "InviteFriends/mindex?from=android";


    //APIName---------------------------------------end-----

    // ------------------------网络状态 begin----------------------
    /**
     * 网络查询成功,获取时间戳成功
     */
    public static final int NETWORK_MEG_WHAT_SUCCESS_0 = 0;// 查询成功
    /**
     * 网络查询失败
     */
    public static final int NETWORK_FAILURE_1 = 1;// 查询失败
    /**
     * 网络错误
     */
    public static final int NETWORK_FAILURE_2 = 2;// 网络错误
    /**
     * 网络超时错误
     */
    public static final int NETWORK_FAILURE_3 = 3;// 网络错误
    /**
     * 网络查询失败 的信息
     */
    public static final String NETWORK_MEG_FAILURE = "errorMsg";
    /**
     * 网络查询成功 的信息
     */
    public static final String NETWORK_MEG_SUCCESS = "successMsg";

    public static final String NETWORK_RESPONSE_MSG = "responseMsg";
    public static final String NETWORK_ERROR_RESULT = "errorResult";
    public static final String NETWORK_OTHER = "Other";
    /**
     * 活动推广免登录并跳转至活动页
     */
    public static final String NO_LOGIN_FOR_HD = "userNoLoginForHd";
    // ------------------------网络状态 end------------------------


    // -------------------------SP存储键值-begin---------------------------
    /**
     * 用户名
     */

    public static final String RONGBEIWANG_APP_CONTENT_1 = "RONGBEIWANG_APP_CONTENT_1";
    /**
     * 密码
     */
    public static final String RONGBEIWANG_APP_CONTENT_2 = "RONGBEIWANG_APP_CONTENT_2";
    /**
     * 是否第一次登陆
     */
    public static final String RONGBEIWANG_APP_CONTENT_0 = "RONGBEIWANG_APP_CONTENT_0";
    /**
     * 用户id
     */
    public static final String RONGBEIWANG_APP_CONTENT_3 = "RONGBEIWANG_APP_CONTENT_3";
    /**
     * 是否开通汇付
     * <p>
     * /已开户 1   没有开户0  没有开户则显示开户界面
     */

    public static final String RONGBEIWANG_APP_CONTENT_4 = "RONGBEIWANG_APP_CONTENT_4";
    /**
     * 真实姓名
     */
    public static final String RONGBEIWANG_APP_CONTENT_6 = "RONGBEIWANG_APP_CONTENT_6";
    /**
     * 资产总额
     */
    public static final String RONGBEIWANG_APP_CONTENT_7 = "RONGBEIWANG_APP_CONTENT_7";
    /**
     * 待收本金
     */
    public static final String RONGBEIWANG_APP_CONTENT_8 = "RONGBEIWANG_APP_CONTENT_8";
    /**
     * 待收利息
     */
    public static final String RONGBEIWANG_APP_CONTENT_9 = "RONGBEIWANG_APP_CONTENT_9";
    /**
     * 奖励金额
     */
    public static final String RONGBEIWANG_APP_CONTENT_10 = "RONGBEIWANG_APP_CONTENT_10";
    /**
     * 账户余额
     */
    public static final String RONGBEIWANG_APP_CONTENT_11 = "RONGBEIWANG_APP_CONTENT_11";
    /**
     * 累计实现收益
     */
    public static final String RONGBEIWANG_APP_CONTENT_12 = "RONGBEIWANG_APP_CONTENT_12";
    /**
     * 累计出借
     */
    public static final String RONGBEIWANG_APP_CONTENT_13 = "RONGBEIWANG_APP_CONTENT_13";
    /**
     * 未读消息条数
     */
    public static final String RONGBEIWANG_APP_CONTENT_14 = "RONGBEIWANG_APP_CONTENT_14";
    /**
     * 预计收益处展示类型
     */
    public static final String RONGBEIWANG_APP_CONTENT_15 = "RONGBEIWANG_APP_CONTENT_15";
    /**
     * 预计收益处描述
     */
    public static final String RONGBEIWANG_APP_CONTENT_16 = "RONGBEIWANG_APP_CONTENT_16";
    /**
     * 预计收益处金额
     */
    public static final String RONGBEIWANG_APP_CONTENT_17 = "RONGBEIWANG_APP_CONTENT_17";
    /**
     * 最近收款日期
     */
    public static final String RONGBEIWANG_APP_CONTENT_18 = "RONGBEIWANG_APP_CONTENT_18";
    /**
     * 预计可用积分
     */
    public static final String RONGBEIWANG_APP_CONTENT_19 = "RONGBEIWANG_APP_CONTENT_19";
    /**
     * 汇付ID
     */
    public static final String RONGBEIWANG_APP_CONTENT_20 = "RONGBEIWANG_APP_CONTENT_20";
    /**
     * 收货地址--姓名
     */
    public static final String RONGBEIWANG_APP_CONTENT_21 = "RONGBEIWANG_APP_CONTENT_21";
    /**
     * 收货地址--手机号
     */
    public static final String RONGBEIWANG_APP_CONTENT_22 = "RONGBEIWANG_APP_CONTENT_22";
    /**
     * 收货地址--详细地址
     */
    public static final String RONGBEIWANG_APP_CONTENT_23 = "RONGBEIWANG_APP_CONTENT_23";
    /**
     * 收货地址--邮编
     */
    public static final String RONGBEIWANG_APP_CONTENT_24 = "RONGBEIWANG_APP_CONTENT_24";
    /**
     * 总融资金额
     */
    public static final String RONGBEIWANG_APP_CONTENT_25 = "RONGBEIWANG_APP_CONTENT_25";
    /**
     * 总出借收益
     */
    public static final String RONGBEIWANG_APP_CONTENT_26 = "RONGBEIWANG_APP_CONTENT_26";
    /**
     * 安全运行天数
     */
    public static final String RONGBEIWANG_APP_CONTENT_27 = "RONGBEIWANG_APP_CONTENT_27";
    /**
     * 待收总额
     */
    public static final String RONGBEIWANG_APP_CONTENT_28 = "RONGBEIWANG_APP_CONTENT_28";
    /**
     * 用户邀请码
     */
    public static final String RONGBEIWANG_APP_CONTENT_29 = "RONGBEIWANG_APP_CONTENT_29";
    /**
     * 联盟ID
     */
    public static final String RONGBEIWANG_APP_CONTENT_30 = "RONGBEIWANG_APP_CONTENT_30";
    /**
     * 是否在贝粉联盟活动内
     */
    public static final String RONGBEIWANG_APP_CONTENT_31 = "RONGBEIWANG_APP_CONTENT_31";
    /**
     * 江西银行存管 jx_user_status 状态（用户状态） 0 错误 1 新用户(没有江西银行账户) 2 已开户无余额未激活的用户  3 已开户有余额未激活用户 4已开户已激活的用户
     */
    public static final String RONGBEIWANG_APP_CONTENT_32 = "RONGBEIWANG_APP_CONTENT_32";
    /**
     * 江西银行存管 user_status_code 状态（账户状态） 0未开户 1未绑卡 2 未设置交易密码 3正常
     */
    public static final String RONGBEIWANG_APP_CONTENT_33 = "RONGBEIWANG_APP_CONTENT_33";
    /**
     * 用户手机号
     */
    public static final String RONGBEIWANG_APP_CONTENT_34 = "RONGBEIWANG_APP_CONTENT_34";
    /**
     * 捡贝壳是否有红点
     */
    public static final String RONGBEIWANG_APP_CONTENT_35 = "RONGBEIWANG_APP_CONTENT_35";
    /**
     * 广告图片地址
     */
    public static final String ADVERT_IMG_URL = "imgurl";
    /**
     * 广告图片跳转地址
     */
    public static final String ADVERT_RET_URL = "returl";
    //付坤----21060605----
    public static final String RONGBEIWANG_APP_CONTENT_MSTR = "mstr";

    // -------------------------SP存储键值-end-----------------------------
    public static final String RONGBEIWANG_APP_CONTENT_5 = "BC265AB8A11423851F9AEEB384E4457120EFB6165E96";


    //----------------------页面跳转来源标识---------------begin-----------------------------
    public static final String WHERE_FROM = "whereFrom";
    /**
     * 来源标识：首页、用户中心
     */
    public static final int WHERE_FROM_HOMEPAGE = 0;
    /**
     * 来源标识：直投详情，直投计算器
     */
    public static final int WHERE_FROM_DETAIL_ZT = 1;
    /**
     * 来源标识：债转详情，债转详情
     */
    public static final int WHERE_FROM_DETAIL_ZZ = 2;
    //----------------------页面跳转来源标识---------------end-----------------------------

    //------------------------webview监听链接---------------begin------------

    /**
     * 去绑卡监听链接
     */
    public static final String NOTOT_CREATE_BANK = Constant.URL + "AppStatics/noToT#createBanks";
    /**
     * 去设置交易密码监听链接
     */
    public static final String NOTOT_SET_TRADE_PASSWORD = Constant.URL + "AppStatics/noToT#setTradePassWord";

    /**
     * app投标 债转忘记密码链接  江西银行“忘记密码”监听一下跳转到app修改交易密码页
     */
    public static final String NOTOT_FORGET_PASSWORD = Constant.URL + "AppStatics/noToT#forgetPassWord";
    /**
     * 司聊
     */
    public static final String M_COMMON_FINANCE = Constant.URL + "MCommon/finance";

    public static final String NOTO_ACCOUNT = Constant.URL + "AppStatics/noToT#account";
//------------------------webview监听链接---------------end------------
    //司聊--------------begin-----------------------
    /**
     * 司聊type——1
     */
    public static final String SILIAO_CLASSROM_TYPE_1 = Constant.URL + "MCommon/siliaoClassroom?type=1&form=app";
    /**
     * 司聊type——2
     */
    public static final String SILIAO_CLASSROM_TYPE_2 = Constant.URL + "MCommon/siliaoClassroom?type=2&form=app";
    /**
     * 司聊type——3
     */
    public static final String SILIAO_CLASSROM_TYPE_3 = Constant.URL + "MCommon/siliaoClassroom?type=3&form=app";
    /**
     * 司聊更多分享
     */
    public static final String SILIAO_CLASSROM_MORE = Constant.URL + "MCommon/siliaoClassroom?type=1";
    //司聊--------------end-----------------------

    public static final String WISH_URL = "BeiFenWish/mindex";//许愿池
    public static final String RANK_URL = "images_wps/new_images/m_beifen_img/lrule.png";//联盟

    /**
     * 自动出借协议
     */
    public static final String INVEST_AGREEMENT = Constant.URL + "AppStatics/investAgreement?isapp=app";
    /**
     * 债转签约协议
     */
    public static final String ASSIGN_AGREEMENT = Constant.URL + "AppStatics/assignAgreement?isapp=app";

}
