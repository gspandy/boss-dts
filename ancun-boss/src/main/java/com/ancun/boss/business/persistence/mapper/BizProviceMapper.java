package com.ancun.boss.business.persistence.mapper;

import com.ancun.boss.business.persistence.module.BizProvice;
import com.ancun.boss.business.persistence.module.BizProviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizProviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_PROVICE
     *
     * @mbggenerated
     */
    int countByExample(BizProviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_PROVICE
     *
     * @mbggenerated
     */
    int deleteByExample(BizProviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_PROVICE
     *
     * @mbggenerated
     */
    int insert(BizProvice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_PROVICE
     *
     * @mbggenerated
     */
    int insertSelective(BizProvice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_PROVICE
     *
     * @mbggenerated
     */
    List<BizProvice> selectByExample(BizProviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_PROVICE
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BizProvice record, @Param("example") BizProviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_PROVICE
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BizProvice record, @Param("example") BizProviceExample example);
}