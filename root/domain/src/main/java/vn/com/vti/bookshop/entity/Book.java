package vn.com.vti.bookshop.entity;

import java.util.Date;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.book.id
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.book.book_name
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    private String bookName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.book.price
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.book.discount
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    private Integer discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.book.page_count
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    private Integer pageCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.book.isbn13
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    private String isbn13;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.book.on_sale_date
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    private Date onSaleDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.book.publisher_id
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    private Integer publisherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.book.category_id
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    private Integer categoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.book.id
     *
     * @return the value of public.book.id
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.book.id
     *
     * @param id the value for public.book.id
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.book.book_name
     *
     * @return the value of public.book.book_name
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.book.book_name
     *
     * @param bookName the value for public.book.book_name
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.book.price
     *
     * @return the value of public.book.price
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.book.price
     *
     * @param price the value for public.book.price
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.book.discount
     *
     * @return the value of public.book.discount
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.book.discount
     *
     * @param discount the value for public.book.discount
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.book.page_count
     *
     * @return the value of public.book.page_count
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.book.page_count
     *
     * @param pageCount the value for public.book.page_count
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.book.isbn13
     *
     * @return the value of public.book.isbn13
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public String getIsbn13() {
        return isbn13;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.book.isbn13
     *
     * @param isbn13 the value for public.book.isbn13
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.book.on_sale_date
     *
     * @return the value of public.book.on_sale_date
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public Date getOnSaleDate() {
        return onSaleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.book.on_sale_date
     *
     * @param onSaleDate the value for public.book.on_sale_date
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setOnSaleDate(Date onSaleDate) {
        this.onSaleDate = onSaleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.book.publisher_id
     *
     * @return the value of public.book.publisher_id
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public Integer getPublisherId() {
        return publisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.book.publisher_id
     *
     * @param publisherId the value for public.book.publisher_id
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.book.category_id
     *
     * @return the value of public.book.category_id
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.book.category_id
     *
     * @param categoryId the value for public.book.category_id
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}