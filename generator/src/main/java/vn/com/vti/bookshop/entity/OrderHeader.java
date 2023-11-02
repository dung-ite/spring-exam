package vn.com.vti.bookshop.entity;

import java.util.Date;

public class OrderHeader {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.order_datetime
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private Date orderDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.customer_id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private Integer customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.payment_amount
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private Integer paymentAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.payment_type_id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private Integer paymentTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.order_header.shipping_method_id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private Integer shippingMethodId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.id
     *
     * @return the value of public.order_header.id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.id
     *
     * @param id the value for public.order_header.id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.order_datetime
     *
     * @return the value of public.order_header.order_datetime
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
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
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setOrderDatetime(Date orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.customer_id
     *
     * @return the value of public.order_header.customer_id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.customer_id
     *
     * @param customerId the value for public.order_header.customer_id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.payment_amount
     *
     * @return the value of public.order_header.payment_amount
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.payment_amount
     *
     * @param paymentAmount the value for public.order_header.payment_amount
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.payment_type_id
     *
     * @return the value of public.order_header.payment_type_id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public Integer getPaymentTypeId() {
        return paymentTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.payment_type_id
     *
     * @param paymentTypeId the value for public.order_header.payment_type_id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setPaymentTypeId(Integer paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.order_header.shipping_method_id
     *
     * @return the value of public.order_header.shipping_method_id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public Integer getShippingMethodId() {
        return shippingMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.order_header.shipping_method_id
     *
     * @param shippingMethodId the value for public.order_header.shipping_method_id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setShippingMethodId(Integer shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }
}