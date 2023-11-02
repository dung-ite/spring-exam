package vn.com.vti.bookshop.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.bookshop.entity.AlcoholCompany;
import vn.com.vti.bookshop.entity.AlcoholCompanyExample;

public interface AlcoholCompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    long countByExample(AlcoholCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    int deleteByExample(AlcoholCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    int insert(AlcoholCompany row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    int insertSelective(AlcoholCompany row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    List<AlcoholCompany> selectByExample(AlcoholCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    AlcoholCompany selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    int updateByExampleSelective(@Param("row") AlcoholCompany row, @Param("example") AlcoholCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    int updateByExample(@Param("row") AlcoholCompany row, @Param("example") AlcoholCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    int updateByPrimaryKeySelective(AlcoholCompany row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.alcohol_company
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    int updateByPrimaryKey(AlcoholCompany row);
}