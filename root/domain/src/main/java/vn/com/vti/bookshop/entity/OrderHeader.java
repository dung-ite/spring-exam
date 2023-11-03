package vn.com.vti.bookshop.entity;

import java.util.Date;

public class OrderHeader {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.order_no
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    private Integer orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.order_datetime
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    private Date orderDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.member_id
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.payment_type
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    private String paymentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.member_card_id
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    private Integer memberCardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.update_at
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    private Date updateAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.create_at
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.product_id
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    private String productId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.order_no
     *
     * @return the value of public.order_header.order_no
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.order_no
     *
     * @param orderNo the value for public.order_header.order_no
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.order_datetime
     *
     * @return the value of public.order_header.order_datetime
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public Date getOrderDatetime() {
        return orderDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.order_datetime
     *
     * @param orderDatetime the value for public.order_header.order_datetime
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public void setOrderDatetime(Date orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.member_id
     *
     * @return the value of public.order_header.member_id
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.member_id
     *
     * @param memberId the value for public.order_header.member_id
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.payment_type
     *
     * @return the value of public.order_header.payment_type
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.payment_type
     *
     * @param paymentType the value for public.order_header.payment_type
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.member_card_id
     *
     * @return the value of public.order_header.member_card_id
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public Integer getMemberCardId() {
        return memberCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.member_card_id
     *
     * @param memberCardId the value for public.order_header.member_card_id
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public void setMemberCardId(Integer memberCardId) {
        this.memberCardId = memberCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.update_at
     *
     * @return the value of public.order_header.update_at
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.update_at
     *
     * @param updateAt the value for public.order_header.update_at
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.create_at
     *
     * @return the value of public.order_header.create_at
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.create_at
     *
     * @param createAt the value for public.order_header.create_at
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.product_id
     *
     * @return the value of public.order_header.product_id
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.product_id
     *
     * @param productId the value for public.order_header.product_id
     *
     * @mbg.generated Fri Nov 03 18:18:06 JST 2023
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
}