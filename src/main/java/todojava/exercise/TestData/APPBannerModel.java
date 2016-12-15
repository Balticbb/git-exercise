package todojava.exercise.TestData;

public class APPBannerModel {
   
    private String bannerId;

   
    private String appPlatform;

   
    private String appChannel;

   
    private String appName;

   
    private String bannerImgUrl;

   
    private String bannerImgHref;

   
    private String bannerPriority;

   
    private String bannerDesc;

   
    private String createDate;

   
    private String updateDate;

   
    private String lastUpdateUser;

   
    private String appTermType;

   
    public String getBannerId() {
        return bannerId;
    }

   
    public void setBannerId(String bannerId) {
        this.bannerId = bannerId == null ? null : bannerId.trim();
    }

   
    public String getAppPlatform() {
        return appPlatform;
    }

   
    public void setAppPlatform(String appPlatform) {
        this.appPlatform = appPlatform == null ? null : appPlatform.trim();
    }

   
    public String getAppChannel() {
        return appChannel;
    }

   
    public void setAppChannel(String appChannel) {
        this.appChannel = appChannel == null ? null : appChannel.trim();
    }

   
    public String getAppName() {
        return appName;
    }

   
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

   
    public String getBannerImgUrl() {
        return bannerImgUrl;
    }

   
    public void setBannerImgUrl(String bannerImgUrl) {
        this.bannerImgUrl = bannerImgUrl == null ? null : bannerImgUrl.trim();
    }

   
    public String getBannerImgHref() {
        return bannerImgHref;
    }

   
    public void setBannerImgHref(String bannerImgHref) {
        this.bannerImgHref = bannerImgHref == null ? null : bannerImgHref.trim();
    }

   
    public String getBannerPriority() {
        return bannerPriority;
    }

   
    public void setBannerPriority(String bannerPriority) {
        this.bannerPriority = bannerPriority == null ? null : bannerPriority.trim();
    }

   
    public String getBannerDesc() {
        return bannerDesc;
    }

   
    public void setBannerDesc(String bannerDesc) {
        this.bannerDesc = bannerDesc == null ? null : bannerDesc.trim();
    }

   
    public String getCreateDate() {
        return createDate;
    }

   
    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

   
    public String getUpdateDate() {
        return updateDate;
    }

   
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }

   
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

   
    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }

   
    public String getAppTermType() {
        return appTermType;
    }

   
    public void setAppTermType(String appTermType) {
        this.appTermType = appTermType == null ? null : appTermType.trim();
    }
}