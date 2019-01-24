package com.travel.system.entity;
/***********************************************************************
 * Module:  SysMenu.java
 * Author:  richaelguitar
 * Purpose: 系统菜单实体类
 ***********************************************************************/

import java.util.*;

public class SysMenu {
   public long menuId;
   public java.lang.String menuNo;
   public java.lang.String menuName;
   public java.lang.String menuUrl;
   public java.lang.String appCode;
   public java.lang.String menuParentNo;
   public byte[] menuIcon;
   public boolean isVisible;
   public boolean isLeaf;
   public int sqeNo;
   public int createUserId;
   public java.util.Date createDate;
   public int modifyUserId;
   public java.util.Date modifyDate;
   
   public long getMenuId() {
      return menuId;
   }
   
   /** @param newMenuId */
   public void setMenuId(long newMenuId) {
      menuId = newMenuId;
   }
   
   public java.lang.String getMenuNo() {
      return menuNo;
   }
   
   /** @param newMenuNo */
   public void setMenuNo(java.lang.String newMenuNo) {
      menuNo = newMenuNo;
   }
   
   public java.lang.String getMenuName() {
      return menuName;
   }
   
   /** @param newMenuName */
   public void setMenuName(java.lang.String newMenuName) {
      menuName = newMenuName;
   }
   
   public java.lang.String getMenuUrl() {
      return menuUrl;
   }
   
   /** @param newMenuUrl */
   public void setMenuUrl(java.lang.String newMenuUrl) {
      menuUrl = newMenuUrl;
   }
   
   public java.lang.String getAppCode() {
      return appCode;
   }
   
   /** @param newAppCode */
   public void setAppCode(java.lang.String newAppCode) {
      appCode = newAppCode;
   }
   
   public java.lang.String getMenuParentNo() {
      return menuParentNo;
   }
   
   /** @param newMenuParentNo */
   public void setMenuParentNo(java.lang.String newMenuParentNo) {
      menuParentNo = newMenuParentNo;
   }
   
   public byte[] getMenuIcon() {
      return menuIcon;
   }
   
   /** @param newMenuIcon */
   public void setMenuIcon(byte[] newMenuIcon) {
      menuIcon = newMenuIcon;
   }
   
   public boolean getIsVisible() {
      return isVisible;
   }
   
   /** @param newIsVisible */
   public void setIsVisible(boolean newIsVisible) {
      isVisible = newIsVisible;
   }
   
   public boolean getIsLeaf() {
      return isLeaf;
   }
   
   /** @param newIsLeaf */
   public void setIsLeaf(boolean newIsLeaf) {
      isLeaf = newIsLeaf;
   }
   
   public int getSqeNo() {
      return sqeNo;
   }
   
   /** @param newSqeNo */
   public void setSqeNo(int newSqeNo) {
      sqeNo = newSqeNo;
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