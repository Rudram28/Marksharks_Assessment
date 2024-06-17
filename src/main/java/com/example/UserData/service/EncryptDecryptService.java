package com.example.UserData.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EncryptDecryptService {



    public String encryptMessage(String plainText) {

        Base64.Encoder encoder = Base64.getEncoder();
        String encodedString = encoder.encodeToString(plainText.getBytes());
        return encodedString;
    }

    public String decryptMessage(String encryptedMessgae) {


        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(encryptedMessgae);
        String pass=new String(bytes);
        return pass;
    }
}
