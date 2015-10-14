package ctec.stateapplication.model;

import android.app.Application;
/**
 * @author Rory Baker
 * @version 1.1 10/14/15
 */
public class AndroidSaveState extends Application
{
    private String userName;
    private int age;
    private boolean isTired;

    public AndroidSaveState()
    {
        userName = "default";
        age = -0;
        isTired = false;
    }


    public String getUserName()
    {
        return userName;
    }

    public int getAge()
    {
        return age;
    }

    public boolean getIsTired()
    {
        return isTired;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setIsTired(boolean isTired)
    {
        this.isTired = isTired;
    }
}
