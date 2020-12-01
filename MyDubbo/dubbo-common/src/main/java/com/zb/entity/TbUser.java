package com.zb.entity;
import java.io.Serializable;
import java.util.Date;

/***
*   用户表
*/
public class TbUser implements Serializable {
    //用户名
    private String username;
    //密码，加密存储
    private String password;
    //注册手机号
    private String phone;
    //注册邮箱
    private String email;
    //创建时间
    private Date created;
    //修改时间
    private Date updated;
    //会员来源：1:PC，2：H5，3：Android，4：IOS
    private String sourceType;
    //昵称
    private String nickName;
    //真实姓名
    private String name;
    //使用状态（1正常 0非正常）
    private String status;
    //头像地址
    private String headPic;
    //QQ号码
    private String qq;
    //手机是否验证 （0否  1是）
    private String isMobileCheck;
    //邮箱是否检测（0否  1是）
    private String isEmailCheck;
    //性别，1男，0女
    private String sex;
    //会员等级
    private Integer userLevel;
    //积分
    private Integer points;
    //经验值
    private Integer experienceValue;
    //出生年月日
    private Date birthday;
    //最后登录时间
    private Date lastLoginTime;
    //get set 方法
    public void setUsername (String  username){
        this.username=username;
    }
    public  String getUsername(){
        return this.username;
    }
    public void setPassword (String  password){
        this.password=password;
    }
    public  String getPassword(){
        return this.password;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setEmail (String  email){
        this.email=email;
    }
    public  String getEmail(){
        return this.email;
    }
    public void setCreated (Date  created){
        this.created=created;
    }
    public  Date getCreated(){
        return this.created;
    }
    public void setUpdated (Date  updated){
        this.updated=updated;
    }
    public  Date getUpdated(){
        return this.updated;
    }
    public void setSourceType (String  sourceType){
        this.sourceType=sourceType;
    }
    public  String getSourceType(){
        return this.sourceType;
    }
    public void setNickName (String  nickName){
        this.nickName=nickName;
    }
    public  String getNickName(){
        return this.nickName;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setStatus (String  status){
        this.status=status;
    }
    public  String getStatus(){
        return this.status;
    }
    public void setHeadPic (String  headPic){
        this.headPic=headPic;
    }
    public  String getHeadPic(){
        return this.headPic;
    }
    public void setQq (String  qq){
        this.qq=qq;
    }
    public  String getQq(){
        return this.qq;
    }
    public void setIsMobileCheck (String  isMobileCheck){
        this.isMobileCheck=isMobileCheck;
    }
    public  String getIsMobileCheck(){
        return this.isMobileCheck;
    }
    public void setIsEmailCheck (String  isEmailCheck){
        this.isEmailCheck=isEmailCheck;
    }
    public  String getIsEmailCheck(){
        return this.isEmailCheck;
    }
    public void setSex (String  sex){
        this.sex=sex;
    }
    public  String getSex(){
        return this.sex;
    }
    public void setUserLevel (Integer  userLevel){
        this.userLevel=userLevel;
    }
    public  Integer getUserLevel(){
        return this.userLevel;
    }
    public void setPoints (Integer  points){
        this.points=points;
    }
    public  Integer getPoints(){
        return this.points;
    }
    public void setExperienceValue (Integer  experienceValue){
        this.experienceValue=experienceValue;
    }
    public  Integer getExperienceValue(){
        return this.experienceValue;
    }
    public void setBirthday (Date  birthday){
        this.birthday=birthday;
    }
    public  Date getBirthday(){
        return this.birthday;
    }
    public void setLastLoginTime (Date  lastLoginTime){
        this.lastLoginTime=lastLoginTime;
    }
    public  Date getLastLoginTime(){
        return this.lastLoginTime;
    }
}
