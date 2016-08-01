package com.ancun.boss.persistence.mapper;

import com.ancun.boss.persistence.model.DupPhoneRep;
import com.ancun.boss.persistence.model.DupPhoneRepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DupPhoneRepMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DUP_PHONE_REP
     *
     * @mbggenerated
     */
    int countByExample(DupPhoneRepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DUP_PHONE_REP
     *
     * @mbggenerated
     */
    int deleteByExample(DupPhoneRepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DUP_PHONE_REP
     *
     * @mbggenerated
     */
    int insert(DupPhoneRep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DUP_PHONE_REP
     *
     * @mbggenerated
     */
    int insertSelective(DupPhoneRep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DUP_PHONE_REP
     *
     * @mbggenerated
     */
    List<DupPhoneRep> selectByExample(DupPhoneRepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DUP_PHONE_REP
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DupPhoneRep record, @Param("example") DupPhoneRepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DUP_PHONE_REP
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DupPhoneRep record, @Param("example") DupPhoneRepExample example);
}