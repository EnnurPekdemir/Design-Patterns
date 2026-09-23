package com.haydikodlayalim.dpatterns.facade;

public class CustomEncryptor {
public static void main(String[] args) {
    String text = "content";

    AESEncryptor aes = new AESEncryptor();
    aes.encrypt(text);


    MD5Encryptor md5 = new MD5Encryptor();
    md5.encrypt(key);
    
    SHAEncryptor sha = new SHAEncryptor();
    sha.encrypt(text, text, false);

}
}
