package com.ancun.boss.persistence.mapper;

import com.ancun.boss.persistence.model.MarketDaily;
import com.ancun.boss.persistence.model.MarketDailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketDailyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    int countByExample(MarketDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    int deleteByExample(MarketDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    int insert(MarketDaily record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    int insertSelective(MarketDaily record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    List<MarketDaily> selectByExample(MarketDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    MarketDaily selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MarketDaily record, @Param("example") MarketDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MarketDaily record, @Param("example") MarketDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MarketDaily record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MARKET_DAILY
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MarketDaily record);
}