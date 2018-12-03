package com.hospital.registration.entity;

import java.util.Date;

public class User extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.display_name
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private String displayName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.role_id
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password_flag
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private String passwordFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.delete_flag
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private String deleteFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.created_by
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private Integer createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.created_at
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.modified_by
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private Integer modifiedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.modified_at
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    private Date modifiedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.display_name
     *
     * @return the value of user.display_name
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.display_name
     *
     * @param displayName the value for user.display_name
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.role_id
     *
     * @return the value of user.role_id
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.role_id
     *
     * @param roleId the value for user.role_id
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password_flag
     *
     * @return the value of user.password_flag
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public String getPasswordFlag() {
        return passwordFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password_flag
     *
     * @param passwordFlag the value for user.password_flag
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setPasswordFlag(String passwordFlag) {
        this.passwordFlag = passwordFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.delete_flag
     *
     * @return the value of user.delete_flag
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.delete_flag
     *
     * @param deleteFlag the value for user.delete_flag
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.created_by
     *
     * @return the value of user.created_by
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.created_by
     *
     * @param createdBy the value for user.created_by
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.created_at
     *
     * @return the value of user.created_at
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.created_at
     *
     * @param createdAt the value for user.created_at
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.modified_by
     *
     * @return the value of user.modified_by
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public Integer getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.modified_by
     *
     * @param modifiedBy the value for user.modified_by
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.modified_at
     *
     * @return the value of user.modified_at
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public Date getModifiedAt() {
        return modifiedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.modified_at
     *
     * @param modifiedAt the value for user.modified_at
     *
     * @mbg.generated Fri Nov 30 17:15:23 CST 2018
     */
    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}