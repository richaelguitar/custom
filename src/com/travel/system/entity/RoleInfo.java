package com.travel.system.entity;
/***********************************************************************
 * Module:  RoleInfo.java
 * Author:  richaelguitar
 * Purpose: 角色信息实体类
 ***********************************************************************/

import java.util.*;

public class RoleInfo {
   public long roleId;
   public java.lang.String roleName;
   public java.lang.String roleDesc;
   public int createUserId;
   public java.util.Date createDate;
   public int modifyUserId;
   public java.util.Date modifyDate;
   
   public long getRoleId() {
      return roleId;
   }
   
   /** @param newRoleId */
   public void setRoleId(long newRoleId) {
      roleId = newRoleId;
   }
   
   public java.lang.String getRoleName() {
      return roleName;
   }
   
   /** @param newRoleName */
   public void setRoleName(java.lang.String newRoleName) {
      roleName = newRoleName;
   }
   
   public java.lang.String getRoleDesc() {
      return roleDesc;
   }
   
   /** @param newRoleDesc */
   public void setRoleDesc(java.lang.String newRoleDesc) {
      roleDesc = newRoleDesc;
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