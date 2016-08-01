package com.ancun.boss.business.persistence.mapper;

import com.ancun.boss.business.persistence.module.BizComboInfo;
import com.ancun.boss.business.persistence.module.BizComboInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizComboInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    int countByExample(BizComboInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    int deleteByExample(BizComboInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    int insert(BizComboInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    int insertSelective(BizComboInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    List<BizComboInfo> selectByExample(BizComboInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    BizComboInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BizComboInfo record, @Param("example") BizComboInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BizComboInfo record, @Param("example") BizComboInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BizComboInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BIZ_COMBO_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BizComboInfo record);
}