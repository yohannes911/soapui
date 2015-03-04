package com.eviware.soapui.analytics;

public interface UserInfoProvider {

    void trackUserInfo(OSUserDescription osUserDescription);

    void trackAction(ActionDescription actionDescription);

}
