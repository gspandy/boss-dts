package com.ancun.boss.business.persistence.mapper;

import com.ancun.boss.business.persistence.module.BizUserLifeCircle;
import com.ancun.boss.business.persistence.module.BizUserLifeCircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizUserLifeCircleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_LIFE_CIRCLE
     *
     * @mbggenerated
     */
    int countByExample(BizUserLifeCircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_LIFE_CIRCLE
     *
     * @mbggenerated
     */
    int deleteByExample(BizUserLifeCircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_LIFE_CIRCLE
     *
     * @mbggenerated
     */
    int insert(BizUserLifeCircle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_LIFE_CIRCLE
     *
     * @mbggenerated
     */
    int insertSelective(BizUserLifeCircle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_LIFE_CIRCLE
     *
     * @mbggenerated
     */
    List<BizUserLifeCircle> selectByExample(BizUserLifeCircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_LIFE_CIRCLE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BizUserLifeCircle record, @Param("example") BizUserLifeCircleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_USER_LIFE_CIRCLE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BizUserLifeCircle record, @Param("example") BizUserLifeCircleExample example);
}