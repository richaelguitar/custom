package com.travel.system.entity;
/***********************************************************************
 * Module:  UserRole.java
 * Author:  richaelguitar
 * Purpose: 用户角色实体类
 ***********************************************************************/

import java.util.*;

public class UserRole {
   public long userRoleId;
   public int userId;
   public int roleId;
   public int createUserId;
   public java.util.Date createDate;
   public int modifyUserId;
   public java.util.Date modifyDate;
   
   public long getUserRoleId() {
      return userRoleId;
   }
   
   /** @param newUserRoleId */
   public void setUserRoleId(long newUserRoleId) {
      userRoleId = newUserRoleId;
   }
   
   public int getUserId() {
      return userId;
   }
   
   /** @param newUserId */
   public void setUserId(int newUserId) {
      userId = newUserId;
   }
   
   public int getRoleId() {
      return roleId;
   }
   
   /** @param newRoleId */
   public void setRoleId(int newRoleId) {
      roleId = newRoleId;
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