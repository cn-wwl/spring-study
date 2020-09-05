package com.wwl;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

import java.security.MessageDigest;
import java.security.Security;

public class Program {
    public static void main(String[] args) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        String str = "73.25";
        MessageDigest md = MessageDigest.getInstance("MD2");
        for (int i = 0; i < 100000000; i++) {
            byte[] digest = md.digest(str.getBytes("UTF-8"));
            str = new String(Hex.encode(digest));
        }

        System.out.println("½á¹û£º"+str);
    }
}
