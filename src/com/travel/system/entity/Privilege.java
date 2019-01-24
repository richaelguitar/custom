package com.travel.system.entity;
/***********************************************************************
 * Module:  Privilege.java
 * Author:  richaelguitar
 * Purpose: 权限信息实体类
 ***********************************************************************/

import java.util.*;

public class Privilege {
   private long privilegeId;
   private java.lang.String privilegeMaster;
   private int privilegeValue;
   private java.lang.String privilegeAccess;
   private java.lang.String privilegeAccessValue;
   private int privilegeOperation;
   private int createUserId;
   private java.util.Date createDate;
   private int modifyUserId;
   private java.util.Date modifyDate;
   
   public java.util.Date getModifyDate() {
      return modifyDate;
   }
   
   /** @param newModifyDate */
   public void setModifyDate(java.util.Date newModifyDate) {
      modifyDate = newModifyDate;
   }
   
   public long getPrivilegeId() {
      return privilegeId;
   }
   
   /** @param newPrivilegeId */
   public void setPrivilegeId(long newPrivilegeId) {
      privilegeId = newPrivilegeId;
   }
   
   public java.lang.String getPrivilegeMaster() {
      return privilegeMaster;
   }
   
   /** @param newPrivilegeMaster */
   public void setPrivilegeMaster(java.lang.String newPrivilegeMaster) {
      privilegeMaster = newPrivilegeMaster;
   }
   
   public int getPrivilegeValue() {
      return privilegeValue;
   }
   
   /** @param newPrivilegeValue */
   public void setPrivilegeValue(int newPrivilegeValue) {
      privilegeValue = newPrivilegeValue;
   }
   
   public java.lang.String getPrivilegeAccess() {
      return privilegeAccess;
   }
   
   /** @param newPrivilegeAccess */
   public void setPrivilegeAccess(java.lang.String newPrivilegeAccess) {
      privilegeAccess = newPrivilegeAccess;
   }
   
   public java.lang.String getPrivilegeAccessValue() {
      return privilegeAccessValue;
   }
   
   /** @param newPrivilegeAccessValue */
   public void setPrivilegeAccessValue(java.lang.String newPrivilegeAccessValue) {
      privilegeAccessValue = newPrivilegeAccessValue;
   }
   
   public int getPrivilegeOperation() {
      return privilegeOperation;
   }
   
   /** @param newPrivilegeOperation */
   public void setPrivilegeOperation(int newPrivilegeOperation) {
      privilegeOperation = newPrivilegeOperation;
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

}