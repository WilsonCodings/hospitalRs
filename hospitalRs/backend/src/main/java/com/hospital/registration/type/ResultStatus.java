package com.hospital.registration.type;

/**
 * ResultStatus.
 * 
 * @author cjh
 *
 */
public enum ResultStatus {

    SUCCESS(200, "Success"),

    CREATED(201, "Created"),

    DELETED(204, "Deleted"),

    INVALID(400, "Invalid Request"),

    UNAUTHORIZED(401, "Unauthorized"),

    FORBIDDEN(403, "ご変更権限がありませんので、システム管理者にご連絡お願いします。"),

    NOT_FOUND(404, "ソースが見つかりません。"),

    NOT_ACCEPTABLE(406, "Not Acceptable"),

    UNPROCESSABLE_ENTITY(422, "Unprocessable Entity"),

    SERVER_ERROR(500, "Internal Server Error"),

    MESSAGE(423, "message");

    private final int code;

    private String reason;

    ResultStatus(int code, String reason) {
        this.code = code;
        this.reason = reason;
    }

    /**
     * Get ResultStatus from code.
     *
     * @return resultStatus
     */
    public static ResultStatus valueOf(int code) {
        for (ResultStatus rs : values()) {
            if (rs.code == code) {
                return rs;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + code + "]");
    }

    public int code() {
        return this.code;
    }

    public String reason() {
        return this.reason;
    }

    public static ResultStatus setReasonForCode423(String reason) {
        ResultStatus.MESSAGE.reason = reason;
        return ResultStatus.MESSAGE;
    }

    @Override
    public String toString() {
        return Integer.toString(code);
    }

}
