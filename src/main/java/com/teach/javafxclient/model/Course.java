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
    private String CourseNum;
    private String CourseName;
    private String CourseHour;
    private String CourseType;
    private String credit;
    private String CourseDesc;
    private String CourseStatus;
    private String CourseRemark;

    private Course preCourse;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseNum() {
        return CourseNum;
    }

    public void setCourseNum(String courseNum) {
        CourseNum = courseNum;
    }

    public String getCourseHour() {
        return CourseHour;
    }

    public void setCourseHour(String courseHour) {
        CourseHour = courseHour;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCourseType() {
        return CourseType;
    }

    public void setCourseType(String courseType) {
        CourseType = courseType;
    }

    public String getCourseDesc() {
        return CourseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        CourseDesc = courseDesc;
    }

    public String getCourseStatus() {
        return CourseStatus;
    }

    public void setCourseStatus(String CourseStatus) {
        this.CourseStatus = CourseStatus;
    }

    public String getCourseRemark() {
        return CourseRemark;
    }

    public void setCourseRemark(String courseRemark) {
        CourseRemark = courseRemark;
    }
}
