package com.ancun.boss.persistence.mapper;

import com.ancun.boss.persistence.model.CalledVoiceZip;
import com.ancun.boss.persistence.model.CalledVoiceZipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CalledVoiceZipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    int countByExample(CalledVoiceZipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    int deleteByExample(CalledVoiceZipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    int insert(CalledVoiceZip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    int insertSelective(CalledVoiceZip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    List<CalledVoiceZip> selectByExample(CalledVoiceZipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    CalledVoiceZip selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CalledVoiceZip record, @Param("example") CalledVoiceZipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CalledVoiceZip record, @Param("example") CalledVoiceZipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CalledVoiceZip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CALLED_VOICE_ZIP
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CalledVoiceZip record);
}