package vn.com.vti.bookshop.entity;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.customer.id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.customer.customer_name
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private String customerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.customer.address
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.customer.mail_address
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private String mailAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.customer.postcode
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private Integer postcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.customer.tel_no
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    private String telNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.customer.id
     *
     * @return the value of public.customer.id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.customer.id
     *
     * @param id the value for public.customer.id
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.customer.customer_name
     *
     * @return the value of public.customer.customer_name
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.customer.customer_name
     *
     * @param customerName the value for public.customer.customer_name
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.customer.address
     *
     * @return the value of public.customer.address
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.customer.address
     *
     * @param address the value for public.customer.address
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.customer.mail_address
     *
     * @return the value of public.customer.mail_address
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.customer.mail_address
     *
     * @param mailAddress the value for public.customer.mail_address
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.customer.postcode
     *
     * @return the value of public.customer.postcode
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public Integer getPostcode() {
        return postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.customer.postcode
     *
     * @param postcode the value for public.customer.postcode
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.customer.tel_no
     *
     * @return the value of public.customer.tel_no
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.customer.tel_no
     *
     * @param telNo the value for public.customer.tel_no
     *
     * @mbg.generated Thu Nov 02 13:54:42 JST 2023
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}