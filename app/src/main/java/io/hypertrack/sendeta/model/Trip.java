package io.hypertrack.sendeta.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by suhas on 26/11/15.
 */
public class Trip extends RealmObject {

    @SerializedName("hypertrack_task_id")
    private String hypertrackTaskID;

    @PrimaryKey
    private String id;

    @SerializedName("share_url")
    private String shareUrl;

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHypertrackTaskID() {
        return hypertrackTaskID;
    }

    public void setHypertrackTaskID(String hypertrackTaskID) {
        this.hypertrackTaskID = hypertrackTaskID;
    }

    @Override
    public String toString() {
        return "Trip{" +
                ", hypertrackTaskID='" + hypertrackTaskID + '\'' +
                ", id='" + id + '\'' +
                ", shareUrl='" + shareUrl + '\'' +
                '}';
    }
}
