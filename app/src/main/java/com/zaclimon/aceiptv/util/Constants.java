package com.zaclimon.aceiptv.util;

import android.content.ComponentName;

import com.zaclimon.aceiptv.service.AceInputTvService;

/**
 * Created by isaac on 17-06-17.
 */

public class Constants {

    // M3U file attributes
    public static final String ATTRIBUTE_TVG_ID = "tvg-id";
    public static final String ATTRIBUTE_LINK = "link";
    public static final String ATTRIBUTE_TVG_LOGO = "tvg-logo";
    public static final String ATTRIBUTE_TVG_NAME = "tvg-name";
    public static final String ATTRIBUTE_GROUP_TITLE = "group-title";

    // Preferences stuff
    public static final String ACE_IPTV_PREFERENCES = "AceSharedPreferences";
    public static final String USERNAME_PREFERENCE = "username";
    public static final String PASSWORD_PREFERENCE = "password";
    public static final String STREAM_TYPE_PREFERENCE = "stream_type";
    public static final String STREAM_TYPE_MPEG_TS = "ts";
    public static final String STREAM_TYPE_HLS = "hls";

    // Channel configuration stuff
    public static final String EPG_ID_PROVIDER = "epg_id";
    public static final ComponentName TV_INPUT_SERVICE = new ComponentName("com.zaclimon.aceiptv", "com.zaclimon.aceiptv.service.AceInputTvService");
}
