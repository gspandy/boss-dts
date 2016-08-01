package com.ancun.boss.persistence.mapper;

import com.ancun.boss.persistence.model.UserWorkOrderExchangeDetailInfo;
import com.ancun.boss.persistence.model.UserWorkOrderExchangeDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWorkOrderExchangeDetailInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    int countByExample(UserWorkOrderExchangeDetailInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(UserWorkOrderExchangeDetailInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    int insert(UserWorkOrderExchangeDetailInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    int insertSelective(UserWorkOrderExchangeDetailInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    List<UserWorkOrderExchangeDetailInfo> selectByExample(UserWorkOrderExchangeDetailInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    UserWorkOrderExchangeDetailInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserWorkOrderExchangeDetailInfo record, @Param("example") UserWorkOrderExchangeDetailInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserWorkOrderExchangeDetailInfo record, @Param("example") UserWorkOrderExchangeDetailInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserWorkOrderExchangeDetailInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_WORK_ORDER_EXCHANGE_DETAIL_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserWorkOrderExchangeDetailInfo record);
}