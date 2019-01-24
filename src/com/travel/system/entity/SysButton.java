package com.travel.system.entity;
/***********************************************************************
 * Module:  SysButton.java
 * Author:  richaelguitar
 * Purpose: 操作按钮实体类
 ***********************************************************************/

import java.util.*;

public class SysButton {
   public long btnId;
   public java.lang.String btnName;
   public java.lang.String btnNo;
   public java.lang.String btnClass;
   public byte[] btnIcon;
   public java.lang.String btnScript;
   public java.lang.String menuNo;
   public boolean initStatus;
   public int seqNo;
   public int createUserId;
   public java.util.Date createDate;
   public int modifyUserId;
   public java.util.Date modifyDate;
   
   public long getBtnId() {
      return btnId;
   }
   
   /** @param newBtnId */
   public void setBtnId(long newBtnId) {
      btnId = newBtnId;
   }
   
   public java.lang.String getBtnName() {
      return btnName;
   }
   
   /** @param newBtnName */
   public void setBtnName(java.lang.String newBtnName) {
      btnName = newBtnName;
   }
   
   public java.lang.String getBtnNo() {
      return btnNo;
   }
   
   /** @param newBtnNo */
   public void setBtnNo(java.lang.String newBtnNo) {
      btnNo = newBtnNo;
   }
   
   public java.lang.String getBtnClass() {
      return btnClass;
   }
   
   /** @param newBtnClass */
   public void setBtnClass(java.lang.String newBtnClass) {
      btnClass = newBtnClass;
   }
   
   public byte[] getBtnIcon() {
      return btnIcon;
   }
   
   /** @param newBtnIcon */
   public void setBtnIcon(byte[] newBtnIcon) {
      btnIcon = newBtnIcon;
   }
   
   public java.lang.String getBtnScript() {
      return btnScript;
   }
   
   /** @param newBtnScript */
   public void setBtnScript(java.lang.String newBtnScript) {
      btnScript = newBtnScript;
   }
   
   public java.lang.String getMenuNo() {
      return menuNo;
   }
   
   /** @param newMenuNo */
   public void setMenuNo(java.lang.String newMenuNo) {
      menuNo = newMenuNo;
   }
   
   public boolean getInitStatus() {
      return initStatus;
   }
   
   /** @param newInitStatus */
   public void setInitStatus(boolean newInitStatus) {
      initStatus = newInitStatus;
   }
   
   public int getSeqNo() {
      return seqNo;
   }
   
   /** @param newSeqNo */
   public void setSeqNo(int newSeqNo) {
      seqNo = newSeqNo;
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