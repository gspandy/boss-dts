package com.ancun.boss.persistence.mapper;

import com.ancun.boss.persistence.model.CostCalc;
import com.ancun.boss.persistence.model.CostCalcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostCalcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    int countByExample(CostCalcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    int deleteByExample(CostCalcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    int insert(CostCalc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    int insertSelective(CostCalc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    List<CostCalc> selectByExample(CostCalcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    CostCalc selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CostCalc record, @Param("example") CostCalcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CostCalc record, @Param("example") CostCalcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CostCalc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COST_CALC
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CostCalc record);
}