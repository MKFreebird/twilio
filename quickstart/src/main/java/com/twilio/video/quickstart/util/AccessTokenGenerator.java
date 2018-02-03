package com.twilio.video.quickstart.util;

import com.twilio.jwt.accesstoken.AccessToken;
import com.twilio.jwt.accesstoken.VideoGrant;


/**
 * Created by freebird on 1-2-18.
 */

public class AccessTokenGenerator {

    public static AccessToken main(String[] args, String room, String username) {
        // Required for all types of tokens
        String twilioAccountSid = "ACd554be8bd7b2222b6dbfc9e57f518bf9";
        String twilioApiKey = "SKb446b9355e200c36839c12a6a07ec5c7";
        String twilioApiSecret = "j7A5U7OIVBbp8sE9gp0eTFhfZUnny1hj";

        // Required for Video
        String identity = username;

        // Create Video grant
        VideoGrant grant = new VideoGrant().setRoom(room);

        // Create access token
        AccessToken token = new AccessToken.Builder(
                twilioAccountSid,
                twilioApiKey,
                twilioApiSecret
        ).identity(identity).grant(grant).build();

        System.out.println(token.toJwt());
        return token;
    }

}

