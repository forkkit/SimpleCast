package com.peirr.cast;

import android.view.Menu;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;

/**
 * Created by kurt on 2016/09/14.
 */

public interface CastDevice {

    interface DeviceCallback {
        void onCastStateChanged(int state);
        void onCastConnected(Session session);
        void onCastDisconnected();
        void onMessagePosted(String namespace, String message);
        void onMessageFailed(String namespace, String message);
        void onMessageReceived(String namespace, String message);
        void onChannelAttachementFailed(Exception e);
    }

    void post(String json);
    void attach(DeviceCallback callback);
    void attachMenu(Menu menu,int menuItemId);
    void detach();
    void setupChannel(Session session);
    void setHost(String host);
    RemoteMediaClient getRemoteClient();
}
