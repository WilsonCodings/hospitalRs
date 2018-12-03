package com.hospital.registration.type;

/**
 * Constant.
 * 
 * @author cjh
 *
 */
public interface Constant {
    /**
     * SlackMessage.
     */
    public static class SlackMessage {
        public static final String SUCCESS_SEND_SLACK = "メセッジは成功に発送しました";
        public static final String FAIL_HAS_SEND_SLACK = "このbutlerのエラー情報は1分間で送信したので,再度送信する必要はない。";
        public static final String FAIL_BOT_REPAIRING = "このbutlerは修理されていないので,再度送信する必要はない!";
    }

    /**
     * UserMessage.
     */
    public static class UserMessage {
        public static final String IS_DELETE_USER = "1"; // user had deleted
    }
}
