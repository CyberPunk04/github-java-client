package com.teach.javafxclient.model;
/**
 * Course 课程表实体类  保存课程的的基本信息信息，
 * Integer courseId 人员表 course 主键 course_id
 * String CourseNum 课程编号
 * String CourseName 课程名称
 * Integer credit 学分
 * String CourseHour 课时
 * String CourseType 课程类型
 * String CourseDesc 课程描述
 * String getCourseStatus 课程状态
 * String CourseRemark 课程备注
 * Course preCourse 前序课程 pre_course_id 关联前序课程的主键 course_id
 */

public class Course {

    private Integer courseId;
    private String courseNum;
    private String courseName;
    private String courseHour;
    private String courseType;
    private String credit;
    private String courseDesc;
    private String courseStatus;
    private String courseRemark;

    private Course preCourse;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(String courseHour) {
        this.courseHour = courseHour;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String getCourseRemark() {
        return courseRemark;
    }

    public void setCourseRemark(String courseRemark) {
        this.courseRemark = courseRemark;
    }
}
