package dev.alvartaco.notifications.dto;

import dev.alvartaco.notifications.model.Message;
import dev.alvartaco.notifications.model.User;

import java.time.LocalDateTime;

public class NotificationDTO {
    private Integer notificationId;
    private Message message;
    private User user;
    private String channelType;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private Integer retryNumber;

    public NotificationDTO(Integer notificationId,
                           Message message,
                           User user,
                           String channelType, 
                           LocalDateTime createdOn,
                           LocalDateTime updatedOn,
                           Integer retryNumber) {
        this.notificationId = notificationId;
        this.message = message;
        this.user = user;
        this.channelType = channelType;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.retryNumber = retryNumber;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getRetryNumber() {
        return retryNumber;
    }

    public void setRetryNumber(Integer retryNumber) {
        this.retryNumber = retryNumber;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
