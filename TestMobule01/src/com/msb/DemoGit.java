package com.msb;

/**
 * @Auther: YeZhanCHN
 * @Date: 2021/6/10 - 06 - 10 - 17:53}
 * @Description:
 * @version:1.0
 */
public class DemoGit {
    private String mame;
    private int age;
    private String className;

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public DemoGit() {
    }

    public DemoGit(String mame, int age, String className) {
        this.mame = mame;
        this.age = age;
        this.className = className;
    }
}
