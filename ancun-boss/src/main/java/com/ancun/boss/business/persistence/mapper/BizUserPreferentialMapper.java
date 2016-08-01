package com.ancun.boss.business.persistence.mapper;

import com.ancun.boss.business.persistence.module.BizUserPreferential;
import com.ancun.boss.business.persistence.module.BizUserPreferentialExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizUserPreferentialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_PREFERENTIAL
     *
     * @mbggenerated
     */
    int countByExample(BizUserPreferentialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_PREFERENTIAL
     *
     * @mbggenerated
     */
    int deleteByExample(BizUserPreferentialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_PREFERENTIAL
     *
     * @mbggenerated
     */
    int insert(BizUserPreferential record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_PREFERENTIAL
     *
     * @mbggenerated
     */
    int insertSelective(BizUserPreferential record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_PREFERENTIAL
     *
     * @mbggenerated
     */
    List<BizUserPreferential> selectByExample(BizUserPreferentialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_PREFERENTIAL
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BizUserPreferential record, @Param("example") BizUserPreferentialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_PREFERENTIAL
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BizUserPreferential record, @Param("example") BizUserPreferentialExample example);
}