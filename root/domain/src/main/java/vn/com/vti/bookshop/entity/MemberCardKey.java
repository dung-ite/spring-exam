package vn.com.vti.bookshop.entity;

public class MemberCardKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.member_card.member_id
     *
     * @mbg.generated Fri Nov 03 17:56:21 JST 2023
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.member_card.member_card_id
     *
     * @mbg.generated Fri Nov 03 17:56:21 JST 2023
     */
    private Integer memberCardId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.member_card.member_id
     *
     * @return the value of public.member_card.member_id
     *
     * @mbg.generated Fri Nov 03 17:56:21 JST 2023
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.member_card.member_id
     *
     * @param memberId the value for public.member_card.member_id
     *
     * @mbg.generated Fri Nov 03 17:56:21 JST 2023
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.member_card.member_card_id
     *
     * @return the value of public.member_card.member_card_id
     *
     * @mbg.generated Fri Nov 03 17:56:21 JST 2023
     */
    public Integer getMemberCardId() {
        return memberCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.member_card.member_card_id
     *
     * @param memberCardId the value for public.member_card.member_card_id
     *
     * @mbg.generated Fri Nov 03 17:56:21 JST 2023
     */
    public void setMemberCardId(Integer memberCardId) {
        this.memberCardId = memberCardId;
    }
}