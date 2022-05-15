package com.example.videochat.listeners;

import com.example.videochat.models.User;

public interface UsersListener {

    void initiateVideoMeeting(User user);

    void initiateAudioMeeting(User user);
}
