package com.demoqa.helpers;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:userData/user.properties"
})
public interface UserData extends Config {
    String sexMale();
    String sexFemale();
    String sexOther();
}
