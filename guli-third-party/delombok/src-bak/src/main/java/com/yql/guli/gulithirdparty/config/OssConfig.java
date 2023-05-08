package com.yql.guli.gulithirdparty.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "oss.yaml")
@RefreshScope
public class OssConfig {
    @Value("${spring.cloud.alicloud.oss.endpoint}")
    String endpoint;
    @Value("${spring.cloud.alicloud.oss.bucket}")
    String bucket;
    @Value("${spring.cloud.alicloud.access-key}")
    String accessId;
    @Value("${spring.cloud.alicloud.secret-key}")
    String accessKey;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public OssConfig() {
    }

    @SuppressWarnings("all")
    public String getEndpoint() {
        return this.endpoint;
    }

    @SuppressWarnings("all")
    public String getBucket() {
        return this.bucket;
    }

    @SuppressWarnings("all")
    public String getAccessId() {
        return this.accessId;
    }

    @SuppressWarnings("all")
    public String getAccessKey() {
        return this.accessKey;
    }

    @SuppressWarnings("all")
    public void setEndpoint(final String endpoint) {
        this.endpoint = endpoint;
    }

    @SuppressWarnings("all")
    public void setBucket(final String bucket) {
        this.bucket = bucket;
    }

    @SuppressWarnings("all")
    public void setAccessId(final String accessId) {
        this.accessId = accessId;
    }

    @SuppressWarnings("all")
    public void setAccessKey(final String accessKey) {
        this.accessKey = accessKey;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OssConfig)) return false;
        final OssConfig other = (OssConfig) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$endpoint = this.getEndpoint();
        final Object other$endpoint = other.getEndpoint();
        if (this$endpoint == null ? other$endpoint != null : !this$endpoint.equals(other$endpoint)) return false;
        final Object this$bucket = this.getBucket();
        final Object other$bucket = other.getBucket();
        if (this$bucket == null ? other$bucket != null : !this$bucket.equals(other$bucket)) return false;
        final Object this$accessId = this.getAccessId();
        final Object other$accessId = other.getAccessId();
        if (this$accessId == null ? other$accessId != null : !this$accessId.equals(other$accessId)) return false;
        final Object this$accessKey = this.getAccessKey();
        final Object other$accessKey = other.getAccessKey();
        if (this$accessKey == null ? other$accessKey != null : !this$accessKey.equals(other$accessKey)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof OssConfig;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $endpoint = this.getEndpoint();
        result = result * PRIME + ($endpoint == null ? 43 : $endpoint.hashCode());
        final Object $bucket = this.getBucket();
        result = result * PRIME + ($bucket == null ? 43 : $bucket.hashCode());
        final Object $accessId = this.getAccessId();
        result = result * PRIME + ($accessId == null ? 43 : $accessId.hashCode());
        final Object $accessKey = this.getAccessKey();
        result = result * PRIME + ($accessKey == null ? 43 : $accessKey.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "OssConfig(endpoint=" + this.getEndpoint() + ", bucket=" + this.getBucket() + ", accessId=" + this.getAccessId() + ", accessKey=" + this.getAccessKey() + ")";
    }
    //</editor-fold>
}
