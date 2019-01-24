package com.travel.system.entity;
/***********************************************************************
 * Module:  UserInfo.java
 * Author:  richaelguitar
 * Purpose: 用户信息实体类
 ***********************************************************************/

import java.util.*;

public class UserInfo {
   public long userId;
   public java.lang.String loginName;
   public java.lang.String loginPWD;
   public java.lang.String userName;
   public int deptId;
   public java.lang.String userNativePalce;
   public int userGender;
   public java.util.Date birthDate;
   public java.lang.String email;
   public java.lang.String tellPhone;
   public java.lang.String cardNo;
   public byte[] userHeadLogo;
   public int userType;
   public int userAddressId;
   public java.lang.String remark;
   public int createUserId;
   public java.util.Date createDate;
   public int modifyUserId;
   public java.util.Date modifyDate;
   
   public long getUserId() {
      return userId;
   }
   
   /** @param newUserId */
   public void setUserId(long newUserId) {
      userId = newUserId;
   }
   
   public java.lang.String getLoginName() {
      return loginName;
   }
   
   /** @param newLoginName */
   public void setLoginName(java.lang.String newLoginName) {
      loginName = newLoginName;
   }
   
   public java.lang.String getLoginPWD() {
      return loginPWD;
   }
   
   /** @param newLoginPWD */
   public void setLoginPWD(java.lang.String newLoginPWD) {
      loginPWD = newLoginPWD;
   }
   
   public java.lang.String getUserName() {
      return userName;
   }
   
   /** @param newUserName */
   public void setUserName(java.lang.String newUserName) {
      userName = newUserName;
   }
   
   public int getDeptId() {
      return deptId;
   }
   
   /** @param newDeptId */
   public void setDeptId(int newDeptId) {
      deptId = newDeptId;
   }
   
   public java.lang.String getUserNativePalce() {
      return userNativePalce;
   }
   
   /** @param newUserNativePalce */
   public void setUserNativePalce(java.lang.String newUserNativePalce) {
      userNativePalce = newUserNativePalce;
   }
   
   public int getUserGender() {
      return userGender;
   }
   
   /** @param newUserGender */
   public void setUserGender(int newUserGender) {
      userGender = newUserGender;
   }
   
   public java.util.Date getBirthDate() {
      return birthDate;
   }
   
   /** @param newBirthDate */
   public void setBirthDate(java.util.Date newBirthDate) {
      birthDate = newBirthDate;
   }
   
   public java.lang.String getEmail() {
      return email;
   }
   
   /** @param newEmail */
   public void setEmail(java.lang.String newEmail) {
      email = newEmail;
   }
   
   public java.lang.String getTellPhone() {
      return tellPhone;
   }
   
   /** @param newTellPhone */
   public void setTellPhone(java.lang.String newTellPhone) {
      tellPhone = newTellPhone;
   }
   
   public java.lang.String getCardNo() {
      return cardNo;
   }
   
   /** @param newCardNo */
   public void setCardNo(java.lang.String newCardNo) {
      cardNo = newCardNo;
   }
   
   public byte[] getUserHeadLogo() {
      return userHeadLogo;
   }
   
   /** @param newUserHeadLogo */
   public void setUserHeadLogo(byte[] newUserHeadLogo) {
      userHeadLogo = newUserHeadLogo;
   }
   
   public int getUserType() {
      return userType;
   }
   
   /** @param newUserType */
   public void setUserType(int newUserType) {
      userType = newUserType;
   }
   
   public int getUserAddressId() {
      return userAddressId;
   }
   
   /** @param newUserAddressId */
   public void setUserAddressId(int newUserAddressId) {
      userAddressId = newUserAddressId;
   }
   
   public java.lang.String getRemark() {
      return remark;
   }
   
   /** @param newRemark */
   public void setRemark(java.lang.String newRemark) {
      remark = newRemark;
   }
   
   public int getCreateUserId() {
      return createUserId;
   }
   
   /** @param newCreateUserId */
   public void setCreateUserId(int newCreateUserId) {
      createUserId = newCreateUserId;
   }
   
   public java.util.Date getCreateDate() {
      return createDate;
   }
   
   /** @param newCreateDate */
   public void setCreateDate(java.util.Date newCreateDate) {
      createDate = newCreateDate;
   }
   
   public int getModifyUserId() {
      return modifyUserId;
   }
   
   /** @param newModifyUserId */
   public void setModifyUserId(int newModifyUserId) {
      modifyUserId = newModifyUserId;
   }
   
   public java.util.Date getModifyDate() {
      return modifyDate;
   }
   
   /** @param newModifyDate */
   public void setModifyDate(java.util.Date newModifyDate) {
      modifyDate = newModifyDate;
   }

}