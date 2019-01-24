package com.travel.system.entity;
/***********************************************************************
 * Module:  SysApplication.java
 * Author:  richaelguitar
 * Purpose: 系统模块实体类
 ***********************************************************************/

import java.util.*;

public class SysApplication {
   public long appId;
   public java.lang.String appCode;
   public java.lang.String appName;
   public java.lang.String appDesc;
   public boolean showInMenu;
   public int createUserId;
   public java.util.Date createDate;
   public int modifyUserId;
   public java.util.Date modifyDate;
   
   public long getAppId() {
      return appId;
   }
   
   /** @param newAppId */
   public void setAppId(long newAppId) {
      appId = newAppId;
   }
   
   public java.lang.String getAppCode() {
      return appCode;
   }
   
   /** @param newAppCode */
   public void setAppCode(java.lang.String newAppCode) {
      appCode = newAppCode;
   }
   
   public java.lang.String getAppName() {
      return appName;
   }
   
   /** @param newAppName */
   public void setAppName(java.lang.String newAppName) {
      appName = newAppName;
   }
   
   public java.lang.String getAppDesc() {
      return appDesc;
   }
   
   /** @param newAppDesc */
   public void setAppDesc(java.lang.String newAppDesc) {
      appDesc = newAppDesc;
   }
   
   public boolean getShowInMenu() {
      return showInMenu;
   }
   
   /** @param newShowInMenu */
   public void setShowInMenu(boolean newShowInMenu) {
      showInMenu = newShowInMenu;
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