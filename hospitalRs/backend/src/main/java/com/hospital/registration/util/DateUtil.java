package com.hospital.registration.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.util.StringUtils;

public class DateUtil {
    /**
     * getCurrentJapanDateTime.
     * 
     * @return CurrentJapanDateTime
     */
    public static Date getCurrentJapanDateTime() {
        Date date = new Date();
        return date;

    }

    /**
     * dateTimeFormat.
     * 
     * @Description: frontから取得したデータをフォマードする。
     * @param:beanDate
     */
    public static String dateTimeFormat(String beanDate) {
        if (StringUtils.isEmpty(beanDate)) {
            return "";
        } else {
            String formatdeBean = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                    .format(new Date(Long.valueOf(beanDate)));
            return formatdeBean;
        }
    }

    /**
     * dateFormat.
     * 
     * @Description: frontから取得したデータをフォマードする。
     * @param:beanDate
     */
    public static String monthFormat(String beanDate) {
        if (StringUtils.isEmpty(beanDate)) {
            return "";
        } else {
            String formatdate = new SimpleDateFormat("yyyy-MM")
                    .format(new Date(Long.valueOf(beanDate)));
            return formatdate;
        }
    }

    /**
     * dateFormat.
     * 
     * @Description: frontから取得したデータをフォマードする。
     * @param:beanDate
     */
    public static Date convertCNtoJAtime(String beanDate) {
        if (StringUtils.isEmpty(beanDate)) {
            return getCurrentJapanDateTime();
        } else {
            Date date = new Date();
            long timet = Long.valueOf(beanDate);
            if ("Asia/Shanghai".equals(TimeZone.getDefault().getID())) {
                date = new Date(timet + 3600000);
            }
            return date;
        }
    }

    /**
     * convertToTime.
     * 
     * @Description: frontから取得したデータをフォマードする。
     * @param:beanDate
     */
    public static Date convertToTime(String beanDate) {
        if (StringUtils.isEmpty(beanDate)) {
            return getCurrentJapanDateTime();
        } else {
            long timet = Long.valueOf(beanDate);
            Date date = new Date(timet);
            return date;
        }
    }

    /**
     * convertToTime.
     * 
     * @Description: frontから取得したデータをフォマードする。
     * @param:beanDate
     */
    public static Date convertFormDateToTime(String beanDate) {
        if (StringUtils.isEmpty(beanDate)) {
            return getCurrentJapanDateTime();
        } else {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            Date date = getCurrentJapanDateTime();
            try {
                date = format.parse(beanDate);
            } catch (ParseException e) {
                e.printStackTrace();
                return getCurrentJapanDateTime();
            }
            return date;
        }
    }
}
