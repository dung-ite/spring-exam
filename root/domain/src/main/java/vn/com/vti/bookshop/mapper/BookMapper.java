package vn.com.vti.bookshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vn.com.vti.bookshop.entity.Book;
import vn.com.vti.bookshop.entity.BookExample;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    long countByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int deleteByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    List<Book> selectByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    Book selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.book
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int updateByPrimaryKey(Book record);
}