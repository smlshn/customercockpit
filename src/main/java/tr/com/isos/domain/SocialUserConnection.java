package tr.com.isos.domain;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Social user.
 */
public class SocialUserConnection implements Serializable {

    private static final long serialVersionUID = 1L;


    @NotNull
    private String userId;

    @NotNull
    private String providerId;

    @NotNull
    private String providerUserId;

    @NotNull
    private Long rank;

    private String displayName;

    private String profileURL;

    private String imageURL;

    @NotNull
    private String accessToken;

    private String secret;

    private String refreshToken;

    private Long expireTime;

    public SocialUserConnection() {}
    public SocialUserConnection(String userId,
                                String providerId,
                                String providerUserId,
                                Long rank,
                                String displayName,
                                String profileURL,
                                String imageURL,
                                String accessToken,
                                String secret,
                                String refreshToken,
                                Long expireTime) {
        this.userId = userId;
        this.providerId = providerId;
        this.providerUserId = providerUserId;
        this.rank = rank;
        this.displayName = displayName;
        this.profileURL = profileURL;
        this.imageURL = imageURL;
        this.accessToken = accessToken;
        this.secret = secret;
        this.refreshToken = refreshToken;
        this.expireTime = expireTime;
    }

    public  getId() {
        return id;
    }

    public void setId( id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderUserId() {
        return providerUserId;
    }

    public void setProviderUserId(String providerUserId) {
        this.providerUserId = providerUserId;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SocialUserConnection user = (SocialUserConnection) o;

        if (!id.equals(user.id)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "SocialUserConnection{" +
            "id=" + id +
            ", userId=" + userId +
            ", providerId='" + providerId + '\'' +
            ", providerUserId='" + providerUserId + '\'' +
            ", rank=" + rank +
            ", displayName='" + displayName + '\'' +
            ", profileURL='" + profileURL + '\'' +
            ", imageURL='" + imageURL + '\'' +
            ", accessToken='" + accessToken + '\'' +
            ", secret='" + secret + '\'' +
            ", refreshToken='" + refreshToken + '\'' +
            ", expireTime=" + expireTime +
            '}';
    }
}
