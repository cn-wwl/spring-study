package com.wwl;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utf8MD2Util {
    public static String Utf8MD2(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        str = new String(str.getBytes(str), StandardCharsets.UTF_8);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("startTime:" + simpleDateFormat.format(new Date()));
        long s = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            str = MD2(str);
        }
        System.out.println("endTime:" + simpleDateFormat.format(new Date()));
        System.out.println("耗时：" + (System.currentTimeMillis() - s) / 1000 + "s");
        return "utf8md2加密亿次:" + str;
    }

    public static String MD2(String str) throws NoSuchAlgorithmException {
        // 获取MD2加密工具
        MessageDigest md = MessageDigest.getInstance("MD2");
        // 加密
        byte[] digest = md.digest(str.getBytes());
        // 获取二进制十六进制互转工具
        HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();
        // 将二进制数组转换为十六进制字符串,输出结果
        return hexBinaryAdapter.marshal(digest);
    }
}
