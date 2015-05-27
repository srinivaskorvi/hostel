package com.logistics.dao;

import com.logistics.model.Amenities;
import com.logistics.model.AmenitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmenitiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    int countByExample(AmenitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    int deleteByExample(AmenitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    int deleteByPrimaryKey(Short amenitiyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    int insert(Amenities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    int insertSelective(Amenities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    List<Amenities> selectByExample(AmenitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    Amenities selectByPrimaryKey(Short amenitiyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    int updateByExampleSelective(@Param("record") Amenities record, @Param("example") AmenitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    int updateByExample(@Param("record") Amenities record, @Param("example") AmenitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    int updateByPrimaryKeySelective(Amenities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    int updateByPrimaryKey(Amenities record);
}